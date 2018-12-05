
import java.util.Scanner;

public class MaxMinTest {
	public static void main(String[] args) {
		MaxMin MaxMin = new MaxMin();
		Scanner console = new Scanner(System.in);
		System.out.print("Enter four strings: ");
		MaxMin.addString(console.next());
		MaxMin.addString(console.next());
		MaxMin.addString(console.next());
		MaxMin.addString(console.next());

		System.out.println("The lexicographic minimum is " + MaxMin.getMinString());

		System.out.println("The lexicographic maximum is " + MaxMin.getMaxString());
		console.close();
	}
}
