package P2;

import java.util.ArrayList;
import java.util.Random;

public final class GatherSurprises {
	private static Random rnd=new Random();
	private static ArrayList<ISurprise> surprise =new ArrayList();
	private GatherSurprises(){	
	}
	
	public static ISurprise gather(){
		int rndNr1=rnd.nextInt(3);
		switch (rndNr1){
			case 0:
				return FortuneCookie.generate();	
			case 1:
				return Candies.generate();
			case 2:
				return MinionToy.generate();
			}
		return null;
		}
	
	public static ArrayList<ISurprise> gather(int nr){
		for(int i=0;i<nr;i++){
			surprise.add(gather());
		}
		return surprise;
	}
}

