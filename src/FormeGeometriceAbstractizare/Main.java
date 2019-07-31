package FormeGeometriceAbstractizare;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Triangle tr1=new Triangle(5,10);
		Triangle tr12=new Triangle(5,10);
		Triangle tr2=new Triangle(4,10);		
		Rectangle rt1=new Rectangle(4, 6);
		Rectangle rt2=new Rectangle(6, 7);
		ArrayList<Shape> arr=new ArrayList<>();
		arr.add(tr1);
		arr.add(tr2);
		arr.add(rt1);
		arr.add(rt2);
		for(int i=0; i<arr.size();i++){
			System.out.println(arr.get(i));
			System.out.println(arr.get(i).getSize());
			if(arr.get(i) instanceof Rectangle){
				Rectangle a=(Rectangle) arr.get(i);
				a.displayRectangleHeight();
				continue;
			}
			if(arr.get(i) instanceof Triangle){
				Triangle a=(Triangle) arr.get(i);
				a.displayTriangleHeight();
				continue;				
			}
			if(arr.get(i) instanceof Shape){
				Shape a=arr.get(i);
				System.out.println("Nu se apeleaza nicio metoda !");
				continue;
			}			
		}
		System.out.println();
		System.out.println("TESTARE EQUALS: ");
		System.out.println("Acelasi element: "+tr1.equals(tr1));
		System.out.println("Acelasi tip de obiect cu aceleasi valori caracteristice: "+tr1.equals(tr12));
		System.out.println("Acelasi tip de obiect dar obiecte diferite: "+tr1.equals(tr2));
		System.out.println("Tipuri diferite de obiecte: "+tr1.equals(rt2));
	}

}
