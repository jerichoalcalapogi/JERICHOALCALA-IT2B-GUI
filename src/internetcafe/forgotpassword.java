
package internetcafe;



import admin.Admindashboard;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import static java.lang.reflect.Array.set;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import user.userdashboard;
import javax.swing.*;

 
public class forgotpassword extends javax.swing.JFrame {

   
     
     
    public forgotpassword() {
        initComponents();
        setResizable(false);      
    }
    

    
  Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (200,32,32);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Submit = new javax.swing.JPanel();
        loggin1 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();
        userrrr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newpasss = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        confirmpasss = new javax.swing.JPasswordField();
        secccc = new javax.swing.JTextField();
        answerrr = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(203, 14, 14));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRATION FORM");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("LOGIN FORM");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 310, 60));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel18.setText("ARE YOU READY?");
        jLabel18.setAlignmentX(1.0F);
        jLabel18.setAlignmentY(3.0F);
        jLabel18.setIconTextGap(10);
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 300, 100));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Join Cross Cyber Arena today and take your online experience to the next level!  ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel2.setText("Enter Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 210, 30));

        Submit.setBackground(new java.awt.Color(200, 32, 32));
        Submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SubmitMouseExited(evt);
            }
        });
        Submit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin1.setText("SUBMIT");
        loggin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin1MouseClicked(evt);
            }
        });
        Submit.add(loggin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 70, 20));

        jPanel1.add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, 310, 40));

        login.setBackground(new java.awt.Color(200, 32, 32));
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        loggin.setText("Search");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
        });
        login.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 30));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 60, 30));

        userrrr.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        userrrr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userrrr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        userrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userrrrActionPerformed(evt);
            }
        });
        jPanel1.add(userrrr, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 310, 40));

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel5.setText("CONFIRM NEW PASSWORD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 300, -1));

        jPanel2.setBackground(new java.awt.Color(200, 32, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REGISTRATION FORM");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel10.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FORGOT PASSWORD");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 460, 60));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 70, 100));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 230, 230));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 100));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Join Cross Cyber Arena today and take your online experience to the next level!  ");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 380, 300));

        jSeparator1.setForeground(new java.awt.Color(200, 32, 32));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 180, 0));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/stylized_gaming_logo_480x480.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 60, 450, 560));

        jLabel6.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel6.setText("Answer:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 240, -1));

        newpasss.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        newpasss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newpasss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(newpasss, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 310, 40));

        jLabel7.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel7.setText("NEW PASSWORD:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 240, -1));

        confirmpasss.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        confirmpasss.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpasss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(confirmpasss, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 310, 40));

        secccc.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        secccc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secccc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        secccc.setEnabled(false);
        secccc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seccccActionPerformed(evt);
            }
        });
        jPanel1.add(secccc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 310, 40));

        answerrr.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        answerrr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerrr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(answerrr, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 310, 40));

        jLabel8.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel8.setText("SECURITY QUESTION:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 240, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userrrrActionPerformed
    

    }//GEN-LAST:event_userrrrActionPerformed

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
  
      
                          
    }//GEN-LAST:event_WindowOpen

    private void logginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseClicked
          if (userrrr.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter the username");
        return;
    }
        
       
   
          
       
    String username = userrrr.getText();
          

    dbConnect dbc = new dbConnect();
    try {
       
        ResultSet userIdResult = dbc.getData(
                "SELECT c_id FROM tbl_user WHERE username = ?",
                username
        );

        if (userIdResult != null && userIdResult.next()) {
            int userId = userIdResult.getInt("c_id");

          
            ResultSet securityQuestionResult = dbc.getData(
                    "SELECT fp_question FROM tbl_forgotpass WHERE c_id = ?",
                    userId
            );

            if (securityQuestionResult != null && securityQuestionResult.next()) {
                String securityQuestion = securityQuestionResult.getString("fp_question");
                secccc.setText(securityQuestion);
            } else {
                JOptionPane.showMessageDialog(this, "Security question not found for this user.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username not found.");
            userrrr.setText("");
        }
    } catch (SQLException ex) {
        System.err.println("Database error: " + ex);
        JOptionPane.showMessageDialog(this, "Database error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (dbc != null) {
            dbc.closeConnection();
        }
    }


        
        
   

    }//GEN-LAST:event_logginMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked

    }//GEN-LAST:event_loginMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(hover);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBackground(defaultcolor);
    }//GEN-LAST:event_loginMouseExited

    private void seccccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seccccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seccccActionPerformed

    private void loggin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin1MouseClicked
   
    
          if ( answerrr.getText().isEmpty() || newpasss.getText().isEmpty() || confirmpasss.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
       answerrr.setText("");
        newpasss.setText("");
        confirmpasss.setText("");
    
        return; 
    }
        
   
        
          String username = userrrr.getText();
    String userAnswer = answerrr.getText(); 
    String newPassword = newpasss.getText(); 
    String confirmPassword = confirmpasss.getText();

    dbConnect dbc = new dbConnect();
    try {
       
        ResultSet userIdResult = dbc.getData(
                "SELECT c_id FROM tbl_user WHERE username = ?",
                username
        );

        if (userIdResult != null && userIdResult.next()) {
            int userId = userIdResult.getInt("c_id");

          
            ResultSet answerResult = dbc.getData(
                    "SELECT fp_answer FROM tbl_forgotpass WHERE c_id = ?",
                    userId
            );

            if (answerResult != null && answerResult.next()) {
                String storedHashedAnswer = answerResult.getString("fp_answer");

              
                String hashedUserAnswer = passwordHasher.hashPassword(userAnswer);

              
                if (storedHashedAnswer.equals(hashedUserAnswer)) {
                  
                    if (newPassword.equals(confirmPassword)) {
                  
                        String hashedNewPassword = passwordHasher.hashPassword(newPassword);

                     
                        int updateResult = dbc.insertData(
                                "UPDATE tbl_user SET password = ? WHERE c_id = ?",
                                hashedNewPassword, userId
                        );

                        
        String passwordd = new String(newpasss.getPassword());
        String confirmPasswordd = new String(confirmpasss.getPassword());
                        
                 if (passwordd.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
            newpasss.setText("");
            confirmpasss.setText("");
            return;
        }
   
                        
                        
                        if (updateResult > 0) {
                            JOptionPane.showMessageDialog(this, "Password changed successfully!");
                         Login loginForm = new Login();
                            loginForm.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "Failed to change password.");
                           
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "New password and confirm password do not match.");
                        newpasss.setText("");
                        confirmpasss.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect answer.");
                   answerrr.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Security question answer not found.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username not found.");
        }
    } catch (SQLException ex) {
        System.err.println("Database error: " + ex);
        JOptionPane.showMessageDialog(this, "Database error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NoSuchAlgorithmException ex) { 
        System.err.println("Hashing error: " + ex);
        JOptionPane.showMessageDialog(this, "Hashing error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (dbc != null) {
            dbc.closeConnection();
        }
    }

        
        
        
        
   
        
        
        
        
        
        
    }//GEN-LAST:event_loggin1MouseClicked

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseClicked

    private void SubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseEntered

    private void SubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseExited

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       Login loginFrame = new Login();
                loginFrame.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(forgotpassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotpassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Submit;
    private javax.swing.JPasswordField answerrr;
    private javax.swing.JPasswordField confirmpasss;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loggin;
    private javax.swing.JLabel loggin1;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField newpasss;
    private javax.swing.JTextField secccc;
    private javax.swing.JTextField userrrr;
    // End of variables declaration//GEN-END:variables
}
