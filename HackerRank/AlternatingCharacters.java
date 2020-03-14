package git.AlgorithmStudy.HackerRank;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class AlternatingCharacters {

	static int alternatingCharacters(String s) {
		int minimum = 0;
		char buf = ' ';
		
		for(int i=0; i<s.length(); i++) {
			
			if(i==0) {
				buf = s.charAt(i);
			}else {
				if(buf != s.charAt(i)) {
					buf = s.charAt(i);
				}else {
					minimum++;
				}
			}
		}

		return minimum;
    }
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int q = scanner.nextInt();
		scanner.nextLine();
		
		for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.close();

        scanner.close();
	}

}
