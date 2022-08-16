/*
 *     
 * 
 */
package za.ac.cput.settings;

import java.net.InetAddress;
import javax.swing.JOptionPane;

/**
 *
 * @author Peter B
 * nemesisnet.co.za
 */
public class TestInternetConnection {
    public static void main(String[] args){
       
    }

    public boolean testInternetConnection() {
       boolean  isDnsAddressReachable = false;
         try{
            InetAddress googleAddress = InetAddress.getByName("google.com");
            InetAddress amazonAddress = InetAddress.getByName("amazon.com");
            InetAddress nemesisnetAddress = InetAddress.getByName("nemesisnet.co.za");
            InetAddress dnsAddress = InetAddress.getByName("8.8.8.8");
            
            boolean isGoogleAddressReachable = googleAddress.isReachable(2000);
            boolean isAmazonAddressReachable = amazonAddress.isReachable(2000);
            boolean isNemesisnetAddressReachable = nemesisnetAddress.isReachable(2000);
            isDnsAddressReachable = dnsAddress.isReachable(2000);
            
            JOptionPane.showMessageDialog(null, "Succseful Conection to :"  +"  \n" +
                                            googleAddress.getHostName()     +" "+ isGoogleAddressReachable       +"  \n" +
                                            amazonAddress.getHostName()     +" "+ isAmazonAddressReachable       +"  \n" +
                                            nemesisnetAddress.getHostName() +" "+ isNemesisnetAddressReachable   +"  \n" +
                                            dnsAddress.getHostName()        +" "+ isDnsAddressReachable          +"  \n" +
                                                    
                                            "");
            
        } catch (Exception e){
            e.printStackTrace();
        }
        return isDnsAddressReachable ;
    }
    
}
