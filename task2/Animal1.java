package javaoops.task2;



class Animal {
	void sound() {
		System.out.println("Animal sound");
	}
}
class Dog extends Animal {
	void sound() {
		System.out.println("Dog braks");
	}
}
class  Cat extends Animal {
	void sound() {
		System.out.println("Cat meows");
	}
}
public class Animal1 {
	public static void main(String[] args) {
		Animal a1 =new Dog();
		Animal a2 =new Cat();
		a1.sound();
		a2.sound();
		
		
	}
	
}

