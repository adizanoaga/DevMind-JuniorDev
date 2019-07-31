package MatriciAplicatii;

import java.util.ArrayList;

public class Problema1 {
	public static int[][] createArray (int numarElemente, int valoareUnica){
		int[][] arr=new int[numarElemente][numarElemente]; 
		for(int i = 0; i < numarElemente; i++) {
			for(int j=0; j<numarElemente; j++){
				arr[i][j]=valoareUnica;
			}
		}
		return arr;
	}
	public static void printArr(int[][] arr){
		for(int i=0; i<arr.length;i++){
			for(int j=0; j<arr.length; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] adunare(int[][] arr1, int[][] arr2){
		if(arr1.length!=arr2.length){
			return null;
		}
		int[][] result= new int[arr1.length][arr1.length];
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length;j++){
				result[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		return result;
	}
	public static int[][] scadere(int[][] arr1, int[][] arr2){
		if(arr1.length!=arr2.length){
			return null;
		}
		int[][] result= new int[arr1.length][arr1.length];
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length;j++){
				result[i][j]=arr1[i][j]-arr2[i][j];
			}
		}
		return result;
	}
	public static int[][] inmultireScalar(int[][] arr1, int scalar){
		int[][] result= new int[arr1.length][arr1.length];
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length;j++){
				result[i][j]=arr1[i][j]*scalar;
			}
		}
		return result;
	}
	
	public static int[][] inmultire(int[][] arr1, int[][] arr2){
		if(arr1.length!=arr2.length){
			return null;
		}
		int[][] result= new int[arr1.length][arr1.length];
		for(int i=0; i<result.length; i++){
			for(int j=0; j<result[i].length;j++){
				result[i][j]=arr1[i][j]*arr2[j][i];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int n=3;
		int[][] arr1=createArray(n, 2);
		int[][] arr2=createArray(n, 3);
		int[][] result=createArray(n, 0);
		printArr(adunare(arr1, arr2));
		System.out.println();
		printArr(scadere(arr1, arr2));
		System.out.println();
		printArr(inmultireScalar(arr1, 10));
		System.out.println();
		arr1[0][0]=0;
		arr1[0][1]=0;
		arr2[1][1]=100;
		arr1[0][2]=0;		
		printArr(inmultire(arr1, arr2));
		
	}

}
