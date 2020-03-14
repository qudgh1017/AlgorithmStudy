package git.AlgorithmStudy.Programmers;

import java.util.ArrayList;

public class Level1_09 {

	public static void main(String[] args) {
		
		Level1_09 l1 = new Level1_09();
		
		int[] arr = {4,3,2,1};
		l1.solution(arr);
	}
	public int[] solution(int[] arr) {
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    int min = Integer.MAX_VALUE;

	    //arrayList에 담기 & 최소값 찾기
	    for(int i=0; i<arr.length; i++) { 
	    	if(arr[i]<min) {
	    		min = arr[i];
	    	}
	    	al.add(arr[i]);
	    }
	    
	    //최소인 값 찾아서 삭제
	    for(int i=0; i<al.size(); i++) {
	    	if(min == al.get(i)) {
	    		al.remove(i);
	    	}
	    }
	    
	    //배열에 저장
	    if(al.size()==0) {
	    	int[] answer = new int[1];
	    	answer[0] = -1;
	    	return answer;
	    	
	    }else {
	    	int[] answer = new int[al.size()];
	    	for(int i=0; i<al.size(); i++) {
	    		answer[i] = al.get(i);
	    	}
	    	return answer;
	    }
	    
	    
	}

}
