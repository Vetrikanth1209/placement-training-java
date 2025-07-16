package day7;
import java.util.Scanner;
public class string_split {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence : ");
		String s1 = sc.nextLine();
		String s2 [] = s1.split(" ");
		for(int i = 0 ; i <s2.length ; i++) {
			if(s2[i].equals("hello")) {
				s2[i] = "*";
			}
		}
		System.out.println();
		System.out.println("After put *");
		for(String i: s2) {
			System.out.println(i);
		}
		sc.close();
	}
}
