package perpustakaan;

public class Fiksi extends Buku {
    public Fiksi(String judul, String penulis) {
        super(judul, penulis);
    }

    @Override
    public void displayInfo() {
        System.out.println("=============================================================");
        System.out.println("📘 [Fiksi] Judul: " + judul + ", Penulis: " + penulis);
        System.out.println("=============================================================");

    }
}
