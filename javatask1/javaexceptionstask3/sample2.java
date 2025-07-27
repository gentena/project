package javaexceptionstask3;
//RemoteControl interface with an abstract and a default method
interface RemoteControl {
 // Abstract method
 void turnOn();

 // Default method
 default void batteryStatus() {
     System.out.println("Battery is at 75%");
 }
}

//TV class implementing RemoteControl interface
class TV implements RemoteControl {
 @Override
 public void turnOn() {
     System.out.println("TV is now ON.");
 }

 
}

//Main class to demonstrate usage

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV myTV = new TV();
	     myTV.turnOn();          // Abstract method implementation
	     myTV.batteryStatus();   // Default method usage
	 }
	

	}


