package day2;
import java.util.Scanner;
public class marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter java mark : ");
		int java = sc.nextInt();
		System.out.println("enter javascript mark : ");
		int js = sc.nextInt();
		System.out.println("enter python mark : ");
		int python = sc.nextInt();
		System.out.println("Your Average mark");
		int avg = (java+js+python)/3;
		System.out.println(avg);
		System.out.println((avg>=90)?"A grade":(avg>=89 && avg<= 80)?"B grade":"fail");
		sc.close();
		
	}
}
