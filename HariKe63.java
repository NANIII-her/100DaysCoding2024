import java.util.Scanner;

public class HariKe63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                continue;
            } else if (i % 3 == 0 || i % 5 == 0) {
                jumlah++;
            }
        }
        System.out.println(jumlah);
    }
}
