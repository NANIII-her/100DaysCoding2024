import java.util.Scanner;

public class HariKe92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (int j = n - 1; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
