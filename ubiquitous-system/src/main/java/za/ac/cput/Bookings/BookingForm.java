/*
 *     
 * 
 */
package za.ac.cput.Bookings;

import za.ac.cput.login.*;
import java.awt.Image;
import java.time.Instant;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import utilities.Dates;
import za.ac.cput.Bookings.LibraryStatus;
import za.ac.cput.crud.Book;
import za.ac.cput.crud.CRUDGui;
import za.ac.cput.crud.Create;
import za.ac.cput.crud.DatabaseConnection;
import za.ac.cput.crud.Loan;
import za.ac.cput.settings.Configuration;
import za.ac.cput.crud.Read;
import za.ac.cput.crud.User;
import za.ac.cput.settings.FrameSettings;

/**
 *
 * @author Peter Buckingham
 */
public class BookingForm extends javax.swing.JFrame {
Book book = null;
User user = null;
Dates dates = new Dates();   
    /**
     * Creates new form registerForm
     */
    public BookingForm() {
        initComponents();
    }
    public BookingForm(User user,Book book) {
        this.book = book;
        this.user = user;
        initComponents();
        Dates dates = new Dates();  
        jTextFieldBookUserName.setText(user.getUserName());
        jTextFieldBookTitle.setText(book.getTitle());
        jTextFieldDateOfIssue.setText(dates.getFormattedStartDate());
        jTextFieldDueDate.setText(dates.getFormattedEndDate());
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBottom = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jButtonConfim = new javax.swing.JButton();
        jPanelMid = new javax.swing.JPanel();
        jLabelBookTitle = new javax.swing.JLabel();
        jLabelDateOfIssue = new javax.swing.JLabel();
        jTextFieldBookTitle = new javax.swing.JTextField();
        jLabelDueDate = new javax.swing.JLabel();
        Dates dates = new Dates();
        jTextFieldDateOfIssue = new javax.swing.JTextField();
        jTextFieldDueDate = new javax.swing.JTextField();
        jLabelUserNeme = new javax.swing.JLabel();
        jTextFieldBookUserName = new javax.swing.JTextField();
        jPanelTop = new javax.swing.JPanel();
        jLabelBannerHeading = new javax.swing.JLabel();
        jPanelImagePanelBanner1 = new javax.swing.JPanel();
        jLabelPictureBanner1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(displayFrameImageIcon());

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonExit.setText("Cancel");
        jButtonExit.setToolTipText("");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonConfim.setText("Comfirm");
        jButtonConfim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonConfim, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonConfim))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelBookTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBookTitle.setText("Book Name :");

        jLabelDateOfIssue.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDateOfIssue.setText("Date of Issue:");

        jTextFieldBookTitle.setEditable(false);
        jTextFieldBookTitle.setColumns(40);
        jTextFieldBookTitle.setToolTipText("Enter user name");
        jTextFieldBookTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBookTitleActionPerformed(evt);
            }
        });

        jLabelDueDate.setForeground(new java.awt.Color(0, 0, 0));
        jLabelDueDate.setText("Due Date : ");

        jTextFieldDateOfIssue.setEditable(false);
        jTextFieldDateOfIssue.setColumns(40);
        jTextFieldDateOfIssue.setText(dates.getFormattedStartDate());
        jTextFieldDateOfIssue.setToolTipText("Date of Issue");
        jTextFieldDateOfIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateOfIssueActionPerformed(evt);
            }
        });

        jTextFieldDueDate.setEditable(false);
        jTextFieldDueDate.setColumns(40);
        jTextFieldDueDate.setText(dates.getFormattedEndDate());
        jTextFieldDueDate.setToolTipText("Return Date");
        jTextFieldDueDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDueDateActionPerformed(evt);
            }
        });

        jLabelUserNeme.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserNeme.setText("User Name :");

        jTextFieldBookUserName.setEditable(false);
        jTextFieldBookUserName.setColumns(40);
        jTextFieldBookUserName.setToolTipText("Enter user name");
        jTextFieldBookUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBookUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBookTitle)
                    .addComponent(jLabelDateOfIssue)
                    .addComponent(jLabelDueDate)
                    .addComponent(jLabelUserNeme))
                .addGap(87, 87, 87)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldBookUserName)
                    .addComponent(jTextFieldDueDate)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldBookTitle)
                            .addComponent(jTextFieldDateOfIssue))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserNeme)
                    .addComponent(jTextFieldBookUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBookTitle)
                    .addComponent(jTextFieldBookTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDateOfIssue)
                    .addComponent(jTextFieldDateOfIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDueDate)
                    .addComponent(jTextFieldDueDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelBannerHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelBannerHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBannerHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBannerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBannerHeading.setText("Book Out:");

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
                .addComponent(jLabelBannerHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        exit();

    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldBookTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBookTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBookTitleActionPerformed

    private void jButtonConfimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfimActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        //new RegisterUserForm().setVisible(rootPaneCheckingEnabled);
        JOptionPane.showMessageDialog(this,user.getUserName()+", You Have booked out "+ book.getTitle() + ".\n Please return it by the due date of " + dates.getFormattedEndDate() +".", "Ubiquitous System - Bookings ", JOptionPane.INFORMATION_MESSAGE);
        
        Loan loan = new Loan(user, book);
        
        Create create = new Create();
        
        create.createLoan(user, loan);
        
        
       // TODO Fancy SQL JOIN Statments here:
        
        
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jButtonConfimActionPerformed

    private void jTextFieldDateOfIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateOfIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateOfIssueActionPerformed

    private void jTextFieldDueDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDueDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDueDateActionPerformed

    private void jTextFieldBookUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBookUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBookUserNameActionPerformed
    public Image displayFrameImageIcon() {
        FrameSettings frameSettings = new FrameSettings();
        return frameSettings.frameSettingsSetIconImage();
    }
    public void exit() {
        JOptionPane.showMessageDialog(new JFrame(), "Thanks for using my program!  \n \n " + "Author : Peter Buckingham \n Student Number: ****65289 \n Date: May 2022", "Ubiquitous System ", JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new BookingForm().setVisible(true);
              //  Instant.now() ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfim;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelBannerHeading;
    private javax.swing.JLabel jLabelBookTitle;
    private javax.swing.JLabel jLabelDateOfIssue;
    private javax.swing.JLabel jLabelDueDate;
    private javax.swing.JLabel jLabelPictureBanner1;
    private javax.swing.JLabel jLabelUserNeme;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelImagePanelBanner1;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JTextField jTextFieldBookTitle;
    private javax.swing.JTextField jTextFieldBookUserName;
    private javax.swing.JTextField jTextFieldDateOfIssue;
    private javax.swing.JTextField jTextFieldDueDate;
    // End of variables declaration//GEN-END:variables
}
