package day6;

public class string {
	public static void main(String[] args) {
		String myStr1 = "Rockybhai";
		String myStr2 = "KGF";
		String myStr3 = "Rockybhai";
		System.out.println(myStr1.equals(myStr2));
		System.out.println(myStr1.equals(myStr3));
		
		String s1= "hello";
		String s2= "hello";
		System.out.println(s1 == s2);
		
		String s3= "hello";
		String s4= "guys";
		System.out.println(s3.concat(s4));
		System.out.println(s3.startsWith("h"));
		System.out.println(s3.startsWith("e"));
		System.out.println(s3.charAt(0));
	}                                                                                                                      
}
