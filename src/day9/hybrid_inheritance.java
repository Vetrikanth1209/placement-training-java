package day9;

class thatha{
	void land() {
		System.out.println("2500 sqfeet");
	}
}
class appa extends thatha{
	void car() {
		System.out.println("BMW");
	}
}
class mama extends thatha{
	void gold() {
		System.out.println("10kg");
	}
}
class naanu extends appa{
	void nothing() {
		System.out.println("dummy bhava");
	}
}
public class hybrid_inheritance {
	public static void main(String[] args) {
		naanu n = new naanu();
		n.nothing();
		n.car();
		n.land();
		
		mama m = new mama();
		m.gold();
		m.land();
		
		appa a = new appa();
		a.car();
		a.land();
	}
}
