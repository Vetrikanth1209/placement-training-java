package day5;

import java.util.Scanner;

public class task {
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);//dynamic way
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int j =0 ; j <size ; j++) {
			System.out.println("Enter  for index "+j+" : ");
			arr[j] = sc.nextInt();
	 	}
		
		System.out.print("Array Data : ");
		for(int k = 0 ; k < size;k++) {
			if(arr[k] % 5 == 0)
			System.out.print(arr[k]+" ");
		}
		sc.close();
	}
}
