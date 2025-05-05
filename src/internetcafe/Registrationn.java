/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetcafe;

import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Registrationn extends javax.swing.JFrame {

    
    public Registrationn() {
        initComponents();
          setResizable(false);
          setLocationRelativeTo(null);
           this.dispose();
    }     

   public static String emaill, userrname;
         public boolean duplicateCheck(){
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT * FROM tbl_user WHERE username = '" + us.getText() + "' OR email = '" + em.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
         
        if(resultSet.next()){
            emaill=resultSet.getString("email");

            if(emaill.equals(em.getText())){
            JOptionPane.showMessageDialog(null, "Email is already used!");
            em.setText("");
           
            
                }  
            userrname=resultSet.getString("username");
            if( userrname.equals(us.getText())){
            JOptionPane.showMessageDialog(null, "Username is already used!");
                  us.setText("");
            }
        return true;
        }else{
        return false;
        }   
    }catch (SQLException ex) {
             System.out.println(""+ex);
        return false;
             }
    }
   
         
         
  
        public int insertData(String sql, Object... params) throws SQLException {
        try {
            Connection connect = new dbConnect().getConnection(); // Get connection from dbConnect
            PreparedStatement statement = connect.prepareStatement(sql);

            for (int i = 0; i < params.length; i++) {
                statement.setObject(i + 1, params[i]);
            }

            return statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("" + ex);
            return 0;
        }
    }

       
   Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (200,32,32);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contact = new javax.swing.JTextField();
        ps = new javax.swing.JPasswordField();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        us = new javax.swing.JTextField();
        fn1 = new javax.swing.JTextField();
        confirmpass = new javax.swing.JPasswordField();
        type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        regis = new javax.swing.JLabel();
        reg2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        ques = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ans = new javax.swing.JPasswordField();
        register = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 200, 30));

        ps.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 200, 30));

        ln.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 200, 30));

        em.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 200, 30));

        us.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 200, 30));

        fn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 200, 30));

        confirmpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 200, 30));

        type.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Admin", "Owner", " ", " " }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 200, 30));

        jLabel4.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel4.setText("Last name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 140, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel16.setText("Username:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 130, 30));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel17.setText("USER TYPE:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 210, 40));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 110, 30));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("First name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 140, 30));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel20.setText("Password:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, 30));

        jLabel21.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel21.setText("CONFIRM PASS:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 170, 40));

        jLabel22.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel22.setText("Answer:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 210, 40));

        jPanel5.setBackground(new java.awt.Color(200, 32, 32));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRATION FORM");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 31)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTration FORM");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 420, 50));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, -10, 70, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 80));

        regis.setBackground(new java.awt.Color(102, 102, 102));
        regis.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        regis.setForeground(new java.awt.Color(200, 32, 32));
        regis.setText("Click here to login!");
        regis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regisMouseClicked(evt);
            }
        });
        jPanel1.add(regis, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 550, 320, 30));

        reg2.setBackground(new java.awt.Color(102, 102, 102));
        reg2.setFont(new java.awt.Font("Yu Gothic Light", 1, 16)); // NOI18N
        reg2.setText("Already have an account?");
        reg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg2MouseClicked(evt);
            }
        });
        jPanel1.add(reg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 550, 320, 30));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/ekosh (1).jpg"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 490, 500));

        ques.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was your mother's maiden name?", "What city were you born in?", "What is your favorite pet's name?", "What was the name of your first school?\"", "What is your favorite book?", " ", " ", " ", " " }));
        ques.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        ques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesActionPerformed(evt);
            }
        });
        jPanel1.add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 350, 30));

        jLabel23.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel23.setText("Contact #:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 200, 40));

        jLabel24.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel24.setText("QUESTION:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 200, 40));

        ans.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ans.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 200, 30));

        register.setBackground(new java.awt.Color(200, 32, 32));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        loggin.setText("REGISTER");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
        });
        register.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 100, 20));

        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 240, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1033, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void emActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void fn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fn1ActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void reg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg2MouseClicked

    private void regisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regisMouseClicked
        Login frm = new   Login();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regisMouseClicked

    private void quesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quesActionPerformed

    private void logginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseClicked
     
        if (fn1.getText().isEmpty()
            || ln.getText().isEmpty()
            || em.getText().isEmpty()
            || us.getText().isEmpty()
            || ps.getText().isEmpty()
            || contact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields are required");
            return;
        }

   
        if (!fn1.getText().matches("[a-zA-Z]+") || !ln.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "First and Last names should contain only letters.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            fn1.setText("");
            ln.setText("");
            return;
        }
           if(duplicateCheck()){
               
               System.out.println("Duplicate Exists");
               return;
           }
         
        String password = new String(ps.getPassword());
        String confirmPassword = new String(confirmpass.getPassword());

      
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match!");
            ps.setText("");
            confirmpass.setText("");
            return;
        }

        
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
        if (!em.getText().matches(regex)) {
            JOptionPane.showMessageDialog(null, "Invalid Email!");
            em.setText("");
            return;
        }

       
        if (password.length() < 8) {
            JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
            ps.setText("");
            confirmpass.setText("");
            return;
        }
        
        
        


        
        String contactNumber = contact.getText();
        if (!contactNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Contact number must contain only numbers.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            contact.setText("");
            return;
        }

     dbConnect dbc = new dbConnect();
