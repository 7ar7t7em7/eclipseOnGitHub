package artHomeworkGeneric2_1;

public class GenNumX2<N extends Number> {
	private final N f1;

	public N getF1() {
		return f1;
	}


	public GenNumX2(N n) {
		super();
		this.f1 = n;
	}
	
	
}
