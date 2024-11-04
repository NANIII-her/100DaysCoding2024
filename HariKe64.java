public class HariKe64 {
    public static void main(String[] args) {
        outerLoop: for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 3) {
                    break outerLoop; // Keluar dari outerLoop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        System.out.println("Loop selesai.");
    }
}
