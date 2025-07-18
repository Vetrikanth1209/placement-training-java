package day9;

public class method_overloading {
	static void canteen1(String juice,String snacks) {
		System.out.println("you have ordered "+juice+" and "+snacks+" from canteen1 ");
	}
	static void canteen2(String meals) {
		System.out.println("you have ordered "+meals+" from canteen2 ");
	}
	public static void main(String[] args) {
		canteen1("Sting", "biscuit");
		canteen2("Briyani");
	}
}
