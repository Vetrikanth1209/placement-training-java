package day5;

public class arr_neon {
	public static void main(String[] args) {
		int num[] = {1,2,3,4,9};
		
		for(int i = 0;i<num.length;i++) {
			int sq = num[i] *num[i];
			int sum =0;
			while(sq > 0) {
				int digit =  sq %10;
				sum = sum + digit;
				sq = sq/10;
			}
			if(sum == num[i]) {
				System.out.println("neon : "+sum);
			}
		}

	}
}
