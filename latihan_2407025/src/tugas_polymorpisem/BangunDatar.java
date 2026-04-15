package tugas_polymorpisem;


public class BangunDatar {
   
    private double varA;
    private double varB;

   
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = varA; 
    }

   
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

    
    public double hitungLuas() {
        return 0;
    }

    
    public void tampilkan() {
        System.out.println("Ini adalah bangun datar umum dengan luas = " + hitungLuas());
    }
}