/*
 *
 *
 */
package za.ac.cput.ubiquitous.system;

import za.ac.cput.crud.LoadingSplashScreen;

/**
 * @author Peter Buckingham
 * Starting point
 */
public class Main {

    /**
     * @param args the command line arguments
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
