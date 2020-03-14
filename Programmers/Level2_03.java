//숫자의 표현(연속되는 자연수들로 n을 표현하는 방법의 수 구하기)
package git.AlgorithmStudy.Programmers;

public class Level2_03 {

	public static void main(String[] args) {
		Level2_03 l2 = new Level2_03();
		l2.solution(15);
	}
	
	public int solution(int n) {
		int answer = 0; //방법의 수
		int sum = 0;
		
		//1부터 n번까지 해보기
		for(int i=1; i<=n; i++) {
			sum=0;
			
			//j는 i부터 시작
			int j=i;
			while(n>=sum) { //sum이 더 크면 조건 끝내기
				sum += j;
				j++;
				
				if(n==sum) // 같으면 방법의 수 1 증가
					answer++;
			}
		}
		System.out.println(answer);
		
		return answer;
	}
	
}
