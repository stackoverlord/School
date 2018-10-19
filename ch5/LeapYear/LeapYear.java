package cds.chapters.ch5.LeapYear;
import java.io.FileNotFoundException;

public class LeapYear {
	
	public LeapYear() throws FileNotFoundException
	{
		
	}
	public void yearcalc(int year) 
	{
		if (year <= 1582)
		{
			if (year % 4 == 0)
			{
				System.out.println(year + " is a leap year.");
			}
			else
			{
				System.out.println(year + " is not a leap year.");
			}
		}
		else
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					System.out.println(year + " is a leap year.");
				}
				else
				{
					System.out.println(year + " is not a leap year.");
				}
			}
			else
			{
				if (year % 400 == 0 || year % 4 == 0)
				{
					System.out.println(year + " is a leap year.");
				}
				else
				{
					System.out.println(year + " is not a leap year.");
				}
			}
		}
	}
}
