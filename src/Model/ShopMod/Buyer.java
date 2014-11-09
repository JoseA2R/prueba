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
    private CreditCard cC;

    public Buyer(Date birthDate, String address,CreditCard cC) {
        this.birthDate = birthDate;
        this.address = address;
        this.cC = cC;
    }

    public Buyer(Date birthDate, String address,CreditCard cC, String name, String lastName, String iD, String userName, String pass, String email, Date regDate, int rol) {
        super(name, lastName, iD, userName, pass, email, regDate, rol);
        this.birthDate = birthDate;
        this.address = address;
        this.cC = cC;
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

    public CreditCard getcC() {
        return cC;
    }

    public void setcC(CreditCard cC) {
        this.cC = cC;
    }
     
}
