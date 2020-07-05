package git.AlgorithmStudy.Algorithmjobs;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

// �ڸ�����
/* ��Ȳ�� �� ������ ������.
 * 1. ���ʿ� ����� �ִ� ���
 * (0�� ������ ���� ���� �������� �ִ°� /2)
 * 2. ���ʿ� ����� ���� ���
 * (���ʺ��� 0�� ����)
 * 3. �����ʿ� ����� ���� ���
 * (�����ʺ��� 0�� ����)
 * 
 * 1,2,3 �� ���� ū �� ���
 * 
 */
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();		
		int max = 0;
		int cnt = 0; //�������� 0�� ��� ���Դ��� ���� ����
		
		int[] seatStatus = new int[n];
		
		for(int i=0; i<n; i++)
		{
			seatStatus[i] = scanner.nextInt();
		}
		
		//1. ���ʿ� ����� �ִ� ���
		// 1 0 1 0 0 0 1 (/2 +1)
		// 1 0 1 0 0 0 0 1 (/2)
		for(int i=0; i<n; i++)
		{
			
		}
		
		//2. ���ʿ� ����� ���� ���
		cnt = 0;
		for(int i=0; i<n; i++)
		{
			if(seatStatus[i] != 1) cnt++;
			else break;
		}
		if(max < cnt) max = cnt;

		//3. �����ʿ� ����� ���� ���
		cnt = 0;
		for(int i=n-1; i>=0; i--)
		{
			if(seatStatus[i] != 1) cnt++;
			else break;
		}
		if(max < cnt) max = cnt;

		
		int tempIdx = 0;
		int tempDistance1 = 0;
		int tempDistance2 = 0;
		int[] distance = new int[n];
		
		int maxDistance = 0;
		int seatIdx = 0;
		
		System.out.println();
		
		for(int i=0; i<seatStatus.length; i++)
		{
			if(seatStatus[i] == 0)
			{
				tempIdx = i;
				
				//idx�� ����
				for(int j=tempIdx-1; j>=0; j--)
				{
					if(seatStatus[j] == 1)
					{
						tempDistance1 = Math.abs(tempIdx-j);
						break;
					}
					
				}
				
					
				//idx�� ������
				for(int j=tempIdx+1; j<seatStatus.length; j++)
				{
					if(seatStatus[j] == 1)
					{
						tempDistance2 = Math.abs(tempIdx-j);
						break;
					}
					
				}
				
				if(tempDistance1 > tempDistance2)
					distance[i] = tempDistance2;
				else
					distance[i] = tempDistance1;
				
				tempDistance1 = 0;
				tempDistance2 = 0;
			}
		}
		
		for(int i=0; i<distance.length; i++)
		{
			if(i==0)
				maxDistance = distance[i];
			else 
			{
				if(distance[i]>maxDistance)
				{
					maxDistance = distance[i];
					seatIdx = i;
				}
			}
			System.out.print(distance[i] + " ");
		}
		System.out.println();
		System.out.println(seatIdx);
		
	}
}
