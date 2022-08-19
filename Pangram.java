package assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class Pangram
{

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter string with only alphabets. Kindly dont enter numbers,special characters ");
		
		//taking input
		String s1= sc.nextLine();
		
		//converting to lowercase and removing spaces
		s1=s1.toLowerCase().replaceAll(" ", "");
		
		
		StringBuilder sb = new StringBuilder();
		//converting to charcter array
		char[] S1=s1.toCharArray();
		
		//boolean array converts the character to its numeric equivalent and checks for the value at this numeric index.
		boolean[] found = new boolean[256];
		
		//using for-each loop 
		for (char c : S1) {
		     if (!found[c]) {
		        found[c] = true;
		        sb.append(c);
		     }
		  }
		
		
		//converting string builder into string
	    s1=sb.toString();
		
		//converting string to character array
		S1=s1.toCharArray();
		//System.out.println(S1);
		
		//sorting the array
		Arrays.sort(S1);
		
		//creating PANGRAM string
		String s2="abcdefghijklmnopqrstuvwxyz";
		char[] S2=s2.toCharArray();
		
		//comparing the S2 array with PANGRAM string Array using if-else loop
		if(Arrays.equals(S1, S2)) {System.out.println("It is a Pangram.");}
		else System.out.println("It is not a Pangram, kindly remove special characters if u typed");
		
	}
}
