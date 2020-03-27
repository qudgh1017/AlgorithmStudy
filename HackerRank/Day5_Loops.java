package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Day5_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
		scanner.close();
	}

}
