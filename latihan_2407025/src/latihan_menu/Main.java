package latihan_menu;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Menu> daftarPesanan = new ArrayList<>();
        
        daftarPesanan.add(new MenuItem("Ayam Goreng", 20000));
        daftarPesanan.add(new MenuItem("Es Jeruk", 8000));
        daftarPesanan.add(new MenuItem("Nasi Putih", 5000));

        double totalSeluruhnya = 0;

        System.out.println("=== DAFTAR PESANAN ===");
        for (Menu m : daftarPesanan) {
            m.tampilkan(); 
            totalSeluruhnya += m.hitungTotal(); 
        }
        System.out.println("===============================");
        System.out.println("TOTAL HARGA KESELURUHAN: Rp " + totalSeluruhnya);
    }
}
