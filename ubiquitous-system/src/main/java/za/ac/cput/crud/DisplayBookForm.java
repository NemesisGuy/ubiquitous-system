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
import za.ac.cput.googlebooksapi.Book;

public class DisplayBookForm extends javax.swing.JFrame {

    public static String myBookTitle, subtTitle, author, description, rating, imageLink;

    /**
     * Creates new form CreateBookForm
     */
    public DisplayBookForm() {
        initComponents();
    }

    //        create.createBook( jTextFieldTitle.getText(), jTextFieldSubTitle.getText(), jTextFieldAuthor.getText(), jTextFieldISBN.getText(), jTextFieldDescription.getText(), jTextFieldRating.getText(), jTextFieldImageLink.getText() );
    public DisplayBookForm(String titleIn, String subtTitleIn, String authorIn, String descriptionIn, String ratingIn, String imageLinkIn) {
        myBookTitle = titleIn;
        subtTitle = subtTitleIn;
        author = authorIn;
        description = descriptionIn;
        rating = ratingIn;
        imageLink = imageLinkIn;
        initComponents();
    }
    //  public static DisplayBookForm displayBookForm = new DisplayBookForm(title,  subtTitle, author, description ,  rating,  imageLink);
//    public  DisplayBookForm displayBookForm = new DisplayBookForm("Hyperion ", "Space books ", "Dan Simmions", "The book that reinvented Space Opera, from the Hugo and World Fantasy Award-winning author of The Terror, which is now a chilling TV show. It is the 29th century and the universe of the Human Hegemony is under threat. Invasion by the warlike Ousters looms, and the mysterious schemes of the secessionist AI TechnoCore bring chaos ever closer. On the eve of disaster, with the entire galaxy at war, seven pilgrims set fourth on a final voyage to the legendary Time Tombs on Hyperion, home to the Shrike, a lethal creature, part god and part killing machine, whose powers transcend the limits of time and space. The pilgrims have resolved to die before discovering anything less than the secrets of the universe itself.  ", "4", "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1405546838l/77566.jpg");

    public DisplayBookForm(Book book) {
        try {
            myBookTitle = book.getTitle();
            subtTitle = book.getSubTitle();
            author = book.getAuthors();
            description = book.getDescription();
            rating = book.getRating();
            imageLink = book.getImageLink();
            //System.out.println(book.getTitle()+" Testing constuctor !!");

            // this.setMyBookTitle(book.getTitle());
            this.setVisible(true);

            initComponents();
            jLabelTitle.setText(myBookTitle);
            jLabelSubTitle.setText(subtTitle);
            jLabelAuthor.setText(author);
            jTextAreaDescription.setText(description);
            jLabelRating.setText(rating);
            // URL url;
            //ImageIcon imageIcon = new ImageIcon();

            URL url = new URL(imageLink);
            Image image = ImageIO.read(url);
            ImageIcon imageIcon;
            jLabelPicture.setIcon(imageIcon = new ImageIcon( image.getScaledInstance(jPanelImagePanel.getWidth(), jPanelImagePanel.getHeight(), Image.SCALE_SMOOTH)));
           // updateBookForm.jLabelPicture.setIcon(imageIcon = new ImageIcon( tempImage.getScaledInstance(jPanelImagePanel.getWidth(), jPanelImagePanel.getHeight(), Image.SCALE_SMOOTH)));

        } catch (MalformedURLException ex) {
            Logger.getLogger(DisplayBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DisplayBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static String getMyBookTitle() {
        return myBookTitle;
    }

    public static void setMyBookTitle(String title) {
        DisplayBookForm.myBookTitle = title;
    }

    public static String getSubtTitle() {
        return subtTitle;
    }

    public static void setSubtTitle(String subtTitle) {
        DisplayBookForm.subtTitle = subtTitle;
    }

    public static String getAuthor() {
        return author;
    }

    public static void setAuthor(String author) {
        DisplayBookForm.author = author;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        DisplayBookForm.description = description;
    }

    public static String getRating() {
        return rating;
    }

    public static void setRating(String rating) {
        DisplayBookForm.rating = rating;
    }

    public static String getImageLink() {
        return imageLink;
    }

    public static void setImageLink(String imageLink) {
        DisplayBookForm.imageLink = imageLink;
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        jLabelHeading = new javax.swing.JLabel();
        jPanelMid = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelAuthor = new javax.swing.JLabel();
        jLabelRating = new javax.swing.JLabel();
        jLabelSubTitle = new javax.swing.JLabel();
        jPanelImagePanel = new javax.swing.JPanel();
        jLabelPicture = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jPanelBottom = new javax.swing.JPanel();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CRUD - Opertation - Display Book ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeading.setText("Display Book :");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addComponent(jLabelHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelHeading)
                .addGap(30, 30, 30))
        );

        jPanelMid.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid.setForeground(new java.awt.Color(0, 0, 0));

        jLabelTitle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("Title:");
        jLabelTitle.setToolTipText("Book Title");

        jLabelAuthor.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
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
            .addComponent(jLabelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaDescription.setEditable(false);
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setText("Description:");
        jTextAreaDescription.setToolTipText("Book Description");
        jTextAreaDescription.setWrapStyleWord(true);
        jTextAreaDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));
        jTextAreaDescription.setMargin(new Insets(5,5,5,5));
        jScrollPane1.setViewportView(jTextAreaDescription);

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle)
                    .addComponent(jLabelSubTitle)
                    .addComponent(jLabelAuthor)
                    .addComponent(jLabelRating)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jPanelImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addComponent(jLabelTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelSubTitle)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAuthor)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRating)))
                .addGap(30, 30, 30))
        );

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

        jButtonClose.setMnemonic('C');
        jButtonClose.setText("Close");
        jButtonClose.setToolTipText("Click to close");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jButtonClose)
                .addGap(228, 228, 228))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonClose)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        this.setVisible(false);
        this.dispose();        // TODO add your handling code here:

       
    }//GEN-LAST:event_jButtonCloseActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(DisplayBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // DisplayBookForm displayBookForm = new DisplayBookForm(title,  subtTitle, author, description ,  rating,  imageLink);
              //  System.out.println(getMyBookTitle() + "...");
              ///  jLabelTitle.setText("this is hard coded");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JLabel jLabelAuthor;
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelPicture;
    private javax.swing.JLabel jLabelRating;
    private javax.swing.JLabel jLabelSubTitle;
    public static javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelBottom;
    private static javax.swing.JPanel jPanelImagePanel;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables
}
