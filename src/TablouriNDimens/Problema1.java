package TablouriNDimens;

public class Problema1 {

	public static void main(String[] args) {
		int maxDimension=6;
		int mainDiagValue=1;
		int sndDiagValue=2;
		int centerValue=3;
		int leftValue=4;
		int upValue=5;
		int rightValue=6;
		int bottomValue=7;
		int[][] arr = new int[maxDimension][maxDimension];
		
		for(int i=0; i<maxDimension;i++){
			for(int j=0; j<maxDimension;j++){
				if(i==j){
					arr[i][j]=mainDiagValue;
					continue;
				}
				if((i+j)==maxDimension-1){
					arr[i][j]=sndDiagValue;
					continue;
				}
				if(maxDimension%2==1){
					arr[maxDimension/2][maxDimension/2]=centerValue;
				}
				else if(maxDimension%2==0){
					arr[maxDimension/2][maxDimension/2-1]=centerValue;
					arr[maxDimension/2-1][maxDimension/2]=centerValue;
					arr[maxDimension/2][maxDimension/2]=centerValue;
					arr[maxDimension/2-1][maxDimension/2-1]=centerValue;
				}
				if(i>j&&((j+i)<maxDimension)){
					arr[i][j]=leftValue;
					continue;
				}
				if(i<j&&((j+i)<maxDimension)){
					arr[i][j]=upValue;
					continue;
				}
				if(i<j&&((j+i)>=maxDimension)){
					arr[i][j]=rightValue;
					continue;
				}
				if(i>j&&((j+i)>=maxDimension)){
					arr[i][j]=bottomValue;
					continue;
				}
			}
		}
	for(int i=0;i<maxDimension;i++){
		System.out.print("\n");
		for(int j=0;j<maxDimension;j++){
			System.out.print(arr[i][j]+" ");
		}
	}
}
}
