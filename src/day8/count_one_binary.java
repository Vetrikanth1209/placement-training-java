package day8;
import java.util.Scanner;
public class count_one_binary {
	static int method1 (int val) {
		String binary = Integer.toBinaryString(val); //decimal to  binary
		System.out.println(binary); 
		int count = 0;
		for (int i = 0 ; i < binary.length();i++) {
			if(binary.charAt(i) == '1') {
				count++;
			}
		}
	return count; //using inbuilt method
	}
static int method2(int val){
		int count = 0;
		int quo = 0;
		while(val > 0) {
			quo = val%2;
			if(quo == 1) {
				count++;
			}
			val = val/2;
		}
		return count;//without inbuilt method
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
//		System.out.println(method1(val));
		System.out.println(method2(val));
		sc.close();
}
}
