package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Admin", "-", "admin", "12345");
        Mahasiswa mhs = new Mahasiswa("Ayub", "512");

        User currentUser = null;

        System.out.println("::=====-- Sistem Login --=====::");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih opsi (1/2): ");
        int pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
            case 1:
                if (admin.login()) {
                    currentUser = admin;
                } else {
                    System.out.println("Login Gagal.");
                }
                break;
            case 2:
                if (mhs.login()) {
                    currentUser = mhs;
                } else {
                    System.out.println("Login Gagal.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        if (currentUser != null) {
            currentUser.displayAppMenu(); // Polymorphism
        }

        input.close();
    }
}
