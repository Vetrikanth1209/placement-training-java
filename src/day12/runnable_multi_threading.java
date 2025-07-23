package day12;


class A1{
	void m1() {
		System.out.println("Method A1");
	}
}

class A2 extends A1 implements Runnable{
	public void run() {
		for(int i = 0; i<=5 ;i++) {
			System.out.println("Method A2");
		}
	}
	
}

public class runnable_multi_threading {
	public static void main(String[] args) {
		A2 obj = new A2();
		Thread t1 = new Thread(obj);
		t1.start();
	}

}
