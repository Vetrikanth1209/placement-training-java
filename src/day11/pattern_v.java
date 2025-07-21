package day11;

public class pattern_v {

	public static void main(String[] args) {
		int a=5;
		for(int row =0;row<a;row++) {
			for(int col=0;col<a+a;col++) {
				if(row==col || row+col == (a+a)-2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
