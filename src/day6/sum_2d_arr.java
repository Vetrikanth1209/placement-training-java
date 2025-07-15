package day6;

import java.util.Scanner;

public class sum_2d_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
		int row_size = sc.nextInt();
		int arr [][] = new int[row_size][row_size];
		for(int i = 0 ; i < row_size ;i++) {
			for(int j = 0 ;j < row_size ; j++) {
				System.out.print("Enter value for "+i+" row "+j+" column : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("VALUES");
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ;j < arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		int sum = 0;
		
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ;j < arr[i].length ; j++) {
				sum = sum + arr[i][j];
				
			}
			System.out.println();
		}
		System.out.println("SUM : "+sum);
	
		
		
		sc.close();
	}
}
