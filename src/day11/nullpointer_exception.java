package day11;


public class nullpointer_exception {

	 static String a;

	public static void main(String[] args) {
		a = null;
		try {
			System.out.println(a.charAt(0));
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException e) {                                                 
			System.out.println(e);
			System.out.println("NullPointer  Exception");
		}
		finally {
			System.out.println("last line of code");
		}
	}

}
