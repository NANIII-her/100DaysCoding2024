import java.util.Scanner;

public class HariKe67 {
    //method void-nya
    public void konversiKeMenit(int detik, int menit) {
        int hasil = detik / menit;
        System.out.println(hasil + " menit");
    }

    public void konversiKeJam(int detik, int jam) {
        int hasil = detik / jam;
        System.out.println(hasil + " jam");
    }

    public void konversiKeHari(int detik, int hari) {
        int hasil = detik / hari;
        System.out.println(hasil + " hari");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menit = 60, jam = 3600, hari = 84600; // waktu-waktu nya

        //inputannya
        int detik = input.nextInt();
        String waktu = input.next();

        //kondisinya
        if (waktu.equalsIgnoreCase("menit")) {
            Commit a = new Commit();
            a.konversiKeMenit(detik, menit);
        } else if (waktu.equalsIgnoreCase("jam")) {
            Commit b = new Commit();
            b.konversiKeJam(detik, jam);
        } else if (waktu.equalsIgnoreCase("hari")) {
            Commit c = new Commit();
            c.konversiKeHari(detik, hari);
        }
    }
}
