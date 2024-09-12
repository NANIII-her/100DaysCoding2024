public class HariKe12 {
    public static void main(String[] args) {
        
        System.out.println("Ini adalah proyek saya di hari ke-12");

        // Tipe data integer
        // Saya akan membuat soal buatan

        /* SOAL PERTAMA
         * Diketahui jarak antara kota A dan kota B pada petaa adalah 32 cm.
         * Jika skala pada peta adalah 2:100.000, 
         * maka berapa jarak km sebenarnya dari kedua kotaa tersebut?
        */

        int jarak_sebenarnya, jarak_pada_peta;
        jarak_pada_peta = 32;
        jarak_sebenarnya = (jarak_pada_peta * 100000 ) / 2; //Jarak cm

        // Untuk mengubah nilai jarak cm ke km
        int jarak_km = jarak_sebenarnya / 100000;
        
        System.out.println("Jarak sebenarnya = " + jarak_sebenarnya + " cm atau " + jarak_km + " km"); 
        //Jawabannya 1.600.000 cm atau 16 km

    }
}
