package latihan_6;

public class segitiga extends bagundatar {
   private double alas;
   private double tinggi;

    public segitiga( double alas, double tinggi){
        super("segitiga");
      
        this.alas = alas;
          this.tinggi = tinggi;

    }

     @Override
    public double hitungluas() {
        return 0.5 * alas * tinggi;
    }
}
