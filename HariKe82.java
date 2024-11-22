import java.util.Scanner;

public class HariKe82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kali ini kita akan membuat yang sedikit lebih rumit
        double a = input.nextInt();

        int i = 0;
        while (true) {
            double b = input.nextInt();
            i++;
            a += b;
            if (b == 0) {
                break;
            }
        }
        a /= i;

        System.out.println("Hasil sebelumnya = " + a);

        if (a <= 10) {
            // Pembulatan ke bawah
            a = Math.floor(a);
        } else if (a > 10 && a <= 20) {
            // Pembulatan ke atas
            a = Math.ceil(a);
        } else {
            // Pembulatan ke terdekat
            a = Math.round(a);
        }

        System.out.println("Hasil setelahnya = " + a);
    }
}
