import java.util.Scanner;

public class HariKe97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean a = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.print(i + " ");
            }
        }

        // Walaupun nyontek dikit, tapi nda apa-apa
    }
}
