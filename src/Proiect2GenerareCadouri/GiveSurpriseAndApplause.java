package Proiect2GenerareCadouri;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {
	
	public GiveSurpriseAndApplause(String type, int waitTime) {
		super(type, waitTime);
	}

	public void giveWithPassion(){
		System.out.println();
		System.out.println("Loud applause to you… For it is in giving that we receive.");
	}
}
