
package user;

import admin.*;
import config.Session;
import config.dbConnect;
import config.passwordHasher;
import internetcafe.Login;
import internetcafe.Registrationn;
import static internetcafe.Registrationn.emaill;
import static internetcafe.Registrationn.userrname;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class editusers extends javax.swing.JFrame {

    
    public editusers() {
        initComponents();
        setResizable(false);
          setLocationRelativeTo(null);
         Color hover = new Color (200,32,32);
    Color defaultcolor = new Color (0,0,0);
    
   
       
    }
     public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path) {
    File file = new File(path);
    String fileName = file.getName();

    Path filePath = Paths.get("src/userimage", fileName);
    boolean fileExists = Files.exists(filePath);

    if (fileExists) {
        return 1;
    } else {
        return 0;
    }
}
    
      public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: "+e);
            }
        } else {
            try{
                Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    

    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
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
    
   
    
    
    
  public boolean duplicateCheck(){
    dbConnect dbc = new dbConnect();
    try {
        String query = "SELECT * FROM tbl_user WHERE username = '" + us2.getText() + "' OR email = '" + em.getText() + "'";
        ResultSet resultSet = dbc.getData(query);
         
        if(resultSet.next()){
            emaill=resultSet.getString("email");

            if(emaill.equals(em.getText())){
            JOptionPane.showMessageDialog(null, "Email is already used!");
            em.setText("");
           
            
                }  
            userrname=resultSet.getString("username");
            if( userrname.equals(us2.getText())){
            JOptionPane.showMessageDialog(null, "Username is already used!");
                  us2.setText("");
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
        String query = "SELECT * FROM tbl_user WHERE (username = '" + us2.getText() + "' OR email = '" + em.getText() + "') AND c_id != '"+useriddd.getText()+"'";
        ResultSet resultSet = dbc.getData(query);
         
        if(resultSet.next()){
            emaill=resultSet.getString("email");

            if(emaill.equals(em.getText())){
            JOptionPane.showMessageDialog(null, "Email is already used!");
            em.setText("");
           
            
                }  
            userrname=resultSet.getString("username");
            if( userrname.equals(us2.getText())){
            JOptionPane.showMessageDialog(null, "Username is already used!");
                  us2.setText("");
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
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        us2 = new javax.swing.JTextField();
        fn1 = new javax.swing.JTextField();
        typee = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        idisplay = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        userstatus = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        useriddd = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        updateee = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        reg2 = new javax.swing.JLabel();
        reg = new javax.swing.JLabel();
        imagesss = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        select = new javax.swing.JButton();

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
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 300, 170, 30));

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

        us2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        us2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        us2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        us2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                us2ActionPerformed(evt);
            }
        });
        jPanel1.add(us2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 170, 30));

        fn1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        fn1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        fn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fn1ActionPerformed(evt);
            }
        });
        jPanel1.add(fn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 170, 30));

        typee.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        typee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Admin", "Owner", " ", " " }));
        typee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        typee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeeActionPerformed(evt);
            }
        });
        jPanel1.add(typee, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 170, 30));

        jLabel4.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel4.setText("Last name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 140, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel16.setText("Username:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 130, 30));

        jLabel17.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel17.setText("USER STATUS:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 210, 40));

        jLabel18.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel18.setText("Email:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 110, 30));

        jLabel19.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel19.setText("First name:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, 30));

        jLabel22.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel22.setText("Contact #:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 210, 40));

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
        jPanel5.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, -20, 80, 120));

        idisplay.setBackground(new java.awt.Color(203, 14, 14));
        idisplay.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        idisplay.setText("0");
        jPanel5.add(idisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -20, 70, 60));

        jLabel14.setFont(new java.awt.Font("Castellar", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("CURRENT USER:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -20, 310, 60));

        jLabel15.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PERSONAL INFORMATION");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 410, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 720, 80));

        userstatus.setFont(new java.awt.Font("Castellar", 1, 11)); // NOI18N
        userstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " ", " ", " " }));
        userstatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        userstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userstatusActionPerformed(evt);
            }
        });
        jPanel1.add(userstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 170, 30));

        jLabel23.setFont(new java.awt.Font("Castellar", 3, 18)); // NOI18N
        jLabel23.setText("Type:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 210, 40));

        useriddd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        useriddd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        useriddd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        useriddd.setEnabled(false);
        useriddd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridddActionPerformed(evt);
            }
        });
        jPanel1.add(useriddd, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 170, 30));

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
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 100, 40));

        updateee.setBackground(new java.awt.Color(255, 255, 255));
        updateee.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        updateee.setText("UPDATE");
        updateee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        updateee.setEnabled(false);
        updateee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateeeMouseExited(evt);
            }
        });
        updateee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateeeActionPerformed(evt);
            }
        });
        jPanel1.add(updateee, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 100, 40));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LoginRegisterImages/resized_image_490x61000.png"))); // NOI18N
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 570));

        reg2.setBackground(new java.awt.Color(102, 102, 102));
        reg2.setFont(new java.awt.Font("Yu Gothic Light", 1, 17)); // NOI18N
        reg2.setText("Want to change password?");
        reg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reg2MouseClicked(evt);
            }
        });
        jPanel1.add(reg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 230, 50));

        reg.setBackground(new java.awt.Color(102, 102, 102));
        reg.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        reg.setForeground(new java.awt.Color(200, 32, 32));
        reg.setText("Click here");
        reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regMouseClicked(evt);
            }
        });
        jPanel1.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 310, 90));

        imagesss.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        imagesss.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 188));

        jPanel1.add(imagesss, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, 200, 210));

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        remove.setText("remove");
        remove.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
        });
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 310, 100, 30));

        select.setBackground(new java.awt.Color(255, 255, 255));
        select.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        select.setText("select");
        select.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(203, 14, 14), 5, true));
        select.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                selectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                selectMouseExited(evt);
            }
        });
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, Short.MAX_VALUE)
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

    private void us2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_us2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_us2ActionPerformed

    private void fn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fn1ActionPerformed

    private void typeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeeActionPerformed

    private void userstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userstatusActionPerformed

    private void useridddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridddActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        fn1.setText("");
        ln.setText("");
        em.setText("");
        us2.setText("");
      
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

    private void updateeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeeMouseClicked

    private void updateeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeeMouseEntered

    private void updateeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateeeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_updateeeMouseExited

    private void updateeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateeeActionPerformed
     if (fn1.getText().isEmpty()
            || ln.getText().isEmpty()
            || em.getText().isEmpty()
            || us2.getText().isEmpty()
           
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
        
        
        
          String contactNumber = contact.getText();
        if (!contactNumber.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Contact number must contain only numbers.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            contact.setText("");
            return;
        }

        
        dbConnect dbc = new dbConnect();
    dbc.updateData("UPDATE tbl_user SET fname='" + fn1.getText() + "', lname='" + ln.getText() + "', "
            + "email='" + em.getText() + "', username='" + us2.getText() + "', contactnum='" + contact.getText() + "', type='"
            + typee.getSelectedItem() + "', status='" + userstatus.getSelectedItem() + "', "
            + "u_image='" + destination + "' "
            + "WHERE c_id='" + useriddd.getText() + "'");
    
if(destination.isEmpty()){
    File existingFile = new File(oldpath);
    if(existingFile.exists()){
        existingFile.delete();
    }
}else{
    if(!(oldpath.equals(path))){
        imageUpdater(oldpath, path);
    }
}
  
    if (selectedFile != null) {
        try {
            Files.copy(selectedFile.toPath(), new File(destination).toPath(), StandardCopyOption.REPLACE_EXISTING);
            JOptionPane.showMessageDialog(null, "Updated Successfully!");

            userdashboard ads = new userdashboard();
            ads.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            System.out.println("Insert Image Error: " + ex);
            JOptionPane.showMessageDialog(null, "Error updating image: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Updated Successfully!");
        userdashboard ads = new userdashboard();
        ads.setVisible(true);
        this.dispose();
    }

       
    }//GEN-LAST:event_updateeeActionPerformed

    private void jLabel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseClicked
 userdashboard userss = new userdashboard();
        userss.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_jLabel37MouseClicked

    private void reg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reg2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_reg2MouseClicked

    private void regMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regMouseClicked
        changepass chs = new   changepass();
        chs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
     
     
   

    }//GEN-LAST:event_formWindowActivated

    private void removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMouseClicked

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMouseEntered

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_removeMouseExited

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
      
