package day5;
import java.util.Scanner;
public class arr {
public static void main(String[] args) {
	
//	int a[] = {10,20,30,40,50};//static way
//	for(int i =0 ;i<a.length ;number i++) {
//		System.out.print(a[i]+" ");
//	}
	
	Scanner sc = new Scanner(System.in);//dynamic way
	System.out.print("Enter size : ");
	int size = sc.nextInt();
	String arr[] = new String[size];
	for(int j =0 ; j <size ; j++) {
		System.out.println("Enter  for index "+j+" : ");
		arr[j] = sc.next();
 	}
	
	System.out.print("Array Data : ");
	for(int k = 0 ; k < size;k++) {
		System.out.print(arr[k]+" ");
	}
	sc.close();
}
}
