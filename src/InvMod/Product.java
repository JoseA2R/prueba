/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package InvMod;

import javax.swing.ImageIcon;

/**
 *
 * @author LaMitologica
 */
public class Product {
    private String name;
    private String description;
    private String cat;
    private float price;
    private ImageIcon image;
    private String provider;
    private int amount;
    private int minAmount;

    public Product(String name, String description, String cat, float price, ImageIcon image, String provider, int amount) {
        this.name = name;
        this.description = description;
        this.cat = cat;
        this.price = price;
        this.image = image;
        this.provider = provider;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }
        
}
