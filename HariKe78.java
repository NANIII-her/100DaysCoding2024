import java.util.Scanner;

public class HariKe78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputBerland = input.next();

        String birland = "";

        // Untuk memmbalikkan inputan berland
        for (int i = inputBerland.length() - 1; i >= 0; i--) {
            birland += inputBerland.charAt(i);
        }

        // Inputan terjemahan
        String inputBirland = input.next();

        // Untuk mengecek apakah terjemahannya benar
        if (inputBirland.equalsIgnoreCase(birland)) {
            if (inputBirland.equals(birland)) {
                System.out.println("NO");
                return;
            }
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
