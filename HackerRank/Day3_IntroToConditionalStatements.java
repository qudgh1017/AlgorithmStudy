package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Day3_IntroToConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		
		if(N%2==1)
			System.out.println("Weird");
		else
		{
			if(N>=2 && N<=5)
				System.out.println("Not Weird");
			else if(N>=6 && N<=20)
				System.out.println("Weird");
			else if(N>20)
				System.out.println("Not Weird");
				
		}
        

        scanner.close();
	}

}
