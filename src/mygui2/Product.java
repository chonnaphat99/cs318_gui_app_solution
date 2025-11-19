/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mygui2;

import java.util.*;

/**
 *
 * @author chonn
 */
public class Product {
    private int productId;
    private String title;
    private double price;
    private int quantity;
    private String description;
    
    public Product(int productId, String title, double price, int quantity, String description) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    
    public static List<Product> init() {
        List<Product> list = new ArrayList<>();
        
        list.add(new Product(101, "Sony Playstation 5", 15000.0, 10, "Play Station 5 Console Ultra HD Blu-ray™ [CFI-1218A01]"));
        list.add(new Product(102, "PlayStation®VR2", 22000.0, 4, "PlayStation®VR2 : CFI-ZVR1 G"));
        list.add(new Product(103, "PlayStation®VR2 Horizon Call of the Mountain", 1000.0, 40, "PlayStation®VR2 Horizon Call of the Mountain™ bundle [ASIA-00446]"));
        list.add(new Product(104, "PS5 The Last of Us Part I", 1000.0, 3, "PS5 The Last of Us Part I [ECAS-00042E]"));
        list.add(new Product(105, "PS5 Gran Tursimo 7", 1500.0, 1, "PS5 Gran Tursimo 7 Standard Edition [ECAS-00035E]"));
        
        return list;
    }
    /**
     * @return the productId
     */
    public int getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the amount
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param amount the amount to set
     */
    public void setQuantity(int amount) {
        this.quantity = amount;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
