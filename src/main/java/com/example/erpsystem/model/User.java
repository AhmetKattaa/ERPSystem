package com.example.erpsystem.model;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;

    // Constructor
    public User(int id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Default constructor (JavaFX ve veri tabanı işlemleri için gerekli olabilir)
    public User() {
    }

    // Getter ve Setter metodları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // UML'de belirtilen Metotlar
    public boolean login(String username, String password) {
        // Şimdilik sadece dummy kontrol
        return this.username.equals(username) && this.password.equals(password);
    }

    public void logout() {
        System.out.println(username + " has logged out.");
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        System.out.println("Password has been reset.");
    }
}
