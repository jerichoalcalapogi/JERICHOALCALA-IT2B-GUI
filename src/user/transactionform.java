
package user;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import config.Session;
import config.dbConnect;
import internetcafe.Login;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import static user.editusers.getHeightFromWidth;


public class transactionform extends javax.swing.JFrame {
 
    private double pricePerHour = 0.00;
    private String currentMembershipType = "";
    public transactionform() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
       Session sess = Session.getInstance();
        updateBalance(sess.getUid());
       
        
       
        
        
        
        
        
        
       
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
LocalDate localDate = LocalDate.now();
tdate.setText(""+dtf.format(localDate));
       

      
        typee1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateMembershipImage();
                currentMembershipType = (String) typee1.getSelectedItem();
                fetchPricePerHour(); 
                calculateAmount(); 
            }
        });
duration.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                calculateAmount(); 
            }
        });
        
        
        updateMembershipImage();
    }
   
public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;

public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
          
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
        
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
          
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }



 public void updateBalance(int userId) {
    dbConnect connect = new dbConnect();
    String query = "SELECT u_balance FROM tbl_user WHERE c_id = ?"; 

    try (Connection conn = connect.getConnection();
         PreparedStatement pst = conn.prepareStatement(query)) {

        pst.setInt(1, userId);

        try (ResultSet rs = pst.executeQuery()) {
            if (rs.next()) {
                double balance = rs.getDouble("u_balance"); 

              
                SwingUtilities.invokeLater(() -> {
                    if (balancee != null) {
                        balancee.setText(" " + String.format("%.2f", balance)); 
                    }
                });
            } else {
                // If no balance found, set balance to 0.00
                SwingUtilities.invokeLater(() -> {
                    if (balancee != null) {
                        balancee.setText(" 0.00");
                    }
                });
            }
        }

        System.out.println("Updating balance for UID: " + userId);

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error loading balance: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        System.err.println("Error loading balance for user ID " + userId + ": " + ex.getMessage());

        // In case of error, set balance to 0.00
        SwingUtilities.invokeLater(() -> {
            if (balancee != null) {
                balancee.setText("₱ 0.00");
            }
        });
    }
}


 
 

 private void fetchPricePerHour() {
        String selectedType = (String) typee1.getSelectedItem();
        pricePerHour = 0.00;

        if (selectedType != null && !selectedType.isEmpty()) {
            dbConnect dbc = new dbConnect();
            Connection con = dbc.getConnection();
            PreparedStatement pst = null;
            ResultSet rs = null;

            try {
                String query = "SELECT price_per_month FROM tbl_membership WHERE m_type = ?";
                pst = con.prepareStatement(query);
                pst.setString(1, selectedType);
                rs = pst.executeQuery();

                if (rs.next()) {
                    pricePerHour = rs.getDouble("price_per_month");
                    System.out.println("Fetched Price per Hour for " + selectedType + ": " + pricePerHour); // DEBUG
                } else {
                    JOptionPane.showMessageDialog(this, "Price per month not found for " + selectedType, "Warning", JOptionPane.WARNING_MESSAGE);
                    System.out.println("Warning: Price per month not found for " + selectedType); // DEBUG
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error fetching price: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace(); // Print the full error stack for debugging
            } finally {
                try {
                    if (rs != null) rs.close();
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error closing connection: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace(); // Print the full error stack
                }
            }
        } else {
            System.out.println("Membership type is null or empty."); // DEBUG
        }
    }
 
 
   private void calculateAmount() {
    try {
        int durationMonths = Integer.parseInt(duration.getText().trim());

        if (durationMonths > 3) {
            amount.setText("Max is 3 months only!");
            return;
        }

        double totalAmount = durationMonths * pricePerHour;
        amount.setText(String.format("%.2f", totalAmount));
        System.out.println("Calculated Amount: " + totalAmount); // DEBUG
    } catch (NumberFormatException e) {
        amount.setText("Enter duration!");
        System.out.println("Invalid duration format."); // DEBUG
    }
}












public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
    private void updateMembershipImage() {
        String selectedType = (String) typee1.getSelectedItem();
        String imagePath = null;

        if (selectedType != null) {
            switch (selectedType.trim()) { 
                case "VIP1":
                    imagePath = "src/AdminUserImages/vip1.png";
                    break;
                  case "VIP2":
                    imagePath = "src/AdminUserImages/vip2.png";
                    break;    
                    case "VIP3":
                    imagePath = "src/AdminUserImages/vip3.png";
                    break;
                     case "SILVER":
                    imagePath = "src/AdminUserImages/silver.png";
                    break;
                
                default:
                    image.setIcon(null);
                    return;
            }

            if (imagePath != null) {
                File imageFile = new File(imagePath);
                if (imageFile.exists()) {
                    image.setIcon(ResizeImage(imagePath, null, image));
                } else {
                    JOptionPane.showMessageDialog(this, "Image file not found: " + imagePath, "Error", JOptionPane.ERROR_MESSAGE);
                    image.setIcon(null);
                }
            } else {
                image.setIcon(null);
            }
        } else {
            image.setIcon(null);
        }
    }



    
Color hover = new Color (102,102,102);
    Color defaultcolor = new Color (204,204,204);
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        users = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        accname = new javax.swing.JLabel();
        accname1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        memberid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tstatuss = new javax.swing.JComboBox<>();
        typee1 = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        tdate = new javax.swing.JTextField();
        duration = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        imagesss = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        balancee = new javax.swing.JLabel();
        add1 = new javax.swing.JPanel();
        buy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        receiptArea = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(172, 120, 67));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jFrame1.getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 46, -1, 440));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(185, 154, 123));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Welcome, Admin!");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 630, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 730, 80));

        jPanel8.setBackground(new java.awt.Color(240, 191, 120));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 191, 120), 5));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(185, 154, 123));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 3, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("WELCOME TO INTERNET CAFE SYSTEM!");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 630, -1));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 80));

        jPanel10.setBackground(new java.awt.Color(172, 120, 67));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users.setBackground(new java.awt.Color(172, 120, 67));
        users.setText("USERS");
        users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usersMouseClicked(evt);
            }
        });
        users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersActionPerformed(evt);
            }
        });
        jPanel10.add(users, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 80, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/waa.png"))); // NOI18N
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 170, 140));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 440));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        jFrame1.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 520));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel8.setText("CANCEL");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(203, 14, 14));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Castellar", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TRANSACTION FORM");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 460, 60));

        accname.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel12.add(accname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 90, 60));

        accname1.setFont(new java.awt.Font("Bell MT", 3, 18)); // NOI18N
        jPanel12.add(accname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 140, 50));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/icons8-administrator-male-100 (1).png"))); // NOI18N
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 90, 130));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Adobe_Express_-_file-removebg-preview.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, -60, 120, 230));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 90));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        memberid.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        memberid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        memberid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        memberid.setEnabled(false);
        memberid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberidActionPerformed(evt);
            }
        });
        jPanel2.add(memberid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 180, 40));

        jLabel19.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        jLabel19.setText("RECEIPT:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 190, 30));

        jLabel21.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel21.setText("MEMBERSHIP TYPE:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 190, 30));

        jLabel22.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel22.setText("SUBSCRIPTION STATUS:");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 210, 30));

        tstatuss.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        tstatuss.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Success", "Failed", " " }));
        tstatuss.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        tstatuss.setEnabled(false);
        tstatuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tstatussActionPerformed(evt);
            }
        });
        jPanel2.add(tstatuss, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 180, 40));

        typee1.setFont(new java.awt.Font("Centaur", 0, 18)); // NOI18N
        typee1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "REGULAR", "PREMIUM", "ELITE", "SILVER", "GOLD", "VIP1", "VIP2", "VIP3", " ", " ", " " }));
        typee1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        typee1.setEnabled(false);
        typee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typee1ActionPerformed(evt);
            }
        });
        jPanel2.add(typee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 180, 40));

        jLabel23.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel23.setText("MEMBERSHIP ID:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 190, 30));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AdminUserImages/icons8-add-32.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 40, 90));

        tdate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        tdate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        tdate.setEnabled(false);
        tdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdateActionPerformed(evt);
            }
        });
        jPanel2.add(tdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 180, 40));

        duration.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        duration.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        duration.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        duration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                durationActionPerformed(evt);
            }
        });
        jPanel2.add(duration, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 180, 40));

        jLabel24.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel24.setText("date:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 190, 30));

        imagesss.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        imagesss.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 320, 370));

        jPanel2.add(imagesss, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 340, 390));

        jLabel20.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel20.setText("MONTHS DURATION (MAX OF 3):");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 290, 30));

        amount.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(200, 32, 32), 5, true));
        amount.setEnabled(false);
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel2.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 180, 40));

        jLabel25.setFont(new java.awt.Font("Castellar", 1, 14)); // NOI18N
        jLabel25.setText("total price:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 190, 30));

        balancee.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        balancee.setForeground(new java.awt.Color(203, 14, 14));
        jPanel2.add(balancee, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 100, 20));

        add1.setBackground(new java.awt.Color(200, 32, 32));
        add1.setEnabled(false);
        add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                add1MouseExited(evt);
            }
        });
        add1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buy.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        buy.setText("BUY");
        buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyMouseClicked(evt);
            }
        });
        add1.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 20));

        jPanel2.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 130, 40));

        receiptArea.setColumns(20);
        receiptArea.setRows(5);
        receiptArea.setEnabled(false);
        jScrollPane1.setViewportView(receiptArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 290, 300));

        jLabel26.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel26.setText("BALANCE:");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 190, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 990, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usersMouseClicked
     
        
        this.dispose();
    }//GEN-LAST:event_usersMouseClicked

    private void usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
