package day2;
import java.util.Scanner;
public class converter {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Meter:");
		int meter = sc.nextInt();
		System.out.println("Centimeter : "+(meter*100)+"cm");
		sc.close();
		
		
	}
}
