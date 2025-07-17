package day8;


class greeting{
	greeting(String name,int age){
		System.out.println("name : "+name+" age : "+age);
	}
}


public class constructor {
public static void main(String[]args) {
//	greeting g = new greeting(); //default constructor
	greeting g = new greeting("vetri",22);//parameterized constructor
}
}
