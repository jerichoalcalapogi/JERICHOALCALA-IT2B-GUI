
package admin;

import config.Session;
import internetcafe.Login;
import java.awt.Color;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;


public class admindashboardd extends javax.swing.JFrame {

    
    public admindashboardd() {
        initComponents();
        setResizable(false);
         setLocationRelativeTo(null);

    }

    Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (0,0,0);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jLabel31 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        accname1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        userr = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(203, 14, 14));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(226, 21, 21));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jLabel11.setText("ADMIN!");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 310, 60));
        jPanel9.add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview (1).png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, -70, 230, 230));

        jLabel14.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("welcome, ");
        jPanel9.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 310, 60));

        accname.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        accname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 90, 60));

        accname1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        accname1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel9.add(accname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 80, 50));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-administrator-male-100 (1).png"))); // NOI18N
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 90, 90));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 90));

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 210, 170));

        userr.setBackground(new java.awt.Color(0, 0, 0));
        userr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userrMouseExited(evt);
            }
        });
        userr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        loggin.setForeground(new java.awt.Color(255, 255, 255));
        loggin.setText("Users");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logginMouseExited(evt);
            }
        });
        userr.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 20, 90, 20));

        jPanel10.add(userr, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 190, 60));

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 200, 450));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 810, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseClicked
  adminuser user = new adminuser();
        user.setVisible(true);
        this.dispose();        
        
    }//GEN-LAST:event_logginMouseClicked

    private void userrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userrMouseClicked
  adminuser user = new adminuser();
        user.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userrMouseClicked

    private void userrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userrMouseEntered
        userr.setBackground(hover);       
    }//GEN-LAST:event_userrMouseEntered

    private void userrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userrMouseExited
        userr.setBackground(defaultcolor); 
    }//GEN-LAST:event_userrMouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        Login logg = new Login();
        logg.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_jLabel31MouseClicked

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
    private void logginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseEntered
         userr.setBackground(hover); 
    }//GEN-LAST:event_logginMouseEntered

    private void logginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseExited
       userr.setBackground(defaultcolor); 
    }//GEN-LAST:event_logginMouseExited
    
    
  
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
            java.util.logging.Logger.getLogger(admindashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindashboardd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindashboardd().setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accname1;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel loggin;
    private javax.swing.JPanel userr;
    // End of variables declaration//GEN-END:variables
}
