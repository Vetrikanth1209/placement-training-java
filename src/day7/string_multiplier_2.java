package day7;

import java.util.Scanner;
public class string_multiplier_2 {
	public static void main(String[]args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
		for(int i = 1 ; i<arr.length; i=i+2) {
			int num = arr[i]-'0';
			for(int j = 0 ; j <num ;j++) {
				System.out.println(arr[i-1]);
			}
		}
		
		sc.close();
	}

}
