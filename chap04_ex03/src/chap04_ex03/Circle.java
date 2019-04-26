package chap04_ex03;

public class Circle {
	int radius;
	String name;
	
	public Circle(){
		radius = 1;
		name = "";
		
	}
	
	public void Circl(int r, String n) {
		radius = r;
		name = n;
		
	}
	
	public double getArea(){
		return 3.14 * radius * radius;
		
	}

	public static void main(String[] args){
		Circle pizza = new Circle();
		double area = pizza.getArea();
		System.out.println(pizza.name + area);
		
		Circle dount = new Circle();
		dount.name = "";
		area = dount.getArea();
		System.out.println(dount.name + area);
		
	}
}