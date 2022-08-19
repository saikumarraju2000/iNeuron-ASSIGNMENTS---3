//Anagram program

package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram
{
   public static void main(String[] args) 
   {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter 1st string ");
	String s1=sc.nextLine();
	s1=s1.replace(" ", "");
	
	System.out.println("Enter 2nd string ");
	String s2=sc.nextLine();
	s2=s2.replace(" ", "");  
	   
	   if(s1.length()==s2.length())
	   {
		char[] c1=s1.toLowerCase().toCharArray();
		char[] c2=s2.toLowerCase().toCharArray();
		
	      	Arrays.sort(c1);
		    Arrays.sort(c2);
		    
		    if(Arrays.equals(c1, c2))
		    {
		    	System.out.println("It is a Anagram");
		    }
		    
		    else System.out.println("It is not a anagram");
		
	   }
	   else System.out.println("Is is not a anagram because the two lengths are different");
	   
	   
	   
   }
	
}
