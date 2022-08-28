/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.myprojecttwo;
import java.awt.*;
import java.awt.event.*;    
import javax.swing.*; 


/**
 *
 * @author wendy
 */
public class AddUserGUI extends JFrame implements ActionListener {
        //private JFrame mainFrame;
private Panel panelWest, panelEast, panelSouth, panelNorth; 
private JLabel lblInstruction;
private JLabel lblIcon;
private JMenuItem saveItem, clearItem, cancelItem; 
private JLabel lblUserID;
private JLabel lblName;
private JLabel lblSurname;
private JLabel lblEmail;
private JLabel lblConfirmEmail;
private JLabel lblPassword;
private JLabel lblConfirmPassword;
private JLabel lblCellNo;

private JTextField txtUserID;
private JTextField txtName;
private JTextField txtSurname;
private JTextField txtEmail;
private JTextField txtConfirmEmail;
private JTextField txtCellNo;
private JTextField txtPassword;
private JTextField txtConfirmPassword;



private JButton btnSave;
private JButton btnClear;
private JButton btnCancel;

private Font ft;

public AddUserGUI() {
    super("Add a new user");
     
        panelWest = new Panel();
        panelEast = new Panel();
        panelSouth = new Panel();
        panelNorth = new Panel();
        lblInstruction = new JLabel("Enter User details below: ");
        lblIcon = new JLabel(new ImageIcon("user.png"));
        lblUserID = new JLabel("User ID: ");
lblName = new JLabel("Name: ");
lblSurname = new JLabel("Surname: ");
lblEmail = new JLabel("Email: ");
lblConfirmEmail = new JLabel("Confirm Email: ");
lblCellNo = new JLabel("Cell No: ");
lblPassword = new JLabel("Password: ");
lblConfirmPassword = new JLabel("Confirm Password: ");
txtUserID = new JTextField(10); 
txtName = new JTextField(10);
txtSurname = new JTextField(10);  
txtEmail = new JTextField(15); 
txtConfirmEmail = new JTextField(15); 
txtCellNo = new JTextField(10);
txtPassword = new JTextField(15); 
//txtPassword.setEchoChar('*');
txtConfirmPassword = new JTextField(10); 
btnSave = new JButton("Save");
btnClear = new JButton("Clear");
btnCancel = new JButton("Cancel");
ft = new Font("Calibri", Font.PLAIN, 22);
}
public void setGUI() {
   ImageIcon img = new ImageIcon("icon.png");
this.setIconImage(img.getImage());
    lblInstruction.setFont(ft);
     
        panelNorth.setBackground(Color.orange);
        panelWest.setBackground(Color.white);
        panelEast.setBackground(Color.white);
        panelWest.setLayout(new GridLayout(8, 1));
        panelEast.setLayout(new GridLayout(8, 1));
        panelSouth.setLayout(new GridLayout(1, 3));
        lblIcon.setPreferredSize(new Dimension(90, 90));
        //panelWest.setPreferredSize(new Dimension(200,30));
        //panelEast.setPreferredSize(new Dimension(200,30));
        //panelSouth.setPreferredSize(new Dimension(200, 40));
        
        lblUserID.setFont(ft);
txtUserID.setFont(ft);
lblName.setFont(ft);
txtName.setFont(ft);
lblSurname.setFont(ft);
txtSurname.setFont(ft);
lblEmail.setFont(ft);
txtEmail.setFont(ft);
lblConfirmEmail.setFont(ft);
txtConfirmEmail.setFont(ft);
lblCellNo.setFont(ft);
txtCellNo.setFont(ft);
lblPassword.setFont(ft);
txtPassword.setFont(ft);
lblConfirmPassword.setFont(ft);
txtConfirmPassword.setFont(ft);

btnSave.setFont(ft);
btnSave.setBackground(Color.green);
btnClear.setFont(ft);
btnClear.setBackground(Color.cyan);
btnCancel.setFont(ft);
btnCancel.setBackground(Color.yellow);
        
        panelNorth.add(lblInstruction);
        panelNorth.add(lblIcon);
        
        panelWest.add(lblUserID );
        panelWest.add(lblName);
        panelWest.add(lblSurname);
        panelWest.add(lblEmail);
        panelWest.add(lblConfirmEmail);
        panelWest.add(lblCellNo);
        panelWest.add(lblPassword);
        panelWest.add(lblConfirmPassword);
        panelEast.add(txtUserID);
        panelEast.add(txtName);
        panelEast.add(txtSurname);
        panelEast.add(txtEmail);
        panelEast.add(txtConfirmEmail);
        panelEast.add(txtCellNo);
        panelEast.add(txtPassword);
        panelEast.add(txtConfirmPassword);
        panelSouth.add(btnSave);
        panelSouth.add(btnClear);
        panelSouth.add(btnCancel);
        
        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelEast, BorderLayout.EAST);
        this.add(panelSouth, BorderLayout.SOUTH);
        this.add(panelWest, BorderLayout.WEST);
        
