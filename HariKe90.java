import java.util.Arrays;
import java.util.Scanner;

public class HariKe90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah array: ");
        int n = input.nextInt();

        int[] hasil = new int[n];
        for (int i = 0; i < n; i++) {
            int angka = input.nextInt();

            hasil[i] += angka;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(hasil[i] + " ");
        }
    }
}
