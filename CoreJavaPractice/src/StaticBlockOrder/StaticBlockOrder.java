package StaticBlockOrder;


public class StaticBlockOrder {
	static StaticBlockOrder objMember = new StaticBlockOrder(20);
	static {
		System.out.println("Called from static Block");
		StaticBlockOrder objMember = new StaticBlockOrder(25);

	}

	public StaticBlockOrder(int x) {
		super();
		System.out.println("StaticBlockOrder Constructor Called " + x);
	}

	public static void main(String[] args) {

	}

}
