package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;
import java.util.Stack;

//���� ����
public class P1874_1 {

	public static void solve(int[] arr) {
		
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int m = 0; // ���ÿ� �� ������ ��
		
		for(int i: arr)
		{
			if(i>m)
			{
				while(i>m)
				{
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}
			else
			{
				if(stack.peek() != i) {
					System.out.println("NO");
					return;
				}
				stack.pop();
				sb.append("-\n");
			}
		}
		
		System.out.println(sb);
	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = input.nextInt();
		}
		
		solve(arr);
	}

}
