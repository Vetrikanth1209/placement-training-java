package day4;
import java.util.Scanner;
public class breaking_statements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		for(int i = 1 ; i<num ;i++) {
			if(num % i == 0) {
//				break;
				continue;
//				return;
			}else {
				System.out.println(i);
			}
		}
		sc.close();
	}
}
