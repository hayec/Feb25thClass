package component;

public class Demo {

	public static void main(String[] args) 
	{
		ConcreteComponent component = new ConcreteComponent();
		component.doJob();
		System.out.println("------------------");
		ConcreteDecorator ex1 = new ConcreteDecorator();
		ex1.setComponent(component);
		ex1.doJob();
		System.out.println("------------------");
		ConcreteDecoratorEX2 ex2 = new ConcreteDecoratorEX2();
		ex2.setComponent(component);
		ex2.doJob();
	}

}
