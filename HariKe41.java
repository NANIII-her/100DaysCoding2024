import java.util.Scanner;
public class Commit {

    public static void main(String[] args) {

        /* Soal nomor 1
         * Buatlah program java yang menghitung keliling dan luas lingkaran dengan 
         * ketentuan sebagai berikut:
         * => Memasukkan dua inputan (berwarna hijau pada gambar) yaitu jari-jari 
         *    dan satuan, tipe data disesuaikan.
         * => Menetapkan nilai Pi sebagai KONSTANTA (Pi = 3,14159)
         * => Output WAJIB serupa dengan dua case di soal.
         */
        Scanner sc = new Scanner(System.in);;

        System.out.print("Input Jari-jari : ");
        int jarijari = sc.nextInt();
        sc.nextLine();
        System.out.print("Input satuan    : ");
        String satuan = sc.nextLine();

        final float Pi = 3.14159f;

        float keliling = (float) 2 * (Pi * jarijari);
        float luas = (float) Pi * (jarijari * jarijari);

        System.out.println("====================================HASIL=======================================");
        System.out.printf("Jari-jari        : %d %s \n", jarijari, satuan);
        System.out.printf("Keliling         : %.5f %s \n", keliling, satuan);
        System.out.printf("Luas             : %.5f %s^2 \n", luas, satuan);
        
        



      
        /* Soal nomor 2
         * Diberikan dua variabel:
         * a (int) bernilai 15
         * b (int) bernilai 20
         * 
         * Cetak variabel b sebanyak 6 kali, diselingi dengan 5 oparasi
         * penugasan berbeda terhadap b yang membuat hasilnya menjadi
         * sebagai berikut:
         * 
         * 20
         * 5
         * 75
         * 60
         * 4
         * 19
         * 
         * Note: dilarang membuat variabel baru! Cukup gunakan dua variabel yang ada.
         */
        int a = 15;
        int b = 20;

        System.out.println(b);
        System.out.println(b /= 4); 
        System.out.println(b *= a); 
        System.out.println(b -= a); 
        System.out.println(b %= 7); 
        System.out.println(b += a);


    }
}