Session sess = Session.getInstance(); 
       if (sess.getUid() == 0) {

    JOptionPane.showMessageDialog(null, "No account, You must Login First!");
    Login lff= new Login();
    lff.setVisible(true);
    this.dispose();     
       } 

        
        
    }//GEN-LAST:event_formWindowActivated

    private void memberidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberidActionPerformed

    private void tstatussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tstatussActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tstatussActionPerformed

    private void typee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typee1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typee1ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
      this.dispose();
      membershiptable mem = new membershiptable();
      mem.setVisible(true);
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
      userdashboard uss = new  userdashboard();
        uss.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void tdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdateActionPerformed

    private void durationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_durationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_durationActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void buyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buyMouseClicked
     Session sess = Session.getInstance();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDate localDate = LocalDate.now();
    System.out.println(dtf.format(localDate));

    String membershipType = typee1.getSelectedItem().toString(); 

    // Validate fields
    if (memberid.getText().isEmpty() || duration.getText().isEmpty() || tdate.getText().isEmpty() || amount.getText().isEmpty() || membershipType.isEmpty()) {
        JOptionPane.showMessageDialog(null, "All fields are required");
        return;
    } 

    int months = Integer.parseInt(duration.getText());
    if (months < 1 || months > 3) {
        JOptionPane.showMessageDialog(null, "Please enter a valid duration!");
        return;
    }

    double balance = Double.parseDouble(balancee.getText()); 
    double price = Double.parseDouble(amount.getText());

    if (balance < price) {
        JOptionPane.showMessageDialog(null, "Not enough cash to avail membership!");
        return;
    }

    dbConnect dbc = new dbConnect();
    Connection con = dbc.getConnection();

    try {
        // Validation: check if user already has an active membership
        PreparedStatement checkStmt = con.prepareStatement(
            "SELECT t.end_datetime FROM tbl_transaction t " +
            "JOIN tbl_user u ON t.c_id = u.c_id " +
            "WHERE u.c_id = ? AND t.activation_status = 'Activated' " +
            "ORDER BY t.t_id DESC LIMIT 1"
        );
      checkStmt.setString(1, String.valueOf(sess.getUid()));

        ResultSet rsCheck = checkStmt.executeQuery();

        if (rsCheck.next()) {
            String endDateStr = rsCheck.getString("end_datetime");
            if (endDateStr != null && !endDateStr.isEmpty()) {
                LocalDateTime endDate = LocalDateTime.parse(endDateStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                if (LocalDateTime.now().isBefore(endDate)) {
                    JOptionPane.showMessageDialog(null, "You already have an active membership that has not yet expired.");
                    rsCheck.close();
                    checkStmt.close();
                    con.close();
                    return;
                }
            }
        }
        rsCheck.close();
        checkStmt.close();
PreparedStatement deleteCancelledStmt = con.prepareStatement(
    "DELETE FROM tbl_transaction " +
    "WHERE c_id = ? AND activation_status = 'Cancelled' " +
    "ORDER BY t_id DESC LIMIT 1"
);
deleteCancelledStmt.setString(1, String.valueOf(sess.getUid()));
deleteCancelledStmt.executeUpdate();
deleteCancelledStmt.close();

        // Proceed to insert transaction
        String transactionStatus = "Success";
        double newBalance = balance - price;
        BigDecimal newBalanceDecimal = new BigDecimal(newBalance).setScale(2, RoundingMode.HALF_UP);

        dbc.insertData("INSERT INTO tbl_transaction (c_id, m_id, duration, date, t_status, amount_to_be_paid, membership_type, activation_status) VALUES ('"
            + sess.getUid() + "','"
            + memberid.getText() + "','"
            + duration.getText() + "','"
            + tdate.getText() + "','"
            + transactionStatus + "','"
            + amount.getText() + "','"
            + membershipType + "','Pending')");

        // Update balance
        dbc.insertData("UPDATE tbl_user SET u_balance = u_balance - '" + price + "' WHERE c_id = '" + sess.getUid() + "'");

        JOptionPane.showMessageDialog(null, "Successfully Subscribed");
        receiptArea.setEnabled(true);

        try {
            ResultSet rs = dbc.getData("SELECT u_balance FROM tbl_user WHERE c_id = '" + sess.getUid() + "'");
            if (rs.next()) {
                double latestBalance = rs.getDouble("u_balance");
                balancee.setText(String.format("%.2f", latestBalance)); 
            } else {
                JOptionPane.showMessageDialog(null, "Error retrieving updated balance.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
        }

        // Generate receipt
        StringBuilder receipt = new StringBuilder();
        receipt.append("*********************************************\n");
        receipt.append("*       INTERNET CAFE MEMBERSHIP RECEIPT        *\n");
        receipt.append("*********************************************\n\n");
        Date date = new Date();
        receipt.append(date.toString() + "\n\n");
        receipt.append("User's Username: " + sess.getUserrname() + "\n");  
        receipt.append("Amount Paid: ₱" + String.format("%.2f", price) + "\n");
        receipt.append("New Balance: ₱" + String.format("%.2f", newBalanceDecimal) + "\n");
        receipt.append("Transaction Status: " + transactionStatus + "\n");
        receipt.append("Membership Type: " + membershipType + "\n");
        receiptArea.setText(receipt.toString());
        receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error during transaction: " + ex.getMessage());
    } finally {
        dbc.closeConnection();
    }



    }//GEN-LAST:event_buyMouseClicked

    private void add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseClicked
     

    }//GEN-LAST:event_add1MouseClicked

    private void add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MouseEntered

    private void add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_add1MouseExited

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
            java.util.logging.Logger.getLogger(transactionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transactionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transactionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transactionform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transactionform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accname;
    private javax.swing.JLabel accname1;
    public javax.swing.JPanel add1;
    public javax.swing.JTextField amount;
    private javax.swing.JLabel balancee;
    public javax.swing.JLabel buy;
    public javax.swing.JTextField duration;
    public javax.swing.JLabel image;
    private javax.swing.JPanel imagesss;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField memberid;
    private javax.swing.JTextArea receiptArea;
    public javax.swing.JTextField tdate;
    private javax.swing.JComboBox<String> tstatuss;
    public javax.swing.JComboBox<String> typee1;
    private javax.swing.JButton users;
    // End of variables declaration//GEN-END:variables
}
