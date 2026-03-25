package comWalking_13_1;

public class Cat extends Animal {

	private Cat() {
		System.out.println("I'm cat");
	}
	
	public Cat(String color) {
		new Cat();
		System.out.println("I'm " + color + " cat");
	}
	
}