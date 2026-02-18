import java.util.Scanner;

public class HitungKotakpersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kotak (persegi): ");
        double sisi = input.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas kotak        : " + luas);
        System.out.println("Keliling kotak    : " + keliling);

        input.close();
    }
}
