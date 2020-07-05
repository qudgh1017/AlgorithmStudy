package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

public class P9012_2 {
	
	public static String isValidPS(String ps) {
		
		String result = "";
		int len = ps.length();
		int cnt = 0;
		
		for(int i=0; i<len; i++)
		{
			if(ps.charAt(i) == '(')
				cnt++;
			else
				cnt--;
			
			if(cnt<0)
			{
				result = "NO";
				break;
			}
		}
		
		if(cnt==0)
			result = "YES";
		else
			result = "NO";
		
		return result;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t --> 0) {
			System.out.println(isValidPS(sc.next()));
		}
	}

}
