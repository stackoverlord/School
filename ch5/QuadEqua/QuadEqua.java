
import java.util.*;

public class QuadForm {

// vars
	private double a, b, c; // quadratic equation coefficients
	private double discriminant; // the value under the square root

// constructors
	public QuadForm(double paramA, double paramB, double paramC) {

		a = paramA;
		b = paramB;
		c = paramC;

	} // end QuadForm 

// methods
	public double getSolution1() {

		return (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

	} // end getSolution1

	public double getSolution2() {

		return (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
	} // end getSolution2

	public boolean hasSolution() {
		if (Math.pow(b, 2) - (4 * a * c) >= 0) {
			return true;
		} else {
			return false;
		}
	} // end hasSolution

} // end class QuadForm
