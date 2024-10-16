public class HariKe45 {
    public static void main(String[] args) {

        boolean a,b,c;
        int d,e;

        a = true;
        b = false;

        c = a || b; System.out.println(c); //tetap ji ini dia true

        d = 30;
        e = 30;
        boolean f = d != e; System.out.println(f);

        boolean hasilAkhir = (f || a) && b || (d >= e) && c;
        System.out.println(hasilAkhir); // Hasil akhirnya adalah...
        

        
    }
}
