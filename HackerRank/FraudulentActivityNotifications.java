package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FraudulentActivityNotifications {

	static int activityNotifications(int[] expenditure, int d) {
		int notiCnt = 0;
		int[] lookbackExpenditure = new int[d];
		float median = 0;
		float trigger = 0;
		int todayExpenditure = 0;
		
		//time out 남.............
		for(int i=0; i<expenditure.length-lookbackExpenditure.length; i++) {
			
			for(int j=0; j<lookbackExpenditure.length; j++) {
				lookbackExpenditure[j] = expenditure[j+i];
			}
			Arrays.sort(lookbackExpenditure);
			
			// d 짝수
			if(d%2==0) {
				// median, trigger 구하기
				int idx = lookbackExpenditure.length/2;
				median = (float) ((lookbackExpenditure[idx-1] + lookbackExpenditure[idx])/2.0);
				trigger = median*2;
				
			}else { //d 홀수
				// median, trigger 구하기
				int idx = lookbackExpenditure.length/2;
				median = lookbackExpenditure[idx];
				trigger = median*2;
			}
			
			todayExpenditure = expenditure[lookbackExpenditure.length+i];
			
			if(todayExpenditure >= trigger) {
				notiCnt ++;
			}
		}

		return notiCnt;
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] nd = scanner.nextLine().split(" ");
        
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];


        String[] expenditureItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
	}

}
