public class HariKe665 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print("Perkalian " + i + "\t");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + " x " + j + " = " + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
