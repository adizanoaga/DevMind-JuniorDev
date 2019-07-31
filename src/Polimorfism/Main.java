package Polimorfism;

public class Main {

	public static void main(String[] args) {
		System.out.println("Polimorfism static");
		PolimorfismStatic.polimorfismStatic(1);
		PolimorfismStatic.polimorfismStatic(1,1);
		
		System.out.println();
		System.out.println("Polimorfism dinamic");
		PolimorfismDinamicCopil pc=new PolimorfismDinamicCopil();
		PolimorfismDinamicCopil.polimorfismDinamic(1);
		PolimorfismDinamicParinte.polimorfismDinamic(1);
		
		System.out.println();
		pc.polimorfismDinamic(1);
		PolimorfismDinamicParinte pp=pc;
		pp.polimorfismDinamic(1);
		pp.polimorfismDinamic(1, 1);
	}

}
