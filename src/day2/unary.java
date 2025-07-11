package day2;

public class unary {
	public static void main(String[] args)
	{
		int i = 1 ,j =2,k=3;
		int m = i-- - j-- - k--;
		System.out.println("i : "+i);
		System.out.println("j : "+j);
		System.out.println("k : "+k);
		System.out.println("m : "+m);
		
//		int a = 11;
//		int b = --(a++); // error can't be in bracket
//		System.out.println(b);
		
		char a = 'd';
		int b = ++a + ++a - --a + a++;
		System.out.println(b);
		
	}
}
