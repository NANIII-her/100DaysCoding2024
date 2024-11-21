import java.util.Scanner;

public class HariKe81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputan = input.nextLine();

        for (char karakter : inputan.toCharArray()) {
            int a = Integer.valueOf(karakter);
            System.out.println(karakter + " = " + a);
        }
    }
}
