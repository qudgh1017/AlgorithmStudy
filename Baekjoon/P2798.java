package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

// 블랙잭
public class P2798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int m = input.nextInt();
		int card[] = new int[n];
		
		for(int i=0; i<n; i++)
		{
			card[i] = input.nextInt();
		}
		
		// 카드 3장의 합이 M을 넘지 않는 최댓값
		int max=0;
		int sum=0;
		for(int i=0; i<card.length; i++)
		{
			for(int j=i+1; j<card.length; j++)
			{
				for(int k=j+1; k<card.length; k++)
				{
					sum = card[i] + card[j] + card[k];
					
					if(sum<=m)
					{
						if(sum>max)
							max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}

}
