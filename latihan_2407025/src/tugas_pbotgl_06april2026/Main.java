package tugas_pbotgl_06april2026;

public class Main {
    public static void main(String[] args) {
        
        double p = 10;
        double l = 5;
        double t = 4;

       
        BangunRuang balok = new BangunRuang(p, l, t);

       
        System.out.println("Luas Alas: " + balok.hitungLuas());
        System.out.println("Volume   : " + balok.hitungVolume());
    }
}
