package day10;

import java.util.Scanner;

public class remove_number_in_string {

	
	static char[] remove_number(String str) {
		char letter[] = str.toCharArray();
		for(int i =0;i<letter.length;i++) {
			if((letter[i]<48 || letter[i]>57)) {
				System.out.print(letter[i]);
			}
			
		}
		return letter;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String str = sc.nextLine();
		remove_number(str);
		sc.close();
	}
}
