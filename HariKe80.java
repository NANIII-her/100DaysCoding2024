import java.util.Scanner;

public class HariKe80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kodeNama = input.nextLine();
        String kodeTanpaSpasi = kodeNama.trim();

        String realOrFake = (kodeNama.equals(kodeTanpaSpasi)) ? "BERHASIL" : "GAGAL";
        System.out.println(realOrFake);
    }
}
