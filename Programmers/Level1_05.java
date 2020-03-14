//시저 암호
package git.AlgorithmStudy.Programmers;

public class Level1_05 {

	public static void main(String[] args) {
		
		String s = "a B z";
		int n = 4;
		
		Level1_05 l1 = new Level1_05();
		
		l1.solution(s, n);
	}
	
	public String solution(String s, int n) {
	    String answer = "";
	    char[] sAlpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
	    		'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	    char[] dAlpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 
	    		'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	    
	    int[] idx = new int[s.length()];
	    
	    //idx에 위치 저장
	    for(int i=0; i<s.length(); i++) {
	    	if(s.charAt(i)==' ') { //개행문자 일때 idx값(-1)
	    		idx[i] = -1;
	    	}else { // 그외 소문자 또는 대문자 일때
	    		for(int j=0; j<sAlpha.length; j++) { 
	    			if(sAlpha[j] == s.charAt(i)) {//소문자 일때 idx값 (0~25)
	    				idx[i] = j;
	    			}else if(dAlpha[j] == s.charAt(i)) { //대문자일때 idx값 (100~125)
	    				idx[i] = 100 + j;
	    			}
		    	}
	    	}
	    }
	    
	    //char형으로 다시 저장(+ n값 고려해서)
	    char[] pwd = new char[idx.length];
	    for(int i=0; i<pwd.length; i++) {
	    	if(idx[i]==-1) { //개행 문자일 때
	    		pwd[i] = ' ';
	    	}else if(idx[i]>=0 && idx[i]<100) { //소문자일 때
	    		pwd[i] = sAlpha[(idx[i]+n)%26];
	    	}else if(idx[i]>=100) { //대문자 일때
	    		pwd[i] = dAlpha[(idx[i]-100+n)%26];	    		
	    	}
	    }
	    
	    //문자열에 char배열 저장
	    for(int i=0; i<pwd.length; i++) {
	    	answer+=pwd[i];
	    }
	    
	    System.out.println(pwd);
	    
	    return answer;
	}

}
