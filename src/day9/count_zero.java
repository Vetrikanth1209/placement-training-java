package day9;
import java.util.Scanner;

public class count_zero {

	static int count(int arr[]) {
		int count =0;
		for(int  i =0;i<arr.length;i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		return count;
	}
	static void count(int size) {
		for(int row =1;row<=size;row++) {
			for(int col =1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Size : ");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i =0;i<size;i++) {
		System.out.print("Enter value for "+i+" index : ");
		arr[i] = sc.nextInt();
	}
	
	int res =count(arr);
	System.out.println();
	System.out.println("Zero Count : "+res);
	System.out.println();
	count(size);
	sc.close();
}
}
