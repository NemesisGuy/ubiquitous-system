/*
 *     
 * 
 */
package za.ac.cput.login;

import java.awt.Image;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import za.ac.cput.settings.Configuration;
import za.ac.cput.crud.Create;
import za.ac.cput.crud.Validator;
import za.ac.cput.settings.FrameSettings;

/**
 *
 * @author Peter Buckingham
 */
public class RegisterUserForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public RegisterUserForm() {
        setTitle("Ubiquitous System" + " - " + "Sign Up Form");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBottom = new javax.swing.JPanel();
        jButtonSignUp = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        jPanelMid = new javax.swing.JPanel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUserName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jLabelComfirmEmail = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldConfirmEmail = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jPasswordFieldConfirmPassword = new javax.swing.JPasswordField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jPanelTop = new javax.swing.JPanel();
        jLabelBannerHeading = new javax.swing.JLabel();
        jPanelImagePanelBanner1 = new javax.swing.JPanel();
        jLabelPictureBanner1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(displayFrameImageIcon());

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonSignUp.setMnemonic('S');
        jButtonSignUp.setText("Sign Up");
        jButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignUpActionPerformed(evt);
            }
        });

        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonSignUp)
                    .addComponent(jButtonLogin))
                .addGap(20, 20, 20))
        );

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelFirstName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFirstName.setText("First Name:");

        jLabelUserName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserName.setText("User Name:");

        jLabelEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelEmail.setText("Email:");

        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setText("Password:");

        jTextFieldUserName.setColumns(40);
        jTextFieldUserName.setToolTipText("Enter user name");
        jTextFieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUserNameActionPerformed(evt);
            }
        });

        jTextFieldEmail.setColumns(40);
        jTextFieldEmail.setToolTipText("Enter email");
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelLastName.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLastName.setText("Last Name: ");

        jLabelComfirmEmail.setForeground(new java.awt.Color(0, 0, 0));
        jLabelComfirmEmail.setText("Confirm Email:");

        jTextFieldLastName.setColumns(40);
        jTextFieldLastName.setToolTipText("Enter last name");

        jTextFieldConfirmEmail.setColumns(40);
        jTextFieldConfirmEmail.setToolTipText("Re-enter email");

        jPasswordFieldPassword.setColumns(40);
        jPasswordFieldPassword.setToolTipText("Enter password");
        jPasswordFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPasswordActionPerformed(evt);
            }
        });

        jLabelConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelConfirmPassword.setText("Confirm Password:");

        jPasswordFieldConfirmPassword.setColumns(40);
        jPasswordFieldConfirmPassword.setToolTipText("Re-enter password");

        jTextFieldFirstName.setColumns(40);
        jTextFieldFirstName.setToolTipText("Enter first name");

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelLastName)
                    .addComponent(jLabelUserName)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelComfirmEmail)
                    .addComponent(jLabelConfirmPassword))
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldConfirmEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(20, 20, 20))
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName)
                    .addComponent(jTextFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldConfirmEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComfirmEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmPassword)
                    .addComponent(jPasswordFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelBannerHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelBannerHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBannerHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBannerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBannerHeading.setText("User Registration:");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBannerHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignUpActionPerformed
        // TODO add your handling code here:
        validateFormFileds();

    }//GEN-LAST:event_jButtonSignUpActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        exit();

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUserNameActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jPasswordFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPasswordActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new LoginUserForm().setVisible(rootPaneCheckingEnabled);
        this.dispose();
    }//GEN-LAST:event_jButtonLoginActionPerformed

    /**
     *
     * @return
     */
    public Image displayFrameImageIcon() {
        FrameSettings frameSettings = new FrameSettings();
        return frameSettings.frameSettingsSetIconImage();
    }

    /**
     *
     */
    public void exit() {
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for using my program!  \n \n " + "Author : Peter Buckingham \n Student Number: ****65289 \n Date: May 2022", "Ubiquitous System - CRUD ", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("");
        System.out.println("Thanks for using my program!");
        System.out.println("Author : Peter Buckingham \n");
        System.err.println("");
        System.exit(0);
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
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterUserForm().setVisible(true);
            }
        });
    }

    private boolean validateFormNames() {
        if (jTextFieldFirstName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald First Name! \n User creation unsuccessfull!");
        } else if (jTextFieldLastName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald Last Name! \n User creation unsuccessfull!");
        } else if (jTextFieldUserName.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Error: invald User Name! \n Setting Suggested Name \n User creation unsuccessfull!");
            Random rand = new Random();
            int number = rand.nextInt(9999);
            jTextFieldUserName.setText(jTextFieldFirstName.getText() + "." + jTextFieldLastName.getText() + "#" + number);
        } else {
            return true;
        }
        return false;
    }

    private boolean validateFormEmails() {

        Validator validator = new Validator();
        if (validator.isEmailValid(jTextFieldEmail.getText())) {
            if (validator.compareEmails(jTextFieldEmail.getText(), jTextFieldConfirmEmail.getText())) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Error: email address missmatch! \n User creation unsuccessfull!");
                clearEmail();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error: invald email address! \n User creation unsuccessfull!");
            clearEmail();
        }

        return false;
    }

    private void validateFormPaswords() {
        Create create = new Create();
        Validator validator = new Validator();
        String tempPassword = new String(jPasswordFieldPassword.getPassword());
        String tempPasswordConfirm = new String(jPasswordFieldConfirmPassword.getPassword());
        if (validator.isValidPassword(tempPassword)) {

            if (validator.comparePasswords(tempPassword, tempPasswordConfirm)) {
                createUser();
                clearForm();
            } else {

                JOptionPane.showMessageDialog(this, "Error: password missmatch! \n User creation unsuccessfull!");
                clearPasswords();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Error: invalid password! \nrequired :\n It contains at least 8 characters and at most 20 characters.\n It contains at least one digit. \nIt contains at least one upper case alphabet.\n It contains at least one lower case alphabet.\nIt contains at least one special character which includes !@#$%&*()-+=^.\n It doesn’t contain any white space.\n User creation unsuccessfull!");
            clearPasswords();
            //not stronk
        }
    }

    private void validateFormFileds() {
        if (validateFormNames()) {
            if (validateFormEmails()) {
                validateFormPaswords();
            }
        }
    }

    private void clearPasswords() {

        jPasswordFieldPassword.setText("");
        jPasswordFieldConfirmPassword.setText("");
    }

    private void clearEmail() {
        jTextFieldEmail.setText("");
        jTextFieldConfirmEmail.setText("");
    }

    private void clearForm() {
        jTextFieldFirstName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldUserName.setText("");
        clearEmail();
        clearPasswords();
    }

    private void createUser() {
        Create create = new Create();
        String tempPassword = new String(jPasswordFieldPassword.getPassword());

        create.createUser(jTextFieldFirstName.getText(), jTextFieldLastName.getText(), jTextFieldUserName.getText(), jTextFieldEmail.getText(), jPasswordFieldPassword.getText(), 0);
        System.out.println("text in password field in register class : " + jPasswordFieldPassword.getText());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonSignUp;
    private javax.swing.JLabel jLabelBannerHeading;
    private javax.swing.JLabel jLabelComfirmEmail;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelPictureBanner1;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelImagePanelBanner1;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JPasswordField jPasswordFieldConfirmPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldConfirmEmail;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
