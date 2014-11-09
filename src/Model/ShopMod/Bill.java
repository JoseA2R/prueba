/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.ShopMod;

import Model.InvMod.Product;
import java.util.Date;


/**
 *
 * @author LaMitologica
 */
public class Bill {
    Buyer buyer;
    Product product;
    Date date;
    String controlNum;

    public Bill(Buyer buyer, Product product, Date date, String controlNum) {
        this.buyer = buyer;
        this.product = product;
        this.date = date;
        this.controlNum = controlNum;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getControlNum() {
        return controlNum;
    }

    public void setControlNum(String controlNum) {
        this.controlNum = controlNum;
    }
    
    
}
