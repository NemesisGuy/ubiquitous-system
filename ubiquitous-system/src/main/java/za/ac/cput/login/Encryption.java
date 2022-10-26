package za.ac.cput.login;

public class Encryption {
    //class that encrypts and decrypts passwords

    public String encrypt(String password){
        //encrypts password using a complex algorithm
        String encryptedPassword = "";
        for(int i = 0; i < password.length(); i++){
            encryptedPassword += (char)(password.charAt(i) + 1);
        }
        return encryptedPassword;

    }
    //decrypts password
    public String decrypt(String password){
        String decryptedPassword = "";
        for(int i = 0; i < password.length(); i++){
            decryptedPassword += (char)(password.charAt(i) - 1);
        }
        return decryptedPassword;
    }
    //


    //
    public  static void main(String[] args)
    {
        Encryption encrypt = new Encryption();
        String password = "Password";
        String encryptedPassword = encrypt.encrypt(password);
        String decryptedPassword = encrypt.decrypt(encryptedPassword);
        System.out.println("Password: " + password);
        System.out.println("Encrypted Password: " + encryptedPassword);
        System.out.println("Decrypted Password: " + decryptedPassword);
    }

}
