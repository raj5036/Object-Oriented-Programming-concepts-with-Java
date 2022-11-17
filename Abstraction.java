abstract class Shape {
	String color;

	public Shape (String color) {
		System.out.println("Shape contructor was called");
		this.color = color;
	}

	abstract double area ();

	abstract void printDetails ();
}

class Circle extends Shape {

	double radius;

	Circle (String color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override //run-time polymorphism
	double area () {
		return 22.7 * radius * radius;
	}

	@Override 
	void printDetails () {
		System.out.println("Area of the circle is " + this.area());
		System.out.println("Color of the circle is " + super.color);
	}
}

class Square extends Shape {

	double length, width;

	Square (String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	@Override
	double area () {
		return length * width;
	}

	@Override
	void printDetails () {
		System.out.println("Area of the circle is " + this.area());
		System.out.println("Color of the circle is " + super.color);
	}
}

public class Abstraction {
	public static void main (String[] args) {
		System.out.println("Hey");
		Circle circle = new Circle("Blue", 33.22);
		circle.printDetails();
	}
}