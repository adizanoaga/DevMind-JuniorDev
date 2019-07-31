package P2;

import java.util.ArrayList;
import java.util.Random;

public class Candies implements ISurprise{
	private static boolean primaInitiere=false;
	private int n;
	private String str;
	private static ArrayList<String> bomboane=new ArrayList();

	public Candies(int n, String str){
		if(primaInitiere){
			primaInitiere=true;
			Candies.addTipuriBomboane();
		}
		this.n=n;
		this.str=str;
	}

	private static void addTipuriBomboane(){
		bomboane.add("chocolate");
		bomboane.add("jelly");
		bomboane.add("fruits");
		bomboane.add("vanilla");
	}
	
	public static Candies generate(){
		bomboane.clear();
		Candies.addTipuriBomboane();
	    Random random = new Random();
	    int n1 = random.nextInt(100);
	    int n2 = random.nextInt(bomboane.size());
	    return new Candies(n1, bomboane.get(n2));
	}
	
	public void enjoy(){
		System.out.println("Ai primit "+n+" bomboane de tipul "+str);
	}
}
