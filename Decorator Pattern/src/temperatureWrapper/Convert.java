package temperatureWrapper;

public class Convert implements ITemp 
{
	public double letsConvertF2C(double tInF)
	{
		return (tInF - 32) * 5 / 9.0;
		
	}	
}
