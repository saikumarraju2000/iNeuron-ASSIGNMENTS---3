//sorting string alphabetically
package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_string_alphabetically

{
  public static void main(String[] args) 
  {
	  Scanner sc= new Scanner (System.in);
	  System.out.println("Please enter String");
	  String S1=sc.nextLine();
	  
	    //removing spaces
	    S1=S1.replaceAll(" ", "");
	 
	    System.out.println("String before sorting == "+ S1);
	 
	    //converting to array
		char[] S2=S1.toCharArray();
		
	    //sorting
		Arrays.sort(S2);
		System.out.print("String After sorting alphabetically == ");
		for(int i=0;i<S1.length();i++)
		{
			System.out.print(S2[i]+" ");
		}		  
  }
	
}
