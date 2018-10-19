package cds.chapters.ch5.UnitConverter;
import java.util.Scanner;

public class UnitConverterTest {
	
	public static void main(String[] args)
	{
		UnitConverter convert = new UnitConverter();
		Scanner console = new Scanner(System.in);
		System.out.print("Convert From: ");
		String from = console.next();
		System.out.print("Convert To: ");
		String to = console.next();
		System.out.print("Value: ");
		double value = console.nextDouble();
		convert.cvrtFrom(from, value);
		convert.cvrtTo(to);
		System.out.println(value + " " + from + " = " + convert.getFin() + " " + to);
		
		
	}

}
