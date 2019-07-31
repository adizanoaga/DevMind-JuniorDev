package TablouriNDimens;

import java.util.ArrayList;

public class Bonus {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList();
		int n = 120;
		for (int i = 2; i <= n; i++) {
			arr.add(i);
		}
		int contor = 2;
		for(int i=0; i<arr.size();i++){
			int max = contor*arr.get(i);
			while(max<n){
				max = contor*arr.get(i);
				arr.remove(Integer.valueOf(max));
				contor++;
			}
			contor=2;
		}	
		System.out.println(arr.toString());
	}

}
