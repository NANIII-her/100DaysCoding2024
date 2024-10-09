import java.util.Scanner;

    public class HariKe38 {
    
        public static void main(String[] args) {
            
            Scanner sc = new Scanner (System.in);
            
            System.out.print("Nilai = ");
            int a = sc.nextInt();
            
            float hasilPerkalian = a * 2;
            float hasilPembagian = (float) a / 3;
            
            System.out.printf("Hasil perkalian = %.0f \n", hasilPerkalian);
            System.out.printf("Hasil pembagian = %.1f \n", hasilPembagian);
            
        }
}
