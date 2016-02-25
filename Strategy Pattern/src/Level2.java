public class Level2 implements Ability
{

	@Override
	public void travel() 
	{
		System.out.println("I travel on horse");
	}

	@Override
	public void handleWeapon() {
		System.out.println("I have a baseball bat");
	}

	@Override
	public void protect() {
		System.out.println("I wear a jersey");
		
	}
	
	
}