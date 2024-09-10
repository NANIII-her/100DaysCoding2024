public class HariKe10 {
    public static void main(String[] args) {
        
        System.out.println("Ini adalah hari ke-10");

        //Tipe data byte
        //Saya ingin menetapkan bahwa variabel a dan b tidak akan dapat diubah nilainya

        final byte a, b, hasil;
        a = 100;
        b = 50;
        
        byte c = 120;
        hasil = (byte) ((a / b) + c); //Hasilnya tidak akan berubah operasi aritmetikanya

        System.out.printf("(%d / %d) +%d = %d \n", a, b, c, hasil);

        //Misalnya saya ingin mengubah nilai c

        System.out.println("");
        System.out.println("=====================================================================================");
        System.out.println("");

        c = 30; // Imi adalah nilai yang baru untuk variabel c

        //Terus, saya juga ingin mengubah operasi aritmetika nya, tapi tipe datanya adalah integer

        int hasil1 = (a * b / (c + (a - b)));
        System.out.printf("(%d x %d / (%d + (%d - %d))) = %d \n", a, b, c, a, b, hasil1);
    }
}
