package cds.chapters.ch3.Easter;
import javax.swing.JOptionPane;

public class Easter 
{
	public Easter()
	{
		str1 = JOptionPane.showInputDialog("Input Integer 1.");
		y1 = Integer.parseInt(str1);
		
		str2 = JOptionPane.showInputDialog("Input Integer 2.");
		y2 = Integer.parseInt(str2);
	}
	public void calcUno()
	{
		a = y1 % 19;
		b = y1 / 100;
		c = y1 % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4; 
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n1 = (h - m + r + 90) / 25;
		p1 = (h - m + r + n1 + 19) % 32;
		strget1 = (n1 - 1) * 9;
		strget2 = strget1 + 9;
		month1 = months.substring(strget1, strget2);
	}
	public void calcDos()
	{
		a = y2 % 19;
		b = y2 / 100;
		c = y2 % 100;
		d = b / 4;
		e = b % 4;
		g = (8 * b + 13) / 25;
		h = (19 * a + b - d - g + 15) % 30;
		j = c / 4; 
		k = c % 4;
		m = (a + 11 * h) / 319;
		r = (2 * e + 2 * j - k - h + m + 32) % 7;
		n2 = (h - m + r + 90) / 25;
		p2 = (h - m + r + n2 + 19) % 32;
		strget3 = (n2 - 1) * 9;
		strget4 = strget3 + 9;
		month2 = months.substring(strget3, strget4);
	}
	public int getYear1()
	{
		return y1;
	}
	public int getYear2()
	{
		return y2;
	}
	public String getMonth1()
	{
		return month1;
	}
	public String getMonth2()
	{
		return month2;
	}
	public int getDay1()
	{
		return p1;
	}
	public int getDay2()
	{
		return p2;
	}
	private String str1;
	private String str2;
	private int y1;
	private int y2;
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	private int g;
	private int h;
	private int j;
	private int k;
	private int m;
	private int r;
	private int n1;
	private int n2;
	private int p1;
	private int p2;
	private int strget1;
	private int strget2;
	private int strget3;
	private int strget4;
	private String month1;
	private String month2;
	private String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";

}
