
package admin;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class Adminlogs extends javax.swing.JFrame {

   
    public Adminlogs() {
        initComponents();
        displayData();
         setResizable(false);
            setLocationRelativeTo(null);
      
    }
    
    
    public void refreshTable() {
    try {
        dbConnect dbc = new dbConnect();
        String query = "SELECT * FROM tbl_user"; 
        ResultSet rs = dbc.getData(query); 

        DefaultTableModel model = (DefaultTableModel) tablelogs.getModel();
        model.setRowCount(0); 

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("c_id"),
                rs.getString("fname"),
                rs.getString("lname"),
                rs.getString("email"),
                rs.getString("username"),
                rs.getString("type"),
                rs.getString("status")
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error refreshing table: " + e.getMessage());
    }
}

    
   
    
    
Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (255,255,255);
 public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT  c_id,fname,lname,email,username,type,status FROM tbl_user");
            tablelogs.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }
 
 }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel26 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        currentuser = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelogs = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        refresh = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();

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

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel10.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 210, 60));

        jLabel15.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Current user:");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 60));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 230, 230));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 470));

        tablelogs.setBackground(new java.awt.Color(203, 14, 14));
        tablelogs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        tablelogs.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablelogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablelogs);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 620, 350));

        jPanel5.setBackground(new java.awt.Color(203, 14, 14));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 630, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jLabel13.setText("TO LOGS");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 310, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 230, 230));

        jLabel14.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("welcome, ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 310, 60));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTER FORM");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 310, 60));

        refresh.setBackground(new java.awt.Color(255, 255, 255));
        refresh.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
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
    
        
    }//GEN-LAST:event_formWindowActivated
    
    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
      
        refreshTable();
        
        
    }//GEN-LAST:event_refreshMouseClicked
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel currentuser;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTable tablelogs;
    // End of variables declaration//GEN-END:variables
}
