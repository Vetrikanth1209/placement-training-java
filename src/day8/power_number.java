package day8;

public class power_number {
	 static int power(int a , int b) {
		int result = 1;
		for(int i =1 ; i<=b;i++) {
			result = result * a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(power(4,3));
	}
}
