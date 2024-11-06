import java.util.Scanner;

public class HariKe66 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (2 * a); j++) {
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}
