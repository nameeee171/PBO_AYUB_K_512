package com.praktikum.users;

import com.praktikum.actions.MahasiswaActions;
import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaActions {
    private static Scanner input = new Scanner(System.in);

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        System.out.println("\n== Login Mahasiswa ==");
        System.out.print("Nama: ");
        String inputNama = input.nextLine();
        System.out.print("NIM: ");
        String inputNim = input.nextLine();

        if (inputNama.equals(getNama()) && inputNim.equals(getNim())) {
            System.out.println("Login Mahasiswa Berhasil!");
            return true;
        } else {
            System.out.println("Login Gagal! Nama atau NIM salah.");
            return false;
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
    }

    @Override
    public void displayAppMenu() {
        int pilihan;
        do {
            System.out.println("\n== Menu Mahasiswa ==");
            System.out.println("1. Laporkan Barang Temuan/Hilang");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    reportItem();
                    break;
                case 2:
                    viewReportedItems();
                    break;
                case 0:
                    System.out.println("Logout...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    @Override
    public void reportItem() {
        System.out.println("== Form Laporan Barang ==");
        System.out.print("Nama Barang: ");
        String nama = input.nextLine();
        System.out.print("Deskripsi Barang: ");
        String deskripsi = input.nextLine();
        System.out.print("Lokasi Terakhir/Ditemukan: ");
        String lokasi = input.nextLine();

        System.out.println(">> Laporan berhasil dikirim!");
        System.out.println("[Barang: " + nama + ", Deskripsi: " + deskripsi + ", Lokasi: " + lokasi + "]");
    }

    @Override
    public void viewReportedItems() {
        System.out.println(">> Fitur Lihat Laporan Belum Tersedia <<");
    }
}
