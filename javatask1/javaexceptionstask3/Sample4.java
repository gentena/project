package javaexceptionstask3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample4 {
// Try catch
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("enter a number");
			double number=  scanner.nextDouble();
            double result=100/number;
			System.out.println("result:"+result);
			
		}catch(ArithmeticException e) {
			System.out.println("Error:cannot divide by zero");
		}catch(InputMismatchException e) {
			System.out.println("invalid input.please enter a number");
			
		}finally {
			scanner.close();
		}

	}

}
