//124 ������ ����

//##3�����ε� 3�� �Ⱦ��� ����, 3���� ���������� Ȯ���� ����
//�ٽ� Ǯ� �ʿ䰡 �ִ� ����!!!
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
	    // ������ 0,1,2�� index�� �ǰ�
	    
	    do {
	    	rest = n % 3;
	    	
	    	//�̺κ��� �߰��ϴϱ� ��... why?
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
