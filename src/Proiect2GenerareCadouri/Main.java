package Proiect2GenerareCadouri;
import java.util.ArrayList;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		BagFactory b=new BagFactory();
		IBag a = b.makeBag("RANDOM");
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		a.put(GatherSurprises.gather());
		AbstractGiveSurprises c =new GiveSurpriseAndSing("RANDOM", 1);
		System.out.println("Felicitari, cele "+a.size() +" cadouri ale tale, sunt: \n");
		c.put(a);
		c.giveAll();
		c.giveWithPassion();
	}
}
