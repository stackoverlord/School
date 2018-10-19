
import javax.swing.JOptionPane;

public class DataSet 
{
	public DataSet()
	{
		str1 = JOptionPane.showInputDialog("Input Integer 1.");
		int1 = Integer.parseInt(str1);
		
		str2 = JOptionPane.showInputDialog("Input Integer 2.");
		int2 = Integer.parseInt(str2);
		
		str3 = JOptionPane.showInputDialog("Input Integer 3.");
		int3 = Integer.parseInt(str3);
		
		str4 = JOptionPane.showInputDialog("Input Integer 4.");
		int4 = Integer.parseInt(str4);
	}
	public void math()
	{
		max = Math.max(Math.max(int1, int2), Math.max(int3, int4));
		min = Math.min(Math.min(int1, int2), Math.min(int3, int4));
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
	private String str3;
	private String str4;
	private int int1;
	private int int2;
	private int int3;
	private int int4;
	private int min;
	private int max;
}
