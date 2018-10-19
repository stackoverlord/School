
import javax.swing.JOptionPane;

public class Converter 
{
	public Converter()
	{
		str1 = JOptionPane.showInputDialog("Input Integer 1.");
		dub1 = Double.parseDouble(str1);
	}
	public void math()
	{
		miles = dub1/1609;
		feet = dub1/.305;
		inches = dub1/.025;
	}
	public double getMeters()
	{
		return dub1;
	}
	public double getMiles()
	{
		return miles;
	}
	public double getFeet()
	{
		return feet;
	}
	public double getInches()
	{
		return inches;
	}
	private String str1;
	private double dub1;
	private double miles;
	private double feet;
	private double inches;
}
