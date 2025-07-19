package day10;
class first{
	void method() {
		System.out.println("first class");
	}
}
class second extends first{
	void method() {
		super.method();
		System.out.println("second class");
	}
}

public class method_overriding {
	public static void main(String[] args) {
		second sc = new second();
		sc.method();
	}
}