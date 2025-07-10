package day2;
import java.util.Scanner;
public class swapping {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter number 2 :");
		int b = sc.nextInt();
		
		System.out.println("----------------------");
		System.out.println("After  before number 1 : "+a);
		System.out.println("After  before number 2 : "+b);
	
//		int temp = a;  // method -1
//		a = b;
//		b = temp ;
		
		
		//method -2
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		//method -3
		a = a*b;
		b = a/b;
		a = a/b;		
		
		System.out.println("----------------------");
		System.out.println("After  Swapping number 1 : "+a);                                                                                             
		System.out.println("After  Swapping number 2 : "+b);
		
		
		sc.close();
	}
}
