import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RekeningBank rek1 = new RekeningBank();
        RekeningBank rek2 = new RekeningBank();

        rek1.nomor = "12345";
        rek1.nama = "lunox";
        rek1.saldo = 2000000;

        rek2.nomor = "54321";
        rek2.nama = "fanni";
        rek2.saldo = 2000000;


        boolean ulang = true;

        while (ulang){
            System.out.println("============= Menu Transaksi ===========");
            System.out.println("1.Setor Uang");
            System.out.println("2.Tarik Tunai");
            System.out.println("3.Keluar");
            System.out.print("Pilihan  transaksi : ");
            int pilihan = input.nextInt();

            if (pilihan == 1){
                System.out.print("Masukkan Nomor Rekening (1) " + rek1.nama + " dan (2) " + rek2.nama + " : ");
                int choice = input.nextInt();
                System.out.print("Masukkan Nominal Setor : ");
                double Str = input.nextDouble();
                if(choice == 1){
                    rek1.setorUang(Str);
                }else if (choice == 2){
                    rek2.setorUang(Str);
                }else{
                    System.out.println("Pilihan Nommor Rekening Tidak Valid");
                }
            }else if (pilihan == 2){
                System.out.print("Masukkan Nomor Rekening (1) " + rek1.nama + " dan (2) " + rek2.nama + " : ");
                int choice2 = input.nextInt();
                System.out.print("Masukkan Nominal Uang : ");
                double Wd = input.nextDouble();

                if(choice2 == 1){
                    rek1.tarikTunai(Wd);
                }else if(choice2 == 2){
                    rek2.tarikTunai(Wd);
                }else{
                    System.out.println("Pilihan Nommor Rekening Tidak Valid");
                }
            }else if (pilihan == 3){
                System.out.println("Terima Kasih Telah Menggunakan layanan Kami");
                ulang = false;
            }else{
                System.out.println("Pilihan Transaksi Tidak Valid");
            }
        }
        rek1.tampilkanInfo();
        rek2.tampilkanInfo();

        input.close();
        }

    }