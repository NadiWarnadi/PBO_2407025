package tugas_pbotgl_06april2026;

public class BangunRuang extends BangunDatar {
    private double tinggi;

    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        return getPanjang() * getLebar();
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}
