package P2;

public class BagFactory implements IBagFactory{
	@Override
	public IBag makeBag(String type) {
		switch (type){
			case "RANDOM":
				return new BagRND();
			case "FIFO":
				return new BagLIFO();
			case "LIFO":
				return new BagFIFO();	
			default:
				System.out.println("Ai introdus o valoare gresita si ai generat un NULL");
				return null;
		}
	}

}
