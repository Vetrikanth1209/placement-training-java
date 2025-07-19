package day10;


interface M_list{
	void dosa();
	void barotta();
}

class Preparation implements M_list{ /// when implementing a interface you should over ride method with public keyword
	public void dosa() {
		System.out.println("Dosa-20");
	}
	public void barotta() {
		System.out.println("Barotta-30");
	}
}

public class interface_example {
public static void main(String[] args) {
	Preparation p = new Preparation();
	p.barotta();
	p.dosa();
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
	////or
	M_list m = new Preparation();
	m.barotta();
	m.dosa();
}
}
