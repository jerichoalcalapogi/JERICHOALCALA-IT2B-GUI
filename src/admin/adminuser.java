
package admin;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;


public class adminuser extends javax.swing.JFrame {

   
    public adminuser() {
        initComponents();
        displayData();
         setResizable(false);
            setLocationRelativeTo(null);
        table.setRowHeight(30);
    }
    
    
    public void refreshTable() {
    try {
        dbConnect dbc = new dbConnect();
        String query = "SELECT * FROM tbl_user"; 
        ResultSet rs = dbc.getData(query); 

        DefaultTableModel model = (DefaultTableModel) table.getModel();
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    
    
Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (255,255,255);
 public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT  c_id,fname,lname,email,username,type,status FROM tbl_user");
            table.setModel(DbUtils.resultSetToTableModel(rs));
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
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cancel21 = new javax.swing.JPanel();
        add = new javax.swing.JLabel();
        cancel22 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cancel23 = new javax.swing.JPanel();
        add1 = new javax.swing.JLabel();
        cancel24 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        cancel35 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cancel36 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        edit = new javax.swing.JPanel();
        cancel71 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        cancel72 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        cancel73 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        cancel74 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        cancel75 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        cancel76 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        cancel77 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        cancel78 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        cancel79 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        cancel80 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        cancel81 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        cancel82 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        cancel83 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        cancel84 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        cancel85 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        edit1 = new javax.swing.JPanel();
        cancel86 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        cancel87 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        cancel88 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        cancel89 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        cancel90 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        cancel91 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        cancel92 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        cancel93 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        cancel94 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        cancel95 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        cancel96 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        cancel97 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        cancel98 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        cancel99 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        cancel100 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
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

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        table.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 620, 350));

