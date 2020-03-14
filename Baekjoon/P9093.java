package git.AlgorithmStudy.Baekjoon;

import java.util.*;

public class P9093 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num = Integer.parseInt(input.nextLine());
		
		Stack<Character> stack = new Stack<Character>();
		String sentence;
		String result;
		int len, size;
		
		for(int i=0; i<num; i++) {
			
			sentence = input.nextLine() + "\n";
			len = sentence.length();
			
			for(int j=0; j<len; j++) {
				
				if(sentence.charAt(j) == ' ' || sentence.charAt(j) == '\n') {
					
					size = stack.size();
					for(int k=0; k<size; k++) {
						System.out.print(stack.pop());						
					}
					if(stack.empty()) {
						System.out.print(" ");
					}
					
				}else {
					stack.push(sentence.charAt(j));
				}
			}
		}

	}

}
