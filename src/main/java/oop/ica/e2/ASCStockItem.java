/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package oop.ica.e2;

/**
 *
 * @author W9641416
 */
public class ASCStockItem {
  // Attribute
    
    String item, title, description;
    int pound, penny, stock;

    
    //Default constructor

    public ASCStockItem() {
    }

  
 
    
    //Parameterised constructor
    public ASCStockItem(String item, String title, String description, int pound, int penny, int stock) {
        this.item = item;
        this.title = title;
        this.description = description;
        this.pound = pound;
        this.penny = penny;
        this.stock = stock;
    }

    
    //Setter methods to set the value to the attrubutes
    public void setItem(String item) {
        this.item = item;
    }
    

    public void setDescription(String description) {
        this.description = description;
    }

    
    public void setPenny(int penny) {
        this.penny = penny;
    }

    
    public void setStock(int stock) {
        this.stock = stock;
    }

    
    public void setPound(int pound) {
        this.pound = pound;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }
    

    //Getter method to get the value from attributes
    public String getItem() {
        return item;
    }
    

    public String getDescription() {
        return description;
    }

    
    public int getPenny() {
        return penny;
    }

    
    public int getPound() {
        return pound;
    }

    
    public int getStock() {
        return stock;
    }

    
    public String getTitle() {
        return title;
    }
   
}
