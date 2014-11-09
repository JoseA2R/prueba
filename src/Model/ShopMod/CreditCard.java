/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.ShopMod;

import java.util.Date;

/**
 *
 * @author LaMitologica
 */
public class CreditCard {
    
    private String number;
    private Date expDate;
    private int seCode;
    private String brand;

    public CreditCard(String number, Date expDate, int seCode, String brand) {
        this.number = number;
        this.expDate = expDate;
        this.seCode = seCode;
        this.brand = brand;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public int getSeCode() {
        return seCode;
    }

    public void setSeCode(int seCode) {
        this.seCode = seCode;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    
    
}
