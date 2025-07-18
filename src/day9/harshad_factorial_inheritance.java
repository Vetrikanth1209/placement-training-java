package day9;
import java.util.Scanner;

class fact{
	int calculate_factorial(int num) {
		int result = 1;
		for(int i  =1;i<=num;i++) {
			result = result * i;
		}
		return result;
	}
}

class harshad extends fact{
	void calculate_harshad(int num) {
		int sum = 0;
		int temp = num;
		while( num !=0 ) {
			int digit = num%10;
			sum = sum + digit;
			num = num/10;
		}
		System.out.println((temp%sum == 0)?"Harshad number":"Not a Harshad number");
	}
}


public class harshad_factorial_inheritance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		harshad obj = new harshad();
		int res = obj.calculate_factorial(num);
		obj.calculate_harshad(num);
		System.out.println(res);                                                  
		sc.close();
	}
}
