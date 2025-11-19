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
public final class GlobalVar {
    public static User currentUser = null;
    
    public static ArrayList<User> users = User.exampleUsers();
    public static List<Product> products = Product.init();
}
