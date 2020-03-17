package git.AlgorithmStudy.HackerRank;

import java.util.Scanner;

public class Day2_Operators {
	
	static void solve(double meal_cost, int tip_percent, int tax_percent) {
		double totalCost;
		double tip;
		double tax;
		
		tip = meal_cost * tip_percent/100;
		tax = meal_cost * tax_percent/100;
		totalCost = meal_cost + tip + tax; 
		System.out.println(Math.round(totalCost));

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double meal_cost = scanner.nextDouble();
		scanner.nextLine();

        int tip_percent = scanner.nextInt();
        scanner.nextLine();

        int tax_percent = scanner.nextInt();
        scanner.nextLine();

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
	}

}
