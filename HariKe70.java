import java.util.Scanner;

public class HariKe70 {
    public String profil(String nama, int usia, String kelas, char tipe) {
        return "Nama " + nama + ", berusia " + usia + ", dari kelas " + kelas + " " + tipe;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Commit ya = new Commit();

        // sengaja menggunakan inputan supaya lebih paham
        String nama = input.nextLine();
        int usia = input.nextInt();
        String kelas = input.next();
        char tipe = input.next().charAt(0);

        // eksekusi
        String prof = ya.profil(nama, usia, kelas, tipe);
        System.out.println(prof);
    }
}
