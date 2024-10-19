package Sathaguru_product_Solutions_Interview_Questions_Answers;

import java.util.ArrayList;
import java.util.List;

public class DistinctCharactersUsingList {
public static void main(String[] args) {
	String input="HELLO WORLD";
	List<Character>distinctChars=new ArrayList<>();
	for(char c:input.toCharArray())
	{
		if(c!=' '&&!distinctChars.contains(c))
		{
			distinctChars.add(c);
		}
	}
	System.out.println("Characters used in the input text: ");
	for(char c:distinctChars)
	{
		System.out.print(c+" ");
	}
	System.out.println("\nTotal Number of Characters: "+distinctChars.size());

}
}
