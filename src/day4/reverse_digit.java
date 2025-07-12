package day4;
import java.util.Scanner;
public class reverse_digit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	int num = sc.nextInt();
	int digit ;
	int rev = 0;
	while(num!=0) {
		digit = num  % 10;
		rev = rev *10 + digit;
		num = num /10;
	}
	System.out.println(rev);
	sc.close();
}
}
