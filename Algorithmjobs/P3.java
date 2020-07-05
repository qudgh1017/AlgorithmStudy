package git.AlgorithmStudy.Algorithmjobs;

import java.util.Scanner;

//투표
/*
 * 투표 부스가 가장 많이 필요할 때를 찾으면 되는 문제
 * 1. 배열의 열에 부스 사용시간을 체크
 * 2. 행으로 확인하며 가장 많이 체크된 행의 체크 갯수 출력
 */
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N;
		int start, end;
		int[] arr = new int[160]; //시간범위 + 10
		int max = -1;
		
		N = scanner.nextInt();
		for(int i=0; i<N; i++)
		{
			start = scanner.nextInt();
			end = scanner.nextInt();

			for(int j=start; j<end; j++)
			{
				arr[j]++;
				if(arr[j] > max)
					max = arr[j];				
			}
			
		}
	
		
		System.out.println(max);
	}

}
