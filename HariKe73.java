import java.util.Scanner;

public class HariKe73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata = input.next();

        for (int i = 0; i < kata.length(); i++) {
            System.out.println(kata.charAt(i));
        }
    }
}
