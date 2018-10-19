package cds.chapters.ch5.QuadEqua;
import javax.swing.JOptionPane;

public class QuadEqua 
{
	public QuadEqua()
	{
		String str1 = JOptionPane.showInputDialog("A = ____");
		a = Double.parseDouble(str1);
		if (a <= 0)
		{
			str1 = JOptionPane.showInputDialog("Please Reenter A (No Negatives)");
			a = Double.parseDouble(str1);
		}
		String str2 = JOptionPane.showInputDialog("B = ____");
		b = Double.parseDouble(str2);
		if (b <= 0)
		{
			str2 = JOptionPane.showInputDialog("Please Reenter B (No Negatives)");
			b = Double.parseDouble(str2);
		}
		String str3 = JOptionPane.showInputDialog("C = ____");
		c = Double.parseDouble(str3);
		if (c <= 0)
		{
			str2 = JOptionPane.showInputDialog("Please Reenter C (No Negatives)");
			a = Double.parseDouble(str3);
		}
	}
	public void getSol1()
	{
		sol1 = (-b + Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	}
	public void getSol2()
	{
		sol2 = (-b - Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
	}
	public void hasSol()
	{
		dis = Math.pow(b, 2) - (4 * a * c);
		if (dis < 0)
		{
			disc = false;
		}
		else 
		{
			disc = true;
		}
	}
	public void ret()
	{
		if (disc == false)
		{
			System.out.println("There are no real Solutions.");
		}
		else
		{
			System.out.println("The three numbers are: " + a + " " + b + " " + c);
			System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c);
			System.out.println("Roots: " + sol1 + " and " + sol2);
		}
	}
	private double a;
	private double b;
	private double c;
	private double dis;
	private boolean disc;
	private double sol1;
	private double sol2;
}
