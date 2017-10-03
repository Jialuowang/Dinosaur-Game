import java.util.Scanner;
import java.util.ArrayList;
public class Runner
	{
		static int num;
		static int userDinoChoice;
		static int opponentDino;
		static String attackType;
		static int attackDamage;
		static int defenseAbilities;
		static int speed;
		static int health;
		static int opponentHealth;

		public static void main(String[] args)
			{
				DinosaurData.fillArray();
				
				askToPlayGame();
				if(num==1)
					{
				selectDinosaur();
				selectDinosaurToBattle();
				runOrFight();
				tellWinner();
					}
				
				
			}

		private static void askToPlayGame()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, would you like to battle some of the greatest creatures to ever walk the face of this planet?");
				System.out.println("Press 1 for yes and 2 for no");
				num = userInput.nextInt();
				if (num == 1)
					{
						System.out.println("Get ready...");
					}
				else
					{
						System.out.println(":(");
					}
				
				
			}
		private static void printList()
		{
			int counter = 1;
			for (Dinosaur d: DinosaurData.dinoArray)
				{
					System.out.println(counter + ")	" + d.getType());
					counter++;
				}
		}

		private static void selectDinosaur()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What dinosaur would you like to be?");
				printList();
				userDinoChoice = userInput.nextInt();
						
							System.out.println("You have chosen the " + DinosaurData.dinoArray.get(userDinoChoice-1).getType());
							attackType = DinosaurData.dinoArray.get(userDinoChoice-1).getAttackType();
							attackDamage = DinosaurData.dinoArray.get(userDinoChoice-1).getAttackDamage();
							System.out.println("	It has an attack damage of " + attackDamage);
							defenseAbilities = DinosaurData.dinoArray.get(userDinoChoice-1).getDefenseAbilities();
							System.out.println("\n	A defense ability of  " + defenseAbilities);
							speed = DinosaurData.dinoArray.get(userDinoChoice-1).getSpeed();
							System.out.println("\n	A speed of " + speed);
							System.out.println("\n	And attacks with a " + attackType);
						
							DinosaurData.dinoArray.remove(userDinoChoice-1);
						
			}
				
		private static void selectDinosaurToBattle()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println();
				System.out.println("What dinosaur would you like to battle?");
				printList();
				opponentDino = userInput.nextInt();
			}

		private static void runOrFight()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Would you like to run or fight? Press 1 for run and 2 for fight. ");
				int battleChoice = userInput.nextInt();
				if (battleChoice == 1)
					{
						System.out.println("You have chosen to run");
						System.out.println();
						if (DinosaurData.dinoArray.get(opponentDino-1).getSpeed() > DinosaurData.dinoArray.get(userDinoChoice-1).getSpeed())
						{
							System.out.println("You tested your luck blindly, and your opponent was faster than you. ");
							System.out.println("You will now have to fight.");
							fightOpponent();
						}
						else
							{
								System.out.println("Wooo close one! \nYou got lucky this time. \nYou outran your opponent, but who knows what will happen next time");
							}
						
					}
				else
					{
						System.out.println("Prepare for battle...");
						fightOpponent();
					}
				
			}
		private static void fightOpponent()
		{
			health = DinosaurData.dinoArray.get(userDinoChoice-1).getHealth();
			opponentHealth = DinosaurData.dinoArray.get(opponentDino-1).getHealth();
			int opponentAttackDamage = DinosaurData.dinoArray.get(opponentDino).getAttackDamage();
			
			System.out.println();
			System.out.println("You are staring down your opponent, plotting your next move");
			System.out.println("You attack with your deadly " +  attackType);
			
			while(health > 0)
				{
					if (attackDamage > opponentAttackDamage)
						{
							opponentHealth = opponentHealth - attackDamage + 2;
							System.out.println("You were stronger than your enemy! ");
						}
				}
		}

		private static void tellWinner()
			{
				// TODO Auto-generated method stub
				
			}

	}
