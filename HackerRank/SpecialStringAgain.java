package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class SpecialStringAgain {

	// timeout...
	static long substrCount(int n, String s) {
		int cnt = 0;
		String subStr = "";
		
		cnt += n; // 한 글자일 경우 추가
		
		for(int i = 2; i<=n; i++) {// 비교할 글자 갯수(2~글자 크기(n))
			
			for(int j=0; j<=n-i; j++) { // 비교 순서
				subStr = s.substring(j, j+i);
				
				//조건
				if(subStr.length()%2==0) 
				{
					boolean check = false;
					char temp = ' ';
					
					for(int k=0; k<subStr.length(); k++) {
						if(k==0) {
							temp = subStr.charAt(k);
							continue;
						}else {
							if(temp!=subStr.charAt(k)) {
								break;
							}else {
								;
							}
						}
						check = true;
					}
					if(check == true)
						cnt++;
				}
				else
				{
					boolean check = false;
					char temp = ' ';
					
					for(int k=0; k<subStr.length(); k++) {
						if(k==0) 
						{
							temp = subStr.charAt(k);
							continue;
						}
						else if(k==subStr.length()/2)
						{
							continue;
						}
						else 
						{
							if(temp!=subStr.charAt(k))
							{
								break;
							}
						}
						check = true;
					}
					if(check == true)
						cnt++;
				}
				
			}
		}
		return cnt;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scanner.nextInt();
        scanner.nextLine();
        
        String s = scanner.nextLine();

        long result = substrCount(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
	}

}
