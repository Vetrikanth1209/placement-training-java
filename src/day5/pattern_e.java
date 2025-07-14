package day5;
import java.util.Scanner;
public class pattern_e {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		int num = sc.nextInt();
		for(int i = 0 ; i <num ; i++) {
			for(int j = 0 ;j < num ;j++) {
				if(j == 0 || i== 0 || i == num-1 || i == num/2) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
