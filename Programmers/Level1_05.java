//���� ��ȣ
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
	    
	    //idx�� ��ġ ����
	    for(int i=0; i<s.length(); i++) {
	    	if(s.charAt(i)==' ') { //���๮�� �϶� idx��(-1)
	    		idx[i] = -1;
	    	}else { // �׿� �ҹ��� �Ǵ� �빮�� �϶�
	    		for(int j=0; j<sAlpha.length; j++) { 
	    			if(sAlpha[j] == s.charAt(i)) {//�ҹ��� �϶� idx�� (0~25)
	    				idx[i] = j;
	    			}else if(dAlpha[j] == s.charAt(i)) { //�빮���϶� idx�� (100~125)
	    				idx[i] = 100 + j;
	    			}
		    	}
	    	}
	    }
	    
	    //char������ �ٽ� ����(+ n�� ����ؼ�)
	    char[] pwd = new char[idx.length];
	    for(int i=0; i<pwd.length; i++) {
	    	if(idx[i]==-1) { //���� ������ ��
	    		pwd[i] = ' ';
	    	}else if(idx[i]>=0 && idx[i]<100) { //�ҹ����� ��
	    		pwd[i] = sAlpha[(idx[i]+n)%26];
	    	}else if(idx[i]>=100) { //�빮�� �϶�
	    		pwd[i] = dAlpha[(idx[i]-100+n)%26];	    		
	    	}
	    }
	    
	    //���ڿ��� char�迭 ����
	    for(int i=0; i<pwd.length; i++) {
	    	answer+=pwd[i];
	    }
	    
	    System.out.println(pwd);
	    
	    return answer;
	}

}
