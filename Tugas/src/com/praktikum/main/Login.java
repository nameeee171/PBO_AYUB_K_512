package com.praktikum.main;

import com.praktikum.users.Admin;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.User;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Admin", "-", "ui", "0");
        Mahasiswa mhs = new Mahasiswa("ui", "0");

        User currentUser = null;

        while (true) {
            System.out.println("::=====-- Sistem Login --=====::");
            System.out.println("1. Login sebagai Admin");
            System.out.println("2. Login sebagai Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1/2/3): ");
            
            String pilihan = input.nextLine();

            switch (pilihan) {
                case "1":
                    if (admin.login()) {
                        currentUser = admin;
                    }
                    break;
                case "2":
                    if (mhs.login()) {
                        currentUser = mhs;
                    }
                    break;
                case "3":
                    System.out.println("Terima kasih. Program selesai.");
                    input.close();
                    return;
                default:
                    System.out.println("Belajar Ngoding Lagi Dekkkkkkkkkkkkkkkkkkkk. Silakan coba lagi.");
            }

            if (currentUser != null) {
                currentUser.displayAppMenu();
                currentUser = null; 
            }
        }
    }
}
