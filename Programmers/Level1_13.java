package git.AlgorithmStudy.Programmers;

import java.util.Stack;

//2018 kakao > [1��] �������
/*
 * ������� ��ȣ �ص�
 * ����1==�� || ����2==�� �� ��ü ���������� ��
 * ����1==���� && ����2==���� �� ��ü �������� ����
 */
public class Level1_13 {

	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		String[] answer = new String[n];
	
		answer = solution(n, arr1, arr2);
		for(int i=0; i<n; i++)
		{
			System.out.println(answer[i]);
		}
		
		
	}
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        String result1 = "";
        String result2 = "";
        for(int i=0; i<n; i++)
        {
        	// arr1 2���� ��ȯ
        	result1 = Integer.toBinaryString(arr1[i]);
        	if(result1.length()<n)
        	{
        		int m = n-result1.length();
        		for(int j=0; j<m; j++)
        		{
        			result1 = "0" + result1;
        		}
        	}
        		
        	// arr2 2���� ��ȯ
        	result2 = Integer.toBinaryString(arr2[i]);
        	if(result2.length()<n)
        	{
        		int m = n-result2.length();
        		for(int j=0; j<m; j++)
        		{
        			result2 = "0" + result2;
        		}
        	}
        		
        	// ���ؼ� answer ����
        	answer[i]="";
        	for(int j=0; j<n; j++)
        	{
        		// �Ѵ� �����̸� ����
        		if(result1.charAt(j) == '0' && result2.charAt(j)=='0')
        			answer[i] += " ";
        		// �� �� �ϳ��� ���̸� ��
        		else if(result1.charAt(j) == '1' || result2.charAt(j)=='1')
        			answer[i] += "#";
        			
        	}
        }
        return answer;
    }

}
