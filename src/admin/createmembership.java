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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class createmembership extends javax.swing.JFrame {

    
    public createmembership() {
        initComponents();
         displayData();
          setResizable(false);
          setLocationRelativeTo(null);
            memtable.setRowHeight(30);
           this.dispose();
      
    } 
    boolean checkadd=true;
    
   
    
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

 
  public void displayData(){
    try{
        dbConnect dbc = new dbConnect();
        ResultSet rs = dbc.getData("SELECT  m_id,m_type,price_per_hour,m_status FROM tbl_membership");
       memtable.setModel(DbUtils.resultSetToTableModel(rs));
         rs.close();
    }catch(SQLException ex){
        System.out.println("Errors: "+ex.getMessage());
    }
}
   
   Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (255,255,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        mprice = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        mtype = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        currentuser2 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        mstatus = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        memtable = new javax.swing.JTable();
        updatee = new javax.swing.JButton();
        deletee = new javax.swing.JButton();

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

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        add.setText("ADD");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setBorderPainted(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 110, 40));

        cancel.setBackground(new java.awt.Color(255, 255, 255));
        cancel.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        cancel.setText("CLEAR");
        cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancel.setBorderPainted(false);
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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 110, 40));

        mprice.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        mprice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mprice.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        mprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpriceActionPerformed(evt);
            }
        });
        jPanel1.add(mprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 170, 30));

        mid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        mid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        mid.setEnabled(false);
        mid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midActionPerformed(evt);
            }
        });
        jPanel1.add(mid, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 170, 30));

        mtype.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        mtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGULAR", "PREMIUM", "ELITE", "SILVER", "GOLD", "VIP1", "VIP2", "VIP3", " ", " ", " ", " " }));
        mtype.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        mtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtypeActionPerformed(evt);
            }
        });
        jPanel1.add(mtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 170, 30));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel17.setText("STATUS:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 210, 40));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("PRICE:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 110, 30));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("MEmbership id:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 190, 30));

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
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 90, 60));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, -10, 70, 100));

        jLabel12.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("membership form");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 320, 50));

        currentuser2.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        currentuser2.setForeground(new java.awt.Color(255, 255, 255));
        currentuser2.setText("Current user:");
        jPanel5.add(currentuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, -10, 190, 60));

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel5.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 210, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 950, 80));

        mstatus.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        mstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "SUSPENDED", " ", " ", " " }));
        mstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        mstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mstatusActionPerformed(evt);
            }
        });
        jPanel1.add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 170, 30));

        jLabel20.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel20.setText("Type:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 210, 40));

        memtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        memtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(memtable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 380, 380));

        updatee.setBackground(new java.awt.Color(255, 255, 255));
        updatee.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        updatee.setText("UPDATE");
        updatee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        updatee.setBorderPainted(false);
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
        jPanel1.add(updatee, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 110, 40));

        deletee.setBackground(new java.awt.Color(255, 255, 255));
        deletee.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        deletee.setText("DELETE");
        deletee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deletee.setBorderPainted(false);
        deletee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteeMouseExited(evt);
            }
        });
        deletee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteeActionPerformed(evt);
            }
        });
        jPanel1.add(deletee, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(hover);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(defaultcolor);
    }//GEN-LAST:event_addMouseExited

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
    
    
   
    }//GEN-LAST:event_addActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked
        checkadd=true;      
        mid.setText("");
        mtype.setSelectedItem(0);
        mprice.setText("");
        mstatus.setSelectedItem(0);
         add.setEnabled(true);
  
    }//GEN-LAST:event_cancelMouseClicked

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(hover);

    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(defaultcolor);
    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

    }//GEN-LAST:event_cancelActionPerformed

    private void mpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpriceActionPerformed

    private void midActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_midActionPerformed

    private void mtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtypeActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
     
            adminuser ads = new adminuser();
            ads.setVisible(true);
             this.dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
          Session sess = Session.getInstance();
        
        currentuser.setText(""+sess.getUid());
    
      
       if (sess.getUid() == 0) {
    JOptionPane.showMessageDialog(null, "No account, You must Login First!");
    Login lff= new Login();
    lff.setVisible(true);
    this.dispose();
       
       
       
       
       
       }
       
       
        currentuser2.setText(""+sess.getUid());
    }//GEN-LAST:event_formWindowActivated

    private void mstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mstatusActionPerformed

    private void memtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memtableMouseClicked
         
       int rowIndex = memtable.getSelectedRow();
       if(rowIndex<0){
       JOptionPane.showMessageDialog(null,"Please select an item in the table!" );
       
        } else{ 
          
          try {
    dbConnect dbc = new dbConnect();
    TableModel tbl = memtable.getModel();
    ResultSet rs = dbc.getData("SELECT * FROM tbl_membership WHERE m_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
        if (rs.next()) {
            mid.setText("" + rs.getInt("m_id"));
           mtype.setSelectedItem("" + rs.getString("m_type"));
            mprice.setText("" + rs.getString("price_per_hour"));
            mstatus.setSelectedItem("" + rs.getString("m_status"));
            add.setEnabled(false);
            checkadd=false;
    }
} catch(SQLException ex) { 
    System.out.println("" + ex);
}
  
        }
        
    }//GEN-LAST:event_memtableMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
      if(checkadd){
      if ( mprice.getText().isEmpty() ) {
        JOptionPane.showMessageDialog(null, "All fields are required");
        return;
      }else{
        dbConnect dbc = new dbConnect();
dbc.insertData("INSERT INTO tbl_membership (m_type, price_per_hour, m_status, m_image) VALUES (?, ?, ?, ?)",
        mtype.getSelectedItem(), mprice.getText(), mstatus.getSelectedItem(), null);
          JOptionPane.showMessageDialog(null, "Successfully Added");  
             displayData();
               checkadd=true;      
        mid.setText("");
        mtype.setSelectedItem(0);
        mprice.setText("");
        mstatus.setSelectedItem(0);
         add.setEnabled(true);
      }
       
} else {
    JOptionPane.showMessageDialog( null,"Clear the field first");
}
   
    }//GEN-LAST:event_addMouseClicked

    private void updateeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseClicked
    
        if(mid.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Please select an item first");
    }else{
              if ( mprice.getText().isEmpty() ) {
        JOptionPane.showMessageDialog(null, "All fields are required");
        return;
        }
       dbConnect dbc = new dbConnect();
      
dbc.updateData("UPDATE tbl_membership SET m_type = '"+mtype.getSelectedItem()+"', price_per_hour = '"+mprice.getText()+"',"
        + " m_status = '"+mstatus.getSelectedItem()+"' WHERE m_id = '"+mid.getText()+"'");
JOptionPane.showMessageDialog(null, "Updated Successfully!");
        displayData();
        checkadd=true;
         mprice.setText("");
       
        } 
      
    }//GEN-LAST:event_updateeMouseClicked

    private void updateeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseEntered
     updatee.setBackground(hover);
    }//GEN-LAST:event_updateeMouseEntered

    private void updateeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeMouseExited
        updatee.setBackground(defaultcolor);
    }//GEN-LAST:event_updateeMouseExited

    private void updateeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeActionPerformed

    private void deleteeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteeMouseClicked

    private void deleteeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteeMouseEntered
       deletee.setBackground(hover);
    }//GEN-LAST:event_deleteeMouseEntered

    private void deleteeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteeMouseExited
         deletee.setBackground(defaultcolor);
    }//GEN-LAST:event_deleteeMouseExited

    private void deleteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteeActionPerformed
       
        int rowIndex = memtable.getSelectedRow();
