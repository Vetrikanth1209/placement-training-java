package day2;

public class bit_op {
	public static void main(String[] args) {
		int a=10, b=2;
		System.out.println(a&b);
		System.out.println(a|b);
		
		int i = -23;
		int j = 9;
		System.out.println(~i); //if the symbol is negative the it changes to positive and lowers one value
		System.out.println(~j); //if the symbol is positive the it changes to negative and increases one value
		
		int num1 = 10;
		System.out.println(num1<<4);// left shift = n*2^t   n = number , t = no of times to shift (or) add same no of zeroes to binary value of n
		System.out.println(num1>>4);// right shift = n/2^t   n = number , t = no of times to shift (or) sub same no of zeroes to binary value of n
		
		int z = 5 , x =2;
		System.out.println(z^x);//if the both values are same in binary o (or) it is 1 
		
	}
}


///a = 40  b = 2 >>>AND

///64 32 16 8 4 2 1

///0  1  0  1 0 0 0

///0  0  0  0 0 1 0

///------------------

///0  0  0  0 0  0 0  == 0

///------------------





//a = 40  b = 2  >>>OR

///64 32 16 8 4 2 1

///0  1  0  1 0 0 0

///0  0  0  0 0 1 0

///------------------

///0  1  0  1 0 1 0 = 42

///------------------

