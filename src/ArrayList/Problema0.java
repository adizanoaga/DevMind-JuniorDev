package ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Problema0 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr = new ArrayList<Integer>();
	for(int i=0; i<10; i++){
		arr.add(i);
	}
	arr.add(5,100);
	printArr(arr);
	arr.add(5,100);
	printArr(arr);
	arr.add(100);
	printArr(arr);
	System.out.println("Marimea array ului este de "+arr.size()+" elemenete.");
	System.out.println("Array ul contine numarul 100 ?: "+arr.contains(100));
	System.out.println("Elementul de pe pozitia 5 este: "+arr.get(5));
	System.out.println("Prima aparitie a numarului 100 este la indexul:  "+arr.indexOf(100));
	System.out.println("Ultima aparitie a numarului 100 este la indexul:  "+arr.lastIndexOf(100));
	arr.remove(Integer.valueOf(1));
	printArr(arr);
	arr.remove(0);
	printArr(arr);
	arr.set(5, 101);
	printArr(arr);
	arr.clear();
	}

	public static void printArr(ArrayList<Integer> arr){
		for(int i=0; i<arr.size();i++){
			System.out.print(" "+arr.get(i));
		}
		System.out.println();
	}
}
