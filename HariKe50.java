import java.util.Scanner;

public class HariKe50 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0 && angka <= 20) {
            System.out.println("Masuk ke 1 sampai 20");
            if (angka > 0 && angka <= 10) {
                System.out.println("Okelah");
            }else if (angka > 10 && angka <= 20) {
                System.out.println("Oke");
            }else {
                System.out.println("Sudah");
            }
        }else if (angka > 20 && angka <= 40) {
            System.out.println("Masuk ke 21 sampai 40");
            if (angka > 20 && angka <= 30) {
                System.out.println("Okelah");
            }else if (angka > 30 && angka <= 40) {
                System.out.println("Oke");
            }else {
                System.out.println("Sudah");
            }
        } else if (angka < 0 || angka > 40) {
            System.out.println("Ga termasuk");
            if (angka < 0) {
                System.out.println("Karena angka minus");
            }else {
                System.out.println("Karena lebih dari 40");
            }
        } else {
            System.out.println("Kenapa nol?");
        }
    }
}
