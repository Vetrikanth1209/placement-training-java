package day4;
import java.util.Scanner;
public class no_of_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int digit =0;
		while(num != 0) {
			num = num / 10;
			System.out.println(num);
			digit++;
		}
		System.out.println(digit);                                                                
		sc.close();                                                                                         
	}
}
