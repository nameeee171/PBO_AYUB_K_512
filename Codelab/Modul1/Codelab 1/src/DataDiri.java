import java.util.Scanner;
import java.time.LocalDate;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
    
        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);
        
        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();
        
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;
        
        String kelamin = "";
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            kelamin = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            kelamin = "Perempuan";
        } else {
            kelamin = "Jenis Kelamin Tidak Valid";
        }
        
        System.out.println("\n=== Data Diri Anda ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + kelamin);
        System.out.println("Umur: " + umur);//
        
        scanner.close();
    }
}