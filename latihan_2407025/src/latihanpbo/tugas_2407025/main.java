package latihanpbo.tugas_2407025;

import java.util.Scanner;

/**
 * Class Cafe dengan enkapsulasi
 * Menyimpan nama menu dan tiga bahan
 */
class Cafe {
    private String namaMenu;
    private String bahan1;
    private String bahan2;
    private String bahan3;

    // Setter untuk nama menu
    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    // Getter
    public String getNamaMenu() {
        return namaMenu;
    }

    public String getBahan1() {
        return bahan1;
    }

    public String getBahan2() {
        return bahan2;
    }

    public String getBahan3() {
        return bahan3;
    }

    /**
     * Method untuk menentukan resep berdasarkan nama menu
     * Menggunakan percabangan if-else
     */
    public void setResep() {
        if (namaMenu.equalsIgnoreCase("Mocafino")) {
            bahan1 = "1 shot espresso";
            bahan2 = "2 oz foam (setengah lot)";
            bahan3 = "1 sendok coklat bubuk";
        } else if (namaMenu.equalsIgnoreCase("Espresso")) {
            bahan1 = "1 shot espresso (30 ml)";
            bahan2 = "Tidak ada";
            bahan3 = "Tidak ada";
        } else if (namaMenu.equalsIgnoreCase("Cappuccino")) {
            bahan1 = "1 shot espresso";
            bahan2 = "1 oz susu steamed";
            bahan3 = "1 oz foam";
        } else if (namaMenu.equalsIgnoreCase("Latte")) {
            bahan1 = "1 shot espresso";
            bahan2 = "3 oz susu steamed";
            bahan3 = "tipis foam";
        } else if (namaMenu.equalsIgnoreCase("Americano")) {
            bahan1 = "1 shot espresso";
            bahan2 = "3 oz air panas";
            bahan3 = "Tidak ada";
        } else {
            // Menu tidak dikenal
            bahan1 = "Resep tidak tersedia";
            bahan2 = "Resep tidak tersedia";
            bahan3 = "Resep tidak tersedia";
        }
    }

    /**
     * Menampilkan resep lengkap
     */
    public void tampilResep() {
        System.out.println("\n=== RESEP MINUMAN ===");
        System.out.println("Menu       : " + namaMenu);
        System.out.println("Bahan 1    : " + bahan1);
        System.out.println("Bahan 2    : " + bahan2);
        System.out.println("Bahan 3    : " + bahan3);
        System.out.println("=====================");
    }
}

/**
 * Class utama untuk menjalankan program
 */
public class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cafe cafe = new Cafe();

        System.out.println("===== PROGRAM RESEP KOPI =====");
        System.out.print("Masukkan nama menu (contoh: Mocafino, Espresso, Cappuccino, Latte, Americano): ");
        String menu = input.nextLine();

        // Set menu dan resep
        cafe.setNamaMenu(menu);
        cafe.setResep();
        cafe.tampilResep();

        input.close();
    }
}
