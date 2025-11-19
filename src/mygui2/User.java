/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mygui2;

import java.util.ArrayList;

/**
 *
 * @author chonn
 */
public class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    
    public static ArrayList<User> exampleUsers() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("somsak.suri", "somsak.suriyawong@bu.ac.th", "pwd123"));
        users.add(new User("nattapong.watt", "nattapong.wattanakul@bu.ac.th", "pwd123"));
        users.add(new User("pimchanok.sukp", "pimchanok.sukprasert@bu.ac.th", "pwd123"));
        users.add(new User("watana.pras", "watana.prasertkul@bu.ac.th", "pwd123"));
        users.add(new User("chonnawee.p", "chonnawee.p@bu.ac.th", "pwd123"));
        
        return users;
    }
}