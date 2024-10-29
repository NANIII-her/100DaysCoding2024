import java.util.Scanner;

public class HariKe58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0;

        System.out.print("Masukkan angka: ");
        int a = sc.nextInt();
        
        while (a >= 1) {
            System.out.print(a + " ");
            jumlah += a;
            a--;
        }
        System.out.println(); // Jangan hiraukan ini
        System.out.println("Hasilnya adalah " + jumlah);

        /* Jadi, angka yang kita masukkan itu akan menurun
         * sampai ke angka 1 dan setiap angka-angka itu
         * akan dijumlah... 
         * 
         * Misalnya kita inputkan angka 5, maka: 
         * 5 + 4 + 3 + 2 + 1 = 15
         */
    }
}
