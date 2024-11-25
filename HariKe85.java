import java.util.Scanner;

public class HariKe85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();
        int[] a = new int[n];

        // Pengisian array variabel a dengan inputan
        for (int i = 0; i < a.length; i++) {
            int x = input.nextInt();
            a[i] = x;
        }

        /*
         * Pengisian array a berdasarkan variabel inputan
         * for di atas
         */
        System.out.print("Array-nya adalah { ");
        for (int i : a) {
            if (i == a[n - 1]) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.print(" }");

    }
}
