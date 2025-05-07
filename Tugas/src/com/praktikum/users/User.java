package com.praktikum.users;

public abstract class User {
    private String nama;
    private String nim;

    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    // Abstract methods
    public abstract boolean login();
    public abstract void displayAppMenu();

    // Method untuk menampilkan informasi umum
    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
