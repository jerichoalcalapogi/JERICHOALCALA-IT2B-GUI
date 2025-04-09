/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.Session;
import internetcafe.*;
import config.dbConnect;
import config.passwordHasher;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class adduser extends javax.swing.JFrame {

    
    public adduser() {
        initComponents();
          setResizable(false);
          setLocationRelativeTo(null);
           this.dispose();
      
    } 
    
 private void recordTransactionLog(int userId, String event, String description) {
    try {
        dbConnect dbc = new dbConnect();
        String query = "INSERT INTO tbl_log (c_id, log_event, log_description, log_timestamp) VALUES (?, ?, ?, NOW())";
        PreparedStatement pstmt = dbc.getConnection().prepareStatement(query);
        pstmt.setInt(1, userId);  
        pstmt.setString(2, event);
        pstmt.setString(3, description);
        pstmt.executeUpdate();
        pstmt.close();
        dbc.closeConnection();
        System.out.println("Transaction log recorded: " + event + ", " + description);
    } catch (SQLException e) {
        System.err.println("Error recording transaction log: " + e.getMessage());
        // Consider more robust error handling here, such as logging to a file or displaying an error message to the user
    }
}
 public void logEvent(int userId, String username, String action) 
    {
        dbConnect dbc = new dbConnect();
        Connection con = dbc.getConnection();
        PreparedStatement pstmt = null;
      Timestamp time = new Timestamp(new java.util.Date().getTime());

        try {
            String sql = "INSERT INTO tbl_log (c_id, username, log_timestamp, log_description) "
                    + "VALUES ('" + userId + "', '" + username + "', '" + time + "', '" + action + "')";
            pstmt = con.prepareStatement(sql);

            /*            pstmt.setInt(1, userId);
            pstmt.setString(2, username);
            pstmt.setTimestamp(3, new Timestamp(new Date().getTime()));
            pstmt.setString(4, userType);*/
            pstmt.executeUpdate();
            System.out.println("Login log recorded successfully.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error recording log: " + e.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            }
        }
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
   
    Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (255,255,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        contact = new javax.swing.JTextField();
        registerr = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
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
        jLabel37 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        currentuser2 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ques = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        ans = new javax.swing.JPasswordField();

        jLabel23.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel23.setText("Answer:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 170, 30));

        registerr.setBackground(new java.awt.Color(255, 255, 255));
        registerr.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        registerr.setText("ADD");
        registerr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        registerr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerrMouseExited(evt);
            }
        });
        registerr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerrActionPerformed(evt);
            }
        });
        jPanel1.add(registerr, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 510, 110, 40));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cancel.setText("CLEAR");
        cancel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 110, 40));

        ps.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 170, 30));

        ln.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 170, 30));

        em.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, 170, 30));

        us.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 220, 170, 30));

        fn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 170, 30));

        confirmpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 170, 30));

        type.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Admin", "Owner", " ", " " }));
        type.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 170, 30));

        jLabel4.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel4.setText("Last name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 140, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel16.setText("Username:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 130, 30));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel17.setText("Type:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 210, 40));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 110, 30));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("First name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 140, 30));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel20.setText("Password:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, 130, 30));

        jLabel21.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel21.setText("CONFIRM PASS:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 180, 40));

        jLabel22.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel22.setText("Contact #:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 210, 40));

        jPanel5.setBackground(new java.awt.Color(200, 32, 32));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRATION FORM");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-left-100.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 100, 60));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 70, 100));

        jLabel12.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Add member form");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 320, 50));

        currentuser2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        currentuser2.setForeground(new java.awt.Color(255, 255, 255));
        currentuser2.setText("Current user:");
        jPanel5.add(currentuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 190, 60));

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel5.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 210, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 80));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/ekosh (1).jpg"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 490, 540));

        jLabel24.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel24.setText("QUESTION:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 200, 40));

        ques.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        ques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What was your mother's maiden name?", "What city were you born in?", "What is your favorite pet's name?", "What was the name of your first school?\"", "What is your favorite book?", " ", " ", " ", " " }));
        ques.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        ques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quesActionPerformed(evt);
            }
        });
        jPanel1.add(ques, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 350, 30));

        jLabel25.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel25.setText("Answer:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 210, 40));

        ans.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ans.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        jPanel1.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void registerrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerrMouseEntered
        registerr.setBackground(hover);
    }//GEN-LAST:event_registerrMouseEntered

    private void registerrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerrMouseExited
        registerr.setBackground(defaultcolor);
    }//GEN-LAST:event_registerrMouseExited

    private void registerrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerrActionPerformed

         Session sess = Session.getInstance();
    dbConnect connector = new dbConnect();
    int LID = 0;


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
    int generatedUserId = 0;
    try {

        String pass = passwordHasher.hashPassword(ps.getText());
        String answer = passwordHasher.hashPassword(ans.getText());
        String username = us.getText();
        String selectedQuestion = ques.getSelectedItem().toString();
        int userId = 0;
        String uname2 = null;

        int resultUser = dbc.insertData(
                "INSERT INTO tbl_user (fname, lname, email, username, password, contactnum, type, status,u_image) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)",
                fn1.getText(), ln.getText(), em.getText(), username, pass, contact.getText(), type.getSelectedItem(), "Pending", "null"
        );

        if (resultUser > 0) {
            ResultSet generatedKeys = dbc.getData("SELECT LAST_INSERT_ID()");
            if (generatedKeys != null && generatedKeys.next()) {
                generatedUserId = generatedKeys.getInt(1);


                try {
                    String query2 = "SELECT c_id FROM tbl_user WHERE c_id = '"+sess.getUid()+"' ";
                    PreparedStatement pstmt = connector.getConnection().prepareStatement(query2);

                    ResultSet resultSet = pstmt.executeQuery();

                    if (resultSet.next()) {
                        userId = resultSet.getInt("c_id");
                    }
                } catch (SQLException ex) {
                    System.out.println("SQL Exception: " + ex);
                    JOptionPane.showMessageDialog(null, "Error retrieving user information: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                }


                String event = "User Added";
                String description = "Added account ID " + generatedUserId + ""; 
         
                recordTransactionLog(userId, event, description);

                int resultForgot = dbc.insertData(
                        "INSERT INTO tbl_forgotpass (c_id, fp_question, fp_answer) VALUES (?, ?, ?)",
                        generatedUserId, selectedQuestion, answer
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
            if (generatedKeys != null) {
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
        if (dbc != null) {
            dbc.closeConnection();


  
            
        }
      
    }//GEN-LAST:event_registerrActionPerformed
}
    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        fn1.setText("");
        ln.setText("");
        em.setText("");
        us.setText("");
        ps.setText("");
        confirmpass.setText("");
        contact.setText("");
        type.setSelectedIndex(0);
        fn1.requestFocus();
       

    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(hover);

    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(defaultcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

    }//GEN-LAST:event_cancelActionPerformed

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

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
     
            adminuser ads = new adminuser();
            ads.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void quesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       Session sess = Session.getInstance();
        
        currentuser2.setText(""+sess.getUid());
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adduser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adduser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ans;
    private javax.swing.JButton cancel;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel currentuser2;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField ps;
    private javax.swing.JComboBox<String> ques;
    private javax.swing.JButton registerr;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
