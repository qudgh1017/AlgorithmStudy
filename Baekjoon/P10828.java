package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

public class P10828 {

	static int[] stack = new int[10000];
	static int size = 0;

	
	public static void push(int data) {
		stack[size] = data;
		
		size ++;
	}
	
	public static void pop() {
		int data;
		
		if(size<=0) {
			System.out.println("-1");
		}else {
			data = stack[size-1];
			stack[size-1] = 0;
			
			size --;
			System.out.println(data);			
		}
		
	}
	
	public static void size() {
		System.out.println(size);
	
	}
	
	public static void empty() {
		
		if(size <= 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
	
	public static void top() {
		
		int data;
		if(size <= 0) {
			System.out.println("-1");
		}else {
			data = stack[size-1];
			System.out.println(data);
		}
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String command;
		int data;
		
		
		for(int i=0; i<n; i++) {
			command = sc.next();
			
			switch (command) {
				case "push":
					data = sc.nextInt();
					push(data);
					break;
				
				case "pop":
					pop();
					break;
				
				case "size":
					size();
					break;
				
				case "empty":
					empty();
					break;
					
				case "top":
					top();
					break;
					
				default:
					break;
			}
					
		}

	}

}
