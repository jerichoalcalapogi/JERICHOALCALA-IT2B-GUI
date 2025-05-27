
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


public class Adminlogs extends javax.swing.JFrame {

   
    public Adminlogs() {
        initComponents();
        displayData();
         setResizable(false);
         setLocationRelativeTo(null);    
         tablelogs.setRowHeight(30);
     
    }
    
    
  
    
    
    public void refreshTablee() {
    try {
        dbConnect dbc = new dbConnect();
      
        String query = "SELECT log_id, c_id, log_event, log_description, log_timestamp FROM tbl_log";
        ResultSet rs = dbc.getData(query);

        
        DefaultTableModel model = (DefaultTableModel) tablelogs.getModel();
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

      public void displayData(){
         try {
        dbConnect dbc = new dbConnect();
        String sql = "SELECT l.log_id, l.c_id, l.log_event, l.log_description, l.log_timestamp " +
                     "FROM tbl_user u, tbl_log l " +
                     "WHERE u.c_id = l.c_id";
        ResultSet rs = dbc.getData(sql);

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Log ID");
        model.addColumn("User ID");
        model.addColumn("Log Event");
        model.addColumn("Description");
        model.addColumn("Timestamp");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("log_id"),
                rs.getInt("c_id"),
                rs.getString("log_event"),
                rs.getString("log_description"),
                rs.getTimestamp("log_timestamp")
            });
        }

        tablelogs.setModel(model);
        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
    

    
 Color hover = new Color (203,14,14);
    Color defaultcolor = new Color (200,32,32);
    

   
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
        currentuser = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        refresh3 = new javax.swing.JPanel();
        loggin = new javax.swing.JLabel();
        refresh4 = new javax.swing.JPanel();
        loggin1 = new javax.swing.JLabel();
        loggin5 = new javax.swing.JLabel();
        refresh5 = new javax.swing.JPanel();
        loggin2 = new javax.swing.JLabel();
        refresh6 = new javax.swing.JPanel();
        loggin3 = new javax.swing.JLabel();
        loggin4 = new javax.swing.JLabel();

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

        currentuser.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        currentuser.setForeground(new java.awt.Color(203, 14, 14));
        jPanel8.add(currentuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 60, 60));

        jLabel15.setBackground(new java.awt.Color(255, 51, 0));
        jLabel15.setFont(new java.awt.Font("Castellar", 1, 12)); // NOI18N
        jLabel15.setText("Current user:");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 130, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 60, 240, 220));

        refresh3.setBackground(new java.awt.Color(200, 32, 32));
        refresh3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh3MouseExited(evt);
            }
        });
        refresh3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin.setText("REFRESH");
        loggin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logginMouseClicked(evt);
            }
        });
        refresh3.add(loggin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        jPanel8.add(refresh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 120, 40));

        refresh4.setBackground(new java.awt.Color(200, 32, 32));
        refresh4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh4MouseExited(evt);
            }
        });
        refresh4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin1.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin1.setText("LOGS");
        loggin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin1MouseClicked(evt);
            }
        });
        refresh4.add(loggin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 50, 20));

        loggin5.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin5.setText("DEPOSIT ");
        loggin5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loggin5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loggin5MouseExited(evt);
            }
        });
        refresh4.add(loggin5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 90, 20));

        jPanel8.add(refresh4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 160, 60));

        refresh5.setBackground(new java.awt.Color(200, 32, 32));
        refresh5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh5MouseExited(evt);
            }
        });
        refresh5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin2.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin2.setText("LOGS");
        loggin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin2MouseClicked(evt);
            }
        });
        refresh5.add(loggin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 50, 20));

        refresh6.setBackground(new java.awt.Color(200, 32, 32));
        refresh6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refresh6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refresh6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refresh6MouseExited(evt);
            }
        });
        refresh6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loggin3.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin3.setText("REFRESH");
        loggin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin3MouseClicked(evt);
            }
        });
        refresh6.add(loggin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        refresh5.add(refresh6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 120, 40));

        loggin4.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        loggin4.setText("TRANSACTION");
        loggin4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loggin4MouseClicked(evt);
            }
        });
        refresh5.add(loggin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        jPanel8.add(refresh5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 60));

        jPanel1.add(jPanel8, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    
    private void logginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logginMouseClicked

    }//GEN-LAST:event_logginMouseClicked

    private void refresh3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh3MouseClicked
          refreshTablee();
        
    }//GEN-LAST:event_refresh3MouseClicked

    private void refresh3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh3MouseEntered
        refresh3.setBackground(hover);
    }//GEN-LAST:event_refresh3MouseEntered

    private void refresh3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh3MouseExited
        refresh3.setBackground(defaultcolor);
    }//GEN-LAST:event_refresh3MouseExited

    private void loggin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin1MouseClicked
 cashinlogs app = new cashinlogs();
    app.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_loggin1MouseClicked

    private void refresh4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh4MouseClicked
       cashinlogs app = new cashinlogs();
    app.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_refresh4MouseClicked

    private void refresh4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh4MouseEntered
        refresh4.setBackground(hover);
    }//GEN-LAST:event_refresh4MouseEntered

    private void refresh4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh4MouseExited
        refresh4.setBackground(defaultcolor);
    }//GEN-LAST:event_refresh4MouseExited

    private void loggin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loggin2MouseClicked

    private void loggin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loggin3MouseClicked

    private void refresh6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh6MouseClicked

    private void refresh6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh6MouseEntered

    private void refresh6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh6MouseExited

    private void refresh5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh5MouseClicked
 transactionlogs ts= new transactionlogs();
    ts.setVisible(true);
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_refresh5MouseClicked

    private void refresh5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh5MouseEntered
       refresh5.setBackground(hover);
    }//GEN-LAST:event_refresh5MouseEntered

    private void refresh5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refresh5MouseExited
         refresh5.setBackground(defaultcolor);
    }//GEN-LAST:event_refresh5MouseExited

    private void loggin4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin4MouseClicked
        transactionlogs ts= new transactionlogs();
    ts.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_loggin4MouseClicked

    private void loggin5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loggin5MouseClicked

    private void loggin5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin5MouseEntered
    
    }//GEN-LAST:event_loggin5MouseEntered

    private void loggin5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loggin5MouseExited
      
    }//GEN-LAST:event_loggin5MouseExited
    

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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loggin;
    private javax.swing.JLabel loggin1;
    private javax.swing.JLabel loggin2;
    private javax.swing.JLabel loggin3;
    private javax.swing.JLabel loggin4;
    private javax.swing.JLabel loggin5;
    private javax.swing.JPanel refresh3;
    private javax.swing.JPanel refresh4;
    private javax.swing.JPanel refresh5;
    private javax.swing.JPanel refresh6;
    private javax.swing.JTable tablelogs;
    // End of variables declaration//GEN-END:variables
}
