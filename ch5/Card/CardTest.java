package cds.chapters.ch5.Card;

import java.util.Scanner;
public class CardTest 
{
	public static void main(String[] args)
	{
		boolean test = false;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		String notation = console.next();
		switch(notation.charAt(0))
		{
		case '2': test = true;
		case '3': test = true;
		case '4': test = true;
		case '5': test = true;
		case '6': test = true;
		case '7': test = true;
		case '8': test = true;
		case '9': test = true;
		}
		if(notation.length() == 3)
		{
			if(notation.length() == 3 && notation.substring(0,2).equals("10")) 
			{
				Card note = new Card(10, notation.substring(2));
				note.crackNotation();
				System.out.println(note.getDescription());
			}
			else
				System.out.println("Wrong three numbers. Rerun program");
		}
		else if(notation.length() == 2)
		{
			String suit = notation.substring(1);
			String symbol = notation.substring(0,1);
			String rightsymbol1 = notation.toLowerCase();
			String rightsymbol2 = symbol.toLowerCase();
			String rightsuit = suit.toLowerCase();
			if(rightsuit.equals("c") || rightsuit.equals("d") || rightsuit.equals("h") || rightsuit.equals("s"))
			{
				if(test) 
				{
					Card note = new Card(Integer.parseInt(notation.substring(0, 1)), notation.substring(1));
					note.crackNotation();
					System.out.println(note.getDescription());
				}
				else
				{	
					Card note = new Card(rightsymbol1);
					note.crackNotation();
					System.out.println(note.getDescription());
				}
				if(!(rightsuit.equals("c") || rightsuit.equals("d") || rightsuit.equals("h") || rightsuit.equals("s")))
				{
				System.out.println("Suit is wrong. Rerun program");
				}
			}
		}
		else
		{
			System.out.println("Too little/many characters. Rerun program.");
		}
	}
}