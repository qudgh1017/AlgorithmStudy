package git.AlgorithmStudy.Algorithmjobs;

import java.util.Scanner;

//��ǥ
/*
 * ��ǥ �ν��� ���� ���� �ʿ��� ���� ã���� �Ǵ� ����
 * 1. �迭�� ���� �ν� ���ð��� üũ
 * 2. ������ Ȯ���ϸ� ���� ���� üũ�� ���� üũ ���� ���
 */
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int N;
		int start, end;
		int[] arr = new int[160]; //�ð����� + 10
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
