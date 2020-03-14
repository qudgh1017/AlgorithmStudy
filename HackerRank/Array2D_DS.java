package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Array2D_DS {

	static int hourglassSum(int[][] arr) {
		int maximum=0;
		int[] glassSum = new int[4 * 4];
		int row, column;
		
		for(int i=0; i<glassSum.length; i++) {
			
			row = i/4;
			column = i%4;
			
			glassSum[i] = arr[row][column] + arr[row][column+1] + arr[row][column+2]
					+ arr[row+1][column+1]
							+ arr[row+2][column] + arr[row+2][column+1] + arr[row+2][column+2];
			
			if(i==0) {
				maximum = glassSum[i];				
			}else {
				if(maximum < glassSum[i]) {
					maximum = glassSum[i];
				}
			}
		}
		
		return maximum;
    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
            String[] arrRowItems = input.nextLine().split(" ");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
		
		System.out.println(hourglassSum(arr));
	}

}
