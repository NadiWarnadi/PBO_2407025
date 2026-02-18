


class PersegiPanjang {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void tampil() {
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Luas    : " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}


public class main {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setPanjang(5.4);
        pp.setLebar(3);
        pp.tampil();
    
    }
}