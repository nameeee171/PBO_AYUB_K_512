public class Pahlawan extends KarakterGame {
    
    public Pahlawan(String nama, int kesehatan){
        super(nama, kesehatan);
    }
    @Override 
    public void serang(KarakterGame target){
        System.out.println(getNama() + " Menyerang " + target.getNama() + " Menggunakan Orbital Strike!");
        
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " Sekarang Memiliki Kesehatan " + target.getKesehatan());
    }
}
