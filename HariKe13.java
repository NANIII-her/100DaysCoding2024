public class HariKe13 {
    public static void main(String[] args) {
        
        byte var1, var2; //Mendeklarasikan variabel var1 dan var2
        var1 = 50;  //Memberi nilai pada variabel yang dideklarasikan
        var2 = 100; //Disebut juga sebagai assignment

        short var3 = 150; 
        int var4 = 200;
        final String var5 = "Okelah kalau begitu"; //Menaruh final pada tipe data String karena memang saya tidak akan mengubah nilainya
        
        System.out.println("var1 = " + var1); //dari var1 sampai var5 diprint dengan menggunakan println
        System.out.println("var2 = " + var2); 
        System.out.println("var3 = " + var3);
        System.out.printf("var4 = " + var4);
        
        var3 = 1000;
        var4 = 1500;
        System.out.println("Nilai var3 yang baru = " + var3); // Mengupdate nilai variabel var3
        System.out.println("Nilai var4 yang baru = " + var4); // dan var4
        
        System.out.printf("var5 = %s \n", var5); //Variabel String menggunakan printfS

        /* Sekian dari saya,
         * Wassalamualaikum wa rahmatullahi wa barakatuh
         */

    }
}
