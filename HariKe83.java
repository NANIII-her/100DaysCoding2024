import java.util.Scanner;

public class HariKe83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] angka = new int[5];
        // Angka tebakan
        angka[0] = 2;
        angka[1] = 3;
        angka[2] = 5;
        angka[3] = 7;
        angka[4] = 9;

        int i = 0;
        while (true) {
            System.out.print("Tebak angka index ke-" + i + " : ");
            int inputan = input.nextInt();
            if (inputan == angka[i]) {
                System.out.println("Benar");
            } else {
                System.out.println("SALAH. Program selesai.");
                break;
            }

            // Percabangan ini berfungsi jika kita berhasil menjawab semua angka pada index
            if (i == 4) {
                System.out.println("ANDA MENJAWAB SEMUANYA DENGAN BENAR. SELAMAT!");
                break;
            }
            i++;
            System.out.println("====================================================");
        }
    }
}
