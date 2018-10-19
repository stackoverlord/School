package cds.chapters.ch3.Cashier;
import javax.swing.JOptionPane;

public class Cashier 
{
	public Cashier()
	{
		str1 = JOptionPane.showInputDialog("Input Amount Due.");
		due = Double.parseDouble(str1);
		
		str2 = JOptionPane.showInputDialog("Input Amount Paid.");
		reciv = Double.parseDouble(str2);
	}
	public void math()
	{
		between = (int)((reciv - due) * 100);
		dollar = between / 100;
		between = between % 100;
		quarter = between / 25;
		between = between % 25;
		dime =  between / 10;
		between = between % 10;
		nickel = between / 5;
		between = between % 5;
		penny = between;
	}
	public double getDue()
	{
		return due;
	}
	public double getReciv()
	{
		return reciv;
	}
	public int getDollars()
	{
		return dollar;
	}
	public int getQuarters()
	{
		return quarter;
	}
	public int getDimes()
	{
		return dime;
	}
	public int getNickels()
	{
		return nickel;
	}
	public int getPennys()
	{
		return penny;
	}
	private String str1;
	private String str2;
	private double due;
	private double reciv;
	private int dollar;
	private int quarter;
	private int dime;
	private int nickel;
	private int penny;
	private int between;
}
