package Number_pattern;

import java.util.Scanner;

public class Number_pattern_function {
	Scanner xyz=new Scanner(System.in);  // create object of Scanner function to accept input from user
	
	public void number_first()
	{
		System.out.println("Enter row for pattern");
		int len=xyz.nextInt();	        // using object class take integer value as an input
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len;j++)
			{
				if(j<=i)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
}
