public class HariKe9 {
    public static void main(String[] args){

        System.out.println("Ini adalah hari ke-9");

        //Final variabel artinya nilai dari variabel itu tidak akan bisa diubah sama sekali

        final String nama, kelas, studi, mentor; //Contohnya ini
        int hari;

        nama = "Khoiri Nur Umar. B";
        kelas = "Informatika C";
        studi = "Informatic Study Club";
        mentor = "Kakak Dita";

        hari = 9;

        System.out.printf("Nama               : %s \n", nama);
        System.out.printf("Kelas              : %s \n", kelas);
        System.out.printf("Studi yang diikuti : %s \n", studi);
        System.out.printf("Mentor             : %s \n", mentor);
        System.out.printf("Progres            : Hari ke-%d \n", hari);
    }
}
