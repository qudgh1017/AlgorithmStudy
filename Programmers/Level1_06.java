//자릿수 더하기
package git.AlgorithmStudy.Programmers;

public class Level1_06 {

	public static void main(String[] args) {
		
		Level1_06 l1 = new Level1_06();
		
		System.out.println(l1.solution(987));
	}
	
	public int solution(int n) {
        int answer = 0;
        
        while(true) {
        	answer += (n%10);
        	n /= 10;
        	
        	if(n==0)
        		break;
        }
        
        return answer;
    }

}
