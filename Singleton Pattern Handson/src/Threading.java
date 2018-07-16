public class Threading implements Runnable{
	
	public int id = 0; 
	
	public Threading(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		
		if(id==1)
		{
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		SingleObject threaded = SingleObject.getInstance();
		System.out.println("Threaded "+ id + " " + threaded.hashCode() + " " + threaded.printDate());
	}
	
}
