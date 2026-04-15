package tugas_polymorpisem;


public class Main {
    public static void main(String[] args) {
        // Polymorphism: satu variabel array untuk menyimpan berbagai objek bangun datar
        BangunDatar[] daftarBangun = new BangunDatar[3];

        daftarBangun[0] = new Persegi(5);           // sisi = 5
        daftarBangun[1] = new PersegiPanjang(4, 6); // panjang=4, lebar=6
        daftarBangun[2] = new Segitiga(3, 8);       // alas=3, tinggi=8

        // Menampilkan semua bangun datar menggunakan method tampilkan()
        System.out.println("=== HASIL PERHITUNGAN LUAS BANGUN DATAR ===\n");
        for (BangunDatar b : daftarBangun) {
            b.tampilkan();
        }
    }
}