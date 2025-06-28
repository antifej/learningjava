package Lessons_class;
import java.util.ArrayList;
import java.util.Scanner;

import Java_class.ComputerGame;
import java_enum.Console;
//08.06.2025

public class Lesson38 {

	public static void main(String[] args) {
			ComputerGame game1 = new ComputerGame("The Legend of Zelda: Tears of a Kingdom ", 68.99, Console.NintendoSwitch2, false);
			ComputerGame game2 = new ComputerGame("Roblox ", 0, Console.NintendoSwitch2, false);
			ComputerGame game3 = new ComputerGame("Minecraft ", 66.50, Console.NintendoSwitch2, true);
			ComputerGame game4 = new ComputerGame("GTA: San Andreas ", 37.80, Console.PC, true);
			ComputerGame game5 = new ComputerGame("Need for Speed: Most Wanted ", 46.30, Console.PC, false);
			ComputerGame game6 = new ComputerGame("Gameboy ", 31.2, Console.NintendoSwitch2, true);
            
			
			ArrayList<ComputerGame>gameList = new ArrayList<ComputerGame>();
            gameList.add(game1);
            gameList.add(game2);
            gameList.add(game3);
            gameList.add(game4);
            gameList.add(game5);
            gameList.add(game6);
            
            for(ComputerGame oneGame: gameList) {
            	oneGame.printInformationAboutGame();
            	
            	
            	//print all games that you can play on PC
            	System.out.print("Games that you can play on your PC ");
           
            	
            } 
            
            
            for(ComputerGame oneGame: gameList) {
            	if(oneGame.gameConsole == Console.PC) {
            		System.out.println(oneGame.gameName+"");
            	}
            }
            
            //get all game price
            double allGamePrice = 0;
            for(ComputerGame oneGame:gameList) {
            	allGamePrice += oneGame.gamePrice;
            	
            }
            System.out.print("\nAll game price is "+ allGamePrice);
            
            //enter money to check whitch games you can buy
            Scanner sk1 = new Scanner(System.in);
            System.out.println("Enter you money");
            double userMoney = sk1.nextDouble();
            System.out.println("You can buy");
            for(ComputerGame oneGame: gameList) {
            	if(oneGame.buyGame(userMoney)) {
            		System.out.print(oneGame.gameName);
            	}
            }
	}

}
