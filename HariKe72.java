import java.util.Scanner;

public class HariKe72 {

    public static void hitungMundur(int angka) {

        // Kita menggunakan looping untuk mencetak angka 10 menurun ke bawah ygy
        for (int i = angka; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        hitungMundur(10); // mulai dari 10 ygy
    }
}
