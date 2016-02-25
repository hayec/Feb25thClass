package component;

public class ConcreteDecorator extends Decorator
{
	public void doJob()
	{
		super.doJob();
		System.out.println("Newly Added Behavior 1");
	}
}
