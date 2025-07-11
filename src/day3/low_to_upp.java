package day3;
import java.util.Scanner;
public class low_to_upp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lower case character : ");
		char ch = sc.next().charAt(0);
//		char result = (char)(ch-32);   because by taking sub on ASCII value of lower and upper difference is always 32
//		char result = (char)(ch+32);   because by taking add on ASCII value of lower and upper 
		char result = (char)(ch^32); // it can do both case upper and lower at same time by using XOR
		System.out.println("Upper case : "+result);
		sc.close();
	}
}
