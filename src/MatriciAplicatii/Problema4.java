package MatriciAplicatii;

import java.util.Random;

public class Problema4 {
	public static void printArr(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){
				if(arr[i][j]<10)
					System.out.print("  "+arr[i][j]+" ");
				if(arr[i][j]>=10&&arr[i][j]<100)
					System.out.print(" "+arr[i][j]+" ");
				if(arr[i][j]>=100)
					System.out.print(""+arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Random rnd=new Random();
		int n = rnd.nextInt(10);
		int m = rnd.nextInt(10);
		while (n < 3 || n > 10) {
			n = rnd.nextInt(11);
		}
		while (m < 3 || m > 10) {
			m = rnd.nextInt(11);
		}
		int[][] arr = new int[n][m];
		int contor=0;
		int newI=0;
		int newJ=0;
		int newMaxI=arr.length;
		int newMaxJ=arr[0].length;
		while(true){
				for(int j=newJ; j<newMaxJ; j++){
					arr[0][j]=++contor;
				}
			newI++;
			newJ++;
			newMaxI--;
			newMaxJ--;
			if(newI==n/2)
				break;
		}
		printArr(arr);
	}

}
