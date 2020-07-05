package git.AlgorithmStudy.educast;

import java.util.Scanner;

//최댓값 찾기
public class printMax {

	public static void main(String[] args) {
		
		int myMax;
		int n;
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		int data[] = new int[n];
		
		// 입력
		for(int i=0; i<n; i++)
		{
			data[i] = input.nextInt();
		}
		
		// myMax 초깃값 설정
		myMax = data[0];
		
		// data와 myMax 비교하여 최댓값 구하기
		for(int i=1; i<n; i++)
		{
			if(data[i]>myMax)
				myMax = data[i];
		}
		System.out.println(myMax);
	}

}
