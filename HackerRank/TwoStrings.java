package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoStrings {

	static String twoStrings(String s1, String s2) {
		
		HashMap<Character, Integer> map = new HashMap<>();
		String result = "";
		
		for(int i=0; i<s1.length(); i++) {
			char key = s1.charAt(i);
			map.put(key, 1);
		}
		
		/*for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.print(entry.getKey() + ", " + entry.getValue());
			System.out.println();
		}*/
		
		for(int i=0; i<s2.length(); i++) {
			char key = s2.charAt(i);
			
			if(map.containsKey(key)) {
				result = "YES";
				break;
			}else {
				result = "NO";
			}
		}
		
		return result;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Scanner input = new Scanner(System.in);
		
		int p = input.nextInt();
		input.nextLine();
		
		for(int i=0; i<p; i++) {
			String s1 = input.nextLine();
			String s2 = input.nextLine();
			
			String result = twoStrings(s1, s2);
			bw.write(result);
			bw.newLine();
		}
		
		bw.close();
		input.close();
	}

}
