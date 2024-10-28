import java.util.Scanner;

public class HariKe57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int percobaan = 0;
        String kata_sandi_benar = "Admin123_wkwkwk";
        boolean terima = true;

        while (percobaan < 3 && terima) {
            System.out.print("Masukkan sandi: ");
            String sandi = input.next();

            if (sandi.equals(kata_sandi_benar)) {
                System.out.print(" ==> Kata sandi benar!");
                System.out.println();
                break;
            }else {
                percobaan++;
                System.out.print("==> Kata sandi salah!");
                System.out.println();
            }

            // Jika percobaan sudah dilakukan sebanyak 3x dan masih salah, maka program akan terhenti.
            if (percobaan >= 3) {
                System.out.println("Akses ditolak!");
            }
        }

        //From ChatGPT
        //Thanks for ChatGPT
    }
}
