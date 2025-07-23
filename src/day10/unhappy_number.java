package day10;

public class unhappy_number {

	static boolean check(int n) {
		int digit = 0,sum =0;
		if(n ==1)
			return true;
		else
			while(n>0) {
				digit = n %10;
				sum = sum +(digit *digit);
				n= n/10;
				if(sum == 1)
					return true;
			}
		return false;
		
	}
	
public static void main(String[] args) {
	int a = 7;
	if(check(a)) {
		System.out.println("UnHappy");
	}else {
		System.out.println("Happy");
	}
}
}
