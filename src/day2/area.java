package day2;
import java.util.Scanner;
public class area {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length : ");
		int length = sc.nextInt();
		System.out.println("Enter the breadth : ");
		int breadth = sc.nextInt();
		System.out.println("Area : "+(length*breadth));
		sc.close();
		
	}
}
