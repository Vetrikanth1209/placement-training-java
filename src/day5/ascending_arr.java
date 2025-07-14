package day5;

import java.util.Scanner;

public class ascending_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size for array : ");
		int size = sc.nextInt();
		int [] num = new int[size];
		for(int j= 0 ;j <size ; j++) {
			System.out.println("Enter  for index "+j+" : ");
			num[j] = sc.nextInt();
		}
		
		for(int i =0;i <num.length ;i++) {
			for(int k = i+1;k < num.length ;k++) {
				if(num[i] > num[k]) {
					int temp = num[i];
					num[i] = num[k];
					num[k] = temp;
				}
			}
		}
		
		for(int res : num) {
			System.out.println(res);
		}
		
		sc.close();
	}
}
