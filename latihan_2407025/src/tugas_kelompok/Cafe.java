package tugas_kelompok;

import java.util.ArrayList;

public class Cafe {
    private String namaCafe;
    private ArrayList<Menu> daftarMenu;

    public Cafe(String nama) {
        this.namaCafe = nama;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("\n--- MENU " + namaCafe.toUpperCase() + " ---");
        for (int i = 0; i < daftarMenu.size(); i++) {
            System.out.print((i + 1) + ". ");
            daftarMenu.get(i).detailMenu(); // Polymorphism
        }
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }
}

