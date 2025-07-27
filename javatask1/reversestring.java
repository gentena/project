package javatask1;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello";
        String reverse = new StringBuilder(input).reverse().toString();
        
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reverse);
    }


	}


