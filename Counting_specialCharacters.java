//Counting special characters program

package assignment3;

import java.util.Scanner;

public class Counting_specialCharacters 
{
   public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string");
		String s= sc.nextLine();
		s=s.replaceAll(" ", "");
		
		int value=0;
		 
		for(int i=0;i<s.length();i++)
		{
			int value1=s.codePointAt(i);
			//32–47 / 58–64 / 91–96 / 123–126
			if (value1>=32 && value1<=47 || value1>=58 && value1<=64 || value1>=91 && value1<=96 || value1>=123 && value1<=126)
			{
				value++;
			}
		}
		System.out.println("The number of special characters in your string are : "+value);
		
		
	}
}
