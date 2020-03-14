package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MarksAndToys {

	static int maximumToys(int[] prices, int k) {

		int result = 0;
		int sum = 0;
		Arrays.sort(prices);
		
		for(int i=0; i<prices.length; i++) {
			
			sum += prices[i];
			
			if(k >= sum) {	
				result++;
			}else {
				break;
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner scanner = new Scanner(System.in);

		String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);

        int[] prices = new int[n];

        String[] pricesItems = scanner.nextLine().split(" ");
        
        for (int i = 0; i < n; i++) {
            int pricesItem = Integer.parseInt(pricesItems[i]);
            prices[i] = pricesItem;
        }

        int result = maximumToys(prices, k);
        
        bw.write(String.valueOf(result));
        bw.newLine();
        
        bw.close();
        scanner.close();
	}

}
