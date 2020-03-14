package git.AlgorithmStudy.HackerRank;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringsMakingAnagrams {

	static int makeAnagram(String a, String b) {
		HashMap<Character, Integer> map = new HashMap<>();
		int cnt = 0;
		
		for(int i=0; i<a.length(); i++) {
			char key = a.charAt(i);
			
			if(map.containsKey(key)) {
				map.put(key, map.get(key)+1);
			}else {
				map.put(key, 1);				
			}
			
		}
		
		for(int i=0; i<b.length(); i++) {
			char key = b.charAt(i);
			
			if(map.containsKey(key)) {
				map.put(key, map.get(key)-1);
				
			}else {
				map.put(key, -1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()!=0) {
				cnt+=Math.abs(entry.getValue());
			}
		}
		
		return cnt;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();

        scanner.close();
        
	}

}
