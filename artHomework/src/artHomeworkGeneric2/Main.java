package artHomeworkGeneric2;

public class Main {

	public static void main(String[] args) {
		Generic1<Integer> gen1 = new Generic1<Integer>(10);
		Generic1<Integer> gen2 = new Generic1<Integer>(null);
		System.out.println(Main.getField(gen1, 11));
		System.out.println(Main.getField(gen2, 11));

	}
	
	public static <R> R getField(Generic1<R> obj, R r) {
		if(obj.getField1() != null ) {
			return obj.getField1();
		}else {
			return r;
		}
	}
}
