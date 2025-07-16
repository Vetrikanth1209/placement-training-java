package day7;
import java.util.Scanner;
public class multiply_string {
public static void main(String[]args) {
	Scanner sc  = new Scanner(System.in);
	String s1 = sc.nextLine();
	char arr[] = s1.toCharArray();
	int num = arr[1] -'0'; //method -1
//	char num = s1.charAt(1);//4    method -2
	int size = (int) num;//52
	int asc = size - '0';//4 = 52 , 0 = 48
//	System.out.println(asc);
	for(int i = 0;i<asc;i++) {
		System.out.print(s1.charAt(0));
	}
	sc.close();
}
}
