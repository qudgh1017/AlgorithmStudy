//올바른 괄호
//스택 사용 가능 
package git.AlgorithmStudy.Programmers;

public class Level2_05 {

	public static void main(String[] args) {
		Level2_05 l2 = new Level2_05();
		l2.solution("(()(()()()()()))");
	}

	boolean solution(String s) {
		boolean answer = true;
		int check = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='(') check += 1;
			else check -= 1;
			if(check<0) return false;
		}
		
		if(check != 0) return false;
		
        return answer;
    }
	
}
