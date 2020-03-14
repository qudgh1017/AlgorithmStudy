package git.AlgorithmStudy.Baekjoon;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P10866 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine(); //¾øÀ¸¸é ¾ÈµÊ
		
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		
		for(int i=0; i<n; i++) {
			String line = sc.nextLine();
			String[] command= line.split(" ");
			
			if(command[0].equals("push_front")) {
				int x = Integer.parseInt(command[1]);
				deque.offerFirst(x);
				
			}else if(command[0].equals("push_back")) {
				int x = Integer.parseInt(command[1]);
				deque.offerLast(x);
				
			}else if(command[0].equals("pop_front")) {
				if (deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollFirst());
				}
				
			}else if(command[0].equals("pop_back")) {
				if (deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.pollLast());
				}
				
			}else if(command[0].equals("size")) {
				System.out.println(deque.size());
				
			}else if(command[0].equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				
			}else if(command[0].equals("front")) {
				if (deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.peekFirst());
				}
				
			}else if(command[0].equals("back")) {
				if (deque.isEmpty()) {
					System.out.println("-1");
				}else {
					System.out.println(deque.peekLast());
				}
				
			}
	
		}

	}

}
