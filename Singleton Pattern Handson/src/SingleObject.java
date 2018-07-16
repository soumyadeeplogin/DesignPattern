import java.util.Calendar;

public class SingleObject {
	private static SingleObject singleObject = null;
	private Calendar now;
	
	private SingleObject(){
		now = Calendar.getInstance();
	}
	
	public String printDate(){
		return now.getTime().toString();
	}
	
	public static SingleObject getInstance(){
		
		synchronized(SingleObject.class)
		{
			if(singleObject==null)
			{			
				Thread.currentThread();
				try {
					Thread.sleep(2000);
					singleObject = new SingleObject();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		return singleObject;
	}
}
