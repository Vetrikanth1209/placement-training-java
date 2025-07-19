package day10;

import java.util.Scanner;

public class remove_word {
	
	static String[] remove(String sentence, String target) { ///method 1
		String space[] = sentence.split(target);
		return space;
	}
	
	static String[] remove_space(String sen,String target) {///method 2
		String space[] = sen.split(" ");
		for(int i =0;i<space.length;i++) {
			if(target.equals(space[i])) {
				continue;
			}
			System.out.print(space[i]+" ");
		}
		return space;
	}
	
	static String[] remove_space_2(String sen,String target) {///method 3
		String space[] = sen.split(" ");
		for(int i =0;i<space.length;i++) {
			if(!target.equals(space[i])) {
				System.out.print(space[i]+" ");
			}
			
		}
		return space;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the sentence : ");
	String sentence = sc.nextLine();
	System.out.print("Enter the target word : ");
	String target = sc.nextLine();
//	String result[] = remove(sentence,target);
//	for(int i =0;i<result.length;i++) {
//		System.out.print(result[i]);
//	}
//	sc.close();
//	remove_space(sentence,target);
	remove_space_2(sentence,target);
	sc.close();
}
}
