package latihan_6;



public abstract class bagundatar {

    private String Nama;

    public bagundatar (String Nama){
        this.Nama= Nama;
    }

    public abstract double hitungluas(); 

    public String getNama() {
        return Nama;
    }

    public void display() {
        System.out.println("Nama Bangun : " + getNama());
        System.out.println("Luas        : " + hitungluas());
        System.out.println("--------------------");
    }

}