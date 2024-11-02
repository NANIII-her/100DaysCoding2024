import java.util.Scanner;

public class Commit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int batas = 0;

        System.out.print("Masukkan angka maksimum: ");
        int a = input.nextInt();

        while (true) {
            System.out.print("Masukkan angka berikutnya: ");
            int b input.nextInt();
            batas += b;

            if (batas a) {
                break;
            }
        } 
        System.out.println(batas);
     }
}
