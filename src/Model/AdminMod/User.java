package Model.AdminMod;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LaMitologica
 */
public class User {
    private String name;
    private String lastName;
    private String iD;
    private String userName;
    private String pass;
    private String email;
    private Date regDate;
    private int rol;    
    
    public User(){
    }

    public User(String name, String lastName, String iD, String userName, String pass, String email, Date regDate, int rol) {
        this.name = name;
        this.lastName = lastName;
        this.iD = iD;
        this.userName = userName;
        this.pass = pass;
        this.email = email;
        this.regDate = regDate;
        this.rol = rol;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }    
}

