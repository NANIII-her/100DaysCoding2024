import java.util.Scanner;

public class HariKe77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you love me?");
        boolean love = true;
        int ulang = 0;

        while (love) {
            String yesOrNo = input.next();

            if (yesOrNo.equals("yes")) {
                System.out.println("MAKASIIIIIIIIIIIIII");
                love = false;
            } else {
                ulang++;
                if (ulang == 1) {
                    System.out.println("Saya pikir kamu salah ucap. Ulang!");
                } else if (ulang == 2) {
                    System.out.println("Ulang lagi!");
                } else if (ulang == 3) {
                    System.out.println("COBA KETIK 'YES'");
                } else {
                    // Apabila mengatakan no sebanyak 3x maka dianggap yes
                    System.out.println("Terserah, ku anggap itu 'yes'");
                    System.out.println("POKOKNYA 'YES'");
                    love = false;
                }
            }
        }
    }
}
