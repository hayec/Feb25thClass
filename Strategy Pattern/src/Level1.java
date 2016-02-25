
public class Level1 implements Ability 
{

	@Override
	public void travel() 
	{
		System.out.println("I travel on foot");
	}

	@Override
	public void handleWeapon() {
		System.out.println("I do fist fight!");
	}

	@Override
	public void protect() {
		System.out.println("I wear a T-shirt");
		
	}
	
}
