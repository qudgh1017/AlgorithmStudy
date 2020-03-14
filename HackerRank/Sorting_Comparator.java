package git.AlgorithmStudy.HackerRank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class Checker implements Comparator<Player> {

  	// complete this method
	public int compare(Player a, Player b) {
		
		if(a.score < b.score) 
		{
			return 1;
		}
		else if(a.score > b.score)
		{
			return -1;
		}
		else
		{
			return a.name.compareTo(b.name);
		}
    }
}

public class Sorting_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
            scan.nextLine();
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
	}

}
