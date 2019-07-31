package MatriciAplicatii;

import java.util.Random;

public class Problema2 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(10);
		int m = rnd.nextInt(10);
		while (n < 3 || n > 10) {
			n = rnd.nextInt(11);
		}
		while (m < 3 || m > 10) {
			m = rnd.nextInt(11);
		}
		int[][] arr = new int[n][m];
		int contor = 1;
		boolean stgdr = true;
		while (contor <= (n * m)) {
			for (int i = n - 1; i >= 0; i--) {
				if (i % 2 == 0)
					stgdr = true;
				else
					stgdr = false;
				if (stgdr) {
					for (int j = 0; j < m; j++) {
						arr[i][j] = contor;
						contor++;
					}
				} else {
					for (int j = m - 1; j >= 0; j--) {
						arr[i][j] = contor;
						contor++;
					}
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] < 10)
					System.out.print(" " + arr[i][j] + " ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		contor=1;
		boolean susjos=true;
		while (contor <= (n * m)) {
			for (int j=0;j<m;j++) {
				if (j % 2 == 0)
					susjos = true;
				else
					susjos = false;
				if (susjos) {
					for (int i = 0; i < n; i++) {
						arr[i][j] = contor;
						contor++;
					}
				} else {
					for (int i = n - 1; i >= 0; i--) {
						arr[i][j] = contor;
						contor++;
					}
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] < 10)
					System.out.print(" " + arr[i][j] + " ");
				else
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
}
