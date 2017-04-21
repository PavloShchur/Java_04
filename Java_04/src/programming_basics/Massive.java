package programming_basics;

import java.util.Random;

public class Massive {

	public static void main(String[] args) {
		int max_number_row = 0;
		int min_number_row = 0;
		int[][] arr = new int[5][5];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = r.nextInt(100);
				System.out.print(arr[i][j] + " ");
				sum += arr[i][j];
				if (max_number_row < arr[i][j]) {
					max_number_row = arr[i][j];
				}
				if (min_number_row > arr[i][j] || (j==0)) {
					min_number_row = arr[i][j];
			}
		}
			System.out.println();
			System.out.println("This is the sum of row: " + sum + ".");
			System.out.println("This is a max number " + max_number_row + ".");
			max_number_row = 0;
			System.out.println("This is a min number " + min_number_row + ".");

		
			
		}

	}
}
