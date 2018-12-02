import java.util.*;

public class QuadFormTest {

    public static void main(String[] args)
    {
    	 Scanner s = new Scanner(System.in);
         System.out.print("Enter the coefficients of a quadratic: ");
         double a = Double.parseDouble(s.next());
         
         double b = Double.parseDouble(s.next());
         
         double c = Double.parseDouble(s.next());
         s.close();    	
    	
//        Scanner s = new Scanner(System.in);
//        System.out.println("Insert value for a: ");
//        double a = Double.parseDouble(s.nextLine());
//        System.out.println("Insert value for b: ");
//        double b = Double.parseDouble(s.nextLine());
//        System.out.println("Insert value for c: ");
//        double c = Double.parseDouble(s.nextLine());
//        s.close();

        QuadForm myQF1 = new QuadForm(a, b, c);
        
        //double answer1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        //double answer2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("Equation: " + a + "x^2 + " + b + "x  + " + c);
        
        if (myQF1.hasSolution()) {
        	System.out.println("Roots: " + myQF1.getSolution1() + " and " + myQF1.getSolution2());
        } else { 
        	System.out.println("no real roots");
        }
        	
    }       
}

