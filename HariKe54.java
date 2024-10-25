import java.util.Scanner;

public class HariKe54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = input.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
