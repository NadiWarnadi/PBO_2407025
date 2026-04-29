package latihan_6;


public class Main {
    public static void main(String[] args) {
        bagundatar[] bs = {
        new persegi(4),
        new segitiga(3, 6)
        };

        for (bagundatar b : bs ){
            b.display();
            System.out.println("Nama Bangun: " + b.getNama());
            System.out.println("Hasil Luas: " + b.hitungluas());
            System.out.println("--------------------");
        }
    }
       
}
