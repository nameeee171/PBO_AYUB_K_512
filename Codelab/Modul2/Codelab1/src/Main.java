public class Main {//Ini adalah classnya
    public static void main(String[] args){//Ini juga termasuk method 
        Hewan hewan1 = new Hewan();//Ini objek 1
        Hewan hewan2 = new Hewan();//Ini objek 2

        hewan1.nama = "Kucing";//Ini kita mengisi objek 1
        hewan2.nama = "Anjing";//Ini kita mengisi objek 2
        
        hewan1.jenis = "mamalia";//Ini kita mengisi objek 1, yang membedakan atributnya saja
        hewan2.jenis = "mamalia";//Ini kita mengisi objek 2, yang membedakan atributnya saja

        hewan1.suara = "nyannn";//Ini kita mengisi objek 1, yang membedakan atributnya saja
        hewan2.suara = "woff-woff";//Ini kita mengisi objek 2, yang membedakan atributnya saja

        hewan1.talk();//Ini memanggil hewan1 dengan method
        hewan2.talk();//Ini memanggil hewan1 dengan method


    }
    
}
