package git.AlgorithmStudy.educast;

import java.util.Scanner;

//�ִ� ã��
public class printMax {

	public static void main(String[] args) {
		
		int myMax;
		int n;
		
		Scanner input = new Scanner(System.in);
		
		n = input.nextInt();
		int data[] = new int[n];
		
		// �Է�
		for(int i=0; i<n; i++)
		{
			data[i] = input.nextInt();
		}
		
		// myMax �ʱ갪 ����
		myMax = data[0];
		
		// data�� myMax ���Ͽ� �ִ� ���ϱ�
		for(int i=1; i<n; i++)
		{
			if(data[i]>myMax)
				myMax = data[i];
		}
		System.out.println(myMax);
	}

}
