package javaexceptionstask3;
//Define the Printable interface
interface Printable {
 void print();
}

//Define the Scannable interface
interface Scannable {
 void scan();
}

//Implement both interfaces in the MultifunctionPrinter class
class MultifunctionPrinter implements Printable, Scannable {
 @Override
 public void print() {
     System.out.println("Printing document...");
 }

 @Override
 public void scan() {
     System.out.println("Scanning document...");
 }
//Main class to test the MultifunctionPrinter

     

public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultifunctionPrinter mfp = new MultifunctionPrinter();

	     mfp.print();  // Calls the print method
	     mfp.scan();   // Calls the scan method
	 }
	

}
}


