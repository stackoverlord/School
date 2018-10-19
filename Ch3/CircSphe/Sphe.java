import javax.swing.JOptionPane;

public class Sphe 
{
	public Sphe()
	{
		str1 = JOptionPane.showInputDialog("Input Radius");
		dub1 = Double.parseDouble(str1);
	}
	public void SurfArea()
	{
		SurfArea = 4 * Math.PI * Math.pow(dub1, 2);
	}
	public void Vol()
	{
		Vol = (4/3) * Math.PI * Math.pow(dub1, 3);
	}
	public double getSurf()
	{
		return SurfArea;
	}
	public double getVol()
	{
		return Vol;
	}
	public double getRadius()
	{
		return dub1;
	}
	private String str1;
	private double dub1;
	private double SurfArea;
	private double Vol;
}
