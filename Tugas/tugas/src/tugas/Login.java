package tugas;
import java.util.Scanner;
public class Login {

    public static void main(String[] args) {
        
        int pilihan;
        String username, password, nama, nim;

        Scanner input = new Scanner(System.in);

        System.out.println("::..Pilih Login..::");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan Pilihan (1/2): ");

        pilihan = input.nextInt();
        input.nextLine(); 

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan Username: ");
                username = input.nextLine();
                System.out.print("Masukkan Password: ");
                password = input.nextLine();

                if (username.equals("admin512") && password.equals("password512")) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;

            case 2:
                System.out.print("Masukkan Nama: ");
                nama = input.nextLine();
                System.out.print("Masukkan NIM: ");
                nim = input.nextLine();

                if (nama.equals("Ayub") && nim.equals("202410370110512")) {
                    System.out.println("Login Mahasiswa berhasil!");
                    System.out.println("Nama: " + nama);
                    System.out.println("NIM: " + nim);
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        input.close();
    }
}
