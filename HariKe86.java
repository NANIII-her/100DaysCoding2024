import java.util.Arrays;
import java.util.Scanner;

public class HariKe86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] mentorKakDita = new String[5];

        for (int i = 0; i < mentorKakDita.length; i++) {
            String listNama = input.next(); // Nama panggilan
            mentorKakDita[i] = listNama;
        }

        System.out.println(Arrays.toString(mentorKakDita));
    }
}
