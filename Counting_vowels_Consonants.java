//counting vowels & consonants

package assignment3;

import java.util.Scanner;

public class Counting_vowels_Consonants
{
  public static void main(String[] args)
  {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Please enter the string only from A to Z, not numbers ");
	  String s=sc.nextLine();
	  
	  
	  s=s.replaceAll(" ", "");
	
	  s=s.toLowerCase();
	 
	
	  int vowels=0;
	  int consonants=0;
	  for(int i=0;i<s.length();i++)
	  {
		if(s.charAt(i)=='a' ||s.charAt(i)=='e'||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u') 
		{
			vowels++;
		}
		else
			consonants++;
		
	 }
	  
	 System.out.println("Number of vowels are : "+vowels); 
	 System.out.println("Number of cononants are : "+consonants);
		  
	  
  }
	
}
