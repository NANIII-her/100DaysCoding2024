import java.util.Scanner;

public class HariKe96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 5;
        int b = 26;

        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                for (int j = 1; j <= 30; j++) {
                    if (j >= a && j <= b) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            } else if (i == 4) {
                for (int j = 1; j <= 30; j++) {
                    if (j >= a && j <= b) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            for (int j = 1; j <= 30; j++) {
                if (j == a || j == b) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            a--;
            b++;
            System.out.println();
        }

        int c = 3;
        int d = 28;
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 30; j++) {
                if (j == c || j == d) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            c++;
            d--;
            System.out.println();
        }
    }
}
