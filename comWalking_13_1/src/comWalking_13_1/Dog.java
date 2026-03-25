package comWalking_13_1;

public class Dog extends Animal {
	
	private Dog() {
		System.out.println("I'm dog");
	}
	
	public Dog(String color) {
		new Dog();
		System.out.println("I'm " + color + " dog");
	}
	
}
