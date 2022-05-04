/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.Project2;
import java.awt.*;
import java.awt.event.*;    
import javax.swing.*;
/**
 *
 * @author wendy
 */
public class UpdateDetailsGui extends JFrame implements ActionListener {

private JMenuItem SaveItem, CancelItem; 
private JLabel lblUserID;
private JLabel lblName;
private JLabel lblSurname;
private JLabel lblEmail;
private JLabel lblConfirmEmail;
private JLabel lblPassword;
private JLabel lblConfirmPassword;
private JLabel lblCellNo;
private JLabel lblInstruction;
private JLabel lblEmpty;

private JTextField txtUserID;
private JTextField txtName;
private JTextField txtSurname;
private JTextField txtEmail;
private JTextField txtConfirmEmail;
private JTextField txtCellNo;
private JTextField txtPassword;
private JTextField txtConfirmPassword;


private JButton btnSave;
private JButton btnCancel;
    
private Font ft;

public UpdateDetailsGui() {
super("Update user details");
lblInstruction = new JLabel("Please enter the updated information :");
lblEmpty = new JLabel("");
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
txtConfirmPassword = new JTextField(10); 
btnSave = new JButton("Save");
btnCancel = new JButton("Cancel");

ft = new Font("Arial", Font.PLAIN, 24);

}

public void setGui(){
this.setLayout(new GridLayout(12,5));
lblInstruction.setFont(ft);
lblEmpty.setFont(ft);
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
btnSave.setBackground(Color.yellow);
btnCancel.setFont(ft);
btnCancel.setBackground(Color.cyan);

this.add(lblInstruction);
this.add(lblEmpty);
this.add(lblUserID);
this.add(txtUserID);
this.add(lblName);
this.add(txtName);
this.add(lblSurname);
this.add(txtSurname);
this.add(lblEmail);
this.add(txtEmail);
this.add(lblConfirmEmail);
this.add(txtConfirmEmail);
this.add(lblCellNo);
this.add(txtCellNo);
this.add(lblPassword);
this.add(txtPassword);
this.add(lblConfirmPassword);
this.add(txtConfirmPassword);
this.add(btnSave);
this.add(btnCancel);

btnSave.addActionListener(this);
btnCancel.addActionListener(this);

        //JMenuBar object
          JMenuBar menuBar = new JMenuBar();      
          setJMenuBar( menuBar );         
        //JMenu objects
          JMenu fileMenu = new JMenu( "Menu" );        
        //JMenuItem objects
            SaveItem = new JMenuItem( "Save" );       
            CancelItem = new JMenuItem( "Cancel" );                     

          //register JMenuItem objects with the Listener
          SaveItem.addActionListener(this);               
          CancelItem.addActionListener(this);         
                 
          //add the JMenuItem objects to the JMenu objects
          fileMenu.add( SaveItem );           
          fileMenu.add( CancelItem );
  
          //add the JMenu objects to the JMenubar object
          menuBar.add( fileMenu );

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
this.setSize( 400,100); 
this.setVisible( true );
                             
} 

public void actionPerformed(ActionEvent e){

if (e.getActionCommand().equals("Save")){
String UserID = txtUserID.getText();
String Name = txtName.getText();
String Surname = txtSurname.getText();
String Email = txtEmail.getText();
String ConfirmEmail = txtConfirmEmail.getText();
String CellNo = txtCellNo.getText();
String Password = txtPassword.getText();
String ConfirmPassword = txtConfirmPassword.getText();

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
UpdateDetailsGui update = new UpdateDetailsGui();
update.setGui();
}
}

