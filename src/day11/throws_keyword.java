package day11;

public class throws_keyword {
	
	 static void m1()throws Exception {
		System.out.println(10/0);
	}

	public static void main(String[] args) {
		try { //// when you skip try catch block it will say error
			m1();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
