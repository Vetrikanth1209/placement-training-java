package day8;

class a{
	int a=10;
	class b{
		int b=20;
		class c{
			int c =30;
		}
	}
}

public class class_inside_class {
	public static void main(String[] args) {
		a first_class = new a();
		System.out.println(first_class.a);
		
		a.b second_class = first_class.new b();
		System.out.println(second_class.b);
		
 		a.b.c third_class=second_class.new c();
		System.out.println(third_class.c);
	}
}
