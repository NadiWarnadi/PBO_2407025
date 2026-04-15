package tugas_polymorpisem;

// PersegiPanjang.java
public class PersegiPanjang extends BangunDatar {
    // Constructor: panjang dan lebar (2 parameter)
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarB(); // panjang x lebar
    }

    @Override
    public void tampilkan() {
        System.out.println("Bangun Datar : Persegi Panjang");
        System.out.println("Panjang      : " + getVarA());
        System.out.println("Lebar        : " + getVarB());
        System.out.println("Luas         : " + hitungLuas());
        System.out.println("------------------------");
    }
}
