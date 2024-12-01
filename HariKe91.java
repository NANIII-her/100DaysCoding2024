import java.util.Scanner;

public class HariKe91 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("==> ");
            int angka = input.nextInt();

            if (angka % 2 == 0) {
                System.out.println("Genap");
            } else {
                System.out.println("You and I, end");
                break;
            }
        }
    }
}
