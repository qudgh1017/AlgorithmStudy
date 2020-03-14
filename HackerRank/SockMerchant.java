package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class SockMerchant {

	public static int sockMerchant(int n, int[] ar) {
		int pairs = 0;
		int compareNum;
		int sameCnt;
		
		for(int i=0; i<n; i++) {
			
			sameCnt = 1; //자기 자신
			
			if(ar[i] == -1) {
				continue;
			}
			else {
				compareNum = ar[i];
			}
			
			for(int j=i+1; j<n; j++) {
				if(compareNum == ar[j])
				{
					sameCnt ++;
					ar[j] = -1;
				}
				
			}
			pairs += (sameCnt/2);
		}
		
		return pairs;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int[] ar = new int[n];
		
		for(int i=0; i<n; i++) {
			ar[i] = input.nextInt();
		}
		
		System.out.println(sockMerchant(n, ar));

	}

}
