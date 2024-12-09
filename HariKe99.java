import java.util.Scanner;

public class HariKe99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble(); // Sebagai penampung hasil

        while (true) {
            char ops = input.next().charAt(0); // Operasinya

            // Jika menginput '=' maka keluar dari perulangan
            if (ops == '=') {
                break;
            }

            // Inputan angka selanjutnya
            double b = input.nextDouble();

            if (ops == '+') {
                a += b;
            } else if (ops == '-') {
                a -= b;
            } else if (ops == '*') {
                a *= b;
            } else if (ops == '/') {
                a /= b;
            } else {
                System.out.println("Operator tidak valid");
            }
        }
        System.out.println(a);
    }
}
