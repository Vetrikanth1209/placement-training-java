package day10;

interface father{
	void car();
}

interface mother{
	void kassu();
}

class naanu implements father,mother{
	public void car() {
		System.out.println("BMW");
	}

	public void kassu() {
		System.out.println("1lakh");
	}
}

public class multiple_inheritance {
	public static void main(String[] args) {
		naanu c = new naanu();
		c.car();
		c.kassu();
	}
}
