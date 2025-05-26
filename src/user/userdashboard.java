
package user;

import config.Session;
import config.dbConnect;
import internetcafe.Login;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;


public class userdashboard extends javax.swing.JFrame {

    
    public userdashboard() {
        initComponents();
         setResizable(false);
        setLocationRelativeTo(null);
    }
Color hover = new Color (102,102,102);
    Color defaultcolor = new Color (204,204,204);
    
   
    
    private void logLogout() {
   dbConnect connector = new dbConnect();
    Session sess = Session.getInstance();
    int userId = sess.getUid();

    if (userId != -1) {
        String sql = "INSERT INTO tbl_log (c_id, log_event, log_description, log_timestamp) VALUES (?, ?, ?, ?)";
        try {
            java.sql.PreparedStatement pst = connector.getConnection().prepareStatement(sql);
            pst.setInt(1, userId);
            pst.setString(2, "LOGOUT"); 
            pst.setString(3, "Logged out successfully");
            pst.setTimestamp(4, new Timestamp(new Date().getTime()));

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Logout log created successfully.");
            } else {
                System.out.println("Failed to create logout log.");
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Failed to get User ID from session for logout log.");
    }
}
    
   
    
    
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
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        accname1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

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

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel8.setText("CANCEL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(203, 14, 14));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview (1).png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, -60, 230, 230));

        jLabel17.setFont(new java.awt.Font("Castellar", 1, 30)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("WELCOME MEMBER!");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 360, 60));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-administrator-male-100 (1).png"))); // NOI18N
        jPanel12.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 90, 140));

        accname.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel12.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 60));

        accname1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel12.add(accname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 50));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/image_no_bg_256-removebg-preview.png"))); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 230, 200));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel9.setText("ACCOUNT");
        jLabel9.setEnabled(false);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 130, 30));

        jSeparator1.setForeground(new java.awt.Color(203, 14, 14));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 10));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/image-removebg-preview (1).png"))); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 160, 130));

        jSeparator2.setForeground(new java.awt.Color(203, 14, 14));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 200, 20));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel10.setText("SUBSCRIPTION");
        jLabel10.setEnabled(false);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 180, 30));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/invitation (1).png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 160, 140));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel13.setText("MEMBERSHIP");
        jLabel13.setEnabled(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 180, 30));

        jSeparator4.setForeground(new java.awt.Color(203, 14, 14));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 220, 10));

        jLabel35.setForeground(new java.awt.Color(0, 204, 204));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/envelop.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 140, 150));

        jSeparator5.setForeground(new java.awt.Color(203, 14, 14));
        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 200, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Castellar", 1, 17)); // NOI18N
        jLabel14.setText("PURCHASE HISTORY");
        jLabel14.setEnabled(false);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 810, 430));

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
    Login lff= new Login();
    lff.setVisible(true);
    this.dispose();
}else{  
       accname.setText(""+sess.getFnamee());
          accname1.setText(""+sess.getLnamee());       
        
        
        
       } 
    }//GEN-LAST:event_formWindowActivated

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
 
    
    editusers edt = new editusers();
    Session sess = Session.getInstance();

    edt.useriddd.setText("" + sess.getUid());
    edt.fn1.setText("" + sess.getFnamee());
    edt.ln.setText("" + sess.getLnamee());
    edt.em.setText("" + sess.getEmaill());
    edt.us2.setText("" + sess.getUserrname());
    edt.contact.setText("" + sess.getContact());

    String imagePath = sess.getUimage(); 

    if (imagePath != null && !imagePath.isEmpty()) {
        
        edt.image.setIcon(edt.ResizeImage(imagePath, null, edt.image));
        edt.path = imagePath;
        edt.oldpath = imagePath;
        edt.destination = imagePath;
        edt.remove.setEnabled(true); 
    } else {
       
        edt.image.setIcon(null); 
        edt.path = "";
        edt.oldpath = "";
        edt.destination = "";
        edt.remove.setEnabled(false); 
    }

    edt.updateee.setEnabled(true);

    edt.setVisible(true);
    this.dispose();
    edt.select.setEnabled(true);
    
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
         int response = JOptionPane.showConfirmDialog(null, "Do you want to log out?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);
    if (response == JOptionPane.YES_OPTION) {
        // Log the logout
        logLogout();

        // Clear the session (important!)
        Session sess = Session.getInstance();
        sess.clearSession(); // Add a clearSession() method to your Session class

        Login logg = new Login();
        logg.setVisible(true);
        this.dispose();
    

}
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
          transactionform tss = new  transactionform();
        tss.setVisible(true);
        this.dispose();
    

    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        subscription sub = new  subscription();
        sub.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        subscription sub = new  subscription();
        sub.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
purchasehistory pur = new  purchasehistory();
        pur.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
purchasehistory pur = new  purchasehistory();
        pur.setVisible(true);
        this.dispose();                
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accname1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
