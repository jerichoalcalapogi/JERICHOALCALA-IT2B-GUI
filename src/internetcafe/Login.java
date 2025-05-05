
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

 
public class Login extends javax.swing.JFrame {

   
     
     
    public Login() {
        initComponents();
        setResizable(false);      
    }
    

    static String Status;
    static String Type;
    

public static boolean loginAcc(String usernamee, String passwordd){
    dbConnect connector = new dbConnect();
        try {
            String query = "SELECT * FROM tbl_user WHERE username = ?"; 
            java.sql.PreparedStatement pst = connector.getConnection().prepareStatement(query); 
            pst.setString(1, usernamee);
            ResultSet resultSet = pst.executeQuery();
            
            if (resultSet.next()) {
                String hashedPass = resultSet.getString("password");
                String rehashedPass = passwordHasher.hashPassword(passwordd);
                if (hashedPass.equals(rehashedPass)) {
                    Status = resultSet.getString("status");
                    Type = resultSet.getString("type");
                    Session sess = Session.getInstance();
                    sess.setUid(resultSet.getInt("c_id"));
                    sess.setFnamee(resultSet.getString("fname"));
                    sess.setLnamee(resultSet.getString("lname"));
                    sess.setEmaill(resultSet.getString("email"));
                    sess.setUserrname(resultSet.getString("username"));
                    sess.setContact(resultSet.getString("contactnum"));
                    sess.setTpyee(resultSet.getString("type"));
                    sess.setStatuss(resultSet.getString("status"));
                    sess.setUimage(resultSet.getString("u_image"));

             
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (SQLException | NoSuchAlgorithmException ex) {
            ex.printStackTrace();
            return false;
        }
    }

   

private static void logLogin(int userId, dbConnect connector) {
    String sql = "INSERT INTO tbl_log (c_id, log_event, log_description, log_timestamp) VALUES (?, ?, ?, ?)";
    try {
        java.sql.PreparedStatement pst = connector.getConnection().prepareStatement(sql); 
        pst.setInt(1, userId);
        pst.setString(2, "LOGIN");
        pst.setString(3, "Logged in successfully");
        pst.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Login log created successfully.");
        } else {
            System.out.println("Failed to create login log.");
        }
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
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
        hide = new javax.swing.JLabel();
        show = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pasw = new javax.swing.JPasswordField();
        login = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblMovingText = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        reg2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        reg3 = new javax.swing.JLabel();
        reg4 = new javax.swing.JLabel();

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
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 140, 30));

        hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hide-50.png"))); // NOI18N
        hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                hideMouseReleased(evt);
            }
        });
        jPanel1.add(hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 60, 40));

        show.setForeground(new java.awt.Color(153, 102, 0));
        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-eye-50.png"))); // NOI18N
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 200, 70, 100));

        user.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 200, 40));

        pasw.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        pasw.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasw.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(pasw, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 200, 40));

        login.setBackground(new java.awt.Color(200, 32, 32));
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

        loggin.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin.setText("Log In");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
        });
        login.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 70, 20));

        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 200, 40));

        jLabel5.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 140, -1));

        reg.setBackground(new java.awt.Color(102, 102, 102));
        reg.setFont(new java.awt.Font("Yu Gothic UI", 2, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(200, 32, 32));
        reg.setText("Click here to register!");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 340, 130));

        jPanel2.setBackground(new java.awt.Color(200, 32, 32));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("REGISTRATION FORM");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel10.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("LOGIN FORM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 320, 60));

        lblMovingText.setBackground(new java.awt.Color(255, 255, 255));
        lblMovingText.setFont(new java.awt.Font("Engravers MT", 0, 24)); // NOI18N
        lblMovingText.setText("ARE YOU READY?");
        lblMovingText.setAlignmentX(1.0F);
        lblMovingText.setAlignmentY(3.0F);
        lblMovingText.setIconTextGap(10);
        jPanel2.add(lblMovingText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 300, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 430, 100));

        jLabel25.setFont(new java.awt.Font("Constantia", 1, 10)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Join Cross Cyber Arena today and take your online experience to the next level!  ");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 380, 90));

        reg2.setBackground(new java.awt.Color(102, 102, 102));
        reg2.setFont(new java.awt.Font("Yu Gothic Light", 3, 16)); // NOI18N
        reg2.setForeground(new java.awt.Color(200, 32, 32));
        reg2.setText("Click here");
        reg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg2MouseClicked(evt);
            }
        });
        jPanel1.add(reg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 150, 50));

        jSeparator1.setForeground(new java.awt.Color(200, 32, 32));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 180, 0));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/stylized_gaming_logo_480x480.png"))); // NOI18N
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, -30, 450, 540));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-eye-50.png"))); // NOI18N
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 110, 180));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-eye-50.png"))); // NOI18N
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 110, 180));

        reg3.setBackground(new java.awt.Color(102, 102, 102));
        reg3.setFont(new java.awt.Font("Yu Gothic Light", 2, 18)); // NOI18N
        reg3.setText("Not Registered?");
        reg3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg3MouseClicked(evt);
            }
        });
        jPanel1.add(reg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 150, 90));

        reg4.setBackground(new java.awt.Color(102, 102, 102));
        reg4.setFont(new java.awt.Font("Yu Gothic Light", 2, 16)); // NOI18N
        reg4.setText("Forgot password?");
        reg4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg4MouseClicked(evt);
            }
        });
        jPanel1.add(reg4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 150, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, Short.MAX_VALUE)
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
 logLogin(Session.getInstance().getUid(), new dbConnect());
                if (Type.equals("Admin")) {
                    Admindashboard adss = new Admindashboard();
                    adss.setVisible(true);
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
       
        forgotpassword forgot = new  forgotpassword();
        forgot.setVisible(true);
        this.dispose();
    
        
        
    }//GEN-LAST:event_reg2MouseClicked

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
  
        final int MAX_X = 400;
        final int MIN_X = 50;

        Thread animation = new Thread(new Runnable() {
            @Override
            public void run() {
                int x = 20;
                int y = 30;  //label start positions
                boolean checked = true;
                while (true) {
                    if (checked) {
                        lblMovingText.setLocation(x, y);
                        x += 10;
                    } else {
                        lblMovingText.setLocation(x, y);
                        x -= 10;
                    }
                    if(x>MAX_X){
                        checked=false;
                        x=400; 
                    }
                    if(x<MIN_X){
                        checked= true;
                    }
                    try {
                        Thread.sleep(200);
                    } catch (Exception e) {

                    }
                }
            }
        });
        animation.start();
                          
    }//GEN-LAST:event_WindowOpen

    private void hideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMousePressed
       show.setVisible(true);
       hide.setVisible(false);
        pasw.setEchoChar((char)0);
        
        
    }//GEN-LAST:event_hideMousePressed

    private void hideMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideMouseReleased
        show.setVisible(false);
       hide.setVisible(true);
         pasw.setEchoChar('*');
    }//GEN-LAST:event_hideMouseReleased

    private void reg3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg3MouseClicked

    private void reg4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg4MouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_showMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hide;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblMovingText;
    private javax.swing.JLabel loggin;
    private javax.swing.JPanel login;
    private javax.swing.JPasswordField pasw;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel reg2;
    private javax.swing.JLabel reg3;
    private javax.swing.JLabel reg4;
    private javax.swing.JLabel show;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
