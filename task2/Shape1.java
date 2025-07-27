package javaoops.task2;



//Abstract class Shape
	abstract class Shape {
	    // Abstract method
	    abstract double area();
	}

	// Derived class Circle
	class Circle extends Shape {
	     double radius;

	     Circle(double radius) {
	        radius = radius;
	    }

	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	// Derived class Rectangle
	class Rectangle extends Shape {
	    double length;
	    double width;

	     Rectangle(double length, double width) {
	        length = length;
	        width = width;
	    }

	    @Override
	    double area() {
	        return length * width;
	    }
	
	}
	
	
	    

public class Shape1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.println("Circle Area: " + circle.area());
        System.out.println("Rectangle Area: " + rectangle.area());
    }



	}


