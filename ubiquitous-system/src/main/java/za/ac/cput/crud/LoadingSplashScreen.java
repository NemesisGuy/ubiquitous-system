/*
 *     
 * 
 */
package za.ac.cput.crud;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import za.ac.cput.login.LoginUserForm;
import za.ac.cput.settings.Configuration;
import za.ac.cput.settings.FileHandler;
import za.ac.cput.settings.FrameSettings;
import za.ac.cput.settings.SystemSettingsCompanyProfileForm;

/**
 *
 * @author Peter Buckingham
 */
public class LoadingSplashScreen extends javax.swing.JFrame {

    boolean complete = false;

    /**
     * Creates new form LoadingSplashScreen
     */
    public LoadingSplashScreen() {
        setTitle("Ubiquitous System" +" - " + "Welcome" );
        initComponents();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    jProgressBarLoading.setValue(i);
                    if (i % 2 == 0) {
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(LoadingSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    if (i < 33) {
                        loadingProgressBarLabel.setText("Finding files...");
                    } else if (i > 33 && i < 66) {
                        loadingProgressBarLabel.setText("Connecting to database...");
                    } else if (i > 66 && i < 99) {
                        loadingProgressBarLabel.setText("Loading properties...");

                    } else {
                        loadingProgressBarLabel.setText("Complete...");
                    }

                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(LoadingSplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }//end of thread
                //    Path path = Paths.get("/settings/");
                //     Configuration configuration = new Configuration();
                //       if (!configuration.isConfigFileFound(path, "Database-Connection") && !configuration.isConfigFileFound(path, "Company-Profile")) {
                //            System.out.println("Configs misssing, running Config Init!");
                //              configuration.intiDefaultConfigs();
                //          }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//                String fileName = "Database-Connection.properties";
//                Path path = Paths.get("resources/settings/" + fileName);
//                Path folderPath = Paths.get("resources/settings/");
//
//                FileHandler fileHandler = new FileHandler();
//                fileHandler.initConfig(folderPath, path);
//                Map<String, String> properties = new HashMap<String, String>();
//                //     name website conrty timzone adminname currency
//                properties.put("db.connectionName", "Default");
//                properties.put("db.url", "192.168.0.32");
//                properties.put("db.port", "9048");
//                properties.put("db.name", "Library");
//                properties.put("db.user", "root");
//                properties.put("db.password", "example");
//                Configuration configuration = new Configuration();
//                configuration.writeConfig(path, properties);

                /////////////////////////////////////////////////////////////////////
                //              jLabelSplashBanner
                //selectedFile.
                // displayLogoBanner(url);
                String fileName = "Database-Connection.properties";
                Path path = Paths.get("resources/settings/" + fileName);
                FileHandler fileHandler = new FileHandler();
                Configuration configuration = new Configuration();
                if (!fileHandler.isConfigFileFound(path)) {
                    configuration.intiDefaultConfigs();
                    System.out.println("Default Configs created and active");
                }

                //intiDefaultConfigs();
                dispose();
                new LoginUserForm().setVisible(rootPaneCheckingEnabled);
                // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

        });
        thread.start();
        complete = true;

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelImagePanelBanner = new javax.swing.JPanel();
        jLabelPictureBanner = new javax.swing.JLabel();
        jPanelHeading = new javax.swing.JPanel();
        jLabelHeading = new javax.swing.JLabel();
        jPanelLoading = new javax.swing.JPanel();
        jProgressBarLoading = new javax.swing.JProgressBar();
        loadingProgressBarLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ubiqutious System - Loading");
        setBackground(new java.awt.Color(250, 249, 246));
        setIconImage(displayFrameImageIcon());

        jLabelPictureBanner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPictureBanner.setText("SplashImage");
        jLabelPictureBanner.setToolTipText("");
        displayBanner();

        javax.swing.GroupLayout jPanelImagePanelBannerLayout = new javax.swing.GroupLayout(jPanelImagePanelBanner);
        jPanelImagePanelBanner.setLayout(jPanelImagePanelBannerLayout);
        jPanelImagePanelBannerLayout.setHorizontalGroup(
            jPanelImagePanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImagePanelBannerLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelPictureBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanelImagePanelBannerLayout.setVerticalGroup(
            jPanelImagePanelBannerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImagePanelBannerLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelPictureBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabelHeading.setFont(new java.awt.Font("Dialog", 0, 50)); // NOI18N
        jLabelHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHeading.setText("Ubiquitous System");

        javax.swing.GroupLayout jPanelHeadingLayout = new javax.swing.GroupLayout(jPanelHeading);
        jPanelHeading.setLayout(jPanelHeadingLayout);
        jPanelHeadingLayout.setHorizontalGroup(
            jPanelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadingLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanelHeadingLayout.setVerticalGroup(
            jPanelHeadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeadingLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelHeading)
                .addGap(30, 30, 30))
        );

        jProgressBarLoading.setToolTipText("Loading...");
        jProgressBarLoading.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBarLoading.setStringPainted(true);

        loadingProgressBarLabel.setText("Loading...");

        javax.swing.GroupLayout jPanelLoadingLayout = new javax.swing.GroupLayout(jPanelLoading);
        jPanelLoading.setLayout(jPanelLoadingLayout);
        jPanelLoadingLayout.setHorizontalGroup(
            jPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLoadingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(loadingProgressBarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBarLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        jPanelLoadingLayout.setVerticalGroup(
            jPanelLoadingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoadingLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(loadingProgressBarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBarLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelImagePanelBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLoading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelImagePanelBanner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelHeading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelLoading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LoadingSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingSplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        LoadingSplashScreen loadingSplashScreen = new LoadingSplashScreen();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                loadingSplashScreen.setVisible(true);
                if (!loadingSplashScreen.complete) {
                } else {
                    // loadingSplashScreen.dispose();

                }

            }
        });

    }

    /**
     *
     * @param selectedFile
     */
    public void displayLogoBanner(File selectedFile) {
        URL url;
        //pull from config file
        try {
            System.out.println(selectedFile.getAbsolutePath());
            url = new URL("file:///" + selectedFile.getAbsolutePath());
            Image image = null;
            try {
                image = ImageIO.read(url);
            } catch (IOException ex) {
                Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            ImageIcon imageIcon;
            jLabelPictureBanner.setIcon(imageIcon = new ImageIcon(image.getScaledInstance(jPanelImagePanelBanner.getWidth(), jPanelImagePanelBanner.getHeight(), Image.SCALE_SMOOTH)));
        } catch (MalformedURLException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param selectedFileUrl
     */
    public void displayLogoBanner(URL selectedFileUrl) {

        // System.out.println(selectedFile.getAbsolutePath());
        //   url = new URL("file:///" + selectedFile.getAbsolutePath());
        Image image = null;
        try {
            image = ImageIO.read(selectedFileUrl);
        } catch (IOException ex) {
            Logger.getLogger(SystemSettingsCompanyProfileForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ImageIcon imageIcon;
        jLabelPictureBanner.setIcon(imageIcon = new ImageIcon(image));

    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     *
     */
    public void displayBanner() {
        URL url;
        //   url = new URL("file:///C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\OpenBookLogo.jpg");
        // url = new URL("file:///C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\ubiquitous-system-logo.png");ubiquitous-system-banner.png
        //        url = new URL("file:///C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\ubiquitous-system-banner.png");
        // C:\Users\Admin\Documents\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\src\main\resources\images\\ubiquitous-system-icon.png
       //  url = getClass().getResource("/resources/images/icon.png");
        url = getClass().getResource("/images/ubiquitous-system-banner.png"); 
        //^^^returns ...
        //file:/C:/Users/Admin/Documents/NetBeansProjects/ubiquitous-system/ubiquitous-system/target/classes/images/ubiquitous-system-banner.png
        
        System.out.println(url);
        displayLogoBanner(url);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

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
    private javax.swing.JLabel jLabelHeading;
    private javax.swing.JLabel jLabelPictureBanner;
    private javax.swing.JPanel jPanelHeading;
    private javax.swing.JPanel jPanelImagePanelBanner;
    private javax.swing.JPanel jPanelLoading;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JProgressBar jProgressBarLoading;
    private javax.swing.JLabel loadingProgressBarLabel;
    // End of variables declaration//GEN-END:variables
}
