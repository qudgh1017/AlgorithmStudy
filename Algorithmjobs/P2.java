package git.AlgorithmStudy.Algorithmjobs;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String cardItems = scanner.nextLine();
		int card1 = Integer.parseInt(cardItems.split(" ")[0]);
		int card2 = Integer.parseInt(cardItems.split(" ")[1]);
		int card3 = Integer.parseInt(cardItems.split(" ")[2]);
		
		int min1;
		int min2;
		int min3;
		
		int k = scanner.nextInt();
		
		String[] card = new String[6];
		
		if(card1<card2)
		{
			if(card1<card3)
			{
				if(card2<card3)
				{
					//card1 card2 card3
					min1 = card1;
					min2 = card2;
					min3 = card3;
				}
				else
				{
					//card1 card3 card2
					min1 = card1;
					min2 = card3;
					min3 = card2;
				}
			}
			else //card1>card3
			{
				//card3 card1 card2
				min1 = card3;
				min2 = card1;
				min3 = card2;
			}
		}
		else // card1>card2
		{
			if(card2<card3)
			{
				if(card1<card3)
				{
					//card2 card1 card3
					min1 = card2;
					min2 = card1;
					min3 = card3;
				}
				else
				{
					//card2 card3 card1
					min1 = card2;
					min2 = card3;
					min3 = card1;
				}
			}
			else //card2>card3
			{
				//card3 card2 card1
				min1 = card3;
				min2 = card2;
				min3 = card1;
			}
		}
		
		card[0] = min1 + " " + min2 + " " + min3;
		card[1] = min1 + " " + min3 + " " + min2;
		card[2] = min2 + " " + min1 + " " + min3;
		card[3] = min2 + " " + min3 + " " + min1;
		card[4] = min3 + " " + min1 + " " + min2;
		card[5] = min3 + " " + min2 + " " + min1;
		
		String result = card[k-1];
		System.out.println(result);
	}

}
