package P2;

import java.util.ArrayList;

public class MinionToy implements ISurprise{
	private static boolean primaInitiere=true;
	private String denumire;
	private static int n=0;
	private static ArrayList<String> minioni=new ArrayList();
	
	public MinionToy(String denumire){
		this.denumire=denumire;
		if(primaInitiere){
			minioni.clear();
			addTipuriMinioni();
		}
	}
	
	private static void addTipuriMinioni(){
		minioni.clear();
		minioni.add("Dave");
		minioni.add("Carl");
		minioni.add("Kevin");
		minioni.add("Jerry");
		minioni.add("Tim");
	}
	
	public static MinionToy generate(){
		addTipuriMinioni();
		if(n==minioni.size()){
			n=0;
		}
		n++;
		return new MinionToy(minioni.get(n-1));
	}
	
	public void enjoy(){
		System.out.println("Ai primit un minion de tipul "+this.denumire);
	}
}
