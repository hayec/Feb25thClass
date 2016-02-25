import java.util.EventObject;

public class OKButtonEventObject extends EventObject 
{
	private String name;
	private String ID;
	public OKButtonEventObject(Object source) 
	{
		super(source);
	}
	public OKButtonEventObject(Object source, String name, String ID) 
	{
		super(source);
		this.name = name;
		this.ID = ID;
	}
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return ID;
	}
}
