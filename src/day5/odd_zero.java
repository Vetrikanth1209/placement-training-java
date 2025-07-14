package day5;
import java.util.Scanner;
public class odd_zero {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size : ");
		int size = sc.nextInt();
		int num[] = new int[size];
		for(int n =0;n < num.length ;n++) {
			System.out.print("Enter value for "+n+" : ");
			num[n] = sc.nextInt();
		}
		for(int i =0;i<num.length;i++) {
			if(num[i]%2 == 0){
				System.out.println("Even number : "+num[i]);
			}else {	
				num[i] = 0;
				System.out.println("Odd number : "+num[i]);
			}
		}
		sc.close();
	}
}
