import java.util.Scanner;
public class Runner
	{
		static int num;

		public static void main(String[] args)
			{
				askToPlayGame();
				if(num==1)
					{
				chooseLandscape();
				selectDinosaur();
				selectDinosaurToBattle();
				battleOpponent();
				tellWinner();
					}
			}

		private static void askToPlayGame()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Hello, would you like to battle some of the greatest creatures to ever walk the face of this planet? Press 1 for yes and 2 for no");
				int num = userInput.nextInt();
				if (num == 1)
					{
						System.out.println("Get ready...");
					}
				else
					{
						System.out.println(":(");
					}
				
				
			}

		private static void chooseLandscape()
			{
				System.out.println("");
				
			}

		private static void selectDinosaur()
			{
				// TODO Auto-generated method stub
				
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
