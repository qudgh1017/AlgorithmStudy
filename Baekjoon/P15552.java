package git.AlgorithmStudy.Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P15552 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		int T = Integer.parseInt(br.readLine());
		
		int a, b;
		int sum;
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a + b;
			bw.write(sum + "\n"); //출력
		}
		
		bw.flush(); // 남아있는 데이터 모두 출력(버퍼 비우는 동작)
		bw.close(); // 스트림을 닫음

	}

}
