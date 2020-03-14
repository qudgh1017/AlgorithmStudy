//핸드폰 번호 가리기
package git.AlgorithmStudy.Programmers;

public class Level1_10 {

	public static void main(String[] args) {
		
		Level1_10 l1 = new Level1_10();
		
		l1.solution("01033334444");
	}

	public String solution(String phone_number) {
	    String answer = "";
	    char[] temp = new char[phone_number.length()-4];
	    
	    for(int i=0; i<temp.length; i++) {
	    	temp[i] = '*';
	    	answer += temp[i];
	    }
	    
	    for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
	    	answer += phone_number.charAt(i);
	    }
	    
	    return answer;
	}
}
