package Proiect2GenerareCadouri;

public class GiveSurpriseAndHug extends AbstractGiveSurprises{
	public GiveSurpriseAndHug(String type, int waitTime) {
		super(type, waitTime);
	}
	public  void giveWithPassion(){
		System.out.println();
		System.out.println("Warm wishes and a big hug!");
	}
}
