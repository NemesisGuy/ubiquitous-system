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
public class AdminUserGUI extends JFrame implements ActionListener {

    private Panel panelWest, panelEast, panelNorth;
    private JLabel lblInstruction;
    private JLabel lblIcon;
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

    public AdminUserGUI() {
        super("Admin Access");
        panelWest = new Panel();
        panelEast = new Panel();
        panelNorth = new Panel();
       
        lblInstruction = new JLabel("Select below: ");
        lblIcon = new JLabel(new ImageIcon("admins.png"));
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

        ft = new Font("Calibri", Font.BOLD, 24);

    }

    public void setGUI() {
        lblInstruction.setFont(ft);
        panelNorth.setBackground(Color.orange);
              
        panelWest.setLayout(new GridLayout(5, 2));
        panelEast.setLayout(new GridLayout(5, 2));
       
        lblIcon.setPreferredSize(new Dimension(120, 120));
        panelWest.setPreferredSize(new Dimension(200, 400));
        panelEast.setPreferredSize(new Dimension(200, 400));
        
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
        panelNorth.add(lblInstruction);
        panelNorth.add(lblIcon);

        panelWest.add(btnSearchBooks);
        panelWest.add(btnIssueBooks);
        panelWest.add(btnReturnBooks);
        panelWest.add(btnOrderBooks);
        panelWest.add(btnCreateUser);
        panelEast.add(btnViewUser);
        panelEast.add(btnRemoveUser);
        panelEast.add(btnReturnReminder);
        panelEast.add(btnUpdateDetails);
        panelEast.add(btnExit);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelEast, BorderLayout.EAST);
        this.add(panelWest, BorderLayout.WEST);

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

        this.setSize(400, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Exit")) {
            System.exit(0);
        }
        if (e.getActionCommand().equals("Create User")) {
            this.setVisible(false);
             new AddUserGUI().setGUI(); //Add User Form to show after the Create User button.
           
        }
        if (e.getActionCommand().equals("Update Details")) {
            this.setVisible(false);
             new UpdateDetailsGUI().setGUI(); // Update Details Form to show after the Update Details button.
        }
    }

    public static void main(String[] args) {
        new AdminUserGUI().setGUI();

    }
}
