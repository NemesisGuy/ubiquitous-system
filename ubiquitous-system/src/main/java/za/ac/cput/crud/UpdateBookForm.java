/*
 *     
 * 
 */
package za.ac.cput.crud;

/**
 *
 * @author Peter Buckingham
 */
import java.awt.Image;
import java.awt.Insets;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import za.ac.cput.settings.Configuration;
import za.ac.cput.settings.FrameSettings;

/**
 *
 * @author Admin
 */
public class UpdateBookForm extends javax.swing.JFrame {

    /**
     *
     */
    public String title,
            /**
             *
             */
            subtTitle,
            /**
             *
             */
            author,
            /**
             *
             */
            description,
            /**
             *
             */
            rating,
            /**
             *
             */
            imageLink;

    /**
     * Creates new form CreateBookForm
     */
    public UpdateBookForm() {
        setTitle("Ubiquitous System" + " - " + "Update Book");
        initComponents();
    }

    //        create.createBook( jTextFieldTitle.getText(), jTextFieldSubTitle.getText(), jTextFieldAuthor.getText(), jTextFieldISBN.getText(), jTextFieldDescription.getText(), jTextFieldRating.getText(), jTextFieldImageLink.getText() );
    /**
     *
     * @param title
     * @param subtTitle
     * @param author
     * @param description
     * @param rating
     * @param imageLink
     */
    public UpdateBookForm(String title, String subtTitle, String author, String description, String rating, String imageLink) {
        try {
            this.title = title;
            this.subtTitle = subtTitle;
            this.author = author;
            this.description = description;
            this.rating = rating;
            this.imageLink = imageLink;
            setTitle("Ubiquitous System" + " - " + "Update Book" + " - " + title);
            initComponents();
            jTextFieldTitle.setText(title);
            jTextFieldSubTitle.setText(subtTitle);
            jTextFieldAuhor.setText(author);
            jTextAreaDescription.setText(description);
            jTextFieldRating.setText(rating);
            jTextFieldImageLink.setText(imageLink);
            URL url = new URL(imageLink);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon;
            jLabelPicture.setIcon(imageIcon = new ImageIcon(image.getScaledInstance(jPanelImagePanel.getWidth(), jPanelImagePanel.getHeight(), Image.SCALE_SMOOTH)));
        } catch (MalformedURLException ex) {
            Logger.getLogger(UpdateBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdateBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //  public static DisplayBookForm createBookForm  = new DisplayBookForm(title,  subtTitle, author, description ,  rating,  imageLink);
    //  public UpdateBookForm updateBookForm = new  UpdateBookForm(title, subtTitle, author, description, rating, imageLink);

    UpdateBookForm(Book book) {
        try {
            this.title = book.getTitle();
            this.subtTitle = book.getSubTitle();
            this.author = book.getAuthors();
            this.description = book.getDescription();
            this.rating = book.getRating();
            this.imageLink = book.getImageLink();
            setTitle("Ubiquitous System" + " - " + "Update Book" + " - " + title);
            initComponents();
            jTextFieldTitle.setText(title);
            jTextFieldSubTitle.setText(subtTitle);
            jTextFieldAuhor.setText(author);
            jTextAreaDescription.setText(description);
            jTextFieldRating.setText(rating);
            jTextFieldImageLink.setText(imageLink);
            URL url = new URL(imageLink);
            Image image = ImageIO.read(url);
            if (image != null) {
                ImageIcon imageIcon;
                jLabelPicture.setIcon(imageIcon = new ImageIcon(image.getScaledInstance(jPanelImagePanel.getWidth(), jPanelImagePanel.getHeight(), Image.SCALE_SMOOTH)));
            }
        } catch (MalformedURLException ex) {
            Logger.getLogger(UpdateBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UpdateBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelMid = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jLabelSubTitle = new javax.swing.JLabel();
        jPanelImagePanel = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jTextFieldTitle = new javax.swing.JTextField();
        jTextFieldSubTitle = new javax.swing.JTextField();
        jTextFieldRating = new javax.swing.JTextField();
        jTextFieldAuhor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabelRating1 = new javax.swing.JLabel();
        jTextFieldImageLink = new javax.swing.JTextField();
        jPanelBottom = new javax.swing.JPanel();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClose1 = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabelBannerHeading = new javax.swing.JLabel();
        jPanelImagePanelBanner1 = new javax.swing.JPanel();
        jLabelPictureBanner1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD - Operations - Update Book ");
        setIconImage(displayFrameImageIcon());

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("Title:");
        jLabelTitle.setToolTipText("Book Title");

        jLabelAuthor.setForeground(new java.awt.Color(0, 0, 0));
        jLabelAuthor.setText("Author:");
        jLabelAuthor.setToolTipText("Book Author");

        jLabelRating.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRating.setText("Rating:");
        jLabelRating.setToolTipText("Book Rating");

        jLabelSubTitle.setFont(new java.awt.Font("Dialog", 2, 11)); // NOI18N
        jLabelSubTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSubTitle.setText("SubTitle: ");
        jLabelSubTitle.setToolTipText("Book Sub Title ");

        jPanelImagePanel.setMaximumSize(new java.awt.Dimension(150, 150));
        jPanelImagePanel.setMinimumSize(new java.awt.Dimension(100, 150));
        jPanelImagePanel.setPreferredSize(new java.awt.Dimension(198, 2));

        jLabelPicture.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPicture.setToolTipText("Book Cover");
        jLabelPicture.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelImagePanelLayout = new javax.swing.GroupLayout(jPanelImagePanel);
        jPanelImagePanel.setLayout(jPanelImagePanelLayout);
        jPanelImagePanelLayout.setHorizontalGroup(
            jPanelImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanelImagePanelLayout.setVerticalGroup(
            jPanelImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setText("Description:");
        jTextAreaDescription.setToolTipText("Book Description");
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jTextAreaDescription.setMargin(new Insets(5,5,5,5));
        jScrollPane1.setViewportView(jTextAreaDescription);

        jTextFieldTitle.setText("jTextField1");

        jTextFieldSubTitle.setText("jTextField1");
        jTextFieldSubTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSubTitleActionPerformed(evt);
            }
        });

        jTextFieldRating.setText("jTextField1");

        jTextFieldAuhor.setText("jTextField1");

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Description:");

        jLabelRating1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelRating1.setText("Image Link:");
        jLabelRating1.setToolTipText("Book Rating");

        jTextFieldImageLink.setText("jTextField1");
        jTextFieldImageLink.setToolTipText("Link to image");

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelSubTitle)
                        .addComponent(jLabelAuthor)
                        .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelRating)
                    .addComponent(jLabelRating1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldImageLink, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                    .addComponent(jTextFieldTitle)
                    .addComponent(jTextFieldSubTitle)
                    .addComponent(jTextFieldAuhor)
                    .addComponent(jTextFieldRating))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTitle)
                            .addComponent(jTextFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSubTitle)
                            .addComponent(jTextFieldSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAuthor)
                            .addComponent(jTextFieldAuhor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRating)
                            .addComponent(jTextFieldRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelRating1)
                            .addComponent(jTextFieldImageLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonUpdate.setMnemonic('u');
        jButtonUpdate.setText("Update");
        jButtonUpdate.setToolTipText("Click to update details");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonClose1.setMnemonic('C');
        jButtonClose1.setText("Close");
        jButtonClose1.setToolTipText("Click to close");
        jButtonClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClose1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jButtonUpdate)
                .addGap(18, 18, 18)
                .addComponent(jButtonClose1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonClose1))
                .addGap(20, 20, 20))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelBannerHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelBannerHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBannerHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBannerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBannerHeading.setText("Update Book:");

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
                .addComponent(jLabelBannerHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
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

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        //   Book book = new Book( title, subtTitle, subtTitle, author, description, rating, imageLink);
        Book book = new Book(jTextFieldTitle.getText(), jTextFieldSubTitle.getText(), jTextFieldAuhor.getText(), jTextAreaDescription.getText(), jTextFieldRating.getText(), jTextFieldImageLink.getText());
        Update update = new Update();
        update.updateBook(title, book);
        // TODO add your handling code here:


    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTextFieldSubTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSubTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSubTitleActionPerformed

    private void jButtonClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClose1ActionPerformed
        this.setVisible(false);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonClose1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelBannerHeading;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelPictureBanner1;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelRating1;
    private javax.swing.JLabel jLabelSubTitle;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBottom;
    private static javax.swing.JPanel jPanelImagePanel;
    private javax.swing.JPanel jPanelImagePanelBanner1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextField jTextFieldAuhor;
    private javax.swing.JTextField jTextFieldImageLink;
    private javax.swing.JTextField jTextFieldRating;
    private javax.swing.JTextField jTextFieldSubTitle;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
