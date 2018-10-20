import javax.swing.JOptionPane;

public class DataSetTest 
{
	public static void main(String[] args)
	{
		
		String str1 = JOptionPane.showInputDialog("Input Integer 1.");
		int int1 = Integer.parseInt(str1);
		
		String str2 = JOptionPane.showInputDialog("Input Integer 2.");
		int int2 = Integer.parseInt(str2);
		
		String str3 = JOptionPane.showInputDialog("Input Integer 3.");
		int int3 = Integer.parseInt(str3);
		
		String str4 = JOptionPane.showInputDialog("Input Integer 4.");
		int int4 = Integer.parseInt(str4);
		
		DataSet data = new DataSet(int1, int2, int3, int4);
		
		data.math();
		System.out.println("Maximum is: " + data.getMax());
		System.out.println("Minimum is: " + data.getMin());
	}
}