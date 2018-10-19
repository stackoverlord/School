
public class ConverterTest 
{
	public static void main(String[] args)
	{
		Converter cvert = new Converter();
		cvert.math();
		System.out.println(cvert.getMeters() + " meters is the same as:");
		System.out.printf("%10.3f", cvert.getMiles());
		System.out.println(" miles");
		System.out.printf("%,14.3f", cvert.getFeet());
		System.out.println(" feet");
		System.out.printf("%,15.3f", cvert.getInches());
		System.out.println(" inches");
	}
}
