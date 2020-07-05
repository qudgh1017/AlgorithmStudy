package git.AlgorithmStudy.educast;

import java.util.Scanner;

// ��� ȣ���� �̿��� ���� Ž�� �ڵ�
// N���� ī�尡 �ְ� ���� 1~N ������ ��ȣ�� ������ �̸� ���ٷ� ����� �ִ� ��� ����� �� ���
// ex) N=3�̸� => 123 132 213 231 312 321
public class RecursionForBruteForce2 {
	
	public static int MAX = 100;
	public static int n;
	public static int[] result = new int[MAX];
	
	public static void getResult(int x) {
		// x��° for���� ������ ��
		
		if(x>=n)
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
				if(isNotContaining(i))
				{
					result[x] = i;
					
					getResult(x+1);
					
					// x��°�� i�� �ִ� ��� ��츦 �̹� �� ����غ�
					result[x] = 0;
				}
			}
		}
	}
	
	// result[]�� i�� ������ true
	public static boolean isNotContaining(int i) {
		
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
		n = input.nextInt();
		
		getResult(0);

	}

}
