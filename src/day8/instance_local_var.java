package day8;


class greet{
	int a=10;
	void method1() {
		int a=20;
		System.out.println(a);
	}
	void method2() {
		System.out.println(a);
	}
}

public class instance_local_var {
	public static void main(String[] args) {
		greet g = new greet();
		g.method1();
		g.method2();
	}

}
