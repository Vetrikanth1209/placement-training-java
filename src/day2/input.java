package day2;

import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		int a = sc.nextInt();
		System.out.println("Enter the number2 :");
		int b = sc.nextInt();
		System.out.println("Output");
		System.out.println("Addition: ");
		System.out.println(a+b);
		System.out.println("Subtraction: ");
		System.out.println(a-b);
		System.out.println("Multiply: ");
		System.out.println(a*b);
		System.out.println("Division: ");
		System.out.println(a/b);
		System.out.println("Modulus: ");
		System.out.println(a%b);
		
		sc.nextLine();
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("name: "+name);
		
		System.out.println("Enter your department: ");
		String dep = sc.next();
		System.out.println("department: "+dep);
		
		System.out.println("Enter your initial: ");
		char initial = sc.next().charAt(0);
		System.out.println("initial : "+initial);
		
		sc.close();
		
	}
}
