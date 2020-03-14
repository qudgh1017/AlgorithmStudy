package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class CountingValleys {

	public static int countingValleys(int n ,String s) {
		
		int level = 0;
		int count = 0;
		boolean valleyCheck = false;
		
		for(int i=0; i<n; i++) {
			
			if(s.charAt(i) == 'U') {
				if(level == 0)
					valleyCheck = false;
				level++;
			}
			else if(s.charAt(i) == 'D') {
				if(level == 0)
					valleyCheck = true;
				level--;
			}
			else {
				continue;
			}
			
			if(valleyCheck == true && level == 0) {
				count++;
			}
			
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		String s = input.nextLine();

		System.out.println(countingValleys(n,s));
	}

}
