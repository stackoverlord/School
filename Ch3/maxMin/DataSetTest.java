
public class DataSetTest 
{
	public static void main(String[] args)
	{
		DataSet data = new DataSet();
		data.math();
		System.out.println("Maximum is: " + data.getMax());
		System.out.println("Minimum is: " + data.getMin());
	}
}
