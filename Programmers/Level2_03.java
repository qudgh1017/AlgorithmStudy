//������ ǥ��(���ӵǴ� �ڿ������ n�� ǥ���ϴ� ����� �� ���ϱ�)
package git.AlgorithmStudy.Programmers;

public class Level2_03 {

	public static void main(String[] args) {
		Level2_03 l2 = new Level2_03();
		l2.solution(15);
	}
	
	public int solution(int n) {
		int answer = 0; //����� ��
		int sum = 0;
		
		//1���� n������ �غ���
		for(int i=1; i<=n; i++) {
			sum=0;
			
			//j�� i���� ����
			int j=i;
			while(n>=sum) { //sum�� �� ũ�� ���� ������
				sum += j;
				j++;
				
				if(n==sum) // ������ ����� �� 1 ����
					answer++;
			}
		}
		System.out.println(answer);
		
		return answer;
	}
	
}
