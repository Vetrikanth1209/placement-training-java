package day5;

import java.util.Scanner;

public class pattern_square {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  : ");
		int size = sc.nextInt();
		for(int i = 0 ; i<size;i++) {
			for(int j = 0 ; j < size ;j++) {
				if(i==0 || j==0 || i == size-1 || j == size -1 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
