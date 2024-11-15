import java.util.Scanner;

public class HariKe75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata (dengan capslock): ");
        String kata = input.nextLine();
        int jumlah = kata.length();

        if (jumlah <= 10) {
            String ubah = kata.toLowerCase();
            System.out.println(ubah);
        } else {
            System.out.println(kata);
        }
    }
}
