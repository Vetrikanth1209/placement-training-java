package day3;
import java.util.Scanner;
public class century_year {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int year = sc.nextInt();
		System.out.println((year%100 == 0)?"Century year":"Not a century year");
		sc.close();
	}
}
   