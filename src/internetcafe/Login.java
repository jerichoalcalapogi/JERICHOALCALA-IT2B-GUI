
package internetcafe;


import admin.admindashboardd;
import config.dbConnect;
import java.awt.Color;
import static java.lang.reflect.Array.set;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import user.userdashboard;


 
public class Login extends javax.swing.JFrame {

   
     
     
    public Login() {
        initComponents();
        setResizable(false);
   
    }
    static String Status;
    static String Type;
    

public static boolean loginAcc(String usernamee, String passwordd){
    dbConnect connector = new dbConnect();
    try{
        String query = "SELECT * FROM tbl_user WHERE username = '" + usernamee + "' AND password = '" + passwordd+ "'";
        ResultSet resultSet = connector.getData(query);
        if(resultSet.next()){
            Status = resultSet.getString("status");
             Type = resultSet.getString("type");
            return true;
        }else{
            return false;
        }
    }catch (SQLException ex) {
        return false;
    }
}

 
    
   Color hover = new Color (102,102,102);
    Color defaultcolor = new Color (204,204,204);
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pasw = new javax.swing.JPasswordField();
        cancel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        reg2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 140, 30));

        user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 190, 40));

        pasw.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        pasw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        jPanel1.add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 190, 40));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel7.setText("CANCEL");
        cancel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 90, 40));

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
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

        loggin.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        loggin.setText("LOG IN");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
        });
        login.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 20));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 90, 40));

        jLabel5.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 140, -1));

        reg.setBackground(new java.awt.Color(102, 102, 102));
        reg.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(203, 14, 14));
        reg.setText("Click here to register!");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, 340, 30));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Engravers MT", 1, 47)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CROSS");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 270, 50));

        jLabel15.setFont(new java.awt.Font("Niagara Solid", 1, 50)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CYBER ARENA");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 230, 60));

        jLabel16.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Welcome to Cross Cyber Arena, your ultimate destination ");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 280, 60));

        jLabel20.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("“Where Friendships Form ");
        jLabel20.setAlignmentY(1.0F);
        jLabel20.setIconTextGap(10);
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 420, 40));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Castellar", 0, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(203, 14, 14));
        jLabel21.setText("and Rivals Are Born!”");
        jLabel21.setAlignmentY(1.0F);
        jLabel21.setIconTextGap(10);
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 340, 100));

        jLabel22.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("or seamless and premium internet café membership.");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 290, 70));

        jLabel24.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Join Cross Cyber Arena today and take your online experience to the next level!  ");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 380, 60));

        jLabel19.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(203, 14, 14));
        jLabel19.setText("About Us");
        jLabel19.setAlignmentY(1.0F);
        jLabel19.setIconTextGap(10);
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 230, 100));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 230, 210));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 230, 210));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 230, 210));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 230, 210));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 110, 210));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 360, 230, 210));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 230, 210));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 230, 210));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 40, 230, 210));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/Screenshot_2025-02-25_210239-removebg-preview.png"))); // NOI18N
        jPanel3.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, -100, 230, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        jPanel2.setBackground(new java.awt.Color(203, 14, 14));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REGISTRATION FORM");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel10.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOGIN FORM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, -10, 310, 60));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        jLabel14.setText("ARE YOU READY?");
        jLabel14.setAlignmentX(1.0F);
        jLabel14.setAlignmentY(3.0F);
        jLabel14.setIconTextGap(10);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 300, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 430, 80));

        reg2.setBackground(new java.awt.Color(102, 102, 102));
        reg2.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N
        reg2.setText("Not Registered?");
        reg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg2MouseClicked(evt);
            }
        });
        jPanel1.add(reg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 140, 30));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 250, 230));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image-removebg-preview (6).png"))); // NOI18N
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, -40, 550, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
    

    }//GEN-LAST:event_userActionPerformed

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
               Registrationn frm = new   Registrationn();
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
         cancel.setBackground(hover);
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
       cancel.setBackground(defaultcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void logginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseClicked
  if (user.getText().isEmpty() || pasw.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "All fields are required");
    return;
}  

if (loginAcc(user.getText(), pasw.getText())) {
    if (!Status.equals("Active")) {
        JOptionPane.showMessageDialog(null, "In-Active Account, Contact the Admin First!");
        user.setText("");
        pasw.setText("");
    } else {
        JOptionPane.showMessageDialog(null, "Login Successfully!");

        if (Type.equals("Admin")) {
            admindashboardd ads = new admindashboardd();
            ads.setVisible(true);
        } else if (Type.equals("Member")) {
            userdashboard usdd = new userdashboard();
            usdd.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No account type found. Contact the Admin!");
        }
    
        this.dispose(); 
    }
} else {
    JOptionPane.showMessageDialog(null, "Invalid Account!");
    user.setText("");
    pasw.setText("");
    user.requestFocus();
}
    }//GEN-LAST:event_logginMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
     
       
    }//GEN-LAST:event_loginMouseClicked

    private void reg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg2MouseClicked

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel loggin;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField pasw;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel reg2;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
