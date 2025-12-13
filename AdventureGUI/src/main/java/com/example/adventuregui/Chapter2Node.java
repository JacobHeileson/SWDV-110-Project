package com.example.adventuregui;

import java.util.ArrayList;
import java.util.Scanner;

public class Chapter2Node extends StoryNode {

    public Chapter2Node() {
        super("Chapter 2");
    }

    // =============================
    // STATIC HELPER METHODS (OUTSIDE play)
    // =============================

    public static ArrayList<String> buildRoute(String[] route, int index) {
        if (index == route.length) return new ArrayList<>();
        ArrayList<String> list = buildRoute(route, index + 1);
        list.add(0, route[index]);
        return list;
    }

    public static int climbStep() {
        return 200;
    }

    public static void restMenu(Player player, Scanner in, String name, String poss, String obj, int elevation) {

        while (true) {
            System.out.println("\n--- Rest Menu ---");
            System.out.println("1. Rest");
            System.out.println("2. Eat something" + (player.countFood() > 0 ? "" : " (no food available)"));
            System.out.println("3. Talk to Dad");
            System.out.println("4. Look around");
            System.out.println("5. Continue climbing");
            System.out.print("Choose an option: ");

            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("\n" + name + " takes a deep breath. Warm summer sun washes over the mountainside.");
                    System.out.println("Dad smiles: \"Good. Rest smart, climb strong.\"");
                    break;

                case "2":
                    if (player.countFood() > 0) {
                        for (String item : new ArrayList<>(player.getInventory())) {
                            if (player.isFood(item)) {
                                player.removeItem(item);
                                System.out.println("\n" + name + " eats " + item + ". Energy returns.");
                                System.out.println("Dad nods: \"Fuel is key up here.\"");
                                break;
                            }
                        }
                    } else {
                        System.out.println("\nYou have no food.");
                    }
                    break;

                case "3":
                    System.out.println("\nDad gazes up the ridge.");
                    System.out.println("\"Proud of you, " + name + ". We're doing this together.\"");
                    break;

                case "4":
                    System.out.println("\nThe warm summer air fills your lungs. The valley below glows green.");
                    System.out.println("Mount Borah rises before you, sharp and bright under the sun.");
                    break;

                case "5":
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // =============================
    // MAIN PLAY METHOD
    // =============================

    @Override
    public void play(Player player, Scanner in) {

        String name = player.getName();
        String poss = player.getPossAdj();
        String obj = player.getProObj();

        int[] checkpointElev = { 9500, 11300, 11800, 12400 };
        boolean[] visited = new boolean[4];

        String[] checkpointStory = {
                "\nTreeline thins out, sky expanding above. The climb becomes real.",
                "\nChicken-Out Ridge looms—narrow, exposed. Many turn back here.",
                "\nA fragile snow bridge spans a steep gap. It looks passable today.",
                "\nLoose scree slides under each step. The final summit push begins."
        };

        int elevation = 7500;
        int summit = 12662;

        System.out.println("\nChapter 2: The First Climb\n");

        // ROUTE
        String[] route = {
                "Trailhead (7,500 ft)",
                "Treeline",
                "Base of Chicken-Out Ridge (11,300 ft)",
                "The Snow Bridge",
                "Final Summit Push",
                "Summit (12,662 ft)"
        };

        ArrayList<String> list = buildRoute(route, 0);
        System.out.println("Today's climbing route:");
        for (String s : list)
            System.out.println(" - " + s);

        System.out.println("\n\"Are you ready?\" Dad asks.");
        System.out.println("\"I'm not sure… it's huge,\" " + name + " admits.");
        System.out.println("\"You're ready. And I'm right here with you.\"");
        System.out.println("\nThe climb begins.\n");

        // MAIN LOOP
        while (elevation < summit) {

            System.out.print("\nClimb or rest? (climb/rest): ");
            String choice = in.nextLine();

            if (choice.equalsIgnoreCase("rest")) {
                restMenu(player, in, name, poss, obj, elevation);
                continue;
            }

            int old = elevation;
            elevation += climbStep();

            System.out.println("\n" + name + " climbs upward...");
            System.out.println(name + " is now at **" + elevation + " feet**.");

            // CHECKPOINTS
            for (int i = 0; i < 4; i++) {

                if (!visited[i] && old < checkpointElev[i] && elevation >= checkpointElev[i]) {

                    visited[i] = true;
                    System.out.println(checkpointStory[i]);

                    // Chicken-Out Ridge decision
                    if (i == 1) {
                        System.out.print("\nDoes " + name + " cross Chicken-Out Ridge? (yes/no): ");
                        String ridge = in.nextLine();

                        if (ridge.equalsIgnoreCase("no")) {
                            System.out.println(name + " hesitates. Wind cuts across the ridge.");
                            System.out.println("Dad grips " + poss + " shoulder: \"I'm here. We cross together.\"");
                        } else {
                            System.out.println(name + " steps carefully onto the narrow spine of rock.");
                        }
                    }
                }
            }
        }

        System.out.println("\nAt last, the summit crest rises…");
        System.out.println("With one final step, " + name + " stands atop Mount Borah for the first time!");
        System.out.println("The warm wind rushes past as Idaho stretches endlessly below.");
    }
}
