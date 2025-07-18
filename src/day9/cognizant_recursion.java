package day9;

public class cognizant_recursion {
	static int cal(int n) {
		if(n == 0)
			return 0;
		else
			return 1+cal(n/10);
}
	
public static void main(String[] args) {
	System.out.println(cal(6571));                                                         
}
}
