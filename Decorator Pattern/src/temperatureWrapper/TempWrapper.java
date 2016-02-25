package temperatureWrapper;

public class TempWrapper 
{
	Convert c = new Convert();
	TempWrapper(Convert c)
	{
		super();
	}
	public double letsConvertF2C(double tInF)
	{
		return 30 * tInF + 32;
	}
	
}
