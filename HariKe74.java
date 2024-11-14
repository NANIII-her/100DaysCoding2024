import java.util.Scanner;

public class HariKe74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Fokus pada String ini
        String namaPatokan = "NANIIIHeri";

        int coba = 0;
        while (true) {
            System.out.print("Masukkan nama: ");
            String nama = input.next();
            int jumlah = namaPatokan.length();

            System.out.println("================================================");

            if (nama.length() != jumlah) {
                System.out.println("Nda pernah ka' lihat ko");
                System.out.println("Seharusnya jumlah karakternya itu " + jumlah);

                // Kalo inputannya lebih dari jumlah karakter, maka akan mencetak ini
                if (nama.length() > jumlah) {
                    System.out.println("INI MALAH LEBIH NJIR");
                }
            } else if (nama.length() == jumlah && nama.equals(namaPatokan)) {
                // Kalo benar, di return dan program usai
                System.out.println("Oke benar mi pale'");
                return;
            }

            /*
             * Kalo salah-salah inputannya, bertambah satu mi
             * Dan kalo sampai tiga kali salahnya, ya terblokir
             */
            coba++;
            if (coba == 3) {
                System.out.println("AIH TERBLOKIR MOKO");
                break;
            }

            System.out.println("Ulangi aih");
            System.out.println("================================================");
        }
    }
}
