package git.AlgorithmStudy.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Stack<Character> left = new Stack<Character>();
		Stack<Character> right = new Stack<Character>();
		
		for(int i=0; i<s.length(); i++) {
			left.push(s.charAt(i));
		}
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			String[] line = br.readLine().split(" ");
			
			if(line[0].equals("L")) {
				if(!left.empty()) {
					right.push(left.pop());
				}
			}else if(line[0].equals("D")) {
				if(!right.empty()) {
					left.push(right.pop());
				}
			}else if(line[0].equals("B")) {
				if(!left.empty()) {
					left.pop();
				}
			}else if(line[0].equals("P")) {
				left.push(line[1].charAt(0));
			}
		}
		
		while(!left.empty()) {
			right.push(left.pop());
		}
		StringBuilder sb = new StringBuilder();
		while(!right.empty()) {
			sb.append(right.pop());
		}
		
		System.out.print(sb);
	}

}
