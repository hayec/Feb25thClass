package component;

public abstract class Decorator 
{
	private AComponent component;
	public void setComponent(AComponent component)
	{
		this.component = component;
	}
	
	public void doJob()
	{
		if(component != null)
		{
			component.doJob();
		}
	}

}
