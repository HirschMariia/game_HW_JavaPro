package org.example;

import java.util.Scanner;

public class RockScissorsPaperGame {


    public static void main(String[] args) {
        Player player = new Player();
        Player computer = new Player();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play Rock, Scissors, Paper! Enter your choice: ROCK, SCISSORS, PAPER");

        while (player.getCountLoosed() < 3) {
            System.out.print("Your choice: ");
            String userInput = scanner.nextLine().toUpperCase();

            switch (userInput) {
                case "ROCK":
                    player.getChoice(GameChoice.ROCK);
                    break;
                case "SCISSORS":
                    player.getChoice(GameChoice.SCISSORS);
                    break;
                case "PAPER":
                    player.getChoice(GameChoice.PAPER);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter ROCK, SCISSORS, or PAPER.");
                    continue;
            }

            computer.makeRandomChoice();
            GameChoice computerChoice = computer.getChoice(GameChoice.ROCK);

            if (player.getChoice(GameChoice.ROCK) == computerChoice) {
                System.out.println("It's a tie: " + player.getChoice(GameChoice.ROCK) + " --- " + computerChoice);
            } else if ((player.getChoice(GameChoice.ROCK).ordinal() + 1) % 3 == computerChoice.ordinal()) {
                System.out.println("Computer wins: " + player.getChoice(GameChoice.ROCK) + " --- " + computerChoice);
                player.setCountLoosed(player.getCountLoosed() + 1);
            } else {
                System.out.println("You win: " + player.getChoice(GameChoice.ROCK) + " --- " + computerChoice);
                player.setCountWins(player.getCountWins() + 1);
            }
        }

        System.out.println("Game over!");
        System.out.println("Your wins: " + player.getCountWins());
        System.out.println("Your losses: " + player.getCountLoosed());
    }
}