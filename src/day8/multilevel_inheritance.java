package day8;

class top_class {
    void method_grand_parent() {
        System.out.println("Grand Parent");
    }
}

class mid_class extends top_class {
    void method_parent() {
        System.out.println("Parent");
    }
}

class last_class extends mid_class {
    void method_child() {
        System.out.println("Child");
    }
}

public class multilevel_inheritance {
	public static void main(String[] args) {
		mid_class p = new mid_class();
		p.method_parent();
		p.method_grand_parent();
		child c = new child();
		c.method_parent();
		c.method_child();
	}
}
