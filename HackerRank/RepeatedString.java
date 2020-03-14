package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		long acnt = 0;
		long totalCnt= 0;
		int index;
		boolean allAcheck = true;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != 'a') {
				allAcheck = false;
			}else {
				acnt++;
			}
		}
		
		if(allAcheck == true) {
			totalCnt = n;
			
		}else {
			totalCnt = (n / s.length()) * acnt;
			for(int i=0; i < n % s.length(); i++) {
				if(s.charAt(i)=='a') {
					totalCnt++;
				}
			}
		}
		
		return totalCnt;
    }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		long n = input.nextLong();
		
		System.out.println(repeatedString(s, n));

	}

}
