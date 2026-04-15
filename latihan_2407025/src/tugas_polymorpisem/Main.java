package tugas_polymorpisem;


public class Main {
    public static void main(String[] args) {
        
        BangunDatar[] daftarBangun = new BangunDatar[3];

        daftarBangun[0] = new Persegi(5);          
        daftarBangun[1] = new PersegiPanjang(4, 6); 
        daftarBangun[2] = new Segitiga(3, 8);       

      
        System.out.println("=== HASIL PERHITUNGAN LUAS BANGUN DATAR ===\n");
        for (BangunDatar b : daftarBangun) {
            b.tampilkan();
        }
    }
}