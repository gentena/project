package javaoops.task2;

public class Calculator{

	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Method to concatenate two strings
	    public String add(String a, String b) {
	        return a + b;
	    }

	    // Main method to test the Calculator
	    public static void main(String[] args) {
	        Calculator calc = new Calculator();

	        // Integer addition
	        int sumInt = calc.add(10, 20);
	        System.out.println("Sum of integers: " + sumInt);

	        // Double addition
	        double sumDouble = calc.add(5.5, 4.5);
	        System.out.println("Sum of doubles: " + sumDouble);

	        // String concatenation
	        String sumString = calc.add("Hello, ", "World!");
	        System.out.println("Concatenated string: " + sumString);
	    }
	}

	