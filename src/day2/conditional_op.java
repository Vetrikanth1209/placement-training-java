package day2;
import java.util.Scanner;
public class conditional_op {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		System.out.println((a<=0)?"It is Negative" : "It is Positive");
		sc.close();
	}
}
                                                                                                 