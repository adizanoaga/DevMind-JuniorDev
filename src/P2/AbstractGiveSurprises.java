package P2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
	private static IBag tolba;
	private static int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		tolba=new BagFactory().makeBag(type);
		this.waitTime=waitTime;
	}

	public static void put(ISurprise newSurprise) {
		tolba.put(newSurprise);
	}

	public static void put(IBag surprises) {
		while(!surprises.isEmpty()) {
			tolba.put(surprises.takeOut());
		}
	}

	public static void give() {
		tolba.takeOut().enjoy();		
	}

	public static void giveAll() {
		int n=1;
		while (!tolba.isEmpty()) {
			tolba.takeOut().enjoy();
			try {
				TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static boolean isEmpty(){
		if(tolba.size()==0)
			return true;
		else
			return false;
	}
	public abstract void giveWithPassion();
	
}
