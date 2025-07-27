package javaoops.task2;


//Base class
class Vehicle1 {
  String brand;
  int speed;
  void showdetails() {
  	System.out.println("Brand:"+brand+",Speed:"+speed+"km/h");
  }
}
class Car extends vehicle1{
	int wheels=4;
	public String speed;
	public String brand;

	public void showdetails() {
		// TODO Auto-generated method stub
		
	}
}
class Bike extends vehicle1{
	int wheels =4;
	public String brand;
	public int speed;

	public void showdetails() {
		// TODO Auto-generated method stub
		
	}
}
public class vehicle1 {
	public static void main(String[] args) {
		Car car =new Car();
		car.brand="honda";
		car.speed="120";
		car.showdetails();
		Bike bike =new Bike();
		bike.brand ="anjali";
		bike.speed =120;
		bike.showdetails();
		
		
	}
		
	}

