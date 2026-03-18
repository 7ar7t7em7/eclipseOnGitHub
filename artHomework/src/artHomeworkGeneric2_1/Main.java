package artHomeworkGeneric2_1;

public class Main {

	public static void main(String[] args) {
		System.out.println(Main.expNum(5).getF1());

	}
	
	public static GenNumX2<? extends Number> expNum(Number n) {
		return new GenNumX2<Number>(n);
	}

}
