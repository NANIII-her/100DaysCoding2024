import java.util.Scanner;

public class HariKe48 {
    public static void main(String[] args) {
      
        //percabangan

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka > 0 && angka <= 10) {
            System.out.println("MASUK");
        }else{
            System.out.println("WOILAH");
        }
    }
}
