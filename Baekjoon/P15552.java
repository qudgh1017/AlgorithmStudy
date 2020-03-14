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
			bw.write(sum + "\n"); //���
		}
		
		bw.flush(); // �����ִ� ������ ��� ���(���� ���� ����)
		bw.close(); // ��Ʈ���� ����

	}

}
