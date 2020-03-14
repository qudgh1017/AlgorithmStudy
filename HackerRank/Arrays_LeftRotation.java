package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Arrays_LeftRotation {
	
	static int[] rotLeft(int[] a, int d) {
		int[] result = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			int idx = (i-d+a.length) % a.length;
			result[idx] = a[i];
		}
		
		
		return result;
    }
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner input = new Scanner(System.in);
		
		String[] nd = input.nextLine().split(" ");
		int n = Integer.parseInt(nd[0]);
		int d = Integer.parseInt(nd[1]);

		int[] a = new int[n];
		
		String[] aItems = input.nextLine().split(" ");
		
		for(int i=0; i<n; i++) {
			int aItem = Integer.parseInt(aItems[i]);
			a[i] = aItem;
		}
		
		int[] result = rotLeft(a, d);
		
		for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        input.close();
	}

}
