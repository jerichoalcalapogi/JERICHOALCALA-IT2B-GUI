
package user;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import internetcafe.Login;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class changepass extends javax.swing.JFrame {

    
    public changepass() {
        initComponents();
         setResizable(false);
        setLocationRelativeTo(null);
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
        memberr = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ps1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        cancel1 = new javax.swing.JButton();
        ps3 = new javax.swing.JPasswordField();
        ps2 = new javax.swing.JPasswordField();

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

        memberr.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 20)); // NOI18N
        memberr.setText("PASSWORD");
        memberr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberrMouseClicked(evt);
            }
        });
        jPanel12.add(memberr, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 210, 70));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("CHANGE");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 160, 70));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel12.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 60, 100));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("CURRENT PASSWORD:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 240, 30));

        jLabel4.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel4.setText("NEW PASSWORD:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 210, 30));

        ps1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        jPanel2.add(ps1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 170, 30));

        jLabel6.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel6.setText("confirm PASSWORD:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 240, 30));

        confirm.setBackground(new java.awt.Color(255, 255, 255));
        confirm.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        confirm.setText("CHANGE PASSWORD");
        confirm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
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
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 170, 40));

        cancel1.setBackground(new java.awt.Color(255, 255, 255));
        cancel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cancel1.setText("BACK");
        cancel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                cancel1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        cancel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel1MouseExited(evt);
            }
        });
        cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel1ActionPerformed(evt);
            }
        });
        jPanel2.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 90, 40));

        ps3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        jPanel2.add(ps3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, 30));

        ps2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        jPanel2.add(ps2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 170, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 480, 470));

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
         
    
        
    }//GEN-LAST:event_formWindowActivated

    private void memberrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberrMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_memberrMouseClicked

    private void confirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseClicked
                          
    try {
        dbConnect dbc = new dbConnect();
        Session sess = Session.getInstance();

        String query = "SELECT password FROM tbl_user WHERE c_id = '" + sess.getUid() + "'";
        ResultSet rs = dbc.getData(query);

        if (rs.next()) {
            String olddbpass = rs.getString("password");
            String oldhash = passwordHasher.hashPassword(ps1.getText());

           
            if (!olddbpass.equals(oldhash)) {
                JOptionPane.showMessageDialog(null, "Old Password is Incorrect!");
           ps1.setText("");
          
                return; 
            }

             String password = new String(ps2.getPassword());
        String confirmPassword = new String(ps3.getPassword());
            
           if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
            ps2.setText("");
           ps3.setText("");
            return;
        }
        
         if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
            ps2.setText("");
            ps3.setText("");
            return;
        }

      
   
            String npass = passwordHasher.hashPassword(ps3.getText());
            dbc.updateData("UPDATE tbl_user SET password = '" + npass + "' WHERE c_id = '" + sess.getUid() + "'");

            JOptionPane.showMessageDialog(null, "Password Successfully Updated!");

        Login lg = new Login();
            lg.setVisible(true);
            this.dispose();
           
        } else {
            JOptionPane.showMessageDialog(null, "User not found!");
        }

    } catch (SQLException | NoSuchAlgorithmException ex) {
        System.out.println("Error: " + ex);
    }
 


        
     
        
    }//GEN-LAST:event_confirmMouseClicked

    private void confirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseEntered
        confirm.setBackground(hover);
    }//GEN-LAST:event_confirmMouseEntered

    private void confirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmMouseExited
        confirm.setBackground(defaultcolor);
    }//GEN-LAST:event_confirmMouseExited

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
      
    }//GEN-LAST:event_confirmActionPerformed

    private void cancel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1MouseClicked

    private void cancel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseEntered
      cancel1.setBackground(hover);
    }//GEN-LAST:event_cancel1MouseEntered

    private void cancel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel1MouseExited
       cancel1.setBackground(defaultcolor);
    }//GEN-LAST:event_cancel1MouseExited

    private void cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel1ActionPerformed
      editusers edd = new editusers();
      edd.setVisible(true);
      this.dispose();
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_cancel1ActionPerformed

    private void cancel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_cancel1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel1AncestorAdded

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
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changepass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changepass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel1;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel currentuser;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel memberr;
    public javax.swing.JPasswordField ps1;
    public javax.swing.JPasswordField ps2;
    public javax.swing.JPasswordField ps3;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
