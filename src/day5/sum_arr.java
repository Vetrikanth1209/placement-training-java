package day5;

import java.util.Scanner;

public class sum_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size for array : ");
		int size = sc.nextInt();
		int [] num = new int[size];
		int sum = 0;	
		for(int j= 0 ;j <size ; j++) {
			System.out.println("Enter  for index "+j+" : ");
			num[j] = sc.nextInt();
		}
		
		for(int i =0;i <num.length ;i++) {
			if(num[i] % 3 ==0 || num[i] % 5 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println("sum value : "+sum);
		sc.close();
	}
}
