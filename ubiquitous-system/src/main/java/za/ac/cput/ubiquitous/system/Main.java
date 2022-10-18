/*
 *
 *
 */
package za.ac.cput.ubiquitous.system;

import za.ac.cput.crud.LoadingSplashScreen;

/**
 * @author Peter Buckingham Starting point write user documentation for the class
 * @apiNote This class starts the application. It is used to start the application. This class is intended to be used to start the application.
 * @since 2019-05-01
 */
public class Main {

    /**
     * @param args the command line arguments
     * @apiNote This method starts the application. It is used to start the application. This method is intended to be used to start the application.
     *
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Project 2");
        System.out.println("Ubiquitus System.... ");
        System.out.println(".....Staring Up.... ");
        System.out.println(".....Please Standby.... ");
        new LoadingSplashScreen().setVisible(true);

    }

}
