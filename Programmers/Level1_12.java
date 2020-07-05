//크레인 인형뽑기 게임
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
        //인형 뽑기
        for(int i=0; i<moves.length; i++)
        {
        	craneIdx = moves[i]-1;
        	
        	for(int j=0; j<board.length; j++)
        	{
        		doll = board[j][craneIdx];

        		// 인형뽑기 자리에 인형이 없을때 아무것도 안함
        		if(doll == 0)
        			continue;
        		
        		// 인형뽑기 자리에 인형이 있을 때 
        		else
        		{
        			// 바구니에 인형 없을 때(처음)
        			if(stack.isEmpty())
        			{
    					stack.push(doll);
   	    				board[j][craneIdx]=0;
	    				break;
        				
        			}
        			// 바구니에 인형 있을 때
        			else
        			{
        				//바구니에 똑같은거 있는지 확인
        				if(stack.peek()==doll)
        				{
        					stack.push(doll);
        					stack.pop();
        					answer++;
        					stack.pop();
        					answer++;
        				}
        				// 바구니에 똑같은거 없으면 추가
        				else
        				{
        					stack.push(doll);
        				}
        				
        				//인형뽑기상자에서 지우기
        				board[j][craneIdx]=0;
        				break;
        			}
        		}
        	}
        }
        
        return answer;
    }

}
