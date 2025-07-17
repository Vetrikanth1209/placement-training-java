package day8;

import java.util.Scanner;

public class sum_of_digit_untill_one {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num%9 == 0)?9:num%9);
		sc.close();
	}
}
