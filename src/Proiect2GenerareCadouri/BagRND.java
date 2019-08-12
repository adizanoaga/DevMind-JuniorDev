package Proiect2GenerareCadouri;

import java.util.ArrayList;
import java.util.Random;

public class BagRND implements IBag{
	private ArrayList<ISurprise> bag=new ArrayList();
	  Random rnd=new Random();
	  // adds a surprise in the bag
	  public void put(ISurprise newSurprise){
		  if(bag.size()==0){
			  bag.add(newSurprise);
			  return;
		  }
		  int n=rnd.nextInt(bag.size());  
		  bag.add(n, newSurprise);
	  }

	  // adds all the surprises from another IBag
	  public void put(IBag bagOfSurprises){
		  while(bagOfSurprises.size()!=0){
			  int n=rnd.nextInt(bagOfSurprises.getBag().size());
			  this.put(bagOfSurprises.takeOut());
		  }
	  }
	 
	  // removes a surprise from the bag and returns it
	  public ISurprise takeOut(){
		  int n=rnd.nextInt(bag.size());
		  ISurprise s=bag.get(n);
		  bag.remove(n);
		  return s;
	  }
	 
	  // Checks if the bag is empty or not
	  public boolean isEmpty(){
		  if(bag.size()==0)
			  return true;
		  else
			  return false;	  
		  }
	 
	  // Returns the number of surprises
	  public int size(){
		  return bag.size();
	  }

	public ArrayList<ISurprise> getBag() {
		return bag;
	}

}
