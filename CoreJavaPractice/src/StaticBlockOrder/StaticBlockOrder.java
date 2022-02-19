package StaticBlockOrder;


/*
static variable  is declared outside any method and it goes method area & loaded when the class is loaded
 */
public class StaticBlockOrder {
	static StaticBlockOrder objMember = new StaticBlockOrder(20);
	
	void test_local_static()
	{
		 String s= "hara";
		
	}
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
