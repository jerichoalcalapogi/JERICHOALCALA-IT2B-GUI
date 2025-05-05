
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


public class transactionlogs extends javax.swing.JFrame {

   
    public transactionlogs() {
        initComponents();
        displayData();
         setResizable(false);
         setLocationRelativeTo(null);    
         tablelogs.setRowHeight(30);
     
    }
    
    
  
    
    
   public void refreshTablee() {
    try {
        dbConnect dbc = new dbConnect();
      
        String query = "SELECT t.t_id, t.m_id, CONCAT(u.fname, ' ', u.lname) AS full_name, m.m_type, t.t_status " +
                       "FROM tbl_transaction t " +
                       "JOIN tbl_user u ON t.c_id = u.c_id " +
                       "JOIN tbl_membership m ON t.m_id = m.m_id";
        ResultSet rs = dbc.getData(query);

        DefaultTableModel model = (DefaultTableModel) tablelogs.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("t_id"),
                rs.getInt("m_id"),
                rs.getString("full_name"),
                rs.getString("m_type"),
                rs.getString("t_status")
            });
        }
        rs.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error refreshing table: " + e.getMessage());
    }
}


  public void displayData() {
    try {
        dbConnect dbc = new dbConnect();
        String sql = "SELECT t.t_id, t.m_id, u.username, CONCAT(u.fname, ' ', u.lname) AS full_name, " +
                     "m.m_type, t.duration, t.activation_status " +
                     "FROM tbl_transaction t " +
                     "JOIN tbl_user u ON t.c_id = u.c_id " +
                     "JOIN tbl_membership m ON t.m_id = m.m_id";

        ResultSet rs = dbc.getData(sql);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Transaction ID");
        model.addColumn("Membership ID");
        model.addColumn("Username");
        model.addColumn("Full Name");
        model.addColumn("Membership");
        model.addColumn("Duration");
        model.addColumn("Activation Status");  // Updated column header

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("t_id"),
                rs.getInt("m_id"),
                rs.getString("username"),
                rs.getString("full_name"),
                rs.getString("m_type"),
                rs.getString("duration"),
                rs.getString("activation_status")  // Updated data column
            });
        }

        tablelogs.setModel(model);
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
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
        tablelogs = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refresh1 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

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

        tablelogs.setBackground(new java.awt.Color(204, 204, 204));
        tablelogs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tablelogs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablelogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablelogs);

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

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel96.setText("ACTIVATION");
        refresh1.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, -1));

        jPanel8.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 140, 40));

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel8.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 60, 60));

        jLabel15.setBackground(new java.awt.Color(255, 51, 0));
        jLabel15.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel15.setText("Current user:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 240, 220));

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refresh1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseExited
       refresh1.setBackground(defaultcolor);
    }//GEN-LAST:event_refresh1MouseExited

    private void refresh1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseEntered
       refresh1.setBackground(hover);
    }//GEN-LAST:event_refresh1MouseEntered

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
    
    private void refresh1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh1MouseClicked
      
    int selectedRow = tablelogs.getSelectedRow();

    if (selectedRow != -1) {
        String username = tablelogs.getValueAt(selectedRow, 2).toString();        // Username
        String membershipType = tablelogs.getValueAt(selectedRow, 4).toString();  // Membership Type

        // Check if the membership is already activated and paused
        subscriptionactivate activateForm = new subscriptionactivate();
        activateForm.setUserFullName(username);    
        activateForm.setMembershipType(membershipType); 
        activateForm.setVisible(true);
        this.dispose();
       activateForm.enableConfirmButton();
    } else {
        JOptionPane.showMessageDialog(this, "Please select a user to activate.");
    }
        
    }//GEN-LAST:event_refresh1MouseClicked
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactionlogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh1;
    private javax.swing.JTable tablelogs;
    // End of variables declaration//GEN-END:variables
}
