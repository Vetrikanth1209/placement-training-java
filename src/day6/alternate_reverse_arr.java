package day6;

import java.util.Scanner;

public class alternate_reverse_arr {
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
			if(i%2 == 0) {
				for(int j = 0 ;j < row_size; j++) {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			else{
				for(int j = row_size-1 ;j >= 0 ; j--) {
					System.out.print(arr[i][j]+" ");
					
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
