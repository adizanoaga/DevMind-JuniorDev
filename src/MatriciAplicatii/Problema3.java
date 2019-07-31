package MatriciAplicatii;

import java.util.Scanner;

public class Problema3 {
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
	public static void printArr(String[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0, j=0;
		int[][] arr = new int[][] { { 3, 14, 100, 21 }, { 1, 23, 3, 5 },
				{ 6, 1, 4, 9 }, { 16, 41, 55, 901 }, { 2, 7, 2, 6 } };
		String[][] directiiPosibile =new String[][]{{"8","1","2"},{"7","R","3"},{"6","5","4"}};
		int[][] contorVizita=new int[arr.length][arr[i].length];
		String[] tipPozitie = { "colt", "latura", "centru" };
		String pozitie;
		int contorPuncte=0;
		while (true) {
			System.out.println("HARTA:");
			printArr(arr);
			System.out.println("\nDirectii posibile:");
			printArr(directiiPosibile);
			System.out.println();
			System.out.println("Puncte acumulate: "+contorPuncte);
			System.out.println("Introduceti directia robotului (numere de la 1 la 8), pentru meniu introduceti 9: ");
			int n = sc.nextInt();
			if((i==0&&j==0)||(i==arr.length-1&&j==arr[i].length-1)||(i==0&&j==arr[i].length-1)||(i==arr.length-1&&j==0)){
				pozitie = tipPozitie[0];
			} else if(i==0||j==0||i==arr.length-1||j==arr[i].length-1){
				pozitie = tipPozitie[1];
			} else {
				pozitie = tipPozitie [2];
			}
			switch (n) {
			case 1:
				i--;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					i++;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 2:
				i--;
				j++;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					i++;
					j--;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 3:
				j++;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					j--;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 4:
				i++;
				j++;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					i--;
					j--;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 5:
					i++;
					if(i<0||j<0||i==arr.length||j==arr[i].length){
						i--;
						System.out.println("Comanda invalida, CAZI DE PE HARTA");
						break;
					}
				break;
			case 6:
				i++;
				j--;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					i--;
					j++;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 7:
				j--;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					j++;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
			case 8:
				i--;
				j--;
				if(i<0||j<0||i==arr.length||j==arr[i].length){
					i++;
					j++;
					System.out.println("Comanda invalida, CAZI DE PE HARTA");
					break;
				}
				break;
				default:
					System.out.println("COMANDA INVALIDA");
					System.out.println("Matricea casutelor cele mai vizitate este: ");
					printArr(contorVizita);
					System.out.println("Tu te afli pe pozitia: x="+i+" y="+j);
					System.out.println();
					break;
			}
			contorPuncte+=arr[i][j];
			arr[i][j]=0;
			contorVizita[i][j]++;

			
			
			
			
			
			
		}
	}

}
