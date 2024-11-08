import java.util.Scanner;

public class Commit {
    public String you(String my) {
        return "JUST YOU";
    }

    public static void main(String[] args) {
        Commit contoh = new Commit();
        String anjay = contoh.you("JUST YOU");

        for (int i = 1;;i++) {
            System.out.println(anjay);
        }
    }
}
