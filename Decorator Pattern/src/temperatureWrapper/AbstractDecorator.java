package temperatureWrapper;

public class AbstractDecorator implements ITemp 
{
	private ITemp ic;
	public AbstractDecorator(ITemp temp)
	{
		ic = temp;
	}
	public double letsConvertF2C(double tInF)
	{
		return ic.letsConvertF2C(tInF);
	}
	
}
