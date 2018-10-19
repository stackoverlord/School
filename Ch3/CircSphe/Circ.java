
import javax.swing.JOptionPane;

public class Circ 
{
	public Circ()
	{
		str1 = JOptionPane.showInputDialog("Input Radius");
		radius = Double.parseDouble(str1);
	}
	public void area()
	{
		area = Math.PI * Math.pow(radius, 2);
	}
	public void circum()
	{
		circum = 2 * Math.PI * radius;
	}
	public double getArea()
	{
		return area;
	}
	public double getCircum()
	{
		return circum;
	}
	public double getRadius()
	{
		return radius;
	}
	private String str1;
	private double radius;
	private double area;
	private double circum;
	
}
