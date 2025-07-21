package day11;

import java.util.Scanner;

class check extends Exception{
	check(String s){
		super(s);
	}
}


public class palindrome_with_exception  {
	
	static boolean pal(String word)   {
		int left = 0,right = word.length()-1;
		while(left<=right) {
			if(word.charAt(right) != word.charAt(left)) {
				return false;
			}
			
			left++;
			right--;
		}
		return true;
	}

	public static void main(String [] args) throws check  {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word : ");
		String word = sc.nextLine();
		boolean res = pal(word);
		if(res) {
			System.out.println("Palindrome");
		}else {
			throw new check("Check the number");
		}
		sc.close();
	}

}
