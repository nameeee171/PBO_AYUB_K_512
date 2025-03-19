public class Main {
    public static void main(String[] args){
        
        KarakterGame krt = new KarakterGame("mas kang", 100);
        Pahlawan phl = new Pahlawan("Brimstone", 150);
        Musuh msh = new Musuh("Viper", 200);

        System.out.println("Status Awal:");
        System.out.println(phl.getNama() + " Memiliki Kesehatan: " + phl.getKesehatan());
        System.out.println(msh.getNama() + " Memiliki Kesehatan: " + msh.getKesehatan());

        phl.serang(msh);
        msh.serang(phl);
    }
}
