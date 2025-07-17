package day8;

class without_this{
	int n1 ,n2;
	without_this(int a,int b){
		n1 =a;
		n2 = b;
	}
	void method() {
		System.out.println("without this keyword : "+(n1+n2));
	}
}

class with_this{
	int a ,b;
	with_this(int a,int b){
		this.a = a;
		this.b =b;
	}
	void method() {
		System.out.println("with this keyword : "+(a+b));
	}
}

public class this_keyword {
	public static void main(String[] args) {
		without_this w1 = new without_this(20,30);
		w1.method();
		
		with_this w2 = new with_this(20,30);
		w2.method();
	}
}
