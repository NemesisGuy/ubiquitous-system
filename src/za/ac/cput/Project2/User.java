/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.Project2;

/**
 *
 * @author wendy
 */
public class User {
private String name;
private String surname;
private String userID;
private String Password; 
private String Email;
private int CellNo;

 public User(String Name ,String Surname , String UserID, String Password,String Email ,int CellNo) {
this.Name = Name;
this.Surname = Surname;
this.UserID = UserID;
this.Password = Password;
this.Email = Email;
this.CellNo = CellNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getCellNo() {
        return CellNo;
    }

    public void setCellNo(int CellNo) {
        this.CellNo = CellNo;
    }
@Override 
public String toString(){
return "Name: "+getName() +"Surname: "+ getSurname() + "UserID: "+ getUserID()+ "Password: "+ getPassword() +"Email: " +getEmail() +"CellNo: "+getCellNo();
}
}
