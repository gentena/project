package javaexceptionstask3;
//multiple catch blocks
public class Sample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//array indexoutofboundexception
			int[]array=new int[5];
			System.out.println("array element at index10:"+array[10]);
			//arithmeticexplression
			int numerator=10;
			int denominator=0;
			int result=numerator/denominator;
			System.out.println("result:"+result);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error:array index out of bounds");
			System.out.println("exception message:"+e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("error:cannot divide by zero");
			System.out.println("exception message:"+e.getMessage());
		}

	}

}
