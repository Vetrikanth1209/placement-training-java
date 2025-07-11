package day3;
import java.util.Scanner;
public class if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int inp  = sc.nextInt();
		if(inp % 2 == 0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
	}
}
