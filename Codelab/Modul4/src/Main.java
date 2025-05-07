import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Fiksi("Laskar Pelangi", "Andrea Hirata");
        Buku buku2 = new NonFiksi("Fisika Dasar", "Halliday & Resnick");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota ayub = new Anggota("Ayub", "ayub512");
        Anggota nanda = new Anggota("Nanda", "nanda508");
System.out.println("\n\n");
System.out.println("===============data perpustakaan=================");
        ayub.pinjamBuku("Laskar Pelangi");
        nanda.pinjamBuku("Fisika Dasar", 7);

        ayub.kembalikanBuku("Laskar Pelangi");
    }
}
