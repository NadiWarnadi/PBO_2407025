package latihan_menu;

public class MenuItem extends Menu {

     public MenuItem(String nama, double harga) {
        super(nama, harga); // Memanggil konstruktor milik Menu
    }

      @Override
    public double hitungTotal() {
        // misal ada aturan pajak (tambah pajak 10%)
        return harga + (harga * 0.1);
    }

     @Override
    public void tampilkan() {
        System.out.println("Nama Menu      : " + nama);
        System.out.println("Harga Awal     : " + harga); // Harga asli
        System.out.println("Pajak (10%)    : " + (harga * 0.1));
        System.out.println("Total Bayar    : " + hitungTotal()); // Harga setelah pajak
        System.out.println("-------------------------------");
    }
}