if (rowIndex < 0) {
    JOptionPane.showMessageDialog(null, "Please select an item in the table!");
    return;
}

int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
if (confirm == JOptionPane.YES_OPTION) {
    dbConnect dbc = new dbConnect();
    TableModel tbl = memtable.getModel();
   
    String recordIdToDelete = tbl.getValueAt(rowIndex, 0).toString(); 

    try {
        String deleteQuery = "DELETE FROM tbl_membership WHERE m_id = ?"; 
        PreparedStatement pstmt = dbc.getConnection().prepareStatement(deleteQuery);
        pstmt.setString(1, recordIdToDelete);
        int affectedRows = pstmt.executeUpdate();

        if (affectedRows > 0) {
           
            DefaultTableModel model = (DefaultTableModel) memtable.getModel();
            model.removeRow(rowIndex);

            
            
             Session sess = Session.getInstance();
                int currentUserId = sess.getUid();
  
            String event = "Record Deleted";
            String description = "Deleted record with m_id: " + recordIdToDelete;
           

            JOptionPane.showMessageDialog(null, "Record deleted successfully.");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete record.");
        }

        if (pstmt != null) pstmt.close();

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
        ex.printStackTrace(); 
    } finally {
        dbc.closeConnection();
       
        
    }    
    
}
       
    }//GEN-LAST:event_deleteeActionPerformed

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
            java.util.logging.Logger.getLogger(createmembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createmembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createmembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createmembership.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createmembership().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel currentuser2;
    private javax.swing.JButton deletee;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable memtable;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mprice;
    private javax.swing.JComboBox<String> mstatus;
    private javax.swing.JComboBox<String> mtype;
    private javax.swing.JButton updatee;
    // End of variables declaration//GEN-END:variables
}
