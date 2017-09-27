
public class Dinosaur
	{
		private String type;
		private int attackDamage;
		private int defenseAbilities;
		private int health;
		private int speed;
		private String attackType;
	

	public Dinosaur (String t, int aD, int d, int h, int s, String aT)
		{
			type = t;
			attackDamage = aD;
			defenseAbilities = d;
			health = h;
			speed = s;
			attackType = aT;
		}


	public String getType()
		{
			return type;
		}


	public void setType(String type)
		{
			this.type = type;
		}


	public int getAttackDamage()
		{
			return attackDamage;
		}


	public void setAttackDamage(int attackDamage)
		{
			this.attackDamage = attackDamage;
		}


	public int getDefenseAbilities()
		{
			return defenseAbilities;
		}


	public void setDefenseAbilities(int defenseAbilities)
		{
			this.defenseAbilities = defenseAbilities;
		}


	public int getHealth()
		{
			return health;
		}


	public void setHealth(int health)
		{
			this.health = health;
		}


	public int getSpeed()
		{
			return speed;
		}


	public void setSpeed(int speed)
		{
			this.speed = speed;
		}


	public String getAttackType()
		{
			return attackType;
		}


	public void setAttackType(String attackType)
		{
			this.attackType = attackType;
		}
	

	}
