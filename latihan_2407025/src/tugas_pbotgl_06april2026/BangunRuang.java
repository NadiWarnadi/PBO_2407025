package tugas_pbotgl_06april2026;

public class BangunRuang extends BangunDatar {
    private double tinggi;

   
    public BangunRuang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

   
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
}

