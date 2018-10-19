package cds.chapters.ch5.MaxMin;

public class MaxMin 
{
	
	public MaxMin()
	{
		
	}
	public void getmin()
	{
		
		int comp1 = string1.compareTo(string2);
		if (comp1 < 0)
		{
			str1 = true;
			str2 = false;
		}
		else
		{
			str1 = false;
			str2 = true;
		}
		int comp2 = string3.compareTo(string4);
		if (comp2 < 0)
		{
			str3 = true;
			str4 = false;
		}
		else
		{	
			str3 = false;
			str4 = true;
		}
		if (str3 == true && str2 == true)
		{
			int comp3 = string3.compareTo(string2);
			if (comp3 < 0)
			{
				str3 = true;
				str2 = false;
			}
			else
			{
				str3 = false;
				str2 = true;
			}
		}
		else if (str1 == true && str3 == true )
		{
			int comp4 = string1.compareTo(string3);
			if (comp4 < 0)
			{
				str1 = true;
				str3 = false;
			}
			else
			{
				str1 = false;
				str3 = true;
			}
		}
		else if (str2 == true && str4 == true)
		{
			int comp5 = string2.compareTo(string4);
			if (comp5 < 0)
			{
				str2 = true;
				str4 = false;
			}
			else 
			{
				str2 = false;
				str4 = true;
			}
		}
		else if (str1 == true && str4 == true)
		{
			int comp6 = string1.compareTo(string4);
			if (comp6 < 0)
			{
				str1 = true;
				str4 = false;
			}
			else 
			{
				str1 = false;
				str4 = true;
			}
		}
		else
		{
			System.out.println("Error. Re-Run.");
		}
		////////////////////////////////////
		
	}
	public void checkmin()
	{
		if (str1 == true)
		{
			System.out.println("The Lexographic Minimum is: " + string1);
		}
		else if (str2 == true)
		{
			System.out.println("The Lexographic Minimum is: " + string2);
		}
		else if (str3 == true)
		{
			System.out.println("The Lexographic Minimum is: " + string3);
		}
		else if (str4 == true)
		{
			System.out.println("The Lexographic Minimum is: " + string4);
		}
		else
		{
			System.out.println("Error with Lexographic Minimum. Re-Run.");
		}
	}
	public void getmax()
	{
		
		int comp1 = string1.compareTo(string2);
		if (comp1 > 0)
		{
			str1 = true;
			str2 = false;
		}
		else
		{
			str1 = false;
			str2 = true;
		}
		int comp2 = string3.compareTo(string4);
		if (comp2 > 0)
		{
			str3 = true;
			str4 = false;
		}
		else
		{	
			str3 = false;
			str4 = true;
		}
		if (str3 == true && str2 == true)
		{
			int comp3 = string3.compareTo(string2);
			if (comp3 > 0)
			{
				str3 = true;
				str2 = false;
			}
			else
			{
				str3 = false;
				str2 = true;
			}
		}
		else if (str1 == true && str3 == true )
		{
			int comp4 = string1.compareTo(string3);
			if (comp4 > 0)
			{
				str1 = true;
				str3 = false;
			}
			else
			{
				str1 = false;
				str3 = true;
			}
		}
		else if (str2 == true && str4 == true)
		{
			int comp5 = string2.compareTo(string4);
			if (comp5 > 0)
			{
				str2 = true;
				str4 = false;
			}
			else 
			{
				str2 = false;
				str4 = true;
			}
		}
		else if (str1 == true && str4 == true)
		{
			int comp6 = string1.compareTo(string4);
			if (comp6 > 0)
			{
				str1 = true;
				str4 = false;
			}
			else 
			{
				str1 = false;
				str4 = true;
			}
		}
		else
		{
			System.out.println("Error. Re-Run.");
		}
		////////////////////////////////////
		
	}
	public void checkmax()
	{
		if (str1 == true)
		{
			System.out.println("The Lexographic Maximum is: " + string1);
		}
		else if (str2 == true)
		{
			System.out.println("The Lexographic Maximum is: " + string2);
		}
		else if (str3 == true)
		{
			System.out.println("The Lexographic Maximum is: " + string3);
		}
		else if (str4 == true)
		{
			System.out.println("The Lexographic Maximum is: " + string4);
		}
		else
		{
			System.out.println("Error with Lexographic Maximum. Re-Run.");
		}
	}
	public void debug()
	{
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string3);
		System.out.println(string4);
	}

	
	
	public String string1;
	public String string2;
	public String string3;
	public String string4;
	public char l1;
	public char l2;
	public char l3;
	public char l4;
	public double maxstr;
	public double minstr;
	private boolean str1;
	private boolean str2;
	private boolean str3;
	private boolean str4;
}
