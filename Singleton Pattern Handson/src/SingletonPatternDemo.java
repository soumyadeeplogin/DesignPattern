
public class SingletonPatternDemo {
	public static void main(String[] args) {
//		SingleObject object1 = SingleObject.getInstance();
//		SingleObject object2 = SingleObject.getInstance();
//		SingleObject object3 = SingleObject.getInstance();
//		
//		
//		System.out.println("Object 1 " + object1.hashCode());
//		System.out.println("Object 2 " + object2.hashCode());
//		System.out.println("Object 3 " + object3.hashCode());
//		
//		System.out.println("Threading here......\n\n\n");
		
		int id = 0;
		
//		new Threading(++id).run();
//		new Threading(++id).run();
//		new Threading(++id).run();
		
		Runnable r1 = new Threading(++id);
		Runnable r2 = new Threading(++id);
		Runnable r3 = new Threading(++id);
		Runnable r4 = new Threading(++id);
		
		new Thread(r1).start();
		new Thread(r2).start();
		new Thread(r3).start();
		new Thread(r4).start();
		
	}
}
