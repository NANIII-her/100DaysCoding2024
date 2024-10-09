import java.util.Scanner;

public class HariKe39{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int P, M, hasilPembagian, sisaPermen;

        System.out.print("Permen: ");
        P = sc.nextInt();

        System.out.print("Murid: ");
        M = sc.nextInt();

        hasilPembagian = P / M;
        sisaPermen = P % M;

        System.out.println("Jumlah permen: " + hasilPembagian);
        System.out.println("Sisa permen: " + sisaPermen);

        
    }
}
