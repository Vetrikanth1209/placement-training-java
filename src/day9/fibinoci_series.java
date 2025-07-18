package day9;

public class fibinoci_series {
public static void main(String[] args) {
	int n1 =0,n2=1;
	int n3 =0;
	for(int i=2;i<=5;i++) {
		n3 = n1+n2;
		n1 = n2;
		n2 = n3;
	}
	System.out.println(n3);
}
}
