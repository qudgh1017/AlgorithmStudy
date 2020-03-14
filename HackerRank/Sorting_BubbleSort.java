package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Sorting_BubbleSort {

	static void countSwaps(int[] a) {

		int n = a.length;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
		    
		    for (int j = 0; j < n - 1; j++) {
		        // Swap adjacent elements if they are in decreasing order
		        if (a[j] > a[j + 1]) {
		        	int temp = a[j+1];
	                a[j+1] = a[j];
	                a[j] = temp;

		            cnt++;
		        }
		    }
		    
		}
		
		System.out.println("Array is sorted in " + cnt + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n-1]);

    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] a = new int[n];
		
		input.nextLine();
		String[] aItems = input.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		
		countSwaps(a);
		
		input.close();
	}

}
