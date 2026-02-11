package latihanpbo.latihan1;
class Cafe {
    String nama;
    String alamat;
    
    Cafe(String nama, String alamat) {
        this.nama = "nama";
        this.alamat = "alamat";
        System.out.println("Cafe.Cafe()");
        System.out.println("Nama Cafe: " + nama);
        System.out.println("Alamat Cafe di: " + alamat);
        System.out.println("==============================");
    }

    void buka() {
        System.out.println("==============================");
        System.out.println("Cafe Sudah Bukabuka");
    }
 
}

public class main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Kopi cinta kamu", "jalan kopie");
        Cafe cafe2 = new Cafe("Kopi hitam kupu  kupu", "jalan kopie hitam");
        Cafe cafe3 = new Cafe("Kopi susu gula aren", "jalan kopie susu");
        
    //  Cafe cafe1 = new Cafe();
    //  Cafe cafe2 = new Cafe();
    //   Cafe cafe3 = new Cafe();
    //     cafe1.nama = "Kopi cinta kamu";
    //     cafe1.alamat = "jalan kopie";  

    //     System.out.println("Nama Cafe: " + cafe1.nama);
    //     System.out.println("Alamat Cafe: " + cafe1.alamat);

        
    //     cafe2.nama = "Kopi hitam kupu kupu";
    //     cafe2.alamat = "jalan kopie hitam";
    //     System.out.println("Nama Cafe: " + cafe2.nama);
    //     System.out.println("Alamat Cafe: " + cafe2.alamat);

    
    // //     cafe3.nama  = "Kopi susu gula aren";
    // //     cafe3.alamat = "jalan kopie susu";
    //      System.out.println("Nama Cafe: " + cafe3.nama);
    //     System.out.println("Alamat Cafe: " + cafe3.alamat);

    }
    
}
