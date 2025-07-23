package day12;

class thread_one extends Thread{ ///using multiple threading 
	public void run()  {
		for(int i = 0 ; i<= 5;i++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("HII"+Thread.currentThread().getName());
		}
	}
}

class thread_two{/// using single thread from main 
	public void m1() {
		for(int i = 0 ; i<= 5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Hello"+Thread.currentThread().getName());
		}
	}
}

public class multi_threading {

	public static void main(String[] args) {
		thread_one obj1 = new thread_one();
		obj1.start();
		System.out.println(obj1.isAlive());
		thread_two obj2 = new thread_two();
		obj2.m1();
		System.out.println(obj1.isAlive());
		System.out.println("the end");
	}



}
