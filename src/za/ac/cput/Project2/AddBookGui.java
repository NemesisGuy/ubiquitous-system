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
public class AddBookGui extends JFrame implements ActionListener {

private JMenuItem SaveItem, ClearItem, CancelItem; 
private JLabel lblTitle;
private JLabel lblSubtitle;
private JLabel lblAuthor;
private JLabel lblDescription;
private JLabel lblRating;
private JLabel lblComment;
private JLabel lblISBN;
private JLabel lblPrice;
private JLabel lblInstruction;
private JLabel lblEmpty;

private JTextField txtTitle;
private JTextField txtSubtitle;
private JTextField txtAuthor;
private JTextField txtDescription;
private JTextField txtRating;
private JTextField txtComment;
private JTextField txtISBN;
private JTextField txtPrice;


private JButton btnSave;
private JButton btnClear;
private JButton btnCancel;

private Font ft; 

public AddBookGui() {
super("Add a new book");
lblInstruction = new JLabel("Enter a new book: ");
lblEmpty = new JLabel("");
lblTitle = new JLabel("Author: ");
lblSubtitle = new JLabel("Subtitle: ");
lblAuthor = new JLabel("Author: ");
lblDescription = new JLabel("Description: ");
lblRating = new JLabel("Rating: ");
lblComment = new JLabel("Comment: ");
lblISBN = new JLabel("ISBN: ");
lblPrice = new JLabel("Price: ");
txtTitle = new JTextField(10); 
txtSubtitle = new JTextField(10);
txtAuthor = new JTextField(10);  
txtDescription = new JTextField(50);
txtRating = new JTextField(15); 
txtComment = new JTextField(10);
txtISBN = new JTextField(15); 
txtPrice = new JTextField(10); 
btnSave = new JButton("Save");
btnClear = new JButton("Clear");
btnCancel = new JButton("Cancel");

ft = new Font("Arial", Font.PLAIN, 24);

}
public void setGui(){
this.setLayout(new GridLayout(12,5));
lblInstruction.setFont(ft);
lblEmpty.setFont(ft);
lblTitle.setFont(ft);
txtTitle.setFont(ft);
lblSubtitle.setFont(ft);
txtSubtitle.setFont(ft);
lblAuthor.setFont(ft);
txtAuthor.setFont(ft);
lblDescription.setFont(ft);
txtDescription.setFont(ft);
lblRating.setFont(ft);
txtRating.setFont(ft);
lblComment.setFont(ft);
txtComment.setFont(ft);
lblISBN.setFont(ft);
txtISBN.setFont(ft);
lblPrice.setFont(ft);
txtPrice.setFont(ft);

btnSave.setFont(ft);
btnSave.setBackground(Color.cyan);
btnClear.setFont(ft);
btnClear.setBackground(Color.magenta);
btnCancel.setFont(ft);
btnCancel.setBackground(Color.blue);

this.add(lblInstruction);
this.add(lblEmpty);
this.add(lblTitle);
this.add(txtTitle);
this.add(lblSubtitle);
this.add(txtSubtitle);
this.add(lblAuthor);
this.add(txtAuthor);
this.add(lblDescription);
this.add(txtDescription);
this.add(lblRating);
this.add(txtRating);
this.add(lblComment);
this.add(txtComment);
this.add(lblISBN);
this.add(txtISBN);
this.add(lblPrice);
this.add(txtPrice);

this.add(btnSave);
this.add(btnClear);
this.add(btnCancel);

btnSave.addActionListener(this);
btnClear.addActionListener(this);
btnCancel.addActionListener(this);

        //JMenuBar object
          JMenuBar menuBar = new JMenuBar();      
          setJMenuBar( menuBar );         
        //JMenu objects
          JMenu fileMenu = new JMenu( "Menu" );        
        //JMenuItem objects
            SaveItem = new JMenuItem( "Save" );   
            ClearItem = new JMenuItem( "Clear" );     
            CancelItem = new JMenuItem( "Cancel" );                     

          //register JMenuItem objects with the Listener
          SaveItem.addActionListener(this);         
          ClearItem.addActionListener(this);         
          CancelItem.addActionListener(this);         
                 
          //add the JMenuItem objects to the JMenu objects
          fileMenu.add( SaveItem );  
          fileMenu.add( ClearItem );            
          fileMenu.add( CancelItem );
  
          //add the JMenu objects to the JMenubar object
          menuBar.add( fileMenu );

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
this.setSize( 400,100); 
this.setVisible( true );
                             
} 

public void actionPerformed(ActionEvent e){

if (e.getActionCommand().equals("Save")){
String Title = txtTitle.getText();
String Subtitle = txtSubtitle.getText();
String Author = txtAuthor.getText();
String Description = txtDescription.getText();
String Rating = txtRating.getText();
String Comment = txtComment.getText();
String ISBN = txtISBN.getText();
String Price = txtPrice.getText();
}

if (e.getActionCommand().equals("Cancel")){
System.exit(0);
}
if (e.getActionCommand().equals("Clear")){
txtTitle.setText("");
txtSubtitle.setText("");
txtAuthor.setText("");
txtDescription.setText("");
txtRating.setText("");
txtISBN.setText("");
txtPrice.setText("");
txtComment.setText("");
}
}

public static void main(String[] args){
AddBookGui book = new AddBookGui();
book.setGui();
} 
}
