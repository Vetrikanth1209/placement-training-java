package day4;

import java.util.Scanner;

public class pyramid_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 1;
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0; j <= i  ;j++) {
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		sc.close();
	}
}
