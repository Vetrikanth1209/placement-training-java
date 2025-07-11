package day3;
import java.util.Scanner;
public class lottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age for getting lottery: ");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Your are eligible for lottery");
			System.out.println("Enter your code : ");
			int code = sc.nextInt();
			System.out.println("Enter your age : ");
			 age = sc.nextInt();
			if(code == 4000  && age>=18) {
				System.out.println("5 lakhs prize");
			}else if( code == 2000 && age>=18) {
				System.out.println("2 lakhs prize");
			}
			else if (code == 2000 || code == 4000 && age<18) {
				System.out.println("Code is correct but your age is not eligible");
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		else {
			System.out.println("You are not eligible");
		}
		sc.close();
	}
}
