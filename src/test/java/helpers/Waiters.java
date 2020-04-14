package helpers;

public class Waiters {
	
	public static void wait(int milisecs) {
		try {
			Thread.sleep(milisecs);					
		} catch (InterruptedException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void fixedwait() {
		Waiters.wait(3000);		
	}
}