remove.setEnabled(false);
select.setEnabled(true);
image.setIcon(null);
destination = "";
path = "";

  
        
    }//GEN-LAST:event_removeActionPerformed

    private void selectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMouseClicked

    private void selectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMouseEntered

    private void selectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_selectMouseExited

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
      
        
          JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        selectedFile = fileChooser.getSelectedFile();
                        destination = "src/userimage/" + selectedFile.getName();
                        path  = selectedFile.getAbsolutePath();
                        
                        
                        if(FileExistenceChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            destination = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                          select.setEnabled(false);
                          remove.setEnabled(true);
                            
                        }
                    } catch (Exception ex) {
                        System.out.println("File Error!");
                    }
                }
        
        
  
        
    }//GEN-LAST:event_selectActionPerformed
  
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
            java.util.logging.Logger.getLogger(editusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editusers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editusers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    public javax.swing.JTextField em;
    public javax.swing.JTextField fn1;
    private javax.swing.JLabel idisplay;
    public javax.swing.JLabel image;
    private javax.swing.JPanel imagesss;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    public javax.swing.JTextField ln;
    private javax.swing.JLabel reg;
    private javax.swing.JLabel reg2;
    public javax.swing.JButton remove;
    public javax.swing.JButton select;
    public javax.swing.JComboBox<String> typee;
    public javax.swing.JButton updateee;
    public javax.swing.JTextField us2;
    public javax.swing.JTextField useriddd;
    public javax.swing.JComboBox<String> userstatus;
    // End of variables declaration//GEN-END:variables

    void setVisble(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private dbConnect updateData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
