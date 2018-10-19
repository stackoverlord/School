package cds.chapters.ch3.Easter;
public class EasterTest 
{
	public static void main(String[] args)
	{
		Easter x = new Easter();
		x.calcUno();
		System.out.println("Easter for " + x.getYear1());
		System.out.println("Month: " + x.getMonth1());
		System.out.println("Day: " + x.getDay1());
		
		x.calcDos();
		System.out.println("Easter for " + x.getYear2());
		System.out.println("Month: " + x.getMonth2());
		System.out.println("Day: " + x.getDay2());
		
	}
}
