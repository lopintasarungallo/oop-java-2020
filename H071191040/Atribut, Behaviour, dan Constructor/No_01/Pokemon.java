class Pokemon
{

	String name;
	String type;
	int damage;
	int defence;
	// private int xp;
	int health;
	boolean guarded = false;
	boolean charged = false;
	int chargeAttack = 0;

	Pokemon(String name, String type, int damage, int defence)
	{
		System.out.println("You've Created Pokemon");
		health = 100;
		this.name = name;
		this.type = type;
		this.damage = damage;
		this.defence = defence;
	}

	Pokemon()
	{
		health = 100;
		System.out.println("your pokemon has no attribute");
	}

	void setName(String name)
	{
		this.name = name;
	}

	String getName()
	{
		return name;
	}

	void setType(String type)
	{
		this.type = type;
	}

	void setDamage(int damage)
	{
		this.damage = this.damage == 0 ? damage:this.damage;
	}

	void setDefence(int defence)
	{
		this.defence = this.defence == 0 ? defence:this.defence;
	}

	int getHealth()
	{
		return health;
	}

	void attack(Pokemon poke)
	{	

		String elementWin = guideElement(type, poke.type);

		if(elementWin == "unknown" || elementWin == poke.type)
		{
			if(poke.guarded)
			{
				poke.guarded = false;
				poke.health = (poke.health + (int)(0.2*poke.defence) + 10) -  (int)(0.8*damage);
				poke.health -= charged ? chargeAttack:0;
				charged = false;
			}
			else
			{
				poke.health = (poke.health + (int)(0.2*poke.defence)) -  (int)(0.8*damage);
				poke.health -= charged ? chargeAttack:0;
				charged = false;
			}
		}
		else if(elementWin == type)
		{
			if(poke.guarded)
			{
				poke.guarded = false;
				poke.health = (poke.health + (int)(0.2*poke.defence)+10) -  (int)(damage*(0.8 + 0.15));
				poke.health -= charged ? chargeAttack:0;
				charged = false;
			}
			else
			{
				poke.health = (poke.health + (int)(0.2*poke.defence)) -  (int)(damage*(0.8 + 0.15));
				poke.health -= charged ? chargeAttack:0;
				charged = false;
			}
		}

		if(poke.health <= 0)
		{
			System.out.println("\n" + poke.name + " has been dead");
			System.out.println(name + " wins\n");
			poke.health = 0;
		}

	}

	void guard()
	{
		guarded = true;
	}

	void charge()
	{
		charged = true;
		chargeAttack += 7;
	}

	boolean dead()
	{
		return health <= 0 ? true:false;
	}

	void showStat(Pokemon poke1)
	{
		System.out.println("Pokemon's Name :" + name + "><" + poke1.name);
		System.out.println("Pokemon's Type :" + type + "><" + poke1.type);
		System.out.println("Pokemon's Damage : " + damage + "><" + poke1.damage);
		System.out.println("Pokemon's defence : " + defence + "><" + poke1.defence);
		System.out.println("Pokemon's health : " + health + "><" + poke1.health);
	}

	String guideElement(String type, String type2)
	{

		switch(type)
		{
			case "water":
				switch(type2)
				{
					case "ground":
						return type;
					case "fire":
						return type;
					case "electric":
						return type2;
				}
				break;

			case "ground":
				switch(type2)
				{
					case "electric":
						return type;
				}
				break;

			case "fire":
				switch(type2)
				{
					case "water":
						return type2;
				}
				break;

			case "electric":
				switch(type2)
				{
					case "water":
						return type;
					case "ground":
						return type2;
				}
		}

		return "unknown";

	}

}