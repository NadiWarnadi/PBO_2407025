package tugas_polymorpisem;

// Segitiga.java
public class Segitiga extends BangunDatar {
    // Constructor: alas dan tinggi (2 parameter)
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB(); // 1/2 x alas x tinggi
    }

    @Override
    public void tampilkan() {
        System.out.println("Bangun Datar : Segitiga");
        System.out.println("Alas         : " + getVarA());
        System.out.println("Tinggi       : " + getVarB());
        System.out.println("Luas         : " + hitungLuas());
        System.out.println("------------------------");
    }
}