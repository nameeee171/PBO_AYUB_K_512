import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Manajemen {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU MANAJEMEN STOK BARANG ===");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Cari Barang Berdasarkan Nama");
            System.out.println("5. Tambah Stok ke Barang yang Ada");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int opsi = -1;

            try {
                opsi = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.nextLine();
                continue;
            }

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan nama barang baru: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan stok awal: ");
                    try {
                        int stok = scanner.nextInt();
                        scanner.nextLine();
                        if (stok < 0) {
                            System.out.println("Stok tidak boleh negatif.");
                            break;
                        }
                        Barang barangBaru = new Barang(nama, stok);
                        daftarBarang.add(barangBaru);
                        System.out.println("Barang berhasil ditambahkan.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input stok harus berupa angka!");
                        scanner.nextLine();
                    }
                    break;

                case 2:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                    } else {
                        System.out.println("Daftar Barang Saat Ini:");
                        Iterator<Barang> iterator = daftarBarang.iterator();
                        while (iterator.hasNext()) {
                            Barang b = iterator.next();
                            System.out.println("- " + b.getNama() + ": " + b.getStok());
                        }
                    }
                    break;

                case 3:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Tidak ada barang untuk dikurangi stok.");
                        break;
                    }

                    tampilkanDaftarBarang(daftarBarang);

                    try {
                        System.out.print("Masukkan indeks barang yang dikurangi: ");
                        int indeks = scanner.nextInt();
                        System.out.print("Masukkan jumlah yang akan dikurangi: ");
                        int jumlah = scanner.nextInt();
                        scanner.nextLine();

                        Barang barangDipilih = daftarBarang.get(indeks);

                        if (jumlah > barangDipilih.getStok()) {
                            throw new StokKurangException("Stok untuk " + barangDipilih.getNama() + " hanya tersisa " + barangDipilih.getStok());
                        }

                        barangDipilih.setStok(barangDipilih.getStok() - jumlah);
                        System.out.println("Stok berhasil dikurangi.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    } catch (StokKurangException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama barang yang dicari: ");
                    String cariNama = scanner.nextLine().toLowerCase();
                    boolean ditemukan = false;
                    for (Barang b : daftarBarang) {
                        if (b.getNama().toLowerCase().contains(cariNama)) {
                            System.out.println("Ditemukan: " + b.getNama() + " (Stok: " + b.getStok() + ")");
                            ditemukan = true;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Barang tidak ditemukan.");
                    }
                    break;

                case 5:
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Belum ada barang yang tersedia.");
                        break;
                    }
                    tampilkanDaftarBarang(daftarBarang);
                    try {
                        System.out.print("Masukkan indeks barang yang ingin ditambah stok: ");
                        int idx = scanner.nextInt();
                        System.out.print("Jumlah stok yang ditambahkan: ");
                        int tambah = scanner.nextInt();
                        scanner.nextLine();
                        if (tambah < 0) {
                            System.out.println("Jumlah tidak boleh negatif.");
                            break;
                        }
                        Barang b = daftarBarang.get(idx);
                        b.setStok(b.getStok() + tambah);
                        System.out.println("Stok untuk " + b.getNama() + " sekarang: " + b.getStok());
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus berupa angka!");
                        scanner.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Opsi tidak dikenal.");
            }
        }

        scanner.close();
        System.out.println("Terima kasih sudah menggunakan sistem manajemen stok.");
    }

    public static void tampilkanDaftarBarang(ArrayList<Barang> daftarBarang) {
        System.out.println("\nDaftar Barang:");
        Iterator<Barang> iter = daftarBarang.iterator();
        int index = 0;
        while (iter.hasNext()) {
            Barang b = iter.next();
            System.out.println(index + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
            index++;
        }
    }
}
