package day9;

public class wipro_recursion {
	
	static int p(int base , int exp) {
		if(exp == 0)
			return 1;
		else
			return base*p(base,exp-1);
	}

	
public static void main(String[] args) {
	System.out.println(p(2,3));
}
}
