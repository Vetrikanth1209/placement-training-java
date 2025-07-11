package day3;

public class type_cast {
	public static void main(String[] args) {
		byte a = 127;
		short b = a;    ///implicit type casting 
		System.out.println(b);
		
		char letter = '*';
		int con = letter ;///implicit type casting 
		System.out.println(con);
		
		int c = 98;
		char ans = (char)c;
		System.out.println(ans);//explicit type casting
		
		///Special case = String type casting
		String name = "98";
		byte by = Byte.parseByte(name);
		float fl = Float.parseFloat(name);
		System.out.println(name.getClass()+" "+name);
		System.out.println(by);
		System.out.println(fl);
		
		
		///string to char

		String s = "abcd";
		char[] ch = s.toCharArray();
		for(int i =0;i <ch.length;i++) {
			System.out.println(ch[i]+" value at position "+i);
		}
		
		/// any data type to string 
		int in = 10;
		String from_in = Integer.toString(in);
		System.out.println(from_in.getClass()+" "+from_in);
		
	}
}
