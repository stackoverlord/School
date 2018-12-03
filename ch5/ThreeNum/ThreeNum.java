//dean pesavento
//per5


import java.util.Arrays;

public class ThreeNum 
{

	private double array[] = new double[3]; 
	
	public ThreeNum() {
		
	} // end ThreeNum

	public void setThreeNum(double pNum1, double pNum2, double pNum3) {
	
		array[0] = pNum1;
		array[1] = pNum2;
		array[2] = pNum3;
		
		Arrays.sort(array);
	}
		
	public double getLargest()
	{
		return array[2];
	} // end getLargest
	
	public double getMiddle()
	{
		return array[1];
	} // end getMiddle
	
	public double getSmallest()
	{
		return array[0];
	} // end getSmallest
	
	
}
