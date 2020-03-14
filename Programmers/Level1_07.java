//자연수 뒤집어 배열로 만들기
package git.AlgorithmStudy.Programmers;

public class Level1_07 {

	public static void main(String[] args) {
		
		Level1_07 l1 = new Level1_07();
		
		System.out.println(l1.solution(12345));
	}

	public int[] solution(long n) {
		long temp = n;
		int len = 0;
		
		//배열 크기 정해주기 위해서
		while(true) {
			temp/=10;
			len++;
			if(temp==0)
				break;
		}
		//배열 값 저장
		int i=0;
	    int[] answer = new int[len];
	    while(i<len) {
			answer[i] = (int) (n%10);
			n/=10;
			i++;
		}
	    
	    return answer;
	}
}
