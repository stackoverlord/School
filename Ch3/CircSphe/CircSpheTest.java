
public class CircSpheTest 
{
	public static void main(String[] args)
	{
		Circ circ = new Circ();
		Sphe sphe = new Sphe();
		
		circ.area();
		circ.circum();
		System.out.println("The Radius Is: " + circ.getRadius());
		System.out.println("The Area Is: " + circ.getArea());
		System.out.println("The Circumference Is: " + circ.getCircum());
		
		sphe.Vol();
		sphe.SurfArea();
		System.out.println("\n" + "The Radius Is: " + sphe.getRadius());
		System.out.println("The Volume Is: " + sphe.getVol());
		System.out.println("The Suface Area Is: " + sphe.getSurf());
	}
}