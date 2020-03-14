package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

public class P10845 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] queue = new int[n];
		int front = 0;
		int back = 0;
		
		while(n-->0) {
			String command = sc.next();
			
			if(command.equals("push")){
				int num = sc.nextInt();
				queue[back] = num;
				back += 1;
				
			}else if(command.equals("pop")){
				if(front == back) {
					System.out.println("-1");
				}else {
					System.out.println(queue[front]);
					queue[front] = 0;
					front += 1;
				}
				
			}else if(command.equals("size")){
				int size = back - front;
				System.out.println(size);
				
			}else if(command.equals("empty")){
				if(back == front)
					System.out.println("1");
				else {
					System.out.println("0");
				}
				
			}else if(command.equals("front")){
				if(queue[front] == 0) {
					System.out.println("-1");
				}else {
					System.out.println(queue[front]);
				}
				
			}else if(command.equals("back")){
				if(front == back) {
					System.out.println("-1");
				}else {
					System.out.println(queue[back-1]);
				}
			}
		}

	}

}
