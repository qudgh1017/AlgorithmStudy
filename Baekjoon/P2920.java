package git.AlgorithmStudy.Baekjoon;

import java.util.Scanner;

//À½°è

public class P2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String result = "";
		
		int[] arr = new int[8];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = input.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[0] == 1)
				result = "ascending";
			else if(arr[0] == 8)
				result = "descending";
			else
			{
				result = "mixed";
				break;
			}
			
			if(result.equals("ascending"))
			{
				if(arr[i] == i+1)
					continue;
				else
				{
					result = "mixed";
					break;
				}
			}
			else if(result.equals("descending"))
			{
				if(arr[i] == 8-i)
					continue;
				else
				{
					result = "mixed";
					break;
				}
			}
		}
		
		System.out.println(result);
	}

}
