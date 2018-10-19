package cds.chapters.ch5.ThreeNum;
import java.io.FileNotFoundException;

public class ThreeNumTest 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		ThreeNum num = new ThreeNum();
		//num.debug();
		num.first3();
		System.out.println("");
		num.second3();
		System.out.println("");
		num.third3();
	}
}
