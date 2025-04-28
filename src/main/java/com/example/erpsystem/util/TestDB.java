package com.example.erpsystem.util;

public class TestDB {
    public static void main(String[] args) {
        try {
            DatabaseConnection.getConnection();
            System.out.println("✅ Veritabanı bağlantısı başarılı!");
        } catch (Exception e) {
            System.out.println("❌ Bağlantı başarısız!");
            e.printStackTrace();
        }
    }
}
