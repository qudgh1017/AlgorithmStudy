//Á¤¼ö Á¦°ö±Ù ÆÇº°
package git.AlgorithmStudy.Programmers;

public class Level1_08 {

	public static void main(String[] args) {
		
		Level1_08 l1 = new Level1_08();
		
		System.out.println(l1.solution(144));
	}
	
	public long solution(long n) {
	      long answer = 0;
	      
	      for(int i=1; i<Math.round(Math.sqrt(n))+1; i++) {
	    	  long temp = n;
	    	  temp /= i;
	    	  if(n == temp*temp) {
	    		  answer = (temp+1)*(temp+1); //Á¦°ö½Ã¿¡´Â Math.pow ¾²¸é µÊ
	    	  }else {
	    		  answer = -1;
	    	  }
	      }
	      
	      return answer;
	  }

}
