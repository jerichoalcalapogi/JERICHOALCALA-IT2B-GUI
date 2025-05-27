
package user;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import internetcafe.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class subscription extends javax.swing.JFrame {

    
    public subscription() {
        initComponents();
         setResizable(false);
        setLocationRelativeTo(null);
        displayMembershipType();
      
       
      
    }

 
   private Timer countdownTimer;
    private boolean isPaused = false;
    private Duration remainingTime;
    private LocalDateTime pauseTime;
    private LocalDateTime endTime;
    private boolean membershipMessageShown = false;
    private boolean timerStarted = false; 
 public void displayMembershipType() {
        dbConnect dbc = new dbConnect();
        try {
            Session sess = Session.getInstance();
            int currentLoggedInUserId = sess.getUid();

            Connection con = dbc.getConnection();
            if (con != null && !con.isClosed()) {
                String query = "SELECT membership_type FROM tbl_transaction WHERE c_id = ? ORDER BY t_id DESC LIMIT 1";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setInt(1, currentLoggedInUserId);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String type = rs.getString("membership_type");
                    if (type != null && !type.trim().isEmpty()) {
                        memberships.setText(type);
                    } else {
                        memberships.setText("");
                    }
                } else {
                    memberships.setText("");
                }

                rs.close();
                pstmt.close();
                loadMembershipStatus(con); 
            } else {
                memberships.setText("");
                JOptionPane.showMessageDialog(null, "Database connection is not valid.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            memberships.setText("");
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        } finally {
            dbc.closeConnection();
        }
    }

 private void loadMembershipStatus(Connection con) {
    Session sess = Session.getInstance();
    PreparedStatement pstmt = null;
    ResultSet rs = null;

    try {
        String query = "SELECT start_datetime, end_datetime, activation_status, cancel_reason " +
                       "FROM tbl_transaction WHERE c_id = ? ORDER BY t_id DESC LIMIT 1";
        pstmt = con.prepareStatement(query);
        pstmt.setInt(1, sess.getUid());
        rs = pstmt.executeQuery();

        if (!rs.next()) {
            displayy.setText("<html><div style='text-align:center; color:#757575;'>No active membership found.</div></html>");
            stopTimer();
            return;
        }

        String startStr = rs.getString("start_datetime");
        String endStr = rs.getString("end_datetime");
        String status = rs.getString("activation_status");
        String cancelReason = rs.getString("cancel_reason");

        if ("Cancelled".equalsIgnoreCase(status)) {
            if (cancelReason == null || cancelReason.trim().isEmpty()) {
                cancelReason = "No reason provided";
            }

            String message = "<html><div style='text-align:center; color:#d32f2f;'>" +
                             "<h3 style='margin-bottom:5px;'>MEMBERSHIP CANCELLED</h3>" +
                             "<div style='background-color:#ffebee; padding:10px; border-radius:5px;'>" +
                             "<b>Reason:</b> " + cancelReason + "</div></div></html>";

            displayy.setText(message);
            stopTimer();
            return;
        }

        if (startStr == null || startStr.isEmpty() || endStr == null || endStr.isEmpty()) {
            displayy.setText("<html><div style='text-align:center; color:#757575;'>No valid membership period found.</div></html>");
            stopTimer();
            return;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime start = LocalDateTime.parse(startStr, formatter);
            LocalDateTime end = LocalDateTime.parse(endStr, formatter);

            switch (status) {
                case "Activated":
                    startMembershipCountdown(end, start, end);
                    break;

                case "Expired":
    String expiredMsg = "<html><div style='text-align:center; color:#d32f2f; font-weight:bold; font-size:16px;'>" +
                        "MEMBERSHIP EXPIRED</div><br>" +
                        "<div style='text-align:center; font-size:14px; color:#d32f2f;'>" +
                        "Your membership expired on:<br>" +
                        "<b>" + end.format(formatter) + "</b><br><br>" +
                        "Please buy again to continue enjoying our services.<br>" +
                        "<i>Contact support or visit the membership page to renew.</i>" +
                        "</div></html>";
    displayy.setText(expiredMsg);
    stopTimer();
    break;

                default:
                    displayy.setText("<html><div style='text-align:center; color:#757575;'>Unknown membership status.</div></html>");
                    stopTimer();
                    break;
            }
        } catch (DateTimeParseException ex) {
            displayy.setText("<html><div style='text-align:center; color:#d32f2f;'>Invalid date format in records.</div></html>");
            stopTimer();
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        displayy.setText("<html><div style='text-align:center; color:#d32f2f;'>Database error occurred.</div></html>");
    } finally {
        try {
            if (rs != null) rs.close();
            if (pstmt != null) pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


private void stopTimer() {
    if (countdownTimer != null) {
        countdownTimer.stop();
        timerStarted = false;
    }
    isPaused = false;
}


    private void startMembershipCountdown(LocalDateTime endDateTime, LocalDateTime startTime, LocalDateTime endTimeFull) {
    this.endTime = endDateTime;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String endDateString = endTimeFull.format(formatter);
    String initialMessage = "<html><b>Membership Active!</b><br>Start Date & Time: %s<br>End Date & Time: %s<br><br>Time left: ";

    if (timerStarted) {
        countdownTimer.stop();
    }
    timerStarted = true;
    isPaused = false;

    countdownTimer = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isPaused) {
                return;
            }

            LocalDateTime now = LocalDateTime.now();
            Duration remaining = Duration.between(now, endTime);
            String startDateString = now.format(formatter); 

            if (!remaining.isNegative()) {
                String msg = String.format(initialMessage, startDateString, endDateString) + formatDuration(remaining) + 
                             "<br><span style='color:red'><i>We're open 24/7</i></span></html>";
                displayy.setText(msg);
            } else {
                displayy.setText("<html><b>Membership expired.</b></html>");
                countdownTimer.stop();
                timerStarted = false;
                isPaused = false;
            }
        }
    });

    countdownTimer.start();
}

   

    private String formatDuration(Duration duration) {
        long days = duration.toDays();
        long hours = duration.minusDays(days).toHours();
        long minutes = duration.minusDays(days).minusHours(hours).toMinutes();
        long seconds = duration.minusDays(days).minusHours(hours).minusMinutes(minutes).getSeconds();
        return String.format("%d days, %02d:%02d:%02d", days, hours, minutes, seconds);
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
        jLabel31 = new javax.swing.JLabel();
        memberships = new javax.swing.JLabel();
        displayy = new javax.swing.JLabel();

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

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/stylized_gaming_logo_480x480.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 450, 540));

        memberships.setFont(new java.awt.Font("Bell MT", 1, 35)); // NOI18N
        memberships.setForeground(new java.awt.Color(203, 14, 14));
        memberships.setText("SILVER");
        jPanel2.add(memberships, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 150, 60));

        displayy.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        displayy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(displayy, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 310, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 90, 840, 470));

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
    } else {
        displayMembershipType();

        if (memberships.getText().isEmpty() && !membershipMessageShown) {
            JOptionPane.showMessageDialog(null, "No membership found for the current user.");
            membershipMessageShown = true;

            userdashboard dash = new userdashboard(); 
            dash.setVisible(true);
            this.dispose(); 
        }
    }

       
    }//GEN-LAST:event_formWindowActivated

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
      userdashboard userr = new userdashboard();
   userr.setVisible(true);
      this.dispose();
        
    }//GEN-LAST:event_jLabel29MouseClicked

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
            java.util.logging.Logger.getLogger(subscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subscription.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subscription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel displayy;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
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
    public javax.swing.JLabel memberships;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
