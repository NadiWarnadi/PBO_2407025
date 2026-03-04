package tugas_2407025.kalkulator_bangun_ruang;

import java.util.Scanner;
public class main {

   


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Persegi\n2. Segitiga\n3. Lingkaran\n4. jajar genjang");
        System.out.print("Pilihan: ");
        int menu = input.nextInt();

        if (menu == 1) {
            persegi p = new persegi();
            System.out.print("Masukkan Sisi: ");
            p.setSisi(input.nextDouble()); 
            
            System.out.println("Luas: " + p.hitungLuas());
            System.out.println("Keliling: " + p.hitungKeliling());

        } else if (menu == 2) {
            segitiga s = new segitiga();
            System.out.print("Masukkan Alas: ");
            s.setLebar(input.nextDouble()); 
            System.out.print("Masukkan Tinggi: ");
            s.setTinggi(input.nextDouble());

            System.out.println("Luas: " + s.hitungLuas());
            System.out.println("Keliling: " + s.hitungKeliling());
        }

        else if (menu == 3) {
    lingkaran l = new lingkaran();
    System.out.print("Masukkan Jari-jari: ");
    l.setJari_jari(input.nextDouble()); 

    System.out.println("Hasil Luas Lingkaran: " + l.hitungLuas());
    System.out.println("Hasil Keliling Lingkaran: " + l.hitungKeliling());
      
    }
      else if (menu == 4) {
    jajargenjang jg = new jajargenjang();
    
    System.out.print("Masukkan Alas (Lebar): ");
    jg.setLebar(input.nextDouble());
    
    System.out.print("Masukkan Tinggi: ");
    jg.setTinggi(input.nextDouble());
    
    System.out.print("Masukkan Sisi Miring: ");
    jg.setSisi(input.nextDouble());

    System.out.println("Luas Jajar Genjang: " + jg.hitungLuas());
    System.out.println("Keliling Jajar Genjang: " + jg.hitungKeliling());
}
        else {
            System.out.println("Pilihan tidak valid!");
        }
        
        input.close();
    }
}

}
