//가장 큰 정사각형 찾기
//한번 더 풀어보기 dp이용
package git.AlgorithmStudy.Programmers;

public class Level2_06 {

	public static void main(String[] args) {
		int [][] board = {
				{0,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{0,0,1,0}
		};
		Level2_06 l2 = new Level2_06();
		l2.solution(board);
	}
	
    public int solution(int [][]board)
    {
        int answer = 0;
        int max = 0;
        
        if(board.length<=1 || board[0].length<=1) {
        	for(int i=0; i<board.length; i++) {
        		for(int j=0; j<board[0].length; j++) {
        			if(board[i][j]==1) {
        				max = 1;
        			}
        		}
        	}
        }else {
        	for(int i=1; i<board.length; i++) {
        		for(int j=1; j<board[i].length; j++) {
        			if(board[i][j]==1) {
        				board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]), board[i-1][j-1]) + 1;
        				if(board[i][j]>max)
        					max = board[i][j];
        			}
        		}
        	}
        }
        answer = (int) Math.pow(max, 2);
        
        return answer;
    }
	
}
