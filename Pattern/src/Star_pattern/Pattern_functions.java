package Star_pattern;

import java.util.Scanner;

public class Pattern_functions{
	   Scanner xyz=new Scanner(System.in);    //create object of scanner to take input from user
	   
	   /*************** pattern **********************************************************************/
  	   /*           *
  	   *           * *
	   *           * * *
	   *           * * * *
	   ***********************************************************************************************/
	   public void first() 
	   {
		 System.out.println("Enter row for pattern for first pattern");
	     int len1=xyz.nextInt();                 //Take integer as a input from user
	       
         for(int i=0;i<len1;i++)                //logic for pattern
           {
             for(int j=0;j<len1;j++)
               {
                 if(j<=i)
                  {
                    System.out.print("*");	 
                  }
               }
             System.out.println();   
           }
	   }
	   
	   /*  pattern
	    *           * * * *
	    *           * * *
	    *           * *
	    *           *
	    * */
	   
	   public void second()
	   {
		   System.out.println("Enter len for second pattern");  
		   int len=xyz.nextInt();        //Take integer as a input from user
		   
		   for(int i=0;i<len;i++)        //logic of patter
		   {
			   for(int j=0;j<len;j++)
			   {
				   if(j<=(len-1)-i)
				   {
					   System.out.print("*");
				   }
			   }
			   System.out.println();
		   }
		   xyz.close();                 //close the scanner object
	   }  
}
