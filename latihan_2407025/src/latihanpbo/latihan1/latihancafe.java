package latihanpbo.latihan1;

class Cafe {
    String nama;
    String alamat;
    
    // Constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;     
        this.alamat = alamat;  
        System.out.println("Constructor Cafe dipanggil");
        System.out.println("Nama Cafe: " + this.nama);
        System.out.println("Alamat Cafe: " + this.alamat);
        System.out.println("==============================");
    }

    void buka() {
        System.out.println("Cafe " + nama + " di " + alamat + " sudah buka!");
    }
    
    void tampilkanInfo() {
        System.out.println("Info Cafe:");
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("------------------------------");
    }
}

public class latihancafe {  
    public static void main(String[] args) {
        // Membuat objek cafe
        Cafe cafe1 = new Cafe("Kopi cinta kamu", "jalan kopie");
        Cafe cafe2 = new Cafe("Kopi hitam kupu kupu", "jalan kopie hitam");
        Cafe cafe3 = new Cafe("Kopi susu gula aren", "jalan kopie susu");
        
        System.out.println("\n=== MENGGUNAKAN METHOD ===");
       
        cafe1.buka();
        cafe1.tampilkanInfo();
        
        cafe2.buka();
        cafe2.tampilkanInfo();
        
        cafe3.buka();
        cafe3.tampilkanInfo();
        
        
        System.out.println("\n=== MENGGUNAKAN LOOP ===");
        Cafe[] semuaCafe = {cafe1, cafe2, cafe3};
        
        for (Cafe cafe : semuaCafe) {
            cafe.tampilkanInfo();
            cafe.buka();
            System.out.println();
        }
    }
}