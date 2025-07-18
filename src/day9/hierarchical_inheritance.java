package day9;
class father{
	void car() {
		System.out.println("BMW");
	}
}
class brother extends father{
	void laptop() {
		System.out.println("LAPTOP");
	}
}
class sister extends father{
	void mobile() {
		System.out.println("MOBILE");
	}
}
public class hierarchical_inheritance {
public static void main(String[] args) {
	brother b =  new brother();
	b.laptop();
	b.car();
	
	sister s = new sister();
	s.mobile();
	s.car();
}
}