try {
    String pass = passwordHasher.hashPassword(ps.getText());
    String answer = passwordHasher.hashPassword(ans.getText());
    String username = us.getText();
    String selectedQuestion = ques.getSelectedItem().toString();

    int resultUser = dbc.insertData(
            "INSERT INTO tbl_user (fname, lname, email, username, password, contactnum, type, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)",
            fn1.getText(), ln.getText(), em.getText(), username, pass, contact.getText(), type.getSelectedItem(), "Pending"
    );

    if (resultUser > 0) {
        // Retrieve the user ID from tbl_user
        ResultSet generatedKeys = dbc.getData("SELECT LAST_INSERT_ID()");
        if (generatedKeys != null && generatedKeys.next()) {
            int userId = generatedKeys.getInt(1);

            // Insert into tbl_forgotpass using the retrieved userId
            int resultForgot = dbc.insertData(
                    "INSERT INTO tbl_forgotpassword(c_id, fp_question, fp_answer) VALUES (?, ?, ?)",
                    userId, selectedQuestion, answer
            );

            if (resultForgot > 0) {
                JOptionPane.showMessageDialog(null, "Successfully Registered");
                this.dispose();
                Login loginFrame = new Login();
                loginFrame.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Security Question Registration Failed!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Failed to retrieve user ID!");
        }
        if(generatedKeys != null){
            generatedKeys.close();
        }
    } else {
        JOptionPane.showMessageDialog(null, "User Registration Failed! Try Again.");
    }
} catch (NoSuchAlgorithmException ex) {
    System.err.println("Hashing error: " + ex);
    JOptionPane.showMessageDialog(null, "Hashing error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
} catch (SQLException ex) {
    System.err.println("Database error: " + ex);
    JOptionPane.showMessageDialog(null, "Database error occurred.", "Error", JOptionPane.ERROR_MESSAGE);
} finally {
    if(dbc != null){
        dbc.closeConnection();
    }
}

    }//GEN-LAST:event_logginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked

    }//GEN-LAST:event_registerMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        register.setBackground(hover);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBackground(defaultcolor);
    }//GEN-LAST:event_registerMouseExited

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
            java.util.logging.Logger.getLogger(Registrationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrationn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrationn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ans;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField ln;
    private javax.swing.JLabel loggin;
    private javax.swing.JPasswordField ps;
    private javax.swing.JComboBox<String> ques;
    private javax.swing.JLabel reg2;
    private javax.swing.JLabel regis;
    private javax.swing.JPanel register;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
