package day10;

public class missing_element_sort_arr {

	public static void main(String[] args) {
		int arr[] = {1,2,5,6};
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i]+1 != arr[i+1]) {
				System.out.println(arr[i]+1);
				return;
			}
		}
		System.out.println("-1");
	}

}
