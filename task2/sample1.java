package javaoops.task2;
class Book3{
	String title;
	String author;
	double price;
}
class Book1 extends Book3{
	void displaydetails() {
		title="manju";
		author="gren";
		price=200;
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
		
		
	}
	
}
class Book2 extends Book3{
	void displaydetails() {
		title="manjula";
		author="grens";
		price=20;
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
		
		
	}
	
}



public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book2 obj=new Book2();
		Book1 obj1=new Book1();
		obj1.displaydetails();
		obj.displaydetails();
		

	}

}
