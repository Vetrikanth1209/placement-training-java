package day3;
import java.util.Scanner;
public class bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in kg : ");
		float weight = sc.nextFloat();
		System.out.println("Enter your height in cm : ");
		float height = sc.nextFloat();
		float cm_height = (height/100);
		float bmi = weight/(cm_height*cm_height);
		System.out.println("Your BMI : "+bmi);
		System.out.println();
		sc.close();
	}
}
