import java.util.Scanner;

public class HariKe95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            for (int j = 2 * i - 1; j >= 1; j--) {
                System.out.print(" ");
            }

            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
