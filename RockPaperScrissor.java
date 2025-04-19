package day5;

import java.util.Scanner;

public class RockPaperScrissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome! Let's play");
		System.out.println("ROCK PAPER SCISSOR");
		Scanner Scanner = new Scanner(System.in);
		int compChoice = (int) (Math.random()*3);
		compChoice +=1;
		System.out.println(compChoice);
		System.out.println("Enter your choice");
		System.out.println("1. Rock");
		System.out.println("2. Paper");
		System.out.println("3. Scissor");
		int playerChoice = Scanner.nextInt();
		
		if(playerChoice == compChoice)
		{
			System.out.println("It is a Draw");
		}
		else if(playerChoice == 1)
		{
			System.out.println("User Choice : Rock");
			if (compChoice ==2)
			{
				System.out.println("Computer Choice : Paper");
				System.out.println("You Loose");
			}
			else if(compChoice == 3)
			{
				System.out.println("Computer Choice : Scissor");
				System.out.println("You Win");
				
			}
		}
		else if(playerChoice == 2)
		{
			System.out.println("User Choice : Paper");
			if (compChoice ==1)
			{
				System.out.println("Computer Choice : Rock ");
				System.out.println("You Win");
			}
			else if(compChoice == 3)
			{
				System.out.println("Computer Choice : Scissor");
				System.out.println("You Loose");
				
			}
		}
		else if(playerChoice == 3)
		{
			System.out.println("User Choice : Scissor");
			if (compChoice ==1)
			{
				System.out.println("Computer Choice : Rock ");
				System.out.println("You Win");
			}
			else if(compChoice == 2)
			{
				System.out.println("Computer Choice : Paper");
				System.out.println("You Loose");
				
			}
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
		
		Scanner.close();

	}

	public static void main(String[] args) {
		Scissor
	}

}
