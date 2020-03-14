//문자열 내 마음대로 정렬하기
package git.AlgorithmStudy.Programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Level1_04 {

	public static void main(String[] args) {
		String[] strings = {"san", "bad", "car"};
		int n = 1;
		
		Level1_04 l1 = new Level1_04();
		for(String s : l1.solution(strings, n)) {
			System.out.print(s + " ");
		}
	}
	
	public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];

		List<String> list = new LinkedList<String> ();
		
		for(int i=0; i<strings.length; i++) { //가장 앞에 인덱스 위치의 문자 추가
			list.add(strings[i].charAt(n) + strings[i]);
		}
		
		Collections.sort(list); // 글자 순 정렬
		
		for(int i=0; i<list.size(); i++) { //앞의 글자 떼어주기
			answer[i] = list.get(i).substring(1, list.get(i).length());
		}
		  
	    return answer;
	  }

}
