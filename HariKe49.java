import java.util.Scanner;

public class HariKe449 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        // Username dan kata sandi
        String usn = "NANIII";
        String password = "12345678";

        // Input username dan kata sandi 
        System.out.print("Masukkan username: ");
        String input_username = input.next();
        System.out.print("Masukkan password: ");
        String input_pass = input.next();

        // Inilah kondisi-kondisinya
        if (input_username.equals(usn) && input_pass.equals(password)) {
            System.out.println("Anda berhasil login!");
        } else if (!input_username.equals(usn) && input_pass.equals(password)) {
            System.out.println("Gagal login!");
            System.out.println("Note: Kesalahan pada username.");
            System.out.println("Coba lagi!");
        } else if (input_username.equals(usn) && !input_pass.equals(password)) {
            System.out.println("Gagal login!");
            System.out.println("Note: Kesalahan pada password.");
            System.out.println("Coba lagi!");
        } else if (!input_username.equals(usn) && !input_pass.equals(password)) {
            System.out.println("Gagal login!");
        }
    }
}
