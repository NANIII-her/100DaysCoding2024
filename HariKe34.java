import java.util.Scanner;
public class HariKe34{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("============================================");
        System.out.print("Nama         : "); String nama = sc.nextLine();
        System.out.print("Umur         : "); int umur = sc.nextInt();
        System.out.print("Tinggi badan : "); double tb = sc.nextDouble();
        System.out.print("Berat badan  : "); float bb = sc.nextFloat();
        sc.nextLine();
        System.out.print("Alamat       : "); String alamat = sc.nextLine();
        System.out.print("Kuliah di    : "); String kampus = sc.nextLine();
        System.out.print("Program studi: "); String prodi = sc.nextLine();
        System.out.print("Kelas        : "); char kelas = sc.next().charAt(0);
        System.out.println("============================================");
        System.out.println("Sekian");

        //Sengaja tidak dicetak, karena kalo dicetak lagi bakal panjang lagi kak


        
    }
}
