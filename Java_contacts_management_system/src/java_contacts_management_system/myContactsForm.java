
package java_contacts_management_system;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class myContactsForm extends javax.swing.JFrame {
 
    public String img432;

    public myContactsForm() {
        initComponents();
        populateJtable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonmini = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLableemail = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldfname = new javax.swing.JTextField();
        jTextFieldlname = new javax.swing.JTextField();
        jTextFieldphone = new javax.swing.JTextField();
        jTextFieldemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelpic = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jComboBoxgroup1 = new javax.swing.JComboBox<>();
        jButtonAddContact = new javax.swing.JButton();
        jLabelAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(242, 241, 20));

        jLabel3.setText("MyContacts");

        jButton1.setText("X");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonmini.setText("-");
        jButtonmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonminiMouseClicked(evt);
            }
        });
        jButtonmini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonminiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(228, 228, 228)
                .addComponent(jButtonmini, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonmini)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Firstname");

        jLabel2.setText("LastName");

        jLabel4.setText("Phone");

        jLableemail.setText("email");

        jLabel6.setText("group1");

        jLabel5.setText("picture");

        jLabelpic.setBackground(new java.awt.Color(242, 24, 240));
        jLabelpic.setText("No image now");
        jLabelpic.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setText("Browse");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxgroup1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "faimly", "friends", "work",  }));
        jComboBoxgroup1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboBoxgroup1FocusLost(evt);
            }
        });
        jComboBoxgroup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxgroup1ActionPerformed(evt);
            }
        });

        jButtonAddContact.setText("Add");
        jButtonAddContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddContactActionPerformed(evt);
            }
        });

        jLabelAddress.setText("Address");

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAddress);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addComponent(jLabelpic, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jButton2))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLableemail)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxgroup1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonAddContact))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jTextFieldfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addComponent(jLabelpic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton2)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                        .addComponent(jLableemail)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jTextFieldemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jComboBoxgroup1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabelAddress))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButtonAddContact)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        System.exit(0);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButtonminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonminiMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jButtonminiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonminiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonminiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonminiActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser jfc=new JFileChooser();
        jfc.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter fnef=new FileNameExtensionFilter("jpg","png");

        jfc.addChoosableFileFilter(fnef);

        int filestate =jfc.showSaveDialog(null);

        if(filestate==JFileChooser.APPROVE_OPTION)
        {
            File selFile=jfc.getSelectedFile();
            String path=selFile.getAbsolutePath();
            img432=path;
            jLabelpic.setIcon(resizepic(path));
        }
        else if(filestate==JFileChooser.CANCEL_OPTION)
        {
            jLabelpic.setText("no image selected");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBoxgroup1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxgroup1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxgroup1FocusLost

    private void jComboBoxgroup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxgroup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxgroup1ActionPerformed

    private void jButtonAddContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddContactActionPerformed



        String fname=jTextFieldfname.getText();

        String lname=jTextFieldlname.getText();

        String phone=jTextFieldphone.getText();

        String email=jTextFieldemail.getText();
        String address=jTextAreaAddress.getText();
        byte[] pic1=null;

        String group1=jComboBoxgroup1.getSelectedItem().toString();
           try{
               
               Path pt=Paths.get(img432);
               pic1=Files.readAllBytes(pt);
           

           
           
           
           
           Contact bb = new Contact(null,fname,lname,email,phone, address,pic1,group1,0);
           ContactQuery qq=new ContactQuery();
           boolean a=qq.insert(bb);
           if(a){
               populateJtable();
           }
           else{
           populateJtable();
           }


           }
           catch(Exception e){
               
               System.out.println(e);
              
           }











        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddContactActionPerformed

    private ImageIcon resizepic (String path)
    {
        
        ImageIcon img =new ImageIcon(path);
        
        Image image=img.getImage().getScaledInstance(jLabelpic.getWidth(),jLabelpic.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon kk =new ImageIcon(image);
        
        
        
        return  kk;
    }
    
    
    public void populateJtable()
{
try{
ContactQuery cq=new ContactQuery();



ArrayList<Contact> ctList=cq.contactList();


String[] colNames={"Id","firstname","lastname","group","email","phone","address","pic1"};

Object[][] rows=new Object[ctList.size()][8];

for(int i=0;i<ctList.size();i++)
{
            System.out.println("i am here");

rows[i][0]=ctList.get(i).getCid();


rows[i][1]=ctList.get(i).getFname();
rows[i][2]=ctList.get(i).getLname();
rows[i][3]=ctList.get(i).getGroup1();
            System.out.println("i 2 am here");

rows[i][4]=ctList.get(i).getPhone();

rows[i][5]=ctList.get(i).getEmail();
rows[i][6]=ctList.get(i).getAddress();


ImageIcon pic=new ImageIcon(new ImageIcon(ctList.get(i).getPic()).getImage().
        getScaledInstance(40,40,Image.SCALE_SMOOTH));
            System.out.println("i3 am here");


rows[i][7]=pic;
}
        System.out.println("i am here");

myModel mmd=new myModel(rows,colNames);
jTable1.setModel(mmd);

        

}
catch(Exception e)
        {
        
        System.out.println(e);
        }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(myContactsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myContactsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAddContact;
    private javax.swing.JButton jButtonmini;
    private javax.swing.JComboBox<String> jComboBoxgroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelpic;
    private javax.swing.JLabel jLableemail;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldemail;
    private javax.swing.JTextField jTextFieldfname;
    private javax.swing.JTextField jTextFieldlname;
    private javax.swing.JTextField jTextFieldphone;
    // End of variables declaration//GEN-END:variables
}
