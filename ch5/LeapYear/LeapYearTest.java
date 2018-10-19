package cds.chapters.ch5.LeapYear;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LeapYearTest {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader reader = new FileReader("src/Dates.dat");
		Scanner file = new Scanner(reader);
		int year1 = file.nextInt();
		int year2 = file.nextInt();
		int year3 = file.nextInt(); 
		int year4 = file.nextInt();
		int year5 = file.nextInt();
		LeapYear leap = new LeapYear();
		leap.yearcalc(year1);
		leap.yearcalc(year2);
		leap.yearcalc(year3);
		leap.yearcalc(year4);
		leap.yearcalc(year5);
		
		
	}

}
