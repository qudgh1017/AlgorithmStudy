package git.AlgorithmStudy.Algorithmjobs;

import java.util.Scanner;

// 놀이공원
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String items = scanner.nextLine();
		
		int groupCnt = Integer.parseInt(items.split(" ")[0]);
		int ticketRoomCnt = Integer.parseInt(items.split(" ")[1]);
		int[] ticketRoomSum = new int[ticketRoomCnt];
		int guestCnt;
		int min = 0;
		int minIdx = 0;
		int max = 0;
		
		for(int i=0; i<groupCnt; i++)
		{
			guestCnt = scanner.nextInt();
			
			if(i < ticketRoomSum.length)
			{
				ticketRoomSum[i] = guestCnt;
			}
			else
			{
				//최소값인 ticketRoomSum[i]에 더해주기
				for(int j=0; j<ticketRoomSum.length; j++)
				{
					if(j==0)
					{
						minIdx = j;
						min = ticketRoomSum[j];
					}
					else
					{
						if(min > ticketRoomSum[j])
						{
							minIdx = j;
							min = ticketRoomSum[j];
						}
					}
				}
				ticketRoomSum[minIdx] += guestCnt;
			}
		}
		
		//max ticketRoomSum
		for(int i=0; i<ticketRoomSum.length; i++)
		{
			if(i==0)
				max = ticketRoomSum[i];
			else
			{
				if(max < ticketRoomSum[i])
					max = ticketRoomSum[i];
			}
		}
		
		System.out.println(max);
	}

}
