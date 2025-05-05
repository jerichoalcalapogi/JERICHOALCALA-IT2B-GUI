
package admin;
import java.sql.SQLException;
import config.Session;
import config.dbConnect;
import internetcafe.Login;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;
import java.sql.Timestamp;
import java.util.Date;
import javax.imageio.ImageIO;

public class Admindashboard extends javax.swing.JFrame {

    
    public Admindashboard() {
        initComponents();
        setResizable(false);
         setLocationRelativeTo(null);

    }

    
    
    private void logLogout() {
   dbConnect connector = new dbConnect();
    Session sess = Session.getInstance();
    int userId = sess.getUid();

    if (userId != -1) {
        String sql = "INSERT INTO tbl_log (c_id, log_event, log_description, log_timestamp) VALUES (?, ?, ?, ?)";
        try {
            java.sql.PreparedStatement pst = connector.getConnection().prepareStatement(sql);
            pst.setInt(1, userId);
            pst.setString(2, "LOGOUT"); // Correct log event
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
    
    
    
 
    
    
    Color hover = new Color (200,32,32);
    Color defaultcolor = new Color (0,0,0);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        logout = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        accname1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(203, 14, 14));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(200, 32, 32));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jLabel11.setText("ADMIN!");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 310, 60));
        jPanel9.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview (1).png"))); // NOI18N
        logout.setMinimumSize(new java.awt.Dimension(50, 100));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel9.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -60, 230, 230));

        accname.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel9.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 60));

        accname1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel9.add(accname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 50));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("welcome, ");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 310, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-administrator-male-100 (1).png"))); // NOI18N
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 90, 120));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/image-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 160, 130));

        jSeparator4.setForeground(new java.awt.Color(200, 32, 32));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 170, 20));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel13.setText("MEMBERSHIP");
        jLabel13.setEnabled(false);
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 160, 50));

        logo.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(255, 255, 255));
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/images-removebg-preview (1).png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        jPanel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 150, 180));

        jSeparator3.setForeground(new java.awt.Color(200, 32, 32));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 170, 20));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/profile_6914786.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 210, 140));

        jSeparator1.setForeground(new java.awt.Color(200, 32, 32));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 170, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel10.setText("LOGS");
        jLabel10.setEnabled(false);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 120, 50));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel9.setText("Users");
        jLabel9.setEnabled(false);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 120, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/modern-monitor-elegant-tableee.png"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 400));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 210, 170));

        jSeparator2.setForeground(new java.awt.Color(200, 32, 32));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 170, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel12.setText("LOGS");
        jLabel12.setEnabled(false);
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 820, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    }//GEN-LAST:event_formWindowActivated
    
    }
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
      adminuser user = new adminuser();
        user.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_jLabel34MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
  
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


    }//GEN-LAST:event_logoutMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
       
      
        
        Adminlogs admslog = new Adminlogs();
        admslog.setVisible(true);
        this.dispose();
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_logoMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       Adminlogs log = new Adminlogs();
      log.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
    
       createmembership createe = new createmembership();
      createe.setVisible(true);
      this.dispose();
        
        
    }//GEN-LAST:event_jLabel13MouseClicked
    
    
  
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
            java.util.logging.Logger.getLogger(Admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admindashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admindashboard().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accname1;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
