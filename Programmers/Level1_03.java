// ���� ���ڴ� �Ⱦ�
package git.AlgorithmStudy.Programmers;

public class Level1_03 {

	public static void main(String[] args) {
		
		Level1_03 l1 = new Level1_03();
		int[] arr = {1, 1, 3, 3, 3, 0, 1, 1, 2, 0};
		
		for(int n : l1.solution(arr)) {
			System.out.print(n);
		}
	}

	public int[] solution(int[] arr) {
        int[] answer = new int[1000000];
        int cnt=0;
        
        for(int i=0; i<arr.length; i++) {
        	
        	if(i==0) { //ó��
        		answer[cnt] = arr[i];
        	}else {
        		if(answer[cnt]!=arr[i]) {//�ٸ� ��
        			cnt++;
        			answer[cnt] = arr[i];
        		}
        	}
        }
        int[] answer2 = new int[cnt+1];
        
        for(int i=0; i<answer2.length; i++) { //ũ�⸸ŭ ����
        	answer2[i] = answer[i];
        }

        return answer2;
	}

}
