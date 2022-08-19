//reverse a sentence while preserving the position.

package assignment3;

public class Reverse_sentence
{
	public static void main(String[] args)
	{
		String sen="Think Twice" ;
		System.out.println("Input: "+sen);
		//convert the words into lowercase
		String sen1=sen.toLowerCase();
		
		
		//split the words in the sentence
		String[] words = sen1.split(" ");
		
		System.out.print("Output: ");
		for(int i=words[0].length()-1;i>=0;i--)
		{
			char c1= words[0].charAt(i);
			System.out.print(c1);
		}
		
		System.out.print(" ");
		
		for(int i=words[1].length()-1;i>=0;i--)
		{
			char c2= words[1].charAt(i);	
			System.out.print(c2);
		}
		
		
	}
	
	
	
}
