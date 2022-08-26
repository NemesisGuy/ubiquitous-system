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

    public void frameSettingsSetIconImage(JFrame selectedJFrame) {
        //   Frame f = new Frame();
        Frame f = selectedJFrame;
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\ubiquitous-system-icon.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

    }

    public Image frameSettingsSetIconImage() {
      //  ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/ubiquitous-system-icon.png"));
      //  imageIcon.
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\ubiquitous-system-icon.png");
      //   Image image=Toolkit.getDefaultToolkit().getImage();
       // Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("/images/ubiquitous-system-icon.png"));
       //  Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("/images/ubiquitous-system-icon.png"));
     //   Image icon = Toolkit.getDefaultToolkit().getImage("/images/ubiquitous-system-icon.png");
        return icon;
    }

    public static void main(String args[]) {
        new FrameSettings().frameSettingsSetIconImage(new JFrame());
    }

    private void setsJarsImageIcon(JFrame selectedJFrame) {
        //   Frame f = new Frame();
        Frame f = selectedJFrame;
        //  Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\Admin\\Documents\\NetBeansProjects\\ubiquitous-system\\ubiquitous-system\\src\\main\\resources\\images\\ubiquitous-system-icon.png");
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/images/ubiquitous-system-icon.png"));
        Image icon = imageIcon.getImage();
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);

    }

}
