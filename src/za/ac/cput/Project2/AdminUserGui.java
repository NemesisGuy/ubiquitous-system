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
public class AdminUserGui extends JFrame implements ActionListener {
private JButton btnSearchBooks;
private JButton btnIssueBooks;
private JButton btnReturnBooks; 
private JButton btnOrderBooks;
private JButton btnCreateUser;
private JButton btnViewUser;
private JButton btnRemoveUser;
private JButton btnReturnReminder;
private JButton btnUpdateDetails;
private JButton btnExit;

private Font ft;

public AdminUserGui(){
super("Admin Access");
 btnSearchBooks = new JButton("Search Books"); 
 btnIssueBooks = new JButton("Issue Books");
btnReturnBooks = new JButton("Return Books");
 btnOrderBooks = new JButton("Order Books");
 btnCreateUser = new JButton("Create User");
 btnViewUser = new JButton("View User");
 btnRemoveUser = new JButton("Remove User");
btnReturnReminder = new JButton("Return Reminder");
btnUpdateDetails = new JButton("Update Details");
btnExit = new JButton("Exit");

ft = new Font("Arial", Font.PLAIN, 24);

}
public void setGui(){
this.setLayout(new GridLayout(12,5));
btnSearchBooks.setFont(ft);
btnSearchBooks.setBackground(Color.white);
btnIssueBooks.setFont(ft);
btnIssueBooks.setBackground(Color.white);
btnReturnBooks.setFont(ft);
btnReturnBooks.setBackground(Color.white);
btnOrderBooks.setFont(ft);
btnOrderBooks.setBackground(Color.white);
btnCreateUser.setFont(ft);
btnCreateUser.setBackground(Color.white);
btnViewUser.setFont(ft);
btnViewUser.setBackground(Color.white);
btnRemoveUser.setFont(ft);
btnRemoveUser.setBackground(Color.white);
btnReturnReminder.setFont(ft);
btnReturnReminder.setBackground(Color.white);
btnUpdateDetails.setFont(ft);
btnUpdateDetails.setBackground(Color.white);
btnExit.setFont(ft);
btnExit.setBackground(Color.white);

this.add(btnSearchBooks);
this.add(btnIssueBooks);
this.add(btnReturnBooks);
this.add(btnOrderBooks);
this.add(btnCreateUser);
this.add(btnViewUser);
this.add(btnRemoveUser);
this.add(btnReturnReminder);
this.add(btnUpdateDetails);
this.add(btnExit);


btnSearchBooks.addActionListener(this);
btnIssueBooks.addActionListener(this);
btnReturnBooks.addActionListener(this);
btnOrderBooks.addActionListener(this);
btnCreateUser.addActionListener(this);
btnViewUser.addActionListener(this);
btnRemoveUser.addActionListener(this);
btnReturnReminder.addActionListener(this);
btnUpdateDetails.addActionListener(this);
btnExit.addActionListener(this);

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
this.setSize( 400,200); 
this.setVisible( true );

}
public void actionPerformed(ActionEvent e){

if (e.getActionCommand().equals("Exit")){
System.exit(0);
}
 if (e.getActionCommand().equals("Create User")){
      this.setVisible(false);
  new AddUserGui().setVisible(true); // Add User Form to show after the Create User button.
       }
if (e.getActionCommand().equals("Update Details")){
      this.setVisible(false);
new UpdateDetailsGui().setVisible(true); // Update Details Form to show after the Update Details button.
       }
}
public static void main(String[] args){
AdminUserGui adminAccess = new AdminUserGui();
adminAccess.setGui();


}
}