        jPanel5.setBackground(new java.awt.Color(203, 14, 14));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 630, -1));

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jLabel13.setText("ADMIN!");
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

        cancel21.setBackground(new java.awt.Color(255, 255, 255));
        cancel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel21MouseExited(evt);
            }
        });
        cancel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        add.setText("add");
        cancel21.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        cancel22.setBackground(new java.awt.Color(255, 255, 255));
        cancel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel22MouseExited(evt);
            }
        });
        cancel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel33.setText("add");
        cancel22.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel21.add(cancel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel23.setBackground(new java.awt.Color(255, 255, 255));
        cancel23.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel23MouseExited(evt);
            }
        });
        cancel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add1.setBackground(new java.awt.Color(0, 0, 0));
        add1.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        add1.setText("add");
        cancel23.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        cancel24.setBackground(new java.awt.Color(255, 255, 255));
        cancel24.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel24MouseExited(evt);
            }
        });
        cancel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel34.setText("add");
        cancel24.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel23.add(cancel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel21.add(cancel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 90, 40));

        jPanel8.add(cancel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 90, 40));

        delete.setBackground(new java.awt.Color(255, 255, 255));
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
        delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel35.setBackground(new java.awt.Color(255, 255, 255));
        cancel35.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel35MouseExited(evt);
            }
        });
        cancel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel46.setBackground(new java.awt.Color(0, 0, 0));
        jLabel46.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel46.setText("add");
        cancel35.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel36.setBackground(new java.awt.Color(255, 255, 255));
        cancel36.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel36MouseExited(evt);
            }
        });
        cancel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setBackground(new java.awt.Color(0, 0, 0));
        jLabel47.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel47.setText("add");
        cancel36.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel35.add(cancel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        delete.add(cancel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel44.setText("DELETE");
        delete.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jPanel8.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 90, 40));

        edit.setBackground(new java.awt.Color(255, 255, 255));
        edit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
        });
        edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel71.setBackground(new java.awt.Color(255, 255, 255));
        cancel71.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel71MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel71MouseExited(evt);
            }
        });
        cancel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setBackground(new java.awt.Color(0, 0, 0));
        jLabel81.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel81.setText("DELETE");
        cancel71.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        edit.add(cancel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 40));

        cancel72.setBackground(new java.awt.Color(255, 255, 255));
        cancel72.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel72MouseExited(evt);
            }
        });
        cancel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setBackground(new java.awt.Color(0, 0, 0));
        jLabel82.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel82.setText("add");
        cancel72.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel73.setBackground(new java.awt.Color(255, 255, 255));
        cancel73.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel73MouseExited(evt);
            }
        });
        cancel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel83.setBackground(new java.awt.Color(0, 0, 0));
        jLabel83.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel83.setText("add");
        cancel73.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel72.add(cancel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        edit.add(cancel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel74.setBackground(new java.awt.Color(255, 255, 255));
        cancel74.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel74MouseExited(evt);
            }
        });
        cancel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setBackground(new java.awt.Color(0, 0, 0));
        jLabel84.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel84.setText("EDIT");
        cancel74.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel75.setBackground(new java.awt.Color(255, 255, 255));
        cancel75.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel75MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel75MouseExited(evt);
            }
        });
        cancel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setBackground(new java.awt.Color(0, 0, 0));
        jLabel85.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel85.setText("add");
        cancel75.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel74.add(cancel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel76.setBackground(new java.awt.Color(255, 255, 255));
        cancel76.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel76MouseExited(evt);
            }
        });
        cancel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setBackground(new java.awt.Color(0, 0, 0));
        jLabel86.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel86.setText("add");
        cancel76.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel77.setBackground(new java.awt.Color(255, 255, 255));
        cancel77.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel77MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel77MouseExited(evt);
            }
        });
        cancel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setBackground(new java.awt.Color(0, 0, 0));
        jLabel87.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel87.setText("add");
        cancel77.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel76.add(cancel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel74.add(cancel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        edit.add(cancel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 40));

        cancel78.setBackground(new java.awt.Color(255, 255, 255));
        cancel78.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel78MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel78MouseExited(evt);
            }
        });
        cancel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setBackground(new java.awt.Color(0, 0, 0));
        jLabel88.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel88.setText("add");
        cancel78.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel79.setBackground(new java.awt.Color(255, 255, 255));
        cancel79.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel79MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel79MouseExited(evt);
            }
        });
        cancel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setBackground(new java.awt.Color(0, 0, 0));
        jLabel89.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel89.setText("add");
        cancel79.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel78.add(cancel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel80.setBackground(new java.awt.Color(255, 255, 255));
        cancel80.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel80MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel80MouseExited(evt);
            }
        });
        cancel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setBackground(new java.awt.Color(0, 0, 0));
        jLabel90.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel90.setText("add");
        cancel80.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel81.setBackground(new java.awt.Color(255, 255, 255));
        cancel81.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel81MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel81MouseExited(evt);
            }
        });
        cancel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setBackground(new java.awt.Color(0, 0, 0));
        jLabel91.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel91.setText("add");
        cancel81.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel80.add(cancel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel78.add(cancel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel82.setBackground(new java.awt.Color(255, 255, 255));
        cancel82.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel82MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel82MouseExited(evt);
            }
        });
        cancel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setBackground(new java.awt.Color(0, 0, 0));
        jLabel92.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel92.setText("add");
        cancel82.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel83.setBackground(new java.awt.Color(255, 255, 255));
        cancel83.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel83MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel83MouseExited(evt);
            }
        });
        cancel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setBackground(new java.awt.Color(0, 0, 0));
        jLabel93.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel93.setText("add");
        cancel83.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel82.add(cancel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel84.setBackground(new java.awt.Color(255, 255, 255));
        cancel84.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel84MouseExited(evt);
            }
        });
        cancel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setBackground(new java.awt.Color(0, 0, 0));
        jLabel94.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel94.setText("add");
        cancel84.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel85.setBackground(new java.awt.Color(255, 255, 255));
        cancel85.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel85MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel85MouseExited(evt);
            }
        });
        cancel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel95.setBackground(new java.awt.Color(0, 0, 0));
        jLabel95.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel95.setText("add");
        cancel85.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel84.add(cancel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel82.add(cancel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel78.add(cancel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, 40));

        edit.add(cancel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 40));

        edit1.setBackground(new java.awt.Color(255, 255, 255));
        edit1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        edit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edit1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edit1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edit1MouseExited(evt);
            }
        });
        edit1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel86.setBackground(new java.awt.Color(255, 255, 255));
        cancel86.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel86MouseExited(evt);
            }
        });
        cancel86.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setBackground(new java.awt.Color(0, 0, 0));
        jLabel97.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel97.setText("DELETE");
        cancel86.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        edit1.add(cancel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 40));

        cancel87.setBackground(new java.awt.Color(255, 255, 255));
        cancel87.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel87MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel87MouseExited(evt);
            }
        });
        cancel87.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setBackground(new java.awt.Color(0, 0, 0));
        jLabel98.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel98.setText("add");
        cancel87.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel88.setBackground(new java.awt.Color(255, 255, 255));
        cancel88.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel88MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel88MouseExited(evt);
            }
        });
        cancel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setBackground(new java.awt.Color(0, 0, 0));
        jLabel99.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel99.setText("add");
        cancel88.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel87.add(cancel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        edit1.add(cancel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel89.setBackground(new java.awt.Color(255, 255, 255));
        cancel89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel89.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel89MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel89MouseExited(evt);
            }
        });
        cancel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel100.setBackground(new java.awt.Color(0, 0, 0));
        jLabel100.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel100.setText("EDIT");
        cancel89.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel90.setBackground(new java.awt.Color(255, 255, 255));
        cancel90.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel90.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel90MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel90MouseExited(evt);
            }
        });
        cancel90.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setBackground(new java.awt.Color(0, 0, 0));
        jLabel101.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel101.setText("add");
        cancel90.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel89.add(cancel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel91.setBackground(new java.awt.Color(255, 255, 255));
        cancel91.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel91MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel91MouseExited(evt);
            }
        });
        cancel91.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setBackground(new java.awt.Color(0, 0, 0));
        jLabel102.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel102.setText("add");
        cancel91.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel92.setBackground(new java.awt.Color(255, 255, 255));
        cancel92.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel92MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel92MouseExited(evt);
            }
        });
        cancel92.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.setBackground(new java.awt.Color(0, 0, 0));
        jLabel103.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel103.setText("add");
        cancel92.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel91.add(cancel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel89.add(cancel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        edit1.add(cancel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 40));

        cancel93.setBackground(new java.awt.Color(255, 255, 255));
        cancel93.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel93MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel93MouseExited(evt);
            }
        });
        cancel93.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel104.setBackground(new java.awt.Color(0, 0, 0));
        jLabel104.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel104.setText("add");
        cancel93.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel94.setBackground(new java.awt.Color(255, 255, 255));
        cancel94.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel94.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel94MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel94MouseExited(evt);
            }
        });
        cancel94.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setBackground(new java.awt.Color(0, 0, 0));
        jLabel105.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel105.setText("add");
        cancel94.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel93.add(cancel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel95.setBackground(new java.awt.Color(255, 255, 255));
        cancel95.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel95.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel95MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel95MouseExited(evt);
            }
        });
        cancel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setBackground(new java.awt.Color(0, 0, 0));
        jLabel106.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel106.setText("add");
        cancel95.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel96.setBackground(new java.awt.Color(255, 255, 255));
        cancel96.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel96MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel96MouseExited(evt);
            }
        });
        cancel96.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel107.setBackground(new java.awt.Color(0, 0, 0));
        jLabel107.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel107.setText("add");
        cancel96.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel95.add(cancel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel93.add(cancel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel97.setBackground(new java.awt.Color(255, 255, 255));
        cancel97.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel97.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel97MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel97MouseExited(evt);
            }
        });
        cancel97.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel108.setBackground(new java.awt.Color(0, 0, 0));
        jLabel108.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel108.setText("add");
        cancel97.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel98.setBackground(new java.awt.Color(255, 255, 255));
        cancel98.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel98.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel98MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel98MouseExited(evt);
            }
        });
        cancel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel109.setBackground(new java.awt.Color(0, 0, 0));
        jLabel109.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel109.setText("add");
        cancel98.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel97.add(cancel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel99.setBackground(new java.awt.Color(255, 255, 255));
        cancel99.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel99.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel99MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel99MouseExited(evt);
            }
        });
        cancel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel110.setBackground(new java.awt.Color(0, 0, 0));
        jLabel110.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel110.setText("add");
        cancel99.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel100.setBackground(new java.awt.Color(255, 255, 255));
        cancel100.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel100MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel100MouseExited(evt);
            }
        });
        cancel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel111.setBackground(new java.awt.Color(0, 0, 0));
        jLabel111.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel111.setText("add");
        cancel100.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

        cancel99.add(cancel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel97.add(cancel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        cancel93.add(cancel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, 40));

        edit1.add(cancel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 40));

        jLabel112.setBackground(new java.awt.Color(0, 0, 0));
        jLabel112.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel112.setText("EDIT");
        edit1.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        edit.add(edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 40));

        jLabel113.setBackground(new java.awt.Color(0, 0, 0));
        jLabel113.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel113.setText("EDIT");
        edit.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jPanel8.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 40));

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

    private void cancel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel22MouseEntered

    private void cancel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel22MouseExited

    private void cancel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel21MouseEntered
     cancel21.setBackground(hover);
    }//GEN-LAST:event_cancel21MouseEntered

    private void cancel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel21MouseExited
       cancel21.setBackground(defaultcolor);
    }//GEN-LAST:event_cancel21MouseExited

    private void deleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseExited
       delete.setBackground(defaultcolor);
    }//GEN-LAST:event_deleteMouseExited

    private void deleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseEntered
       delete.setBackground(hover);
    }//GEN-LAST:event_deleteMouseEntered

    private void cancel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel35MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel35MouseExited

    private void cancel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel35MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel35MouseEntered

    private void cancel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel36MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel36MouseExited

    private void cancel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel36MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel36MouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
       refresh.setBackground(defaultcolor);
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
       refresh.setBackground(hover);
    }//GEN-LAST:event_refreshMouseEntered

    private void cancel71MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel71MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel71MouseEntered

    private void cancel71MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel71MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel71MouseExited

    private void cancel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel73MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel73MouseEntered

    private void cancel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel73MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel73MouseExited

    private void cancel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel72MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel72MouseEntered

    private void cancel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel72MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel72MouseExited

    private void cancel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel75MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel75MouseEntered

    private void cancel75MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel75MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel75MouseExited

    private void cancel77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel77MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel77MouseEntered

    private void cancel77MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel77MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel77MouseExited

    private void cancel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel76MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel76MouseEntered

    private void cancel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel76MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel76MouseExited

    private void cancel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel74MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel74MouseEntered

    private void cancel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel74MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel74MouseExited

    private void cancel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel79MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel79MouseEntered

    private void cancel79MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel79MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel79MouseExited

    private void cancel81MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel81MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel81MouseEntered

    private void cancel81MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel81MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel81MouseExited

    private void cancel80MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel80MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel80MouseEntered

    private void cancel80MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel80MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel80MouseExited

    private void cancel83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel83MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel83MouseEntered

    private void cancel83MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel83MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel83MouseExited

    private void cancel85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel85MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel85MouseEntered

    private void cancel85MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel85MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel85MouseExited

    private void cancel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel84MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel84MouseEntered

    private void cancel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel84MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel84MouseExited

    private void cancel82MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel82MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel82MouseEntered

    private void cancel82MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel82MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel82MouseExited

    private void cancel78MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel78MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel78MouseEntered

    private void cancel78MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel78MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel78MouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
       edit.setBackground(hover);
    }//GEN-LAST:event_editMouseEntered

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
         edit.setBackground(defaultcolor);
    }//GEN-LAST:event_editMouseExited

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
            Admindashboard add = new Admindashboard();            
            add.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
        currentuser.setText(""+sess.getUid());
    
        
    }//GEN-LAST:event_formWindowActivated

    private void cancel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel21MouseClicked
       adduser add = new adduser();
       add.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_cancel21MouseClicked

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        int rowIndex = table.getSelectedRow();
        if(rowIndex<0){
       JOptionPane.showMessageDialog(null,"Please select an item in the table!" );
       
        } else{ 
          
          try {
    dbConnect dbc = new dbConnect();
    TableModel tbl = table.getModel();
    ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE c_id ='"+tbl.getValueAt(rowIndex,0)+"' " );
    if(rs.next()) {
         createuser crtt = new createuser();
         crtt.useridd.setText("" + rs.getInt("c_id"));
        crtt.fn1.setText("" + rs.getString("fname"));
        crtt.ln.setText("" + rs.getString("lname"));
        crtt.em.setText("" + rs.getString("email"));
        crtt.us.setText("" + rs.getString("username"));
        crtt.ps.setText("" + rs.getString("password"));
        crtt.confirmpass.setText("" + rs.getString("password"));
        crtt.contact.setText("" + rs.getString("contactnum"));
        crtt.typee.setSelectedItem("" + rs.getString("type"));
        crtt.userstatus.setSelectedItem("" + rs.getString("status"));
       
         crtt.updatee.setEnabled(true);
        crtt.setVisible(true);
        this.dispose();
    }
} catch(SQLException ex) { 
    System.out.println("" + ex);
}
    }//GEN-LAST:event_editMouseClicked
    }
    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked

   int rowIndex = table.getSelectedRow();
    if (rowIndex < 0) {
        JOptionPane.showMessageDialog(null, "Please select an item in the table!");
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this record?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        dbConnect dbc = new dbConnect();
        TableModel tbl = table.getModel();
        String userIdToDelete = tbl.getValueAt(rowIndex, 0).toString();
        String usernameToDelete = ""; // Initialize to store the username

        try {
         
            ResultSet rs = dbc.getData("SELECT username FROM tbl_user WHERE c_id = '" + userIdToDelete + "'");
            if (rs.next()) {
                usernameToDelete = rs.getString("username");
            }
            if (rs != null) rs.close();


            String deleteQuery = "DELETE FROM tbl_user WHERE c_id = ?";
            PreparedStatement pstmt = dbc.getConnection().prepareStatement(deleteQuery);
            pstmt.setString(1, userIdToDelete);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                // Remove row from JTable
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(rowIndex);

                // Record transaction log
                Session sess = Session.getInstance();
                int currentUserId = sess.getUid(); // Assuming you have the current user's ID in the session
                String event = "User Deleted";
                String description = " Deleted account ID " + userIdToDelete; 
                recordTransactionLog(currentUserId, event, description);

                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete record.");
            }

            if (pstmt != null) pstmt.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error deleting record: " + ex.getMessage());
            ex.printStackTrace(); // It's good practice to print the stack trace for debugging
        } finally {
            dbc.closeConnection();
        }
        
        } 
        
        
    }//GEN-LAST:event_deleteMouseClicked

    private void cancel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel86MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel86MouseEntered

    private void cancel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel86MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel86MouseExited

    private void cancel88MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel88MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel88MouseEntered

    private void cancel88MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel88MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel88MouseExited

    private void cancel87MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel87MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel87MouseEntered

    private void cancel87MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel87MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel87MouseExited

    private void cancel90MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel90MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel90MouseEntered

    private void cancel90MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel90MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel90MouseExited

    private void cancel92MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel92MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel92MouseEntered

    private void cancel92MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel92MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel92MouseExited

    private void cancel91MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel91MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel91MouseEntered

    private void cancel91MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel91MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel91MouseExited

    private void cancel89MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel89MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel89MouseEntered

    private void cancel89MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel89MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel89MouseExited

    private void cancel94MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel94MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel94MouseEntered

    private void cancel94MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel94MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel94MouseExited

    private void cancel96MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel96MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel96MouseEntered

    private void cancel96MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel96MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel96MouseExited

    private void cancel95MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel95MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel95MouseEntered

    private void cancel95MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel95MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel95MouseExited

    private void cancel98MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel98MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel98MouseEntered

    private void cancel98MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel98MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel98MouseExited

    private void cancel100MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel100MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel100MouseEntered

    private void cancel100MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel100MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel100MouseExited

    private void cancel99MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel99MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel99MouseEntered

    private void cancel99MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel99MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel99MouseExited

    private void cancel97MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel97MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel97MouseEntered

    private void cancel97MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel97MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel97MouseExited

    private void cancel93MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel93MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel93MouseEntered

    private void cancel93MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel93MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel93MouseExited

    private void edit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_edit1MouseClicked

    private void edit1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_edit1MouseEntered

    private void edit1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edit1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_edit1MouseExited

    private void cancel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel24MouseEntered

    private void cancel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel24MouseExited

    private void cancel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel23MouseClicked

    private void cancel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel23MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel23MouseEntered

    private void cancel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel23MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel23MouseExited

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
      
        refreshTable();
        
        
    }//GEN-LAST:event_refreshMouseClicked
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel add1;
    private javax.swing.JPanel cancel100;
    private javax.swing.JPanel cancel21;
    private javax.swing.JPanel cancel22;
    private javax.swing.JPanel cancel23;
    private javax.swing.JPanel cancel24;
    private javax.swing.JPanel cancel35;
    private javax.swing.JPanel cancel36;
    private javax.swing.JPanel cancel71;
    private javax.swing.JPanel cancel72;
    private javax.swing.JPanel cancel73;
    private javax.swing.JPanel cancel74;
    private javax.swing.JPanel cancel75;
    private javax.swing.JPanel cancel76;
    private javax.swing.JPanel cancel77;
    private javax.swing.JPanel cancel78;
    private javax.swing.JPanel cancel79;
    private javax.swing.JPanel cancel80;
    private javax.swing.JPanel cancel81;
    private javax.swing.JPanel cancel82;
    private javax.swing.JPanel cancel83;
    private javax.swing.JPanel cancel84;
    private javax.swing.JPanel cancel85;
    private javax.swing.JPanel cancel86;
    private javax.swing.JPanel cancel87;
    private javax.swing.JPanel cancel88;
    private javax.swing.JPanel cancel89;
    private javax.swing.JPanel cancel90;
    private javax.swing.JPanel cancel91;
    private javax.swing.JPanel cancel92;
    private javax.swing.JPanel cancel93;
    private javax.swing.JPanel cancel94;
    private javax.swing.JPanel cancel95;
    private javax.swing.JPanel cancel96;
    private javax.swing.JPanel cancel97;
    private javax.swing.JPanel cancel98;
    private javax.swing.JPanel cancel99;
    private javax.swing.JLabel currentuser;
    private javax.swing.JPanel delete;
    private javax.swing.JPanel edit;
    private javax.swing.JPanel edit1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel refresh;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
