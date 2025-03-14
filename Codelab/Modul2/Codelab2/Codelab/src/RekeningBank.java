public class RekeningBank {
    String nomor,nama;
    double saldo;
   
   
    void tampilkanInfo(){
        System.out.println("===============================");
        System.out.println("nomor rekening : " + nomor);
        System.out.println("nama pemilik : " + nama);
        System.out.println("saldo : " +"Rp."+saldo);
        System.out.println("===============================\n");
    }
   
   
    void setorUang(double total){
        if (total >0 ){
            saldo += total;
            System.out.println(nama + " " + "menyetor Rp." + total + " " + "saldo sekarang Rp." + saldo);
        }
    }
   
    void tarikTunai(double total){
        if(saldo >= total){
            saldo -= total;
            System.out.println(nama + " " + "menarik Rp." + total + " " + " (berhasil !) saldo saat ini Rp." + saldo );
        }else{
            System.out.println(nama + " " + "menarik Rp." + total + " " + "(gagal ! saldo anda tidak cukup)" + " " + "saldo saat ini Rp." + saldo );
   
        }
    }
   }