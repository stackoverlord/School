package cds.chapters.ch5.UnitConverter;

public class UnitConverter {
	
	public UnitConverter()
	{
		
	}
	public void cvrtFrom(String from, double value)
	{
		if (from.equalsIgnoreCase("in"))
		{
			m = value * 0.0254;
		}
		else if (from.equalsIgnoreCase("ft"))
		{
			m = value * .305;
		}
		else if (from.equalsIgnoreCase("mi"))
		{
			m = value * 1609;
		}
		else if (from.equalsIgnoreCase("m"))
		{
			m = value;
		}
		else if (from.equalsIgnoreCase("mm"))
		{
			m = value * 0.001;
		}
		else if (from.equalsIgnoreCase("cm"))
		{
			m = value * .01;
		}
		else if (from.equalsIgnoreCase("km"))
		{
			m = value * 1000;
		}
		else
		{
			System.out.println("ERROR. Incorrect Unit. Please Re-Run.");
		}
	}
	public void cvrtTo(String to)
	{
		if (to.equalsIgnoreCase("in"))
		{
			fin = m / 0.0254;
		}
		else if (to.equalsIgnoreCase("ft"))
		{
			fin = m / .305;
		}
		else if (to.equalsIgnoreCase("mi"))
		{
			fin = m / 1609;
		}
		else if (to.equalsIgnoreCase("m"))
		{
			fin = m;
		}
		else if (to.equalsIgnoreCase("mm"))
		{
			fin = m / 0.001;
		}
		else if (to.equalsIgnoreCase("cm"))
		{
			fin = m / .01;
		}
		else if (to.equalsIgnoreCase("km"))
		{
			fin = m / 1000;
		}
		else
		{
			System.out.println("ERROR. Incorrect Unit. Please Re-Run.");
		}
	}
	public double getFin()
	{
		return fin;
	}
	private double m;
	private double fin;
}
