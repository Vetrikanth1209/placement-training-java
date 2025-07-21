package day11;

import java.util.Scanner;

class smallboy extends Exception{
	smallboy(String s){
		super(s);
	}
}

public class own_exception {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("You are not child");
		}
		else {
			try {
				throw new smallboy("Need to grow");
			}catch(Exception e) {
				System.err.println(e);
			}
		}
		sc.close();
	}
	

}
