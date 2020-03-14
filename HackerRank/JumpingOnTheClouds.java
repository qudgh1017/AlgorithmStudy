package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class JumpingOnTheClouds {

	static int jumpingOnClouds(int[] c) {
		int minimum = 0;
		int i = 0;
		
		while(true) {
			if(i+2 >= c.length) {
				if(i+1 >= c.length) {
					break;
				}else {
					minimum++;
					break;
				}
			}
			if(c[i+2] != 1) {
				minimum++;
				i += 2;
			}
			else if(c[i+1] != 1) {
				minimum++;
				i++;
			}
		}
		
		return minimum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		input.nextLine();
		
		int[] c = new int[n];
		
		String[] sc = input.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			c[i] = Integer.parseInt(sc[i]);
		}
		
		System.out.println(jumpingOnClouds(c));
	}

}
