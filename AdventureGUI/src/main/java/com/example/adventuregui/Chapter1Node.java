package com.example.adventuregui;

import java.util.Scanner;

public class Chapter1Node extends StoryNode {

    public Chapter1Node() {
        super("Chapter 1");
    }

    @Override
    public void play(Player player, Scanner in) {

        int pounds = 25;

        System.out.println("\nChapter 1: Prepping For The Daunting Task\n");

        System.out.print(player.getName() + " has decided to climb Mount Borah. But " 
            + player.getProSubj());

        Grammar.wants(player.getProSubj());

        System.out.print(" another challenge. ");
        System.out.print(Grammar.capitalize(player.getProSubj()));
        System.out.println(" to summit the mountain in the fastest time ever.");

        System.out.println("In order to do that though, " + player.getName()
            + " has to figure out if " + player.getProSubj() + " can even climb Mount Borah to begin with.");

        System.out.print(player.getName() + " needed to do some research. ");
        Grammar.needs(player.getProSubj());

        System.out.println(" to figure out what gear will be necessary.\n");

        // GUESSING GAME
        System.out.println("Guess how many pounds of gear are necessary (hint: it's 25): ");

        int guess = Integer.parseInt(in.nextLine());
        while (guess != pounds) {
            System.out.println("Try again!");
            guess = Integer.parseInt(in.nextLine());
        }

        System.out.println("Correct!\n");

        System.out.println("Let's go shopping. You'll need 15 items of gear, clothes, food, and water.\n");

        // ⭐ PASS SCANNER + PLAYER
        Gear.shoppingList(player.getName(), player, in);

        System.out.println("\nNow that everything is packed, " + player.getName() 
            + " and " + player.getPossAdj() + " dad head toward Mount Borah.");

        System.out.println("How many hours did they drive to reach the mountain base?");
        int hours = Integer.parseInt(in.nextLine());

        Travel.startTrip(hours, player.getName(), player.getPossAdj());

        System.out.println("The weather is sunny! Perfect for the first climb!\n");

        System.out.println("\"Woah…\" " + player.getName() + " says as the mountain rises ahead,");
        System.out.println("tall and impossibly massive under the blue summer sky.");
    }
}
