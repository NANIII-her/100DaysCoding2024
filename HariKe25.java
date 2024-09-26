import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		System.out.println("Ini adalah proyek saya di hari ke-25");
		
		//Tipe data reference Double
		
		Double a,b,c,hasil;
		a = 90.5;
		b = Double.valueOf(a);
		c = 45.5;

		hasil = (a * 2) / b + c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("C = " + c);

		System.out.printf("(%.1f * 2) / %.1f + %.1f = %.3f \n",a,b,c,hasil);

		System.out.println("Hasilnya adalah " + hasil);
	}
}
