package day7;

import java.util.Scanner;

public class duplicate_remover_string {
	public static void main(String[]args) {
		Scanner sc  = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s1 = sc.nextLine();
		char arr[] = s1.toCharArray();
		for(int i = 0 ; i<arr.length; i++) {
			for(int j = i+1 ; j <arr.length ;j++) {
				if(arr[i] == arr[j]) {
					arr[i] = '*';
				}
			}
		}
		for(int i = 0;i <arr.length;i++) {
			if(arr[i] != '*') {
				System.out.print(arr[i]);
			}
		}
		
		sc.close();
	}
}
