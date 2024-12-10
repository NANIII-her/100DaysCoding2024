import java.time.LocalTime;

public class HariKe100 {
    public static void main(String[] args) {
        String nama = "Heri";
        LocalTime waktuSekarang = LocalTime.now();

        String salam;
        if (waktuSekarang.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi, ";
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang, ";
        } else {
            salam = "Selamat malam, ";
        }

        System.out.println("========================================");
        System.out.println(salam + nama);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("========================================");
    }
}
