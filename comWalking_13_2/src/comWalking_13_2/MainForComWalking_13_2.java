package comWalking_13_2;

public class MainForComWalking_13_2 {

	public static void main(String[] args) {
				
		Animal[] animals = {new Cat(), new Dog(), new Cow()};
		for (Animal animal : animals) {
			animal.sound();
		}
	}

}
