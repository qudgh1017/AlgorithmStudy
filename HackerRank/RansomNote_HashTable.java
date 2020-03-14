package git.AlgorithmStudy.HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class RansomNote_HashTable {

	static void checkMagazine(String[] magazine, String[] note) {

		HashMap<String, Integer> magazineMap = new HashMap<>();
		HashMap<String, Integer> noteMap = new HashMap<>();
		
		for(int i=0; i<magazine.length; i++) {
			String key = magazine[i];
			
			if(magazineMap.containsKey(key)) {
				magazineMap.put(key, (magazineMap.get(key)+1));	
			}
			else 
			{
				magazineMap.put(key, 1);
			}
		}
		
		for(int i=0; i<note.length; i++) {
			String key = note[i];
			
			if(magazineMap.containsKey(key)) {
				
				if(magazineMap.get(key)-1 >= 0) {
					magazineMap.put(key, (magazineMap.get(key)-1));						
				}
				else {
					System.out.println("No");
					break;
				}
			}
			else 
			{
				System.out.println("No");
				break;
			}
			
			if(i==note.length-1) {
				System.out.println("Yes");
			}
		}

		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] mn = input.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = input.nextLine().split(" ");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = input.nextLine().split(" ");
        

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        input.close();
	}

}
