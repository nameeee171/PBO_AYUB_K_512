public class Musuh extends KarakterGame{

        public Musuh(String nama, int kesehatan){
            super(nama, kesehatan);
        }
        @Override
        public void serang(KarakterGame target){
            System.out.println(getNama() + " Menyerang " + target.getNama() + " Menggunakan Snake Bite! ");
        
            target.setKesehatan(target.getKesehatan() - 15);
            System.out.println(target.getNama() + " Sekarang Memiliki Kesehatan " + target.getKesehatan());
        }
    }
    

