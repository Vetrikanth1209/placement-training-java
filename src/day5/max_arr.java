package day5;
import java.util.Scanner;
public class max_arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size for array : ");
		int size = sc.nextInt();
		int [] num = new int[size];
		int max = num[0];
		for(int j= 0 ;j <size ; j++) {
			System.out.println("Enter  for index "+j+" : ");
			num[j] = sc.nextInt();
		}
		for(int i =0;i <num.length ;i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("Max num : "+max);
		sc.close();
	}
}
