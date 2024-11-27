import java.util.Arrays;
import java.util.Scanner;

public class HariKe87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] hasil = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(hasil));

        System.out.print("Ganti nilai array? ");
        String yon = input.next();

        if (yon.equals("ya")) {
            while (true) {
                System.out.println("==>");
                // Menentukan index ke berapa dan ubah nilainya
                System.out.print("Index ke-");
                int ubahNilai = input.nextInt();

                if (ubahNilai >= 5) {
                    System.out.println("Ga ada index ke-" + ubahNilai);
                    continue;
                }
                System.out.print("Nilainya: ");
                int nilai = input.nextInt();

                if (ubahNilai == 0) {
                    hasil[0] = nilai;
                } else if (ubahNilai == 1) {
                    hasil[1] = nilai;
                } else if (ubahNilai == 2) {
                    hasil[2] = nilai;
                } else if (ubahNilai == 3) {
                    hasil[3] = nilai;
                } else if (ubahNilai == 4) {
                    hasil[4] = nilai;
                }
                System.out.print("Lanjut? ");
                String x = input.next();

                if (x.equals("ya")) {
                    continue;
                } else if (x.equals("no")) {
                    break;
                }
            }
        } else if (yon.equals("no")) {
            System.out.println("Ya udah sih");
        }
        System.out.println("=====================================");
        System.out.println("Hasil akhir ==> " + Arrays.toString(hasil));
    }
}
