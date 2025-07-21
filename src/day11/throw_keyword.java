package day11;

import java.util.Scanner;

public class throw_keyword {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("U R eligible");
		}else {
			extracted();
		}
		sc.close();
	}

	 static void extracted() {
		throw new ArithmeticException("Check Input");
	}

}
