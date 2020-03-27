package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Day7_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
        scanner.nextLine();

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        
        for(int i=arr.length-1; i >=0; i--)
        {
        	if(i != 0)
        		System.out.print(arr[i] + " ");
        	else
        		System.out.print(arr[i]);
        }

        scanner.close();
    
	}

}
