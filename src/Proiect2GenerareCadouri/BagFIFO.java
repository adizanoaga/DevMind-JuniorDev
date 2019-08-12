package Proiect2GenerareCadouri;

import java.util.ArrayList;

public class BagFIFO implements IBag{
	private ArrayList<ISurprise> bag=new ArrayList();
	@Override
	public void put(ISurprise newSurprise) {
		bag.add(newSurprise);	
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while(bagOfSurprises.size()!=0){
			put(bagOfSurprises.takeOut());
		}		
	}

	@Override
	public ISurprise takeOut() {
		ISurprise s=bag.get(0);
		bag.remove(0);
		return s;
	}

	@Override
	public boolean isEmpty() {
		if(size()!=0)
			return false;
		else
			return true;
	}

	@Override
	public int size() {
		return bag.size();
	}

	@Override
	public ArrayList<ISurprise> getBag() {
		return bag;
	}

}
