
package admin;

import user.*;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import internetcafe.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Properties;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class subscriptionactivate extends javax.swing.JFrame {

    
    public subscriptionactivate() {
        initComponents();
         setResizable(false);
        setLocationRelativeTo(null);
      
     loadActivatedMembershipData();
       
       cancell.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cancelMouseClicked(evt);
        }
    });
    }

 private Timer countdownTimer;

private Duration remainingTime;


private LocalDateTime endTime;
 
   private boolean membershipMessageShown = false;
  
  
   public void enableConfirmButton() {
    confirm.setEnabled(true);
}
  

    
   public void setUserFullName(String username) {
    user.setText(username); 
}
   public void setMembershipType(String type) {
    membershipss.setText(type);
}
   
 public void loadActivatedMembershipData() {
    dbConnect dbc = new dbConnect();
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        con = dbc.getConnection();
        if (con == null || con.isClosed()) {
            displayy.setText("Database connection error");
            return;
        }

        String query = "SELECT t.start_datetime, t.end_datetime, t.activation_status, t.cancel_reason " +
                      "FROM tbl_transaction t " +
                      "JOIN tbl_user u ON t.c_id = u.c_id " +
                      "WHERE u.username = ? " +
                      "ORDER BY t.t_id DESC LIMIT 1";

        pstmt = con.prepareStatement(query);
        pstmt.setString(1, user.getText());
        rs = pstmt.executeQuery();

        if (!rs.next()) {
            displayy.setText("<html><div style='text-align:center;'>No membership data found.</div></html>");
            stopCountdown();
            return;
        }

        String activationStatus = rs.getString("activation_status");
        String startStr = rs.getString("start_datetime");
        String endStr = rs.getString("end_datetime");
        
        
 String displayedMembershipType = membershipss.getText(); 
        if ("Cancelled".equalsIgnoreCase(activationStatus)) {
            String reason = rs.getString("cancel_reason");
            if (reason == null || reason.trim().isEmpty()) {
                reason = "No reason provided";
            }
            
          
         String message = "<html><div style='text-align:center; color:#d32f2f;'>" +
                             "<h3 style='margin-bottom:5px;'>MEMBERSHIP CANCELLED</h3>" +
                             "<div style='font-size:14px; margin-bottom:10px;'>" + displayedMembershipType + " Status Revoked</div>" + // <--- THIS LINE IS FIXED
                             "<div style='background-color:#ffebee; padding:10px; border-radius:5px;'>" +
                             "<b>Reason:</b> " + reason + "</div></div></html>";
          

            displayy.setText(message);
            stopCountdown();
            
        } else if ("Activated".equalsIgnoreCase(activationStatus)) {
            LocalDateTime startDateTime = LocalDateTime.parse(startStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            LocalDateTime endDateTime = LocalDateTime.parse(endStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            this.endTime = endDateTime;

            if (LocalDateTime.now().isBefore(endDateTime)) {
                startMembershipCountdown(endDateTime);
            } else {
                displayy.setText("<html><div style='text-align:center; color:#ff6f00;'>" +
                               "<h3>MEMBERSHIP EXPIRED</h3></div></html>");
                stopCountdown();
            }
        } else {
            displayy.setText("<html><div style='text-align:center;'>No active membership found.</div></html>");
            stopCountdown();
        }

    } catch (SQLException e) {
        e.printStackTrace();
        displayy.setText("<html><div style='color:#d32f2f;'>Error loading membership data</div></html>");
    } catch (DateTimeParseException e) {
        e.printStackTrace();
        displayy.setText("<html><div style='color:#d32f2f;'>Invalid date format in database</div></html>");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbc.closeConnection();
    }
}

    private void stopCountdown() {
        if (countdownTimer != null && countdownTimer.isRunning()) {
            countdownTimer.stop();
        }
        countdownTimer = null;
    }

    private String formatDuration(Duration duration) {
        long days = duration.toDays();
        long hours = duration.minusDays(days).toHours();
        long minutes = duration.minusDays(days).minusHours(hours).toMinutes();
        long seconds = duration.minusDays(days).minusHours(hours).minusMinutes(minutes).getSeconds();
        return String.format("%d days, %02d:%02d:%02d", days, hours, minutes, seconds);
    }

  private void startMembershipCountdown(LocalDateTime endDateTime) {
    endTime = endDateTime;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String endDateString = endTime.format(formatter);

    countdownTimer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            LocalDateTime now = LocalDateTime.now();
            Duration remaining = Duration.between(now, endTime);
            String startDateString = now.format(formatter);

            if (!remaining.isNegative()) {
                String msg = String.format(
                    "<html><b>Membership Active!</b><br><br>" +
                    "Start Date & Time: %s<br><br>" +
                    "End Date & Time: %s<br><br>" +
                    "Time left: %s<br><br>" +
                    "<span style='color:red'><i>We're open 24/7</i></span></html>",
                    startDateString, endDateString, formatDuration(remaining)
                );
                displayy.setText(msg);
            } else {
                displayy.setText("<html><b>Membership expired.</b></html>");
                countdownTimer.stop();

                // Update activation status to "Expired" in the database
                dbConnect dbc = new dbConnect();
                try (Connection con = dbc.getConnection()) {
                    String updateStatus = "UPDATE tbl_transaction SET activation_status = 'Expired' " +
                                          "WHERE t_id = (SELECT t.t_id FROM tbl_transaction t " +
                                          "JOIN tbl_user u ON t.c_id = u.c_id " +
                                          "WHERE u.username = ? ORDER BY t.t_id DESC LIMIT 1)";
                    PreparedStatement updateStmt = con.prepareStatement(updateStatus);
                    updateStmt.setString(1, user.getText());
                    updateStmt.executeUpdate();
                    updateStmt.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("Failed to update status to Expired.");
                } finally {
                    dbc.closeConnection();
                }
            }
        }
    });

    countdownTimer.start();
}

  Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (255,255,255);


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        users = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cancel = new javax.swing.JPanel();
        cancell = new javax.swing.JLabel();
        confirm = new javax.swing.JPanel();
        loggin1 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        displayy = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        membershipss = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(172, 120, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 46, -1, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(185, 154, 123));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome, Admin!");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 630, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 730, 80));

        jPanel8.setBackground(new java.awt.Color(240, 191, 120));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 191, 120), 5));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(185, 154, 123));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WELCOME TO INTERNET CAFE SYSTEM!");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 630, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel10.setBackground(new java.awt.Color(172, 120, 67));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(172, 120, 67));
        users.setText("USERS");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        jPanel10.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waa.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 170, 140));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 440));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        jFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(203, 14, 14));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Castellar", 1, 27)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MEMBERSHIP");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 220, 70));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 60, 100));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 230, 230));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel.setBackground(new java.awt.Color(200, 32, 32));
        cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.setEnabled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancell.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        cancell.setText("CANCEL");
        cancell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancellMouseClicked(evt);
            }
        });
        cancel.add(cancell, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 160, 20));

        jPanel2.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 290, 40));

        confirm.setBackground(new java.awt.Color(200, 32, 32));
        confirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        confirm.setEnabled(false);
        confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmMouseExited(evt);
            }
        });
        confirm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin1.setText("ACTIVATE NOW");
        loggin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin1MouseClicked(evt);
            }
        });
        confirm.add(loggin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 160, 20));

        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 290, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/stylized_gaming_logo_480x480.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 450, 540));

        displayy.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        displayy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(displayy, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 350, 240));

        user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        user.setEnabled(false);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 200, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel16.setText("MEMBERSHIP:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 150, 30));

        membershipss.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        membershipss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        membershipss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        membershipss.setEnabled(false);
        membershipss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipssActionPerformed(evt);
            }
        });
        jPanel2.add(membershipss, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 200, -1));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("Username:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 870, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
     
        
        this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
   Session sess = Session.getInstance();
    if (sess.getUid() == 0) {
        JOptionPane.showMessageDialog(null, "No account, You must Login First!");
        Login lff = new Login();
        lff.setVisible(true);
        this.dispose();
        return;
    }

    
    loadActivatedMembershipData();
   

       
    }//GEN-LAST:event_formWindowActivated

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
     transactionlogs trass = new transactionlogs();
   trass.setVisible(true);
      this.dispose();
        
    }//GEN-LAST:event_jLabel29MouseClicked

    private void loggin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin1MouseClicked
 
            
    }//GEN-LAST:event_loggin1MouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
      
 if (!confirm.isEnabled()) return;
    confirm.setEnabled(false);

    dbConnect dbc = new dbConnect();

    try {
        Connection con = dbc.getConnection();
        if (con != null && !con.isClosed()) {

            String selectedUsername = user.getText();

            String getTransaction = "SELECT t.t_id, t.duration, t.start_datetime, t.end_datetime, t.activation_status " +
                                    "FROM tbl_transaction t " +
                                    "JOIN tbl_user u ON t.c_id = u.c_id " +
                                    "WHERE u.username = ? ORDER BY t.t_id DESC LIMIT 1";

            PreparedStatement pstmt = con.prepareStatement(getTransaction);
            pstmt.setString(1, selectedUsername);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int t_id = rs.getInt("t_id");
                int durationInMonths = rs.getInt("duration");
             int totalDays = durationInMonths * 30;

                String startStr = rs.getString("start_datetime");
                String endStr = rs.getString("end_datetime");
                String activationStatus = rs.getString("activation_status");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime startDateTime;
                LocalDateTime endDateTime;

                // Ask for confirmation if membership was cancelled
                if ("Cancelled".equalsIgnoreCase(activationStatus)) {
                    int confirmResult = JOptionPane.showConfirmDialog(null,
                        "This membership was previously cancelled.\nDo you want to activate it again?",
                        "Confirm Reactivation", JOptionPane.YES_NO_OPTION);
                            
                 
                   
                    
                    if (confirmResult != JOptionPane.YES_OPTION) {
                        displayy.setText("Reactivation cancelled.");
                        rs.close();
                        pstmt.close();
                                  
        transactionlogs trans = new transactionlogs();
        trans.setVisible(true);
        this.dispose();

        return;
                    }
                }

               
                if ("Cancelled".equalsIgnoreCase(activationStatus) || startStr == null || endStr == null) {
                 startDateTime = LocalDateTime.now();
                   endDateTime = startDateTime.plusDays(totalDays);
                    String update = "UPDATE tbl_transaction SET start_datetime = ?, end_datetime = ?, activation_status = 'Activated', cancel_reason = NULL WHERE t_id = ?";
                    PreparedStatement updateStmt = con.prepareStatement(update);
                    updateStmt.setString(1, startDateTime.format(formatter));
                    updateStmt.setString(2, endDateTime.format(formatter));
                    updateStmt.setInt(3, t_id);
                    updateStmt.executeUpdate();
                    updateStmt.close();
                } else {
                    startDateTime = LocalDateTime.parse(startStr, formatter);
                    endDateTime = LocalDateTime.parse(endStr, formatter);
                }

                String message = "<html><b>Membership Active!</b><br><br>"
                        + "Start Date & Time: " + startDateTime.format(formatter) + "<br>"
                        + "End Date & Time: " + endDateTime.format(formatter) + "</html>";
                displayy.setText(message);

                stopCountdown(); // Stop existing timer
                startMembershipCountdown(endDateTime); // Start new timer
            } else {
                displayy.setText("No recent membership found for this user.");
            }

            rs.close();
            pstmt.close();
        } else {
            displayy.setText("Database connection failed.");
        }
    } catch (SQLException | DateTimeParseException ex) {
        ex.printStackTrace();
        displayy.setText("Error: " + ex.getMessage());
    } finally {
        dbc.closeConnection();
        confirm.setEnabled(false);
        }





        
        
        
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmMouseExited

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void membershipssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipssActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membershipssActionPerformed

    private void cancellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancellMouseClicked
     
   String reason = JOptionPane.showInputDialog(this, "Enter cancellation reason:");

