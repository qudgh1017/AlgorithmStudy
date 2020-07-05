package git.AlgorithmStudy.educast;

import java.util.Scanner;

public class RecursionForBruteForceAlpha {

	public static int MAX = 106;
	public static int n;
	public static int r;
	public static char[] result = new char[MAX];
	public static boolean[] check = new boolean[MAX];
	
	public static void getResult(int x) {
		// x번째 for문
		if(x >= r)
		{
			//출력
			System.out.println(result);
		}
		else
		{
			for(int i=0; i<n; i++)
			{
				char alpha = (char) (i + 'a');
				if(!check[i])
				{
					result[x] = alpha;
					check[i] = true;
					
					getResult(x+1);
					
					//x 번째에 i 넣는 것은 다 고려함
					check[i] = false;
					result[x] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		r = input.nextInt();
		
		getResult(0);
	}

}
