import java.util.Scanner;

public class Commit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Ganggu Wawa");
        System.out.println("2. Ngoding Java");
        System.out.println("3. Ngoding Python");
        System.out.println("4. Turu");

        System.out.println("==================================================");

        System.out.print("Masukkan pilihan Anda: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Apa ga bakal kesel dianya? "); //ya atau tidak
                boolean anu = input.nextBoolean();
                if (anu == true) {
                    System.out.println("Mending lakukan hal lain");
                }else {
                    System.out.println("Gaskan aja bang!!!");
                }
                break;
            case 2:
                System.out.println("Ga kuliah? Ga penting juga sih wkwkwk");
                // Bersyandaaa~~
                break;
            case 3:
                System.out.println("Emangnya kamu masih ingat sama sytaxnya?");
                break;
            case 4:
                System.out.println("Pilihan yang bagus, incik boss!!");
                break;
            default:
                System.out.println("Mending lu turu aja");
                break;
        } 
    }
}
