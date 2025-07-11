package day3;
import java.util.Scanner;
public class movie_choice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Movies    2.Exit");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("1.Tamil   2.Telugu  3.Malayalam");
			int mchoice = sc.nextInt();
			if(mchoice == 1) {
				System.out.println("Watch Leo");
			}
			else if(mchoice == 2) {
				System.out.println("Watch Salaar");
			}
			else if(mchoice == 3) {
				System.out.println("Watch Premam");
			}
			else {
				System.out.println("Wrong input");
			}
		}else {
			System.out.println("Thank You");
		}
		sc.close();
	}
}
