package ArrayList;

import java.awt.Image;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Problema1 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			arr.add(i);
		}
		arr.add(5,100);
		printArr(arr);
		arr.add(5,100);
		printArr(arr);
		arr.add(100);
		arr.add(0,100);
		printArr(arr);
		System.out.println("--------------------------");
		arr.add(5);
		arr.add(5);
		arr.add(5);
		arr.add(4);
		arr.add(4);
		arr.add(4);
		printArr(arr);
		System.out.println("--------------------------");
		ArrayList<Integer> maxArr=numaraAparitii(arr);
		printArr(maxArr);

		
		
		
		
		
		
		
		
		

	}

	public static void printArr(ArrayList<Integer> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(" " + arr.get(i));
		}
		System.out.println();
	}
	
	public static ArrayList<Integer> numaraAparitii(ArrayList<Integer> arr){
		int counter=1;
		int max=0;
		ArrayList<Integer> maxArr= new ArrayList<Integer>();
		while(arr.size()>0){
			for(int j=1; j<arr.size(); j++){
				if(arr.get(0).equals(arr.get(j))){
					counter++;
					arr.remove(j);
					j=j-1;
				}
			}
			if(max<counter){
				max=counter;
				maxArr.clear();
				maxArr.add(Integer.valueOf(arr.get(0)));			
			}
			if((max==counter&&!maxArr.contains(Integer.valueOf(arr.get(0))))){
				maxArr.add(Integer.valueOf(arr.get(0)));
			}		
			counter=1;
			arr.remove(0);
			printArr(arr);
			printArr(maxArr);
		}
		return maxArr;
	}
}
