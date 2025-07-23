package day12;

class page extends Thread{ ///using multiple threading 
	public void run()  {
		for(int i = 0 ; i<= 5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Page : "+i);
		}
	}
}

class song extends Thread{/// using single thread from main 
	public void run() {
		for(int i = 0 ; i<= 5;i++) {
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println("Song : "+i);
		}
	}
}


public class example_multi_thread {
public static void main(String[] args) {
	page p = new page();
	p.start();
	song s = new song();
	s.start();
	try {
		p.join();
		s.join();
	}catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("the end");
}
}
