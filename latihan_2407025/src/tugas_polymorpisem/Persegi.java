package tugas_polymorpisem;
public class Persegi extends BangunDatar {
    // Constructor: sisi (1 parameter)
    public Persegi(double sisi) {
        super(sisi); // memanggil constructor BangunDatar dengan 1 parameter
    }

    // Override hitungLuas
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA(); // sisi x sisi
    }

    // Override tampilkan
    @Override
    public void tampilkan() {
        System.out.println("Bangun Datar : Persegi");
        System.out.println("Sisi         : " + getVarA());
        System.out.println("Luas         : " + hitungLuas());
        System.out.println("------------------------");
    }
}