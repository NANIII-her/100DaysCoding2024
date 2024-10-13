public class HariKe42 {
    public static void main(String[] args) {
        
        int a,b,c;
        a = 1;
        b = 5;
        c = 10;

        int d = c;
        byte e = (byte) (b + a - a);

        System.out.println(d == c); 
        System.out.println(e != b);
        System.out.println(9 == (b + b - a)); 
        System.out.println(b *= 5); 
        c *= 4;
        int x = b + 15;
        System.out.println("Apakah " + x + " tidak sama dengan " + c + "? " + (x != c));

        a = 9;
        c -= 37; System.out.println(c);
        System.out.println(a != b);
        System.out.println(c != (a / 3));
        System.out.println(((c * 7) + 4) == b); 
        System.out.println("Hasil akhir = " + !((a /= 3) != a)); 


    }
}
