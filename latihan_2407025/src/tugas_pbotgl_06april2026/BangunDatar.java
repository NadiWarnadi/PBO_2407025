package tugas_pbotgl_06april2026;

public class BangunDatar {
    
    private double panjang;
    private double lebar;

  
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }


    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}
