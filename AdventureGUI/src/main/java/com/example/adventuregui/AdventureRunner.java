package com.example.adventuregui;

import java.util.Scanner;

public class AdventureRunner {

    public static void start() {

        Scanner in = new Scanner(System.in);

        System.out.println("Launching console adventure...");

        // Build Player
        Player player = new Player(in);

        // Starting node
        StoryNode current = StoryNode.buildStory();

        // And now play the entire chain
        while (current != null) {
            current.play(player, in);

            if (current.getChoice1() == null && current.getChoice2() == null) {
                current = null;
                continue;
            }

            // Show choices
            System.out.println("\nChoose:");
            if (current.getChoice1() != null)
                System.out.println("1. " + current.getChoice1().getDescription());
            if (current.getChoice2() != null)
                System.out.println("2. " + current.getChoice2().getDescription());

            System.out.print("Enter choice: ");
            String input = in.nextLine();

            if (input.equals("1") && current.getChoice1() != null) {
                current = current.getChoice1().getNextNode();
            } else if (input.equals("2") && current.getChoice2() != null) {
                current = current.getChoice2().getNextNode();
            } else {
                System.out.println("Invalid — try again.");
            }
        }

        System.out.println("\n=== End of Adventure ===");
    }
}
