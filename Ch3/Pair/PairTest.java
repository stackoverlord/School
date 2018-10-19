package cds.chapters.ch3.Pair;
public class PairTest 
{
	public static void main(String[] args)
	{
		Pair greg = new Pair();
		System.out.println("Your integers are: " + greg.getInt1() + " and " + greg.getInt2());
		greg.math();
		System.out.println("Sum = " + greg.getSum());
		System.out.println("Diference = " + greg.getDifference());
		System.out.println("Product = " + greg.getProduct());
		System.out.println("Average = " + greg.getAverage());
		System.out.println("Distance = " + greg.getDistance());
		System.out.println("Maximum = " + greg.getMax());
		System.out.println("Minimum = " + greg.getMin());
	}
}
