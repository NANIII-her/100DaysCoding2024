import java.util.Scanner;

public class HariKe60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka, jumlah = 0;

        do {
            angka = input.nextInt();
            jumlah += angka;
        } while (angka != 0);

        System.out.println(jumlah);
        
    }
}
