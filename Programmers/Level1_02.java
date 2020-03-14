//이상한 문자 만들기
package git.AlgorithmStudy.Programmers;

public class Level1_02 {

	public String solution(String s) {
	      String answer1 = "";
	      String answer2 = "";
	      //문장 단어로 나누기
	      String[] ss = s.split(" ");
	      
	      for(int i=0; i<ss.length; i++) {
	    	  answer1 = "";
	    	  
	    	  //단어 한글자씩 나누기
	    	  String[] sss = ss[i].split("");
	    	  
	    	  for(int j=0; j<sss.length; j++) {
	    		  
    			  if((j+1)%2 == 0) { 
    				  sss[j] = sss[j].toLowerCase();
    			  }else {
    				  sss[j] = sss[j].toUpperCase();
    			  }
    			  answer1 += sss[j];
	    	  }
	    	  answer2 += answer1;
	    	  if(i != ss.length-1) {
	    		  answer2 += " ";
	    	  }
	      }
	      
	      if(s.length()-answer2.length()>0) {
	    	  int len = s.length() - answer2.length();
	    	  for(int i=0; i<len; i++) {
	    		  answer2 += " ";
	    	  }
	      }
	      
	      return answer2;
	  }
	
	public static void main(String[] args) {

		Level1_02 l1 = new Level1_02();
		
		System.out.println(l1.solution("try hello world word fffffff   "));
		
	}

}
