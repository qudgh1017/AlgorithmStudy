//���� ū ����
//Integer.bitCount() ����غ���!
package git.AlgorithmStudy.Programmers;

public class Level2_02 {

	public static void main(String[] args) {

		Level2_02 l1 = new Level2_02();
		l1.solution(15);
	}
	
	public int solution(int n) {
		int temp = n;
		int cnt1 = 0; //2������ ��ȯ���� �� 1�� ����
		
		while(temp>0) {
			if(temp%2 == 1) {
				cnt1++;
			}
			temp /= 2;
		}
		
		int cnt2 = 0;
		int answer = n;
		
		while(cnt2!=cnt1) {
			answer++;
			temp = answer;
			cnt2=0;
			
			while(temp>0) {
				if(temp%2 == 1) {
					cnt2++;
				}
				temp /= 2;
			}
		}
		
		return answer;
	}
	
}
