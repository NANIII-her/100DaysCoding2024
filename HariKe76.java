import java.util.Scanner;

public class HariKe76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("===>> " + kata.toUpperCase());
            } else {
                System.out.println(kata);
            }
        }
    }
}
