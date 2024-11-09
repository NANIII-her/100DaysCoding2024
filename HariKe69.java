import java.util.Scanner;

public class HariKe69{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= (2 * a - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
