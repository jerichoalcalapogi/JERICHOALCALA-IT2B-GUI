
package admin;

import config.Session;
import config.dbConnect;
import config.passwordHasher;
import internetcafe.Login;
import internetcafe.Registrationn;
import static internetcafe.Registrationn.emaill;
import static internetcafe.Registrationn.userrname;
import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;


public class createuser extends javax.swing.JFrame {

   
    public createuser() {
        initComponents();
        setResizable(false);
          setLocationRelativeTo(null);
         Color hover = new Color (200,32,32);
    Color defaultcolor = new Color (0,0,0);

       
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


    
  

   public boolean UpdateCheck(){
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT * FROM tbl_user WHERE (username = '" + us.getText() + "' OR email = '" + em.getText() + "') AND c_id != '"+useridd.getText()+"'";
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

  
  
 
    
      Color hover = new Color (102,102,102);
    Color defaultcolor = new Color (204,204,204);
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
        typee = new javax.swing.JComboBox<>();
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
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        userstatus = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        useridd = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        updatee = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contact.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 170, 30));

        ps.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ps.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ps.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        ps.setEnabled(false);
        jPanel1.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 170, 30));

        ln.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        ln.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ln.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel1.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 170, 30));

        em.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        em.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        em.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        em.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emActionPerformed(evt);
            }
        });
        jPanel1.add(em, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 170, 30));

        us.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        us.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        jPanel1.add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 170, 30));

        fn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, 30));

        confirmpass.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        confirmpass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmpass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        confirmpass.setEnabled(false);
        jPanel1.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 170, 30));

        typee.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        typee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Admin", "Owner", " ", " " }));
        typee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        typee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeeActionPerformed(evt);
            }
        });
        jPanel1.add(typee, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 170, 30));

        jLabel4.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel4.setText("Last name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 140, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel16.setText("Username:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 130, 30));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel17.setText("USER STATUS:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 210, 40));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 110, 30));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("First name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, 30));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel20.setText("Password:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 130, 30));

        jLabel21.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel21.setText("CONFIRM PASS:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 180, 40));

        jLabel22.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel22.setText("Contact #:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 210, 40));

        jPanel5.setBackground(new java.awt.Color(203, 14, 14));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Niagara Solid", 3, 50)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("REGISTRATION FORM");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 210, 60));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-left-100.png"))); // NOI18N
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel37MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -20, 80, 120));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel5.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 70, 100));

        jLabel12.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("UPDATE FORM");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 320, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 390, 80));

        userstatus.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        userstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " ", " ", " " }));
        userstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        userstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userstatusActionPerformed(evt);
            }
        });
        jPanel1.add(userstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 170, 30));

        jLabel23.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel23.setText("Type:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 210, 40));

        useridd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        useridd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        useridd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        useridd.setEnabled(false);
        useridd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useriddActionPerformed(evt);
            }
        });
        jPanel1.add(useridd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 170, 30));

        jLabel24.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel24.setText("user id:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 140, 30));

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        delete.setText("CLEAR");
        delete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMouseExited(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 100, 40));

        updatee.setBackground(new java.awt.Color(255, 255, 255));
        updatee.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        updatee.setText("UPDATE");
        updatee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        updatee.setEnabled(false);
        updatee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateeMouseExited(evt);
            }
        });
        updatee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateeActionPerformed(evt);
            }
        });
        jPanel1.add(updatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 100, 40));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/resized_image_490x61000.png"))); // NOI18N
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 480, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void typeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeeActionPerformed

    private void userstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userstatusActionPerformed

    private void useriddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useriddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useriddActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        fn1.setText("");
        ln.setText("");
        em.setText("");
        us.setText("");
        ps.setText("");
        confirmpass.setText("");
        contact.setText("");
        typee.setSelectedIndex(0);
        userstatus.setSelectedIndex(0);
        fn1.requestFocus();
        
    }//GEN-LAST:event_deleteMouseClicked

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseEntered

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteMouseExited

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void updateeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeMouseClicked

    private void updateeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeMouseEntered

    private void updateeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeMouseExited

    private void updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeActionPerformed
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
    if(UpdateCheck()){

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
    if (password.length() < 8) {
        JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
        ps.setText("");


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
   int userId = 0;


    int resultUser = dbc.insertData("UPDATE tbl_user SET  fname='"+fn1.getText()+"',lname='"+ln.getText()+"',"
            + "email = '"+em.getText()+"',username = '"+us.getText()+"',contactnum = '"+contact.getText()+"',type = "
            + "'"+typee.getSelectedItem()+"',status ='"+userstatus.getSelectedItem()+"' WHERE c_id='"+useridd.getText()+"'");

    if (resultUser > 0) {
        ResultSet generatedKeys = null;
        try {
            generatedKeys = dbc.getData("SELECT LAST_INSERT_ID()");
            if (generatedKeys != null && generatedKeys.next()) {
                generatedUserId = generatedKeys.getInt(1);
            }

            try {
                String query2 = "SELECT c_id FROM tbl_user WHERE c_id = '"+sess.getUid()+"' ";
                PreparedStatement pstmt = connector.getConnection().prepareStatement(query2);
                ResultSet resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    userId = resultSet.getInt("c_id");
                }
                if (pstmt != null) pstmt.close();
                if (resultSet != null) resultSet.close();
            } catch (SQLException ex) {
                System.out.println("SQL Exception (selecting user ID): " + ex);
                JOptionPane.showMessageDialog(null, "Error retrieving user information: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String event = "User Edited";
            String description = "Edited account ID " + useridd.getText() + ""; 
            
            recordTransactionLog(userId, event, description);

            JOptionPane.showMessageDialog(null, "Updated Successfully!");
            adminuser ads = new adminuser();
            ads.setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            System.out.println("SQL Exception (getting last insert ID): " + ex);
            JOptionPane.showMessageDialog(null, "Error retrieving last inserted ID: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
         
        } finally {
            try {
                if (generatedKeys != null) generatedKeys.close();
            } catch (SQLException ex) {
                System.out.println("Error closing ResultSet: " + ex);
            }
        }
    

    }      
    }//GEN-LAST:event_updateeActionPerformed
    
            
    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
  adminuser admins = new adminuser();
        admins.setVisible(true);
        this.dispose();      
    
    }//GEN-LAST:event_jLabel37MouseClicked
  
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
            java.util.logging.Logger.getLogger(createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPasswordField confirmpass;
    public javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn1;
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
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField ln;
    public javax.swing.JPasswordField ps;
    public javax.swing.JComboBox<String> typee;
    public javax.swing.JButton updatee;
    public javax.swing.JTextField us;
    public javax.swing.JTextField useridd;
    public javax.swing.JComboBox<String> userstatus;
    // End of variables declaration//GEN-END:variables

    void setVisble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private dbConnect updateData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
