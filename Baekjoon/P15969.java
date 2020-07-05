package git.AlgorithmStudy.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class P15969 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int len = input.nextInt();
		int max = -1;
		int min = 1001;
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++) {
			arr[i] = input.nextInt();
			
			if(arr[i] > max)
				max = arr[i];
			
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println(max-min);

	}

}
