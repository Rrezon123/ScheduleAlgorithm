package main;

import java.util.*;

public class AlgoSchedule {

	private static int n = 16;
	private static int m = n - 1;

//Create a sort function and use it to change the array order
	public static void sort(int arr[]) {
		int tmp = arr[1];
		for (int j = 1; j < arr.length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[arr.length - 1] = tmp;

	}

//create another function to set the games 
	public static void setGames(int arr[]) {
		//create a matrix(2D array) so we can visualize week in rows and matches in columns
		String M[][] = new String[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j <= n-1 / 2; j++) {
				//we divide array in half and start to get the right and left element from array and post them to matrix
				M[i][j] = arr[m / 2 - j] + ":" + arr[m / 2 + j + 1]+",";
				System.out.print(M[i][j] + " ");
			}
			//change the array order by moving them one step back
			sort(arr);
			
			System.out.printf("//week %d", i + 1);
			System.out.println("");

		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };

		AlgoSchedule.setGames(arr);

	}
}
