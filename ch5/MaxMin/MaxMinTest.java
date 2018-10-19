package cds.chapters.ch5.MaxMin;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxMinTest 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		MaxMin MaxMin = new MaxMin();
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the four strings: ");
		MaxMin.string1 = console.next();
		MaxMin.string2 = console.next();
		MaxMin.string3 = console.next();
		MaxMin.string4 = console.next();
		MaxMin.getmin();
		MaxMin.checkmin();
		MaxMin.getmax();
		MaxMin.checkmax();
	}
}
