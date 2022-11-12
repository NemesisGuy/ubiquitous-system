/*
 *     
 * 
 */
package za.ac.cput.settings;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Peter B
 */
public class FrameSettings {

    /**
     * @apiNote This method sets the frame icon for the application.
     * @param selectedJFrame - The frame for which the icon is to be set.
     * @apiNote The frame icon is set for the frame specified by the "selectedJFrame" parameter. This method sets the frame icon for the application.
     */
    public void frameSettingsSetIconImage(JFrame selectedJFrame) {
        Frame f = selectedJFrame;
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/ubiquitous-system-icon.png"));
        Image icon = imageIcon.getImage();
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    /**
     *
     * @return - Returns the application icon.
     * @apiNote This method returns the application icon.png.
     */
    public Image frameSettingsSetIconImage() {
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/ubiquitous-system-icon.png"));
        Image icon = imageIcon.getImage();
        return icon;
    }

    /**
     *
     * @param args - The command line arguments for the application.
     * @apiNote This method sets the frame icon for the application.
     */
    public static void main(String args[]) {
        new FrameSettings().frameSettingsSetIconImage(new JFrame());
    }

    private void setsJarsImageIcon(JFrame selectedJFrame) {
        Frame f = selectedJFrame;
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/ubiquitous-system-icon.png"));
        Image icon = imageIcon.getImage();
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

}
