package day8;

class parent{
	void method_parent() {
		System.out.println("Parent");
	}
}

class child extends parent{
	void method_child() {
		System.out.println("child");
	}
}

public class single_inheritance {
	public static void main(String[] args) {
		parent p = new parent();
		p.method_parent();
		child c = new child();
		c.method_parent();
		c.method_child();
	}
}
