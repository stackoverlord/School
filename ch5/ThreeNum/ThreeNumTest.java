//dean pesavento
//per 5

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ThreeNumTest 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ThreeNum num = new ThreeNum();

		double num1;
		double num2;
		double num3;
		
		FileReader reader = new FileReader("src/Numbers.dat");
		Scanner file = new Scanner(reader);
		num1 = file.nextDouble();
		num2 = file.nextDouble();
		num3 = file.nextDouble();
		
		num.setThreeNum(num1, num2, num3);
		
		System.out.printf("First set of inputs: %6.1f %6.1f %6.1f\n", num1, num2, num3);
		System.out.printf("Sorted inputs: %6.1f %6.1f %6.1f\n", num.getSmallest(), num.getMiddle(), num.getLargest());
		
		num1 = file.nextDouble();
		num2 = file.nextDouble();
		num3 = file.nextDouble();
		
		num.setThreeNum(num1, num2, num3);
		
		System.out.printf("Second set of inputs: %6.1f %6.1f %6.1f\n", num1, num2, num3);
		System.out.printf("Sorted inputs: %6.1f %6.1f %6.1f\n", num.getSmallest(), num.getMiddle(), num.getLargest());
		
		num1 = file.nextDouble();
		num2 = file.nextDouble();
		num3 = file.nextDouble();
		file.close();
		num.setThreeNum(num1, num2, num3);
	
		System.out.printf("Third set of inputs: %6.1f %6.1f %6.1f\n", num1, num2, num3);
		System.out.printf("Sorted inputs: %6.1f %6.1f %6.1f\n", num.getSmallest(), num.getMiddle(), num.getLargest());
	}
}
