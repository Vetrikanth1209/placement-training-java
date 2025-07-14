package day5;

import java.util.Scanner;

public class neon_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		
		for(int i =1 ; i<= num ;i++) {
			int sq = i*i;
			int sum = 0;
			                            
			while(sq > 0) {
				int digit = sq %10;
				sum = sum+ digit;
				sq = sq/10;
			}
			if(i == sum) {
				System.out.println("neon : "+i);
				
   		}
		sc.close();
	}
}
}

/// neon = 9 =  9*9 = 81
///81 = 8+1 = 9
///9 = 9 ()neon)
