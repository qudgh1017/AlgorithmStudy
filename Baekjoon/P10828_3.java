package git.AlgorithmStudy.Baekjoon;

import java.util.*;

public class P10828_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        
        String cmd;
        for(int i=0; i<n; i++)
        {
        	cmd = sc.next();
        	if(cmd.equals("push"))
        	{
        		int num = Integer.parseInt(sc.next());
        		stack.push(num);
        	}
        	else if(cmd.equals("pop"))
        	{
        		if(stack.empty())
        			System.out.println("-1");
        		else
        			System.out.println(stack.pop());
        	}
        	else if(cmd.equals("size"))
        	{
        		System.out.println(stack.size());
        	}
        	else if(cmd.equals("empty"))
        	{
        		if(stack.empty())
        			System.out.println("1");
        		else
        			System.out.println("0");
        	}
        	else if(cmd.equals("top"))
        	{
        		if(stack.empty())
        			System.out.println("-1");
        		else
        			System.out.println(stack.peek());
        	}
        }

	}

}

