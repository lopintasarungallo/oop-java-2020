import java.util.Scanner;

class Main
{
	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
		Pokemon poke1 = new Pokemon();
		Pokemon poke2 = new Pokemon("pikachu", "electric", 35, 15);
		boolean turns = true;

		if(poke1.damage == 0)
		{
			System.out.print("Your Pokemon's name : ");
			poke1.setName(read.nextLine());
			System.out.print("Set your Pokemon's type : ");
			poke1.setType(read.nextLine());
			System.out.print("Set your Pokemon's damage : ");
			poke1.setDamage(read.nextInt());
			System.out.print("Set your Pokemon's defence : ");
			poke1.setDefence(read.nextInt());
		}

		if(poke2.damage == 0)
		{
			System.out.print("Your Pokemon's name : ");
			poke1.setName(read.nextLine());
			System.out.print("Set your Pokemon's type : ");
			poke1.setType(read.nextLine());
			System.out.print("Set your Pokemon's damage : ");
			poke1.setDamage(read.nextInt());
			System.out.print("Set your Pokemon's defence : ");
			poke1.setDefence(read.nextInt());
		}

		while(true)
		{
			if(turns)
			{
				System.out.println(poke1.getName() + "'s turn");
				System.out.println("1. attack");
				System.out.println("2. guard");
				System.out.println("3. charge");

				switch(read.nextInt())
				{
					case 1:
						poke1.attack(poke2);
						break;
					case 2:
						poke1.guard();
						break;
					case 3:
						poke1.charge();
						break;
					default:
						System.out.println("you missed");
						break;
				}

				poke1.showStat(poke2);
				turns = false;
				if(poke2.dead()) break;

			}

			else
			{
				System.out.println(poke2.getName() + "'s turn");
				System.out.println("1. attack");
				System.out.println("2. guard");
				System.out.println("3. charge");

				switch(read.nextInt())
				{
					case 1:
						poke2.attack(poke1);
						break;
					case 2:
						poke2.guard();
						break;
					case 3:
						poke2.charge();
						break;
					default:
						System.out.println("you missed");
						break;
				}

				poke1.showStat(poke2);
				turns = true;
				if(poke1.dead()) break;
			}
		}

	}




}