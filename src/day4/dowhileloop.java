package day4;

import java.util.Scanner;

public class dowhileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		do {
			System.out.println(num--);
		}while(num<0);
		sc.close();           
	}
}
