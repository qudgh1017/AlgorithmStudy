package git.AlgorithmStudy.Baekjoon;
import java.util.Scanner;

public class P2588 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int b1 = b%10;
        int b10 = ((b%100)-b1)/10;
        int b100 = b/100;
        
        int temp3 = a * b1;
        int temp4 = a * b10;
        int temp5 = a * b100;
        
        System.out.println(temp3);
        System.out.println(temp4);
        System.out.println(temp5);
        System.out.println(a*b);
        
      
        
    }
}