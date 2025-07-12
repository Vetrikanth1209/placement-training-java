package day4;
import java.util.Scanner;
public class magic_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		int sum =0;
		int rev = 0;
		int magic = 0;
		
		int tempNum = num; /// storing as a reference because num becomes zero finally
		while(num > 0) {
			
			///sum
			sum = sum + num %10;
			num = num /10;
			
		}
		
		int tempSum = sum;/// storing as a reference because sum becomes zero finally
		while(sum > 0) {
			rev = rev *10 + sum  % 10;
			sum = sum /10;
		}
		
//		System.out.println("SUM OF NUMBER : "+sum);
//		System.out.println("REVERSE OF NUMBER : "+rev);
		
		
		magic = tempSum * rev ;
		
		if(magic == tempNum) {
			System.out.println("Magic Number");
		}else {
			System.out.println("Not a Magic Number ");
		}
		sc.close();
	}
}
