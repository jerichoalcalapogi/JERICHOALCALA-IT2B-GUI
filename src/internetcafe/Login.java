/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetcafe;

import java.awt.Color;

/**
 *
 * @author ADMIN
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
       
   
    }
    
   Color hover = new Color (194,102,9);
    Color defaultcolor = new Color (172,120,67);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pasw = new javax.swing.JPasswordField();
        reg = new javax.swing.JLabel();
        cancel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(185, 154, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO INTERNET CAFE SYSTEM");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 630, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 80));

        jPanel3.setBackground(new java.awt.Color(172, 120, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/786450cc285ab6c793cc67090540d084.jpg"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 320, 310));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 360, 440));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 30));

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 2, 18)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 100, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 2, 24)); // NOI18N
        jLabel4.setText("LOG IN FORM");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, -1));

        user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 170, 30));

        pasw.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        pasw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 170, 30));

        reg.setFont(new java.awt.Font("Yu Gothic UI", 2, 18)); // NOI18N
        reg.setText("Not Registered?Click here to Register!");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 350, 40));

        cancel.setBackground(new java.awt.Color(172, 120, 67));
        cancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(185, 154, 123), 3));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setText("CANCEL");
        cancel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 80, 40));

        login.setBackground(new java.awt.Color(172, 120, 67));
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(185, 154, 123), 3));
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel8.setText("LOG IN");
        login.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 80, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
               Registration frm = new   Registration();
               frm.setVisible(true);
               this.dispose();
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_regMouseClicked

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
             login.setBackground(hover);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
          login.setBackground(defaultcolor);
    }//GEN-LAST:event_loginMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
         login.setBackground(hover);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
     
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField pasw;
    private javax.swing.JLabel reg;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
