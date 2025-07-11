package day2;
import java.util.Scanner;
public class swapping {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int a = sc.nextInt();
		System.out.println("Enter number 2 :");
		int b = sc.nextInt();
		
		System.out.println("----------------------");
		System.out.println("After  before number 1 : "+a);
		System.out.println("After  before number 2 : "+b);
	
//		int temp = a;  // method -1
//		a = b;
//		b = temp ;
		
		
		//method -2
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
//		//method -3
//		a = a*b;
//		b = a/b;
//		a = a/b;		
		
		
		//method -4
		a = a^b;
		b = a^b;
		a = a^b;	
		/// use binary for transfer which is most efficient way , use bitwise XOR
			
		
		System.out.println("----------------------");
		System.out.println("After  Swapping number 1 : "+a);                                                                                             
		System.out.println("After  Swapping number 2 : "+b);
		
		
		sc.close();
	}
}


///XOR Method 

///a=a^b  

///b=a^b

///a=a^b



///First Line a = a^b

///a=5 b = 2

///Binary Value of 5 is 0101

///Binary value of 2 is 0010

///                     ----

///                   a=0111 = 6

///                     ----

///Second Line b = a^b

///Binary Value of a = 0111

///Binary Value of b = 0010

///                    ----

///                  b=0101 = 5

///                    ----

///Third Line a = a^b

///Binary Value of a = 0111

///Binary Value of b = 0101

///                    ----

///                  a=0010 = 2





///Now A value is Stored 2

///Now B value is Stored 5
