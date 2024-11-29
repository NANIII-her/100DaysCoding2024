import java.util.Scanner;

public class HariKe89 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();

        String palindrom = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            palindrom += text.charAt(i);
        }

        if (text.equalsIgnoreCase(palindrom)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
