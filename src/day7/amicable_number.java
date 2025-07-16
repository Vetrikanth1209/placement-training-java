package day7;
import java.util.Scanner;
public class amicable_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = sc.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i =1;i<num1;i++) {
			if(num1%i == 0) {
				sum1 = sum1 +i;
			}
		}
		
		
		for(int i =1;i<num2;i++) {
			if(num2%i == 0) {
				sum2 = sum2 +i;
			}
		}
		
		
		if(sum1 == num2 && sum2 == num1) {
			System.out.println("Amicable number");
		}else {
			System.out.println("Not Amicable number");
		}
		
		sc.close();
	}
}
