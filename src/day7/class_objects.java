package day7;

public class class_objects {
	public static void main(String[] args) {
		Number num = new Number();
		System.out.println(num.a=1);
		num.num1 = 20;
       
        Number num2 = new Number();
        num2.num1 = 30;
        System.out.println(num2.num1);
        System.out.println(num.num1);



	}
}

class Number{
	int a ;
	static int num1 ;
	
}