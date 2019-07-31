package MyArrayList;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		MyIntArrayList arr = new MyIntArrayList();
		for(int i=1;i<10;i++){
			arr.add(i);
		}
		MyIntArrayList arr2 = new MyIntArrayList();
		for(int i=0;i<3;i++){
			arr2.add(99);
		}
		
		//ADD AT INDEX
			//arr.printArr();
			arr.add(5, 100);
			arr.printArr();
		
		//boolean contains(int e)
			//System.out.println(arr.contains(100));
			//System.out.println(arr.contains(101));
		
		//int lastIndexOf(int e)
			//arr.add(100);
			//System.out.println(arr.lastIndexOf(100));
			//System.out.println(arr.lastIndexOf(101));
			
		//arr.remove;
			//arr.remove(100);
			//arr.printArr();
		
		//add all
			//arr.addAll(arr2);
			//arr.printArr();
	
		//	arr all 2
			//arr2.printArr();
			//arr.addAll(4, arr2);
			//arr.printArr();
		//ensure capacity
			//arr.ensureCapacity(20);
			//arr.trimToSize();
	}

}
