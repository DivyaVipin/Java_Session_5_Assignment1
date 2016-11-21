abstract class Figure{
	
	abstract double findArea();
	abstract double findPerimeter();
}
class Circle extends Figure
{
	private double dim1;
	private final double pi = Math.PI;
	Circle(double radius)
	{
		this.dim1=radius;
	}
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		return pi * Math.pow(dim1, 2);
	}

	@Override
	double findPerimeter() {
		// TODO Auto-generated method stub
		return 2 * pi * dim1;
	}

}
	

class Rectangle extends Figure
{
	private int width,height;
	Rectangle(int wi,int hi)
	{
		this.width=wi;
		this.height=hi;
	}
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	double findPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width +height);
	}

	
	
}
class Triangle extends Figure
{
	private double a,b,c;
	public Triangle(double side1,double side2,double side3)
	{
		this.a=side1;
		this.b=side2;
		this.c=side3;
	}
	@Override
	double findArea() {
		// TODO Auto-generated method stub
		double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	@Override
	double findPerimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}


	
}
public class Shape {

	public static void main(String[] args) {
		int width = 5;
		int height=2;
        Figure rectangle = new Rectangle(width,height);
        System.out.println("Area of Rectangle");
        System.out.println("---------------");
        System.out.println("Rectangle width: " + width + " and height: " +height
                + "\nResulting area: " + rectangle.findArea()
                + "\nResulting perimeter: " + rectangle.findPerimeter() + "\n");
        System.out.println("Area of Circle");
        System.out.println("---------------");
        double radius = 5;
        Figure circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + circle.findArea()
            + "\nResulting Perimeter: " + circle.findPerimeter() + "\n");
        System.out.println("Area of Triangle");
        System.out.println("---------------");
        double a = 5, b = 3, c = 4;
        Figure triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + triangle.findArea()
                + "\nResulting Perimeter: " + triangle.findPerimeter() + "\n");
        
	}

}
