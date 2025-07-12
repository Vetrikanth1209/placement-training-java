package day4;
import java.util.Scanner;
public class split_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int rev = 0 , n1 =0,n2=0;
		
		while(num != 0) {
			int digit = num % 10;
			rev = rev *10 + digit;
			num = num /10;
		}
		
		while(rev > 0) {
			int k = rev % 10;
			if(k %2 ==0) {
				n1 = n1 *10 + k;
			}else {
				n2 = n2*10 + k;
			}
			rev = rev /10;
		}
		
		System.out.println("ODD :"+n1);
		System.out.println("EVEN :"+n2);
		sc.close();
	}
}
