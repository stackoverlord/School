package cds.chapters.ch5.Card;

public class Card 
{
	//String constructor
	public Card(String notation)
	{
		symbol = notation.charAt(0);
		suit = notation.charAt(1);
	}
	//double constructor
	public Card(int nummer, String suitsyou)
	{
		number = nummer;
		suit = suitsyou.charAt(0);
	}
	//method for un-abbreviating
	public void crackNotation()
	{
		switch(Character.toLowerCase(suit))
		{
		case 'h': suitanswer = "Hearts";	break;
		case 'c': suitanswer = "Clubs";		break;
		case 'd': suitanswer = "Diamonds";	break;
		case 's': suitanswer = "Spades";	break;
		}
		if(number != 0)
			{
			if(number >= 2)
			{
				switch(number)
				{
			case 2: answer = "Two of " + suitanswer;	break;
			case 3: answer = "Three of " + suitanswer;	break;
			case 4: answer = "Four of " + suitanswer;	break;
			case 5: answer = "Five of " + suitanswer;	break;
			case 6: answer = "Six of " + suitanswer;	break;
			case 7: answer = "Seven of " + suitanswer;	break;
			case 8: answer = "Eight of " + suitanswer;	break;
			case 9: answer = "Nine of " + suitanswer;	break;
			case 10: answer = "Ten of " + suitanswer;	break;
				}
			}	
		}
		else
		{
			switch(symbol)
			{
			case 'a': answer = "Ace of " + suitanswer;	break;
			case 'j': answer = "Jack of " + suitanswer;	break;
			case 'q': answer = "Queen of " + suitanswer;break;
			case 'k': answer = "King of " + suitanswer;	break;
			}
		}
	}
	//method for returning previous method
	public String getDescription()
	{
		return answer;
	}
	//instance fields
	private int number;
	private char symbol;
	private char suit;
	private String answer;
	private String suitanswer;
}