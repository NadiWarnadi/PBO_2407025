package latihanpbo.latihan2;

import java.util.Scanner;

// Kelas induk (sesuai dengan kode user)
class bangun_ruang {
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double sisi;
    protected double jari_jari;

    // Setter public
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void setJari_jari(double jari_jari) {
        this.jari_jari = jari_jari;
    }
}

// Subclass Kubus
class Kubus extends bangun_ruang {
    // Konstruktor
    public Kubus(double sisi) {
        setSisi(sisi);
    }

    // Method public untuk menghitung volume dan luas permukaan
    public double hitungVolume() {
        return sisi * sisi * sisi;
    }

    public double hitungLuasPermukaan() {
        return 6 * sisi * sisi;
    }

    // Method protected untuk mendapatkan sisi (contoh akses protected)
    protected double getSisi() {
        return sisi;
    }
}

// Subclass Balok
class Balok extends bangun_ruang {
    public Balok(double panjang, double lebar, double tinggi) {
        setPanjang(panjang);
        setLebar(lebar);
        setTinggi(tinggi);
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

// Subclass Tabung
class Tabung extends bangun_ruang {
    public Tabung(double jari_jari, double tinggi) {
        setJari_jari(jari_jari);
        setTinggi(tinggi);
    }

    public double hitungVolume() {
        return Math.PI * jari_jari * jari_jari * tinggi;
    }

    public double hitungLuasPermukaan() {
        return 2 * Math.PI * jari_jari * (jari_jari + tinggi);
    }

    // Method protected untuk menghitung luas alas
    protected double hitungLuasAlas() {
        return Math.PI * jari_jari * jari_jari;
    }
}

// Subclass Bola
class Bola extends bangun_ruang {
    public Bola(double jari_jari) {
        setJari_jari(jari_jari);
    }

    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(jari_jari, 3);
    }

    public double hitungLuasPermukaan() {
        return 4 * Math.PI * jari_jari * jari_jari;
    }
}

// Kelas utama (public) dengan program interaktif
public class KalkulatorBangunRuang {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            tampilkanMenu();
            int pilihan = bacaPilihan();
            if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan kalkulator bangun ruang!");
                break;
            }
            prosesPilihan(pilihan);
        }
        scanner.close();
    }

    private static void tampilkanMenu() {
        System.out.println("\n=== KALKULATOR BANGUN RUANG ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Bola");
        System.out.println("0. Keluar");
        System.out.print("Pilih bangun ruang (0-4): ");
    }

    private static int bacaPilihan() {
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // bersihkan buffer
        return pilihan;
    }

    private static void prosesPilihan(int pilihan) {
        switch (pilihan) {
            case 1:
                hitungKubus();
                break;
            case 2:
                hitungBalok();
                break;
            case 3:
                hitungTabung();
                break;
            case 4:
                hitungBola();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    private static void hitungKubus() {
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        scanner.nextLine();
        Kubus kubus = new Kubus(sisi);
        System.out.println("\n" + "Kubus");
        System.out.printf("Volume         : %.2f\n", kubus.hitungVolume());
        System.out.printf("Luas Permukaan : %.2f\n", kubus.hitungLuasPermukaan());
        // Contoh akses method protected (masih dalam package yang sama)
        System.out.println("Sisi kubus (via protected method): " + kubus.getSisi());
    }

    private static void hitungBalok() {
        System.out.print("Masukkan panjang balok: ");
        double p = scanner.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        double l = scanner.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        double t = scanner.nextDouble();
        scanner.nextLine();
        Balok balok = new Balok(p, l, t);
        System.out.println("\n" + "Balok");
        System.out.printf("Volume         : %.2f\n", balok.hitungVolume());
        System.out.printf("Luas Permukaan : %.2f\n", balok.hitungLuasPermukaan());
    }

    private static void hitungTabung() {
        System.out.print("Masukkan jari-jari tabung: ");
        double r = scanner.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double t = scanner.nextDouble();
        scanner.nextLine();
        Tabung tabung = new Tabung(r, t);
        System.out.println("\n" + "Tabung");
        System.out.printf("Volume         : %.2f\n", tabung.hitungVolume());
        System.out.printf("Luas Permukaan : %.2f\n", tabung.hitungLuasPermukaan());
        System.out.println("Luas alas tabung (via protected method): " + tabung.hitungLuasAlas());
    }

    private static void hitungBola() {
        System.out.print("Masukkan jari-jari bola: ");
        double r = scanner.nextDouble();
        scanner.nextLine();
        Bola bola = new Bola(r);
        System.out.println("\n" + "Bola");
        System.out.printf("Volume         : %.2f\n", bola.hitungVolume());
        System.out.printf("Luas Permukaan : %.2f\n", bola.hitungLuasPermukaan());
    }
}