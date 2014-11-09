/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.ShopMod;

import Model.AdminMod.*;
import java.util.Date;

/**
 *
 * @author LaMitologica
 */
public class Buyer extends User{
    private Date birthDate;
    private String address;

    public Buyer(Date birthDate, String address) {
        this.birthDate = birthDate;
        this.address = address;
    }

    public Buyer(Date birthDate, String address, String name, String lastName, String iD, String userName, String pass, String email, Date regDate, int rol) {
        super(name, lastName, iD, userName, pass, email, regDate, rol);
        this.birthDate = birthDate;
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
}
