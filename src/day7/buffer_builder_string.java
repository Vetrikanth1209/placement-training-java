package day7;

public class buffer_builder_string {
	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("hello"); //single thread 
		StringBuffer b = new StringBuffer("hii");
		a.insert(0, "hey");//insert in given position
		System.out.println(a.append(b));
		System.out.println(a.reverse());
		
		
		StringBuilder c = new StringBuilder("bro"); //multiple thread 
		StringBuilder d = new StringBuilder("code");
		System.out.println(c.append(d));
	}
}
