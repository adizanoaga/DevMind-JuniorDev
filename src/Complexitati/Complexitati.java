package Complexitati;

public class Complexitati {
	public static int binarySearchI(int[] sortedList, int key) {
		  int left = 0, right = sortedList.length - 1;
		  int position=0;
		  int middle = 0;
		  while (left <= right) {
		       middle = (left + right) / 2;
		 
		       if (key == sortedList[middle]) {
		         return middle;
		       } else if (key < sortedList[middle]) {
		         right = middle - 1;
		       } else if (key > sortedList[middle]) {
		         left  = middle + 1;
		       }
		   }
		  System.out.println("Ar trebui sa fie la pozitia: ");
		  return middle+1;
	}	 
		   
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,5,6,7,8,9};
		int nr=6;
		System.out.println(binarySearchI(arr, nr));

	}

}
