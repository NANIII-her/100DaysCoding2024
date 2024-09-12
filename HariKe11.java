public class HariKe11 {
    public static void main(String[] args) {
        
        System.out.println("Ini adalah proyek saya di hari ke-11");

        System.out.println("=============================================================");

        /* Tipe data short
        Seperti yang kemarin, saya ingin membuat operasi aritmetika dengan tipe data short
        Tapi operasinya itu lain daripada yang kemarin
        */

        /* SOAL!!
         * Ada sebuah balok dengan panjang 10 cm, lebar 3 cm dan tinggi 5 cm.
         * Berapakah luas dari balok tersebut?
         */

        short panjang, lebar, tinggi;
        panjang = 10;
        lebar = 3;
        tinggi = 5;

        int luas_balok = panjang * lebar * tinggi;

        System.out.println("Panjang balok = " + panjang);
        System.out.println("Lebar balok   = " + lebar);
        System.out.println("Tinggi balok  = " + tinggi);
        System.out.println("Luas balok    = " + luas_balok); //luasnya adalah 150

        System.out.println("=============================================================");

        /* Bersambung dengan soal sebelumnya
          Misalnya, jumlah balok ada 4 buah. Jika 1 balok dijual dengan harga 54 ribu,
          maka berapakah harga total dari keempat balok tersebut?
        */ 

        short balok = 4;
        int harga_balok = 54000;
        int harga_total_balok = balok * harga_balok;

        System.out.println("Balok yang tersedia      = " + balok);
        System.out.println("Harga satu balok         = " + harga_balok);
        System.out.println("Harga total dari keempat = Rp." + harga_total_balok); //hasilnya Rp.216.000

        System.out.println("=============================================================");

        /* Setiap balok akan dipotong setengah dan harganya juga akan dikurang 25%. 
         * Maka, berapakah keseluruhan harga dari potongan balok tersebut?
        */

        short balok_terpotong = (short) ((balok / 1) * 2); //hasilnya 8
        short satu_balok_terpotong = (short) ((harga_balok * 25) / 100);
        int harga_balok_baru = ((harga_balok * 25) / 100) * balok_terpotong;

        System.out.println("Harga satu balok yang sudah terpotong  = " + satu_balok_terpotong);
        System.out.println("Jumlah balok yang sudah dipotong       = " + balok_terpotong);
        System.out.println("Harga balok yang baru setelah dipotong = Rp." + harga_balok_baru); //hasilnya Rp.108.000

        
    }
}
