package day8;

public class methods {
	void details1() {
		String name = "vetri";
		int age =22;
		System.out.println("Name : "+name+" Age : "+age);
	}
	static void details2() {
		String clg = "Muthayammal";
		int year = 4;
		System.out.println("College : "+clg+" Year : "+year);
	}
	void details3(String dep,int sem) {
		System.out.println("Department : "+dep+" Sem : "+sem);
	}
	String details4(String roll , int dob) {
		return "Roll No : "+roll+" DOB Year :"+dob ;
	}
	int details5() {
		int passout = 2026;
		return passout;
	}
	public static void main(String[] args) {
		methods md = new methods();
		
		md.details1();//without return type without arguments
		
		details2();// static method     
		
		md.details3("AI", 7);//without return type with arguments
		
		String a = md.details4("22AD105", 2004);//with return type with arguments
		System.out.println(a);
		
		int b = md.details5();
		System.out.println("Pass out year : s"+b);
	}
}
