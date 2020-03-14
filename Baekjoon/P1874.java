package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class P1874 {

	public static void solve(int[] a) {
		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		int m = 0; //스택에 들어간 마지막 수
		StringBuilder sb = new StringBuilder();
		
		for(int x:a) {
			if(x > m) {
				while(x > m) {
					stack.push(++m);
					sb.append("+\n");
				}
				stack.pop();
				sb.append("-\n");
			}else {
				if(stack.peek() != x) {
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
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = input.nextInt();
		}
		
		solve(a);
	}

}
