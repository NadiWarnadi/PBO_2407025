package latihan_6;



public class persegi extends bagundatar {
    private double sisi;

    public persegi ( double sisi){
        super("persegi");
        this.sisi =sisi;

    }
    @Override
    public double hitungluas(){
        return sisi*sisi;
    }
}
