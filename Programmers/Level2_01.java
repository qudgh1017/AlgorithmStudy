//124 나라의 숫자

//##3진수인데 3을 안쓰는 문제, 3으로 나눠질때도 확인해 볼것
//다시 풀어볼 필요가 있는 문제!!!
package git.AlgorithmStudy.Programmers;

public class Level2_01 {

	public static void main(String[] args) {
		Level2_01 l2 = new Level2_01();
		
		l2.solution(15);
	}
	public String solution(int n) {
		
		String[] num = {"4", "1", "2"};
	    String answer = "";
	    
	    int rest;
	    // 나머지 0,1,2가 index값 되게
	    
	    do {
	    	rest = n % 3;
	    	
	    	//이부분을 추가하니까 됨... why?
	    	if(rest==0)
	    		n -= 1;
	    	
	    	answer = num[rest] + answer;
	    	if(n==3)
	    		break;
	    	n /= 3;
	    	
	    }while(n>0);
	    
	    System.out.println(answer);
	    
	    return answer;
	}
	
}