        btnSave.addActionListener(this);
        
        btnClear.addActionListener(this);
        
        btnCancel.addActionListener(this);
      
        
         //JMenuBar object
          JMenuBar menuBar = new JMenuBar();      
          setJMenuBar( menuBar );  
        //JMenu objects
          JMenu fileMenu = new JMenu( "Menu" );        
        //JMenuItem objects
            saveItem = new JMenuItem( "Save" );   
            clearItem = new JMenuItem( "Clear" );     
            cancelItem = new JMenuItem( "Cancel" );                     

          //register JMenuItem objects with the Listener
          saveItem.addActionListener(this);         
          clearItem.addActionListener(this);         
          cancelItem.addActionListener(this);         
                 
          //add the JMenuItem objects to the JMenu objects
          fileMenu.add( saveItem );  
          fileMenu.add( clearItem );            
          fileMenu.add( cancelItem );
  
          //add the JMenu objects to the JMenubar object
          menuBar.add( fileMenu );
       
        this.setSize(465,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    
public void actionPerformed(ActionEvent e){

if (e.getActionCommand().equals("Save")){
String userID = txtUserID.getText();
String name = txtName.getText();
String surname = txtSurname.getText();
String email = txtEmail.getText();
String confirmEmail = txtConfirmEmail.getText();
String cellNo = txtCellNo.getText();
String password = txtPassword.getText();
String confirmPassword = txtConfirmPassword.getText();

//checks for any blanks on the form 
if(txtUserID.getText().isBlank()){
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease enter UserID ");
} else if (txtName.getText().isBlank()) {
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease enter Name");
}
else if ( txtSurname.getText().isBlank()){ 
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease enter Surname");
} else if (txtEmail.getText().isBlank()){
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease enter Email");
} else if (txtConfirmEmail.getText().isBlank()) {
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease confirm Email");
} else if (txtCellNo.getText().isBlank()) {
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease cell number");
} else if (txtPassword.getText().isBlank()) {
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease enter password");
} else if (txtConfirmPassword.getText().isBlank()){
    JOptionPane.showMessageDialog(null,"Invalid!\nPlease confirm password");
}

//checks if email matches confirm
boolean emailConfirm = false;
if(txtEmail.getText().equals(txtConfirmEmail.getText())){ 
    emailConfirm = true;
} else {
    JOptionPane.showMessageDialog(null,"Email mismatch");
    emailConfirm = false;
}
//checks if passwords matches confirm
boolean  passwordConfirm = false;
if(txtPassword.getText().equals(txtConfirmPassword.getText())){
    passwordConfirm = true;
}else {
    JOptionPane.showMessageDialog(null,"Password mismatch");   
}
  
//      Checks each character to see if it is acceptable.
boolean valid = false;
if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*")&& password.matches(".*[a-z]{1,}.*")&& password.matches(".*[A-Z]{1,}.*") && password.length() >=8 && password.length()<=20) {
                valid = true;
            } 
            else {
                JOptionPane.showMessageDialog(null,"PASSWORD DENIED!\nPLEASE CHECK IF YOUR PASSWORD MEETS THE FOLLOWING REQUIREMENTS:\n\n"+"^Password length must be minimum of 8 charcters "+"\n^Password must contain a special character"
                        + "\n^Password must contain Upper case and lower case characters");
                valid = false;
               
            }

if (valid == true) {
    JOptionPane.showMessageDialog(null,"Password accepted");
    JOptionPane.showMessageDialog(null,"User is successfully created:\n"+"User ID: "+txtUserID.getText()+"\nName: "+txtName.getText()+"\nSurname: "+txtSurname.getText()+"\nEmail: "+txtEmail.getText()+"\nCell no: "+txtCellNo.getText()+"\nPassword: "+txtPassword.getText());
}
}

if (e.getActionCommand().equals("Cancel")){
System.exit(0);
}
if (e.getActionCommand().equals("Clear")){
txtUserID.setText("");
txtName.setText("");
txtSurname.setText("");
txtEmail.setText("");
txtConfirmEmail.setText("");
txtCellNo.setText("");
txtPassword.setText("");
txtConfirmPassword.setText("");
}

}
public static void main(String[] args){    
    new  AddUserGUI().setGUI();
}

}