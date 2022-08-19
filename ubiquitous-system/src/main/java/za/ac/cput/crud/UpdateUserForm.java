/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.awt.Image;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import za.ac.cput.settings.Configuration;
import za.ac.cput.settings.FrameSettings;

/**
 *
 * @author Peter Buckingham
 */
public class UpdateUserForm extends javax.swing.JFrame {

    private String firstName, lastName, userName, email, password;

    /**
     * Creates new form UpdateUserForm
     */
    public UpdateUserForm() {
        initComponents();
    }

    public UpdateUserForm(User user) {
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userName = user.getUserName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        initComponents();
        jTextFieldFirstNameUpdate.setText(user.getFirstName());
        jTextFieldLastNameUpdate.setText(user.getLastName());
        jTextFieldUserNameUpdate.setText(user.getUserName());
        jTextFieldEmailUpdate.setText(user.getEmail());
        jPasswordFieldPasswordUpdate.setText(user.getPassword());

    }
    private void updateUser()
    {
        User user = new User(jTextFieldFirstNameUpdate.getText(), jTextFieldLastNameUpdate.getText(), jTextFieldUserNameUpdate.getText(), jTextFieldEmailUpdate.getText(), jPasswordFieldPasswordUpdate.getPassword().toString());
        Update update = new Update();
        update.updateUser(firstName, user);
        dispose();
    
    }
    private boolean validateFormNames()
    {
        if(jTextFieldFirstNameUpdate.getText().isBlank())
        {  JOptionPane.showMessageDialog(null, "Error: invald First Name! \n User creation unsuccessfull!");
        }else if(jTextFieldLastNameUpdate.getText().isBlank())
        { JOptionPane.showMessageDialog(null, "Error: invald Last Name! \n User creation unsuccessfull!");
        }else if(jTextFieldUserNameUpdate.getText().isBlank())
        {JOptionPane.showMessageDialog(null, "Error: invald User Name! \n Setting Suggested Name \n User creation unsuccessfull!");
        Random rand = new Random();
        int number = rand.nextInt(9999);
         jTextFieldUserNameUpdate.setText(jTextFieldFirstNameUpdate.getText()+"."+ jTextFieldLastNameUpdate.getText() +"#"+number);
        }else {
        return true;
        }
        return false;
    }
    private boolean validateFormEmails() {

        Validator validator = new Validator();
        if (validator.isEmailValid(jTextFieldEmailUpdate.getText())) {
            if (validator.compareEmails(jTextFieldEmailUpdate.getText(), jTextFieldConfirmEmailUpdate.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Error: email address missmatch! \n User creation unsuccessfull!");
                clearEmail();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error: invald email address! \n User creation unsuccessfull!");
            clearEmail();
        }

        return false;
    }

    private void validateFormPaswords() {
       
        Validator validator = new Validator();
        String tempPassword = new String(jPasswordFieldPasswordUpdate.getPassword());
        String tempPasswordConfirm = new String(jPasswordFieldConfirmPasswordUpdate.getPassword());
        if (validator.isValidPassword(tempPassword)) {

            if (validator.comparePasswords(tempPassword, tempPasswordConfirm)) {
                updateUser();
                clearForm();
            } else {

                JOptionPane.showMessageDialog(null, "Error: password missmatch! \n User creation unsuccessfull!");
                clearPasswords();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error: invalid password! \nrequired :\n It contains at least 8 characters and at most 20 characters.\n It contains at least one digit. \nIt contains at least one upper case alphabet.\n It contains at least one lower case alphabet.\nIt contains at least one special character which includes !@#$%&*()-+=^.\n It doesn’t contain any white space.\n User creation unsuccessfull!");
            clearPasswords();
            //not stronk
        }
    }

    private void validateFormFileds() {
       if(validateFormNames()){
            if(validateFormEmails()){
                validateFormPaswords();
            }
        }    
    }

    private void clearPasswords() {

        jPasswordFieldPasswordUpdate.setText("");
        jPasswordFieldConfirmPasswordUpdate.setText("");
    }

    private void clearEmail() {
        jTextFieldEmailUpdate.setText("");
        jTextFieldConfirmEmailUpdate.setText("");
    }

    private void clearForm() {
        jTextFieldFirstNameUpdate.setText("");
        jTextFieldLastNameUpdate.setText("");
        
        jTextFieldUserNameUpdate.setText("");
        clearEmail();
        clearPasswords();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelBottom = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabelBannerHeading = new javax.swing.JLabel();
        jPanelImagePanelBanner1 = new javax.swing.JPanel();
        jLabelPictureBanner1 = new javax.swing.JLabel();
        jPanelMid3 = new javax.swing.JPanel();
        jLabelFirstNameUpdate = new javax.swing.JLabel();
        jLabelUserNameUpdate = new javax.swing.JLabel();
        jLabelEmailUpdate = new javax.swing.JLabel();
        jLabelPasswordUpdate = new javax.swing.JLabel();
        jTextFieldUserNameUpdate = new javax.swing.JTextField();
        jTextFieldEmailUpdate = new javax.swing.JTextField();
        jLabelLastNameUpdate = new javax.swing.JLabel();
        jLabelComfirmEmailUpdate = new javax.swing.JLabel();
        jTextFieldLastNameUpdate = new javax.swing.JTextField();
        jTextFieldConfirmEmailUpdate = new javax.swing.JTextField();
        jPasswordFieldPasswordUpdate = new javax.swing.JPasswordField();
        jLabelConfirmPasswordUpdate = new javax.swing.JLabel();
        jPasswordFieldConfirmPasswordUpdate = new javax.swing.JPasswordField();
        jTextFieldFirstNameUpdate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(displayFrameImageIcon());

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSubmit))
                .addGap(30, 30, 30))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelBannerHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelBannerHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBannerHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBannerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBannerHeading.setText("Update User:");

        jPanelImagePanelBanner1.setMaximumSize(new java.awt.Dimension(75, 75));

        jLabelPictureBanner1.setBackground(new java.awt.Color(192, 192, 192));
        jLabelPictureBanner1.setForeground(new java.awt.Color(192, 192, 192));
        jLabelPictureBanner1.setIcon(new Configuration().displayLogoBannerFromConfig());
        jLabelPictureBanner1.setMaximumSize(new java.awt.Dimension(75, 75));
        jLabelPictureBanner1.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout jPanelImagePanelBanner1Layout = new javax.swing.GroupLayout(jPanelImagePanelBanner1);
        jPanelImagePanelBanner1.setLayout(jPanelImagePanelBanner1Layout);
        jPanelImagePanelBanner1Layout.setHorizontalGroup(
            jPanelImagePanelBanner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagePanelBanner1Layout.createSequentialGroup()
                .addComponent(jLabelPictureBanner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelImagePanelBanner1Layout.setVerticalGroup(
            jPanelImagePanelBanner1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagePanelBanner1Layout.createSequentialGroup()
                .addComponent(jLabelPictureBanner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelImagePanelBanner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabelBannerHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelImagePanelBanner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBannerHeading))
                .addGap(20, 20, 20))
        );

        jPanelMid3.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid3.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFirstNameUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFirstNameUpdate.setText("First Name:");

        jLabelUserNameUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserNameUpdate.setText("User Name:");

        jLabelEmailUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmailUpdate.setText("Email:");

        jLabelPasswordUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPasswordUpdate.setText("Password:");

        jTextFieldUserNameUpdate.setColumns(40);
        jTextFieldUserNameUpdate.setToolTipText("Enter user name");
        jTextFieldUserNameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameUpdateActionPerformed(evt);
            }
        });

        jTextFieldEmailUpdate.setColumns(40);
        jTextFieldEmailUpdate.setToolTipText("Enter email");
        jTextFieldEmailUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailUpdateActionPerformed(evt);
            }
        });

        jLabelLastNameUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLastNameUpdate.setText("Last Name: ");

        jLabelComfirmEmailUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelComfirmEmailUpdate.setText("Confirm Email:");

        jTextFieldLastNameUpdate.setColumns(40);
        jTextFieldLastNameUpdate.setToolTipText("Enter last name");

        jTextFieldConfirmEmailUpdate.setColumns(40);
        jTextFieldConfirmEmailUpdate.setToolTipText("Re-enter email");

        jPasswordFieldPasswordUpdate.setColumns(40);
        jPasswordFieldPasswordUpdate.setToolTipText("Enter password");
        jPasswordFieldPasswordUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordUpdateActionPerformed(evt);
            }
        });

        jLabelConfirmPasswordUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmPasswordUpdate.setText("Confirm Password:");

        jPasswordFieldConfirmPasswordUpdate.setColumns(40);
        jPasswordFieldConfirmPasswordUpdate.setToolTipText("Re-enter password");

        jTextFieldFirstNameUpdate.setColumns(40);
        jTextFieldFirstNameUpdate.setToolTipText("Enter first name");

        javax.swing.GroupLayout jPanelMid3Layout = new javax.swing.GroupLayout(jPanelMid3);
        jPanelMid3.setLayout(jPanelMid3Layout);
        jPanelMid3Layout.setHorizontalGroup(
            jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMid3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstNameUpdate)
                    .addComponent(jLabelEmailUpdate)
                    .addComponent(jLabelLastNameUpdate)
                    .addComponent(jLabelUserNameUpdate)
                    .addComponent(jLabelPasswordUpdate)
                    .addComponent(jLabelComfirmEmailUpdate)
                    .addComponent(jLabelConfirmPasswordUpdate))
                .addGap(50, 50, 50)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldPasswordUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLastNameUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUserNameUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmailUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldConfirmEmailUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFirstNameUpdate, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldConfirmPasswordUpdate, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        jPanelMid3Layout.setVerticalGroup(
            jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMid3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstNameUpdate)
                    .addComponent(jTextFieldFirstNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastNameUpdate)
                    .addComponent(jTextFieldLastNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserNameUpdate)
                    .addComponent(jTextFieldUserNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailUpdate)
                    .addComponent(jTextFieldEmailUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConfirmEmailUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComfirmEmailUpdate))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPasswordUpdate)
                    .addComponent(jPasswordFieldPasswordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPasswordUpdate)
                    .addComponent(jPasswordFieldConfirmPasswordUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUserNameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameUpdateActionPerformed

    private void jTextFieldEmailUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailUpdateActionPerformed

    private void jPasswordFieldPasswordUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordUpdateActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        // TODO add your handling code here:
       validateFormFileds();
        

        // Create create = new Create();
        // String tempPassword = new String(jPasswordFieldPasswordUpdate.getPassword());
        // create.createUser(jTextFieldFirstNameUpdate.getText(), jTextFieldLastNameUpdate.getText() ,jTextFieldUserName.getText(), jTextFieldEmailUpdate.getText(),tempPassword, 0);
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();

    }//GEN-LAST:event_jButtonCancelActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateUserForm().setVisible(true);
            }
        });
    }
    public Image displayFrameImageIcon() {
        FrameSettings frameSettings = new FrameSettings();
        return frameSettings.frameSettingsSetIconImage();
    }
    public void exit() {
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for using my program!  \n \n " + "Author : Peter Buckingham \n Student Number: ****65289 \n Date: May 2022", "Ubiquitous System - CRUD ", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
        System.out.println("Thanks for using my program!");
        System.out.println("Author : Peter Buckingham \n");
        System.err.println("");
        System.exit(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelBannerHeading;
    private javax.swing.JLabel jLabelComfirmEmailUpdate;
    private javax.swing.JLabel jLabelConfirmPasswordUpdate;
    private javax.swing.JLabel jLabelEmailUpdate;
    private javax.swing.JLabel jLabelFirstNameUpdate;
    private javax.swing.JLabel jLabelLastNameUpdate;
    private javax.swing.JLabel jLabelPasswordUpdate;
    private javax.swing.JLabel jLabelPictureBanner1;
    private javax.swing.JLabel jLabelUserNameUpdate;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelImagePanelBanner1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid3;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordFieldConfirmPasswordUpdate;
    private javax.swing.JPasswordField jPasswordFieldPasswordUpdate;
    private javax.swing.JTextField jTextFieldConfirmEmailUpdate;
    private javax.swing.JTextField jTextFieldEmailUpdate;
    private javax.swing.JTextField jTextFieldFirstNameUpdate;
    private javax.swing.JTextField jTextFieldLastNameUpdate;
    private javax.swing.JTextField jTextFieldUserNameUpdate;
    // End of variables declaration//GEN-END:variables
}
