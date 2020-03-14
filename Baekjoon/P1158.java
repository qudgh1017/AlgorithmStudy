package git.AlgorithmStudy.Baekjoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		
		while(queue.size()>0) {
			for(int i=0; i<k-1; i++) {
				queue.offer(queue.poll());
			}
			if(queue.size()==1) {
				sb.append(queue.poll() + ">");
			}else {
				sb.append(queue.poll() + ", ");				
			}
			
		}
		System.out.println(sb);

	}

}
