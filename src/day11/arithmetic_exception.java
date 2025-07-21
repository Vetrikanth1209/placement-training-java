package day11;

import java.util.Scanner;

public class arithmetic_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("You are wrong totally wrong!");
		}
		sc.close();
	}

}
