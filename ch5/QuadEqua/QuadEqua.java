import java.util.*;

public class QuadForm {


public static void main(String[]args) {
  System.out.println("insert value for a:");
  Scanner scan1 = new Scanner(System.in);
   double a = scan1.nextDouble();
    System.out.println("insert value for b:");
  Scanner scan2 = new Scanner(System.in);
    double b = scan2.nextDouble();
    System.out.println("insert value for C:");
  Scanner scan3 = new Scanner(System.in);
   double c = scan3.nextDouble();

    double answer =((Math.sqrt(Math.pow(b,2)-(4*a*c))-b)/2);
      double final2 =(-b + Math.sqrt(Math.pow(b,2)-(4*a*c)))/2;
  System.out.println("The x values are:" + answer + final2);
}
}
