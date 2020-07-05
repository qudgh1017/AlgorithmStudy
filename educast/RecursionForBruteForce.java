package git.AlgorithmStudy.educast;

import java.util.Scanner;

// 재귀 호출을 이용한 완전 탐색 코드
// N개의 카드가 있고 각각 1~N 까지의 번호를 갖으며 이를 한줄로 세울수 있는 모든 경우의 수 출력
// ex) N=3이면 => 123 132 213 231 312 321
public class RecursionForBruteForce {
	
	public static void getResult(int current, int n, int result[]) {
		if(current >= n)
		{
			// 출력
			for(int i=0; i<n; i++)
			{
				System.out.print(result[i] + " ");				
			}
			System.out.println();
		}
		else
		{
			for(int i=1; i<=n; i++)
			{
				if(isNotContaining(result, i)) 
				{
					result[current] = i;
					getResult(current+1, n, result);
					result[current] = 0;
				}
			}
		}
	}
	
	public static boolean isNotContaining(int result[], int i) {
		
		boolean flag = true;
		
		for(int j=0; j<result.length; j++)
		{
			if(result[j]==i)
			{
				flag = false;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		n = input.nextInt();
		int[] result = new int[n];
		
		getResult(0, n, result);

	}

}
