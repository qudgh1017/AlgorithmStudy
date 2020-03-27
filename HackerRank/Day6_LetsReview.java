package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Day6_LetsReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		
		for(int i=0; i<t; i++) 
		{
			String s = scanner.nextLine();
			
			for(int j=0; j<s.length(); j++)
			{
				if(j%2==0)
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.print(" ");
			for(int j=0; j<s.length(); j++)
			{
				if(j%2==1)
				{
					System.out.print(s.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
