package cds.chapters.ch3.Pair;
import javax.swing.JOptionPane;
public class Pair 
{
	public Pair()
	{
		str1 = JOptionPane.showInputDialog("Input Integer 1.");
		int1 = Integer.parseInt(str1);
		
		str2 = JOptionPane.showInputDialog("Input Integer 2.");
		int2 = Integer.parseInt(str2);
	}
	public void math()
	{
		sum = int1 + int2;
		difference = int1 - int2;
		product = int1 * int2;
		average = (int1 + int2)/2;
		distance = Math.abs(difference);
		max = Math.max(int1, int2);
		min = Math.min(int1, int1);
	}
	public int getInt1()
	{
		return int1;
	}
	public int  getInt2()
	{
		return int2;
	}
	public int getSum()
	{
		return sum;
	}
	public int getDifference()
	{
		return difference;
	}
	public int getProduct()
	{
		return product;
	}
	public int getAverage()
	{
		return average;
	}
	public int getDistance()
	{
		return distance;
	}
	public int getMax()
	{
		return max;
	}
	public int getMin()
	{
		return min;
	}
	private String str1;
	private String str2;
	private int int1;
	private int int2;
	private int sum;
	private int difference;
	private int product;
	private int average;
	private int distance;
	private int min;
	private int max;
}
