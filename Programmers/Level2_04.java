//JadenCase ���ڿ� �����
// ���ڱ��� �ٸ������� split�� ó������ �ѱ��ڷ� �����ִ°��� ����!!!
package git.AlgorithmStudy.Programmers;

public class Level2_04 {

	public static void main(String[] args) {
		Level2_04 l2 = new Level2_04();
		l2.solution("3people unFollowed me ");
	}
	
	 public String solution(String s) {
		 String answer = "";
		 int len = s.length();
		 
		 String[] ss = s.split(" ");
		 String[][] sss = new String[ss.length][];
		 
		 //�ѱ��ھ� �����ֱ�
		 for(int i=0; i<ss.length; i++) {			 
			 sss[i] = ss[i].split("");
		 }
		 
		 for(int i=0; i<sss.length; i++) {
			 for(int j=0; j<sss[i].length; j++) {
				 if(j==0)
					 answer += sss[i][j].toUpperCase();
				 else
					 answer += sss[i][j].toLowerCase();
			 }
			 if(i<sss.length-1)
				 answer+=" ";
		 }
		 
		 //���� ���� �ٸ���
		 if(len>answer.length()) {
			 for(int i=0; i<len-answer.length(); i++) {
				 answer+=" ";
			 }
		 }
		 System.out.println(answer);
		 
	     return answer;
	 }
	
}
