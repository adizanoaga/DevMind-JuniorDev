package Polimorfism;

public class PolimorfismDinamicCopil extends PolimorfismDinamicParinte{
	public static void polimorfismDinamic(int n){
		System.out.println("Aceasta este metoda statica din polimorfismDinamicCopil");
	}
	public void polimorfismDinamic(int n, int n2){
		System.out.println("Aceasta este metoda nestatica, dar cu 2 parametrii din polimorfismDinamicCopil");
	}
}
