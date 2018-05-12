package Runner;

import Game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Game game = new Game("castle");

        System.out.printf("starting game %s", game.getName());



        while (true) {
            System.out.print("what level would you like? ");

            try {
                Scanner input = new Scanner(System.in);
                int level = input.nextInt();
                System.out.printf("You chose level %s", level);
                break;
            } catch (RuntimeException e) {
                System.out.println("We need a number!");

            }
        }

    }
}
