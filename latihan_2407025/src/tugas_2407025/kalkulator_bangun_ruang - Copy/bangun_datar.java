package tugas_2407025.kalkulator_bangun_ruang;

public class bangun_datar {
  
    protected double panjang;
    protected double lebar;
    protected double tinggi;
    protected double sisi;
    protected double jari_jari;


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
    

  
    public void tampilkanInfo() {
        System.out.println("Menghitung Luas Bangun Datar...");
    }
}
