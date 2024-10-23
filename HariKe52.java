import java.util.Scanner;

public class HariKe52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        char hasil = (a > 80 && a <= 100) ? 'A' :
                     (a > 60 && a <= 80) ? 'B' :
                     (a > 40 && a <= 60) ? 'C' :
                     (a > 20 && a <= 40) ? 'D' 
                     : 'E';

        System.out.println(hasil);

        
    }
}
