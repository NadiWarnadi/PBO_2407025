package tugas_kelompok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cafe myCafe = new Cafe("Kopi Coding");

        myCafe.tambahMenu(new Makanan("Nasi Goreng", 25000, "Pedas"));
        myCafe.tambahMenu(new Makanan("Mie Ayam", 15000, "Gurih"));
        myCafe.tambahMenu(new Minuman("Es Teh", 5000, "Large"));
        myCafe.tambahMenu(new Minuman("Kopi Susu", 12000, "Normal"));

        double totalHarga = 0;
        boolean pesanLagi = true;

        System.out.println("Selamat Datang di Kopi Coding!");

        while (pesanLagi) {
            myCafe.tampilkanMenu();
            System.out.print("\nPilih nomor menu (0 untuk selesai): ");
            
            int pilihan = input.nextInt();

            if (pilihan > 0 && pilihan <= myCafe.getDaftarMenu().size()) {
                Menu itemDipilih = myCafe.getDaftarMenu().get(pilihan - 1);
                totalHarga += itemDipilih.getHarga();
                System.out.println("Berhasil menambah: " + itemDipilih.getNama());
            } else if (pilihan == 0) {
                pesanLagi = false;
            } else {
                System.out.println("Pilihan tidak tersedia!");
            }
           
        }

       
        input.close();

        System.out.println("\n--- STRUK PEMBAYARAN ---");
        System.out.println("Total yang harus dibayar: Rp" + totalHarga);
        System.out.println("Terima kasih sudah mampir!");
    }
}
