/*
 *     
 * 
 */
package za.ac.cput.crud;

import com.google.api.client.testing.json.AbstractJsonParserTest;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter Buckingham
 */
public class CRUDGui extends javax.swing.JFrame {

    /**
     * Creates new form CRUDGui
     */
    public CRUDGui() {
        initComponents();
    }
    CreateUserForm createUserForm = new CreateUserForm(this, rootPaneCheckingEnabled);
    CreateBookForm createBookForm = new CreateBookForm();
    UpdateBookForm updateBookForm = new UpdateBookForm();
    UpdateUserForm updateUserForm = new UpdateUserForm();
    DisplayBookForm displayBookForm = new DisplayBookForm();

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonAddBook = new javax.swing.JButton();
        jButtonBookList = new javax.swing.JButton();
        jButtonUpdateBook = new javax.swing.JButton();
        jButtonAddUser = new javax.swing.JButton();
        jButtonUserList = new javax.swing.JButton();
        jButtonUpdateUser = new javax.swing.JButton();
        jButtonSearchUser = new javax.swing.JButton();
        jButtonSearchBook = new javax.swing.JButton();
        jButtonDeleteBook = new javax.swing.JButton();
        jButtonDeleteUser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD - Opertations -  Menu");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowClosingHandler(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(250, 249, 246));

        jPanel2.setBackground(new java.awt.Color(192, 192, 192));

        jButtonAddBook.setText("Add Book ");
        jButtonAddBook.setToolTipText("Click to add book");
        jButtonAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddBookActionPerformed(evt);
            }
        });

        jButtonBookList.setText("Book List");
        jButtonBookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookListActionPerformed(evt);
            }
        });

        jButtonUpdateBook.setText("Update Book");
        jButtonUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateBookActionPerformed(evt);
            }
        });

        jButtonAddUser.setText("Add User");
        jButtonAddUser.setToolTipText("Click to add users");
        jButtonAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUserActionPerformed(evt);
            }
        });

        jButtonUserList.setText("User List");
        jButtonUserList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserListActionPerformed(evt);
            }
        });

        jButtonUpdateUser.setText("Update User");
        jButtonUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateUserActionPerformed(evt);
            }
        });

        jButtonSearchUser.setText("Search User");
        jButtonSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchUserActionPerformed(evt);
            }
        });

        jButtonSearchBook.setText("Search Book");
        jButtonSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchBookActionPerformed(evt);
            }
        });

        jButtonDeleteBook.setText("Delete Book");
        jButtonDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteBookActionPerformed(evt);
            }
        });

        jButtonDeleteUser.setText("Delete User");
        jButtonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddUser)
                    .addComponent(jButtonAddBook))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonBookList)
                    .addComponent(jButtonUserList))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonUpdateUser)
                    .addComponent(jButtonUpdateBook))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonDeleteUser)
                    .addComponent(jButtonDeleteBook))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSearchBook)
                    .addComponent(jButtonSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddBook)
                    .addComponent(jButtonBookList)
                    .addComponent(jButtonUpdateBook)
                    .addComponent(jButtonDeleteBook)
                    .addComponent(jButtonSearchBook))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddUser)
                    .addComponent(jButtonUserList)
                    .addComponent(jButtonUpdateUser)
                    .addComponent(jButtonDeleteUser)
                    .addComponent(jButtonSearchUser))
                .addGap(30, 30, 30))
        );

        jPanel3.setBackground(new java.awt.Color(192, 192, 192));

        jButtonCancel.setText("Cancel");
        jButtonCancel.setMaximumSize(new java.awt.Dimension(67, 67));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel4.setBackground(new java.awt.Color(192, 192, 192));

        jLabel1.setBackground(new java.awt.Color(192, 192, 192));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please select a action :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteUserActionPerformed
        Delete delete = new Delete();
        delete.deleteUser();        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteUserActionPerformed

    private void jButtonDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteBookActionPerformed
        Delete delete = new Delete();
        delete.deleteBook();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonDeleteBookActionPerformed

    private void jButtonSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchBookActionPerformed

        Read read = new Read();
        read.readBookByTitle();// TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchBookActionPerformed

    private void jButtonSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchUserActionPerformed
        // TODO add your handling code here:
        Read read = new Read();
        read.readUserByName();
    }//GEN-LAST:event_jButtonSearchUserActionPerformed

    private void jButtonUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateUserActionPerformed

        //find user  
        //update user
        Read read = new Read();
        User user = read.readUserByName();
        updateUserForm = new UpdateUserForm(user);
        updateUserForm.setVisible(rootPaneCheckingEnabled);
        updateUserForm.setAlwaysOnTop(rootPaneCheckingEnabled);

        Update update = new Update();
        // update.updateUser();       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateUserActionPerformed

    private void jButtonUserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserListActionPerformed
        Read read = new Read();
        UserListForm userListForm = new UserListForm(read.readAllUsers());
        userListForm.setVisible(rootPaneCheckingEnabled);
        userListForm.setAlwaysOnTop(rootPaneCheckingEnabled);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUserListActionPerformed

    private void jButtonAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUserActionPerformed
        createUserForm.setVisible(rootPaneCheckingEnabled);
        createUserForm.setAlwaysOnTop(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButtonAddUserActionPerformed

    private void jButtonUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateBookActionPerformed
        //read book 
        Read read = new Read();
        Book book = read.readBookByTitle();
        //updateBookForm.get
        updateBookForm = new UpdateBookForm(book);
        //   updateBookForm = new UpdateBookForm(book.getTitle(), book.getSubTitle(), book.getAuthors(), book.getDescription(), book.getRating(), book.getImageLink());
        updateBookForm.setVisible(rootPaneCheckingEnabled);
        //updateBookForm.setAlwaysOnTop(rootPaneCheckingEnabled);

        //if book found
        //display boo update form and populate with data from DB
        //if user presses update button then push to DB (update)
        ////////////// Update update = new Update();
        ////////////// update.updateBook();
        // if book found then diplay book details with form
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateBookActionPerformed

    private void jButtonBookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookListActionPerformed
        // TODO add your handling code here:
        Read read = new Read();
        //read.readAllBooks();
        BookListForm bookListForm = new BookListForm(read.readAllBooks());
        bookListForm.setVisible(true);
        bookListForm.setAlwaysOnTop(true);
    }//GEN-LAST:event_jButtonBookListActionPerformed

    private void jButtonAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddBookActionPerformed
        createBookForm.setVisible(rootPaneCheckingEnabled);
        createBookForm.setAlwaysOnTop(rootPaneCheckingEnabled);
        //  Create create = new Create();
        //create.createBook();/////
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddBookActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:

        exit();

    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void windowClosingHandler(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowClosingHandler

        exit();

        // TODO add your handling code here:
    }//GEN-LAST:event_windowClosingHandler

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
            java.util.logging.Logger.getLogger(CRUDGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDGui().setVisible(true);
            }
        });
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
    private javax.swing.JButton jButtonAddBook;
    private javax.swing.JButton jButtonAddUser;
    private javax.swing.JButton jButtonBookList;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeleteBook;
    private javax.swing.JButton jButtonDeleteUser;
    private javax.swing.JButton jButtonSearchBook;
    private javax.swing.JButton jButtonSearchUser;
    private javax.swing.JButton jButtonUpdateBook;
    private javax.swing.JButton jButtonUpdateUser;
    private javax.swing.JButton jButtonUserList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
