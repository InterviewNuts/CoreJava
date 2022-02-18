package StaticBlock;

public class StaticBlock {

	static StaticBlock obj = new StaticBlock();
	int y = 90;

	static int x = 100;
	static {

		System.out.println("Static blk starts");
		obj = new StaticBlock();
		System.out.println(StaticBlock.x);
		System.out.println(obj.x);
		System.out.println("Static blk ends ");
	}

	StaticBlock() {
		System.out.println("constructor called ");
	}

	void non_static_show() {
		System.out.println(" Non Static Y  " + y);
		System.out.println("  Static X " + x);
	}

	static void show() {
		System.out.println("Obj is static Object Y " + obj.y);
	}

	public static void main(String[] args) {
		System.out.println(" From Main method");
//		System.out.println(StaticBlock.obj);
		obj.non_static_show();
		obj.show();
		

	}

}
