
package admin;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import config.Session;
import config.dbConnect;
import internetcafe.Login;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class cashinapproval extends javax.swing.JFrame {

   
    public cashinapproval() {
        initComponents();
        displayData();
         setResizable(false);
         setLocationRelativeTo(null);    
         cashtable.setRowHeight(30);
     
    }
    
    
   public class LoanStatus {
    public static final String PENDING = "PENDING";
    public static final String PAID = "APPROVED";
    public static final String REJECTED = "REJECTED";
}
    
    
    public void refreshTablee() {
    try {
        dbConnect dbc = new dbConnect();
      
        String query = "SELECT log_id, c_id, log_event, log_description, log_timestamp FROM tbl_log";
        ResultSet rs = dbc.getData(query);

        
        DefaultTableModel model = (DefaultTableModel) cashtable.getModel();
        model.setRowCount(0); 
       
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("log_id"),
                rs.getInt("c_id"),
                rs.getString("log_event"),
                rs.getString("log_description"),
                rs.getTimestamp("log_timestamp") 
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error refreshing logs table: " + e.getMessage());
    }

}

     

public void displayData() {
    try {
        dbConnect dbc = new dbConnect();
        String sql = "SELECT mem_id, balance, c_status, c_date, c_id FROM tbl_member";
        ResultSet rs = dbc.getData(sql);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Member ID");
        model.addColumn("Balance");
        model.addColumn("Status");
        model.addColumn("Date");
        model.addColumn("User ID"); // Assuming c_id links to tbl_user

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("mem_id"),
                rs.getDouble("balance"),
                rs.getString("c_status"),
                rs.getTimestamp("c_date"),
                rs.getInt("c_id")
            });
        }

        cashtable.setModel(model); // Make sure 'tablelogs' is the correct JTable for tbl_member data
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors displaying member data: " + ex.getMessage());
    }
}

    
Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (204,204,204);

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cashtable = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        refresh1 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-administrator-male-100 (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cashtable.setBackground(new java.awt.Color(204, 204, 204));
        cashtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        cashtable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cashtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(cashtable);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 630, 350));

        jPanel5.setBackground(new java.awt.Color(203, 14, 14));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 630, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 230, 230));

        jLabel14.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("welcome to logs");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 440, 60));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-hacker-64.png"))); // NOI18N
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, -10, 70, 110));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTER FORM");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 310, 60));

        refresh.setBackground(new java.awt.Color(204, 204, 204));
        refresh.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        refresh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel96.setText("refresh");
        refresh.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jPanel8.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 100, 40));

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel8.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 60, 60));

        jLabel15.setBackground(new java.awt.Color(255, 51, 0));
        jLabel15.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel15.setText("Current user:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 240, 220));

        refresh1.setBackground(new java.awt.Color(204, 204, 204));
        refresh1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refresh1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh1MouseExited(evt);
            }
        });
        refresh1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setBackground(new java.awt.Color(0, 0, 0));
        jLabel97.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel97.setText("APPROVE");
        jLabel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel97MouseClicked(evt);
            }
        });
        refresh1.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        jPanel8.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 120, 40));

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
       refresh.setBackground(defaultcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
       refresh.setBackground(hover);
    }//GEN-LAST:event_refreshMouseEntered

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
            Admindashboard add = new Admindashboard();            
            add.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        currentuser.setText(""+sess.getUid());
    
      
       if (sess.getUid() == 0) {
    JOptionPane.showMessageDialog(null, "No account, You must Login First!");
    Login lff= new Login();
    lff.setVisible(true);
    this.dispose();

      
        
       }   
        
    }//GEN-LAST:event_formWindowActivated
    
    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
      
        refreshTablee();
        
        
    }//GEN-LAST:event_refreshMouseClicked

    private void refresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1MouseClicked

    private void refresh1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1MouseEntered

    private void refresh1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1MouseExited

    private void jLabel97MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel97MouseClicked
       
                                

 
   int selectedRow = cashtable.getSelectedRow();

    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Please select a cash request to approve.");
        return;
    }

    // Adjust column indices based on how your cashtable is populated
    int memberIdToUpdate = (int) cashtable.getValueAt(selectedRow, 0); // Assuming mem_id is at index 0
    double cashAmount = 0.0;
    String cashAmountStr = cashtable.getValueAt(selectedRow, 1).toString(); // Assuming Balance is at index 1
    String currentStatus = cashtable.getValueAt(selectedRow, 2).toString().toUpperCase(); // Assuming Status is at index 2
    int userIdToFind = (int) cashtable.getValueAt(selectedRow, 4); // Assuming c_id is at index 4

    // Check if the cash request is already approved or rejected
    if ("APPROVED".equals(currentStatus) || "REJECTED".equals(currentStatus)) {
        JOptionPane.showMessageDialog(null, "This cash request has already been processed.");
        return;
    }

    // Check if cashAmountStr is numeric before parsing
    try {
        cashAmount = Double.parseDouble(cashAmountStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid cash amount. Please ensure the cash amount is a valid number.");
        return; // Exit if cash amount is invalid
    }

    // Get admin session details
    Session sess = Session.getInstance();
    int adminId = sess.getUid();
    String adminUsername = sess.getUserrname();

    if (adminId == -1) {
        JOptionPane.showMessageDialog(null, "Admin not logged in!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Connection conn = null;
    PreparedStatement pstCashUpdate = null;
    PreparedStatement pstBalanceUpdate = null;
    PreparedStatement pstGetUser = null;
    String username = null;

    try {
        dbConnect dbc = new dbConnect();
        conn = dbc.getConnection();
        conn.setAutoCommit(false); // Start transaction

        // Get username based on c_id from tbl_user
        String getUsernameQuery = "SELECT username FROM tbl_user WHERE c_id = ?";
        pstGetUser = conn.prepareStatement(getUsernameQuery);
        pstGetUser.setInt(1, userIdToFind);
        ResultSet rsUser = pstGetUser.executeQuery();
        if (rsUser.next()) {
            username = rsUser.getString("username");
        } else {
            JOptionPane.showMessageDialog(null, "User not found for User ID: " + userIdToFind);
            return;
        }
        rsUser.close();
        pstGetUser.close();

        // 1. Update cash request status to APPROVED in tbl_member
        String sqlCashUpdate = "UPDATE tbl_member SET c_status = 'Approve' WHERE mem_id = ? AND balance = ? AND c_status = 'pending'";
        pstCashUpdate = conn.prepareStatement(sqlCashUpdate);
        pstCashUpdate.setInt(1, memberIdToUpdate);
        pstCashUpdate.setDouble(2, cashAmount);
        int cashUpdateResult = pstCashUpdate.executeUpdate();

        // Check if cash update was successful
        if (cashUpdateResult > 0) {
            // 2. Get user's current balance from tbl_member
            String getBalanceQuery = "SELECT balance FROM tbl_member WHERE c_id = ?";
            pstBalanceUpdate = conn.prepareStatement(getBalanceQuery);
            pstBalanceUpdate.setInt(1, userIdToFind);
            ResultSet rsBalance = pstBalanceUpdate.executeQuery();

            double currentBalance = 0.0;
            if (rsBalance.next()) {
                currentBalance = rsBalance.getDouble("balance");
                System.out.println("Current balance for " + username + ": " + currentBalance);  // Debugging line
            } else {
                JOptionPane.showMessageDialog(null, "User balance not found!");
                return;
            }
            rsBalance.close();

            // 3. Update user's balance by ADDING the approved cash amount
            double newBalance = currentBalance + cashAmount;
            System.out.println("New balance after cash approval: " + newBalance);  // Debugging line

            String updateBalanceQuery = "UPDATE tbl_member SET balance = ? WHERE c_id = ?";
PreparedStatement pstUpdateBalance = conn.prepareStatement(updateBalanceQuery);
pstUpdateBalance.setDouble(1, newBalance);
pstUpdateBalance.setInt(2, userIdToFind); // Correctly set the second parameter for c_id
int balanceUpdateResult = pstUpdateBalance.executeUpdate();
pstUpdateBalance.close();
            // If both operations succeed, commit the transaction
            if (balanceUpdateResult > 0) {
                conn.commit(); // Commit the transaction
                JOptionPane.showMessageDialog(null, "Cash Request Approved and Balance Updated.");

                // Log the approval
                String description = "Admin approved cash-in of ₱" + String.format("%.2f", cashAmount) + " for user " + username + " (ID: " + userIdToFind + ")";
                // ... (your logging code here) ...

                // Refresh the table with the updated cash statuses
                refreshTablee(); // Ensure this method exists and is relevant
            } else {
                conn.rollback(); // Rollback transaction if balance update fails
                JOptionPane.showMessageDialog(null, "Error updating user balance.");
            }
        } else {
            conn.rollback(); // Rollback transaction if cash update fails
            JOptionPane.showMessageDialog(null, "Cash approval failed. Request may not be in pending status or amount mismatch.");
        }

    } catch (SQLException e) {
        if (conn != null) {
            try {
                conn.rollback(); // Rollback the transaction in case of error
            } catch (SQLException sqlEx) {
                JOptionPane.showMessageDialog(null, "Error rolling back transaction: " + sqlEx.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage());
        e.printStackTrace();
    } finally {
        try {
            if (pstCashUpdate != null) pstCashUpdate.close();
            if (pstBalanceUpdate != null) pstBalanceUpdate.close();
            if (conn != null) conn.close(); // Close the connection
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error closing resources: " + e.getMessage());
            e.printStackTrace();
        }
    }

        
    }//GEN-LAST:event_jLabel97MouseClicked
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashinapproval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cashtable;
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JPanel refresh1;
    // End of variables declaration//GEN-END:variables
}
