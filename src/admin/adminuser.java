/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;


public class adminuser extends javax.swing.JFrame {

   
    public adminuser() {
        initComponents();
        displayData();
         setResizable(false);
            setLocationRelativeTo(null);
            
    }
Color hover = new Color (102,102,102);
    Color defaultcolor = new Color (204,204,204);
 public void displayData(){
        try{
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT  fname,lname,email,username,type,status FROM tbl_user");
            table.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());

        }

 }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cancel21 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        cancel22 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        cancel33 = new javax.swing.JPanel();
        cancel34 = new javax.swing.JPanel();
        cancel35 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        cancel36 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cancel70 = new javax.swing.JPanel();
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
        jLabel96 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haha-removebg-preview (1).png"))); // NOI18N
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 230, 230));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 470));

        table.setBackground(new java.awt.Color(203, 14, 14));
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

        jLabel12.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("welcome, ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 310, 60));

        jLabel13.setFont(new java.awt.Font("Gill Sans Ultra Bold", 3, 36)); // NOI18N
        jLabel13.setText("ADMIN!");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 310, 60));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -70, 230, 230));

        jPanel8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));

        jLabel11.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("REGISTER FORM");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, -10, 310, 60));

        cancel21.setBackground(new java.awt.Color(255, 255, 255));
        cancel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel21MouseExited(evt);
            }
        });
        cancel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel32.setText("add");
        cancel21.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 80, -1));

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

        jPanel8.add(cancel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 90, 40));

        cancel33.setBackground(new java.awt.Color(255, 255, 255));
        cancel33.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel33MouseExited(evt);
            }
        });
        cancel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cancel34.setBackground(new java.awt.Color(255, 255, 255));
        cancel34.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel34MouseExited(evt);
            }
        });
        cancel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        cancel33.add(cancel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 40));

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

        cancel33.add(cancel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

        jLabel44.setBackground(new java.awt.Color(0, 0, 0));
        jLabel44.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel44.setText("DELETE");
        cancel33.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        jPanel8.add(cancel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 90, 40));

        cancel70.setBackground(new java.awt.Color(255, 255, 255));
        cancel70.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        cancel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel70MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel70MouseExited(evt);
            }
        });
        cancel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        cancel70.add(cancel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 110, 40));

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

        cancel70.add(cancel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 110, 110, 40));

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

        cancel70.add(cancel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 40));

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

        cancel70.add(cancel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 110, 40));

        jLabel96.setBackground(new java.awt.Color(0, 0, 0));
        jLabel96.setFont(new java.awt.Font("Castellar", 1, 15)); // NOI18N
        jLabel96.setText("EDIT");
        cancel70.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jPanel8.add(cancel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 90, 40));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel21MouseEntered

    private void cancel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel21MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel21MouseExited

    private void cancel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel33MouseExited

    private void cancel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel33MouseEntered

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

    private void cancel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel34MouseExited

    private void cancel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel34MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel34MouseEntered

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

    private void cancel70MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel70MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel70MouseEntered

    private void cancel70MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancel70MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cancel70MouseExited

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
          admindashboardd add = new admindashboardd();
        add.setVisible(true);
        this.dispose();     
    }//GEN-LAST:event_jLabel29MouseClicked

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cancel21;
    private javax.swing.JPanel cancel22;
    private javax.swing.JPanel cancel33;
    private javax.swing.JPanel cancel34;
    private javax.swing.JPanel cancel35;
    private javax.swing.JPanel cancel36;
    private javax.swing.JPanel cancel70;
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
