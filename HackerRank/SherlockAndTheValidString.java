package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndTheValidString {

	// 히든케이스 하나 통과 못함..........
	static String isValid(String s) {
		String result = "";
		HashMap<Character, Integer> map = new HashMap<>();
		
		if(s.length() == 1) {
			result = "YES";
			
			
		}else {
			for(int i=0; i<s.length(); i++) {
				char key = s.charAt(i);
				if(!map.containsKey(key)) {
					map.put(key, 1);				
				}else {
					map.put(key, (map.get(key)+1));
				}
			}
			
			boolean firstCheck = true;
			int temp = 0;
			int cnt = 0;
			
			for(Map.Entry<Character, Integer> entry: map.entrySet()) {
				
				if(firstCheck) {
					temp = entry.getValue();
					cnt++;
					firstCheck = false;
					continue;
				}else {
					if(temp==entry.getValue()) {
						cnt++;
					}else {
						;
					}
				}
			}
			
			if(Math.abs(cnt-map.size())==0 || Math.abs(cnt-map.size())==1) {
				result = "YES";
			}else {
				result = "NO";
			}
			
		}

		return result;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = scanner.nextLine();

        String result = isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        
	}

}
