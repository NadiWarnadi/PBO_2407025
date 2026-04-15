package tugas_polymorpisem;

// BangunDatar.java
public class BangunDatar {
    // Enkapsulasi: atribut private
    private double varA;
    private double varB;

    // Constructor dengan 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor dengan 1 parameter (varB = varA, bisa juga diisi 0)
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = varA; // agar seragam, misal untuk persegi
    }

    // Getter dan Setter (enkapsulasi)
    public double getVarA() {
        return varA;
    }

    public void setVarA(double varA) {
        this.varA = varA;
    }

    public double getVarB() {
        return varB;
    }

    public void setVarB(double varB) {
        this.varB = varB;
    }

    // Method hitungLuas dengan nilai default 0
    public double hitungLuas() {
        return 0;
    }

    // Method tampilkan (akan di-override di kelas turunan)
    public void tampilkan() {
        System.out.println("Ini adalah bangun datar umum dengan luas = " + hitungLuas());
    }
}