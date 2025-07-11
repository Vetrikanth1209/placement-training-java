package day3;
import java.util.Scanner;
public class largest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		int b = sc.nextInt();
		System.out.println("Enter number 3 : ");
		int c = sc.nextInt();
		System.out.println((a>b && a>c)?"A is bigger":(b>c)?"B is bigger":"C is bigger");
		sc.close();
	}
}
