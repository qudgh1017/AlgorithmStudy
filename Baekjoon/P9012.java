package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

public class P9012 {
	
	public static String isValidPS(String ps) {
		
		int n = ps.length();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(ps.charAt(i) == '(') {
				cnt ++;
			}else {
				cnt --;
			}
			
			if(cnt < 0) {
				return "NO";
			}
		}
		
		if(cnt == 0) {
			return "YES";
		}else {
			return "NO";
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t --> 0) {
			System.out.println(isValidPS(sc.next()));
		}
	}

}
