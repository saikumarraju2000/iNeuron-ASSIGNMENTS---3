//Repeatedly occurring characters in the given String program.
package assignment3;

import java.util.Scanner;

public class Repeated_string 
{

	public static void main(String argu[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the string");
	    String str = sc.nextLine();
	    //repalcing spaces 
	     str=str.replaceAll(" ", "");
	     str=str.toLowerCase();
	     char[] ch = str.toCharArray();


	      System.out.print("Repeatedly occurring Characters in above string are: ");
	      for (int i = 0; i < str.length(); i++)
	      {
	         for (int j = i + 1; j < str.length(); j++)
	         {
	            if (ch[i] == ch[j]) 
	            {
	             System.out.print(ch[j]+" ");
	               break;
	            }
	         }
	      }
	   
	    
	    
	   }
}