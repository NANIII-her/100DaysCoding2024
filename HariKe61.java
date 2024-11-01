import java.util.Scanner;

public class HariKe61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bom = 50;
        int a = 0, b = 100, angka = 0;

        while (angka != bom) {
            System.out.println("Masukkan angka " + a + " - " + b);
            angka = input.nextInt();
            if (angka < a || angka > b) {
                System.out.println("Tidak boleh melewati batas");
            }

            if (angka > a && angka < bom) {
                a = angka;
            }else if (angka > bom && angka <= b) {
                b = angka;
            }
            System.out.println("========================================");
        }
        System.out.println("Duarrrrrrrr!!!!!");
    }
}
