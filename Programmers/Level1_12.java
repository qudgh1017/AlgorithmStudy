//ũ���� �����̱� ����
package git.AlgorithmStudy.Programmers;

import java.util.Stack;

public class Level1_12 {

	public static void main(String[] args) {
		
		//00~04
		//10~14
		//20~24
		//30~34
		//40~44
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
	
		System.out.println(solution(board, moves));
		
	}
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<Integer>();
        
        int craneIdx; 
        int doll=-1;
        //���� �̱�
        for(int i=0; i<moves.length; i++)
        {
        	craneIdx = moves[i]-1;
        	
        	for(int j=0; j<board.length; j++)
        	{
        		doll = board[j][craneIdx];

        		// �����̱� �ڸ��� ������ ������ �ƹ��͵� ����
        		if(doll == 0)
        			continue;
        		
        		// �����̱� �ڸ��� ������ ���� �� 
        		else
        		{
        			// �ٱ��Ͽ� ���� ���� ��(ó��)
        			if(stack.isEmpty())
        			{
    					stack.push(doll);
   	    				board[j][craneIdx]=0;
	    				break;
        				
        			}
        			// �ٱ��Ͽ� ���� ���� ��
        			else
        			{
        				//�ٱ��Ͽ� �Ȱ����� �ִ��� Ȯ��
        				if(stack.peek()==doll)
        				{
        					stack.push(doll);
        					stack.pop();
        					answer++;
        					stack.pop();
        					answer++;
        				}
        				// �ٱ��Ͽ� �Ȱ����� ������ �߰�
        				else
        				{
        					stack.push(doll);
        				}
        				
        				//�����̱���ڿ��� �����
        				board[j][craneIdx]=0;
        				break;
        			}
        		}
        	}
        }
        
        return answer;
    }

}
