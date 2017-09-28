import java.util.Scanner;
import java.util.ArrayList;
public class Runner
	{
		static int num;

		public static void main(String[] args)
			{
				DinosaurData.fillArray();
				
				askToPlayGame();
				if(num==1)
					{
				selectDinosaur();
				selectDinosaurToBattle();
				battleOpponent();
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

		private static void selectDinosaur()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What dinosaur would you like to be?");
				for (Dinosaur d: DinosaurData.dinoArray)
					{
				System.out.println(d.getType());
					}
				
			}
		private static void selectDinosaurToBattle()
			{
				// TODO Auto-generated method stub
				
			}

		private static void battleOpponent()
			{
				// TODO Auto-generated method stub
				
			}

		private static void tellWinner()
			{
				// TODO Auto-generated method stub
				
			}

	}
