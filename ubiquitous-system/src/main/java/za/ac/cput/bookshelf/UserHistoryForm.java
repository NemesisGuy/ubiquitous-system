/*
 *     
 * 
 */
package za.ac.cput.bookshelf;

import utilities.Loan;
import za.ac.cput.crud.*;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilities.Dates;
import za.ac.cput.settings.Configuration;
import za.ac.cput.settings.FrameSettings;

/**
 *
 * @author Peter Buckingham
 */
public class UserHistoryForm extends javax.swing.JFrame {

    ArrayList<Loan> loanList;
    ArrayList<User> userList;
    User userSelected;

    /**
     * Creates new form UserListForm
     */
    public UserHistoryForm() {
        setTitle("Ubiquitous System" + " - " + "User List");
        initComponents();
    }

    /**
     *
     * @param
     */
    public UserHistoryForm(ArrayList<Loan> loanList, User userSelected) {

        setTitle("Ubiquitous System" + " - " + "User History");
        initComponents();
        setTitle("Ubiquitous System" + " - " + "User History - " +  userSelected.getUserName());
        //loop though list to populate table
        this.loanList = loanList;
        String tableLable = "User Name : " + userSelected.getUserName();

        this.jLabelUserNeme.setText(tableLable);
        Object[][] data = new Object[loanList.size()][7];
        for (int i = 0; i < loanList.size(); i++) {
            long diffInDays = 0;
            data[i][0] = loanList.get(i).getLoanId();
            data[i][1] = loanList.get(i).getBookId();
            data[i][2] = loanList.get(i).getLoanFromDate();
            data[i][3] = loanList.get(i).getDueOnDate();
            data[i][4] = loanList.get(i).getReturnedDate();
            //if loan return date > due date then calculate how many days late and add to table
            if (loanList.get(i).getReturnedDate() != null) {
                //difference between dates
                Dates dates = new Dates();

                Date dueDate = dates.getDateObject(loanList.get(i).getDueOnDate());
                Date returnDate = dates.getDateObject(loanList.get(i).getReturnedDate());
                //    int diffInDays = (int)( (newerDate.getTime() - olderDate.getTime()) / (1000 * 60 * 60 * 24) )
                diffInDays = (returnDate.getTime() - dueDate.getTime()) / (1000 * 60 * 60 * 24);
                data[i][6] = diffInDays;
                if (diffInDays < 0) {
                    data[i][6] = "Early";

                }
            } else {
                data[i][6] = "Not Returned";
            }

            if (diffInDays > 0) {
                data[i][5] = "Late";
            } else {
                data[i][5] = "On Time";
            }

        }
        Object[] columnNames = {"Loan ID : ", "Book ID : ", "Loan Date : ", "Due Date : ", "Return Date : ", "Late : ", "Late by : "};
        DefaultTableModel model = new DefaultTableModel(data, columnNames) {

            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        jTable1.setModel(model);

        // create JTable just once and pass model in the constructor
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelMid3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelUserNeme = new javax.swing.JLabel();
        jPanelBottom = new javax.swing.JPanel();
        jButtonCancel = new javax.swing.JButton();
        jPanelTop = new javax.swing.JPanel();
        jLabelBannerHeading = new javax.swing.JLabel();
        jPanelImagePanelBanner1 = new javax.swing.JPanel();
        jLabelPictureBanner1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD - Operations - User List");
        setIconImage(displayFrameImageIcon());

        jPanelMain.setBackground(new java.awt.Color(250, 249, 246));

        jPanelMid3.setBackground(new java.awt.Color(192, 192, 192));
        jPanelMid3.setForeground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Book Name", "Last Name", "User Name", "Returned ", "Late"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabelUserNeme.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUserNeme.setText("User Name :");

        javax.swing.GroupLayout jPanelMid3Layout = new javax.swing.GroupLayout(jPanelMid3);
        jPanelMid3.setLayout(jPanelMid3Layout);
        jPanelMid3Layout.setHorizontalGroup(
            jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMid3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelUserNeme)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );
        jPanelMid3Layout.setVerticalGroup(
            jPanelMid3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMid3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelUserNeme)
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanelBottom.setBackground(new java.awt.Color(192, 192, 192));
        jPanelBottom.setForeground(new java.awt.Color(0, 0, 0));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(241, 241, 241))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonCancel)
                .addGap(30, 30, 30))
        );

        jPanelTop.setBackground(new java.awt.Color(192, 192, 192));

        jLabelBannerHeading.setBackground(new java.awt.Color(192, 192, 192));
        jLabelBannerHeading.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelBannerHeading.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBannerHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBannerHeading.setText("User History :");

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
                .addComponent(jLabelBannerHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMid3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(UserHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserHistoryForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserHistoryForm().setVisible(true);
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
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JLabel jLabelBannerHeading;
    private javax.swing.JLabel jLabelPictureBanner1;
    private javax.swing.JLabel jLabelUserNeme;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelImagePanelBanner1;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMid3;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
