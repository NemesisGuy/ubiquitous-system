/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.myprojecttwo;

/**
 *
 * @author wendy
 */
public class User {
private String name;
private String surname;
private String userID;
private String password; 
private String email;
private int cellNo;

public User(String name ,String surname , String userID, String password,String email ,int cellNo) {
this.name = name;
this.surname = surname;
this.userID = userID;
this.password = password;
this.email = email;
this.cellNo = cellNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCellNo() {
        return cellNo;
    }

    public void setCellNo(int cellNo) {
        this.cellNo = cellNo;
    }

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", surname=" + surname + ", userID=" + userID + ", password=" + password + ", email=" + email + ", cellNo=" + cellNo + '}';
    }

}
