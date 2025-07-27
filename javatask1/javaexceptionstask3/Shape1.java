package javaexceptionstask3;
//Abstract class
abstract class Shape {
 abstract double area();
}

//Circle subclass
class Circle extends Shape {
 double radius;

 // Constructor
 Circle(double radius) {
     this.radius = radius;
 }

 // Implement area()
 double area() {
     return Math.PI * radius * radius;
 }
}

//Rectangle subclass
class Rectangle extends Shape {
 double length, width;

 // Constructor
 Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implement area()
 double area() {
     return length * width;
 }
}

//Main class to test
public class Shape1 {
 public static void main(String[] args) {
     Shape c = new Circle(5);
     Shape r = new Rectangle(4, 6);

     System.out.println("Area of Circle: " + c.area());
     System.out.println("Area of Rectangle: " + r.area());
 }
}


