package cds.chapters.ch5.ThreeNum;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThreeNum 
{
	public ThreeNum() throws FileNotFoundException
	{
		FileReader reader = new FileReader("src/cds/chapters/ch5/Numbers.dat");
		Scanner file = new Scanner(reader);
		num1 = file.nextFloat();
		num2 = file.nextFloat();
		num3 = file.nextFloat();
		num4 = file.nextFloat();
		num5 = file.nextFloat();
		num6 = file.nextFloat();
		num7 = file.nextFloat();
		num8 = file.nextFloat();
		num9 = file.nextFloat();
	}
	public void debug()
	{
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
		System.out.println(num8);
		System.out.println(num9);
	}
	public void first3()
	{
		System.out.println("The First Three Inputs are: " + num1 + "   " + num2 + "   " + num3);
		max1 = Math.max(num1, Math.max(num2, num3));
		min1 = Math.min(num1, Math.min(num2, num3));
		if ((max1 == num1 || max1 == num2) && (min1 == num1 || min1 == num2))
		{
			mid1 = num3;
		}
		else if ((max1 == num2 || max1 == num3) && (min1 == num2 || min1 == num3))
		{
			mid1 = num1;
		}
		else
		{
			mid1 = num2;
		}
		System.out.println("Sorted Inputs:  " + min1 + "   " + mid1 + "   " + max1);
	}
	public void second3()
	{
		System.out.println("The Second Three Inputs are: " + num4 + "   " + num5 + "   " + num6);
		max2 = Math.max(num4, Math.max(num5, num6));
		min2 = Math.min(num4, Math.min(num5, num6));
		if ((max2 == num4 || max2 == num5) && (min2 == num4 || min2 == num5))
		{
			mid2 = num6;
		}
		else if ((max2 == num5 || max2 == num6) && (min2 == num5 || min2 == num6))
		{
			mid2 = num4;
		}
		else
		{
			mid2 = num5;
		}
		System.out.println("Sorted Inputs:  " + min2 + "   " + mid2 + "   " + max2);
	}
	public void third3()
	{
		System.out.println("The Third Three Inputs are: " + num7 + "   " + num8 + "   " + num9);
		max3 = Math.max(num7, Math.max(num8, num9));
		min3 = Math.min(num7, Math.min(num8, num9));
		if ((max3 == num7 || max3 == num8) && (min3 == num7 || min3 == num8))
		{
			mid3 = num9;
		}
		else if ((max3 == num8 || max3 == num9) && (min3 == num8 || min3 == num9))
		{
			mid3 = num7;
		}
		else
		{
			mid3 = num8;
		}
		System.out.println("Sorted Inputs:  " + min3 + "   " + mid3 + "   " + max3);
	}
	private float num1;
	private float num2;
	private float num3;
	private float num4;
	private float num5;
	private float num6;
	private float num7;
	private float num8;
	private float num9;
	private float max1;
	private float min1;
	private float mid1;
	private float max2;
	private float min2;
	private float mid2;
	private float max3;
	private float min3;
	private float mid3;
}
