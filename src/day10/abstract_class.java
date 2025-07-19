package day10;

abstract class Menu{
	abstract void idly();
	abstract void juice();
	void briyani() {
		System.out.println("Briyani -230");
	}
}

class preparation extends Menu{
	void idly() {
		System.out.println("Idly -10");
	}

	void juice() {
		System.out.println("Juice -30");
	}
}

public class abstract_class {

	public static void main(String[] args) {
		preparation p = new preparation();
		p.briyani();
		p.idly();
		p.juice();
	}

}
