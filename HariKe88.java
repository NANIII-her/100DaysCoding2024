import java.util.Scanner;

public class HariKe88 {
    public static double kubik(double r, double t) {
        return 3.14 * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double t = input.nextDouble();

        System.out.println(kubik(r, t) + " m kubik.");
    }
}
