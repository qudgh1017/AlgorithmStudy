package git.AlgorithmStudy.educast;

import java.util.Scanner;

// ��� ȣ���� �̿��� ���� Ž�� �ڵ�
// N���� ī�尡 �ְ� ���� 1~N ������ ��ȣ�� ������ �̸� ���ٷ� ����� �ִ� ��� ����� �� ���
// ex) N=3�̸� => 123 132 213 231 312 321
public class RecursionForBruteForce {
	
	public static void getResult(int current, int n, int result[]) {
		if(current >= n)
		{
			// ���
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