if (reason == null) {
    // User clicked Cancel — do nothing
    return;
}

if (reason.trim().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Cancellation reason is required.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
    dbConnect dbc = new dbConnect();
    try (Connection con = dbc.getConnection()) {
        if (con != null && !con.isClosed()) {
            String username = user.getText();

           
            String query = "SELECT t.t_id FROM tbl_transaction t " +
                           "JOIN tbl_user u ON t.c_id = u.c_id " +
                           "WHERE u.username = ? AND t.activation_status = 'Activated' " +
                           "ORDER BY t.t_id DESC LIMIT 1";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int t_id = rs.getInt("t_id");

                // Update transaction to cancel it
                String update = "UPDATE tbl_transaction SET activation_status = 'Cancelled', cancel_reason = ? WHERE t_id = ?";
                PreparedStatement updateStmt = con.prepareStatement(update);
                updateStmt.setString(1, reason);
                updateStmt.setInt(2, t_id);
                updateStmt.executeUpdate();

                JOptionPane.showMessageDialog(this, "Membership has been cancelled.", "Success", JOptionPane.INFORMATION_MESSAGE);
                displayy.setText("Membership cancelled.");
                stopCountdown();

                updateStmt.close();
            } else {
                JOptionPane.showMessageDialog(this, "No active membership to cancel.", "Info", JOptionPane.INFORMATION_MESSAGE);
            }

            rs.close();
            pstmt.close();
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        dbc.closeConnection();
    }

    }//GEN-LAST:event_cancellMouseClicked

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
       
  
        
        
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(subscriptionactivate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subscriptionactivate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subscriptionactivate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subscriptionactivate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subscriptionactivate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel cancell;
    private javax.swing.JPanel confirm;
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel displayy;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel loggin1;
    private javax.swing.JTextField membershipss;
    private javax.swing.JTextField user;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
