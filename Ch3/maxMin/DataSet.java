
import javax.swing.JOptionPane;

public class DataSet 
{
	//vars
	private int int1;
	private int int2;
	private int int3;
	private int int4;
	private int min;
	private int max;
	
	public DataSet(int pInt1, int pInt2, int pInt3, int pInt4)
	{
	int1 = pInt1;
	int2 = pInt2;
	int3 = pInt3;
	int4 = pInt4;
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
	
}