
public class Demo {

	public static void main(String[] args) 
	{
		Hero hero = new Hero("Avatar");
		hero.setAbility(new Level1());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
		System.out.println("Level 2 Unlocked!");
		hero.setAbility(new Level2());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
		System.out.println("Level 3 Unlocked!");
		hero.setAbility(new Level3());
		hero.travel();
		hero.handleWeapon();
		hero.protect();
	}

}
