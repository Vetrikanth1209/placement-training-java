package day6;

import java.util.Scanner;

public class prime_zero_diagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size : ");
		int row_size = sc.nextInt();
		System.out.print("Enter column size : ");
		int col_size = sc.nextInt();
		int arr [][] = new int[row_size][col_size];
		for(int i = 0 ; i < row_size ;i++) {
			for(int j = 0 ;j < col_size ; j++) {
				System.out.print("Enter value for "+i+" row "+j+" column : ");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("VALUES");
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ;j < arr[i].length ; j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("PRIME VALUES");
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ;j < arr[i].length ; j++) {
				if(arr[i][j] % 2 == 0) {
					arr[i][j] = 0;
				}

					System.out.print(arr[i][j]+" ");
			}
			System.out.println();                                         
  		}                                      
		sc.close();        
	}
}  


