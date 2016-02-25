
public class Hero 
{
	private String name;
	public Ability ability;
	public Hero(String name)
	{
		this.name = name;
	}
	public void setAbility(Ability a)
	{
		this.ability = a;
	}
	public void travel()
	{
		this.ability.travel();
	}
	public void handleWeapon()
	{
		this.ability.handleWeapon();
	}
	public void protect()
	{
		this.ability.protect();
	}
}
