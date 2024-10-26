import java.util.Scanner;

public class HariKe55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mulai dari mana: ");
        int a = input.nextInt();

        for (int i = a; i >= 1; i--) {
            if (i % 15 == 0) {
                System.out.println(i + "==> Master piece");
            }else if (i % 5 == 0) {
                System.out.println(i + "==> Kelipatan 5");
            }else if (i % 3 == 0) {
                System.out.println(i + "==> Kelipatan 3");
            }else {
                System.out.println(i);
            }
        }
    }
}
