package day9;

public class accenture_recursion {
	
	static int rs(int n ) {
		if(n<=1)
			return n;
		else
			return n+rs(n-1);
	}
	
	public static void main(String[] args) {
		System.out.println(rs(7));
	}
}


///---execution-----
///7+rs(7-1)
///6+rs(6-1)
///5+rs(5-1)
///4+rs(4-1)
///3+rs(3-1)
///2+rs(2-1)
///1 condition ends here


///------backtracking------
///1
///2+1 =3
///3+3 =6
///4+6 =10
///5+10 =15
///6+15 =21
///7+21 =28


///ANS = 28