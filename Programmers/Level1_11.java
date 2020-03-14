//x만큼 간격이 있는 n개의 숫자
package git.AlgorithmStudy.Programmers;

public class Level1_11 {

	public static void main(String[] args) {
		
		Level1_11 l1 = new Level1_11();
		
		l1.solution(-5, 3);
	}
	public long[] solution(int x, int n) {
	    long[] answer = new long[n];
	    for(int i=0; i<answer.length; i++) {
	    	answer[i] = (long)x*(i+1); //int i이므로 값 저장시 형변환 해줘야 한다...
	    }
	    
	    return answer;
	}

}
