import java.util.ArrayList;
import java.util.Scanner;

public class Chapter2Node extends StoryNode {

    // RECURSIVE METHOD #1 
    public static ArrayList<String> buildRoute(String[] route, int index) {
        if (index == route.length) {
            return new ArrayList<>();
        }
        ArrayList<String> list = buildRoute(route, index + 1); 
        list.add(0, route[index]); 
        return list;
    }

    // RECURSIVE METHOD #2 
    public static int countSteps(int current, int target) {
        if (current == target) {
            return current;  
        }
        return countSteps(current + 1, target); 
    }

    @Override
    public void play(Player player, Scanner in) {

        String[] borahRoute = {
            "Trailhead (7,500 ft)",
            "Treeline",
            "Base of Chicken-Out Ridge (11,300 ft)",
            "The Snow Bridge (seasonal)",
            "Upper West Face / Final Summit Push",
            "Summit (12,662 ft)"
        };

        // STRUCTURE RECURSION CALL
        System.out.println();
        System.out.println("Chapter 2: The First Climb");
        System.out.println();
        System.out.println("Before beginning the climb, " + player.getName() 
            + " studies the major checkpoints of Mount Borah...");

        ArrayList<String> routePlan = buildRoute(borahRoute, 0);

        System.out.println("The climbing route for today:");
        for (String checkpoint : routePlan) {
            System.out.println(" - " + checkpoint);
        }
        System.out.println();

        // STORY
        System.out.println("\"Are you ready?\" " + player.getName() + "'s dad says.");
        System.out.println("\"I don't know dad... This seems way more daunting now that we are here.\""); 
        System.out.println(player.getName() + "'s dad turns to " + player.getProObj() + ", puts his hand on " + player.getName() + "'s shoulder and pauses.");
        System.out.println("\"You have been training for this for months. You are capable of this. " + "You won't break the record today. But I will be right next to you to guide you to the top.\"");
        System.out.println("\"Okay Dad... Let's go.\"");
        System.out.println(player.getName() + "'s breath leaves " + player.getPossAdj() + " lungs as " + player.getProObj() + " and " + player.getPossAdj() + " dad start in the biggest climb of their life up to this point.");
        System.out.println();
        System.out.println("The trail steepens almost immediately as " + player.getName()  + " begins the first true climb of the day.");
        System.out.println(player.getName() + " focuses on breathing steadily as the ground grows steeper and rockier.");

        int steps = countSteps(0, 120);
        System.out.println(player.getName() + " pushes through " + steps + " steady steps before reaching the base of Chicken-Out Ridge.");

        System.out.println();
        System.out.println("The narrow arête stretches across the mountain, dropping sharply on both sides.");
        System.out.println("It's the point where many hikers turn back, just like its name warns.");

        System.out.print("Does " + player.getName() + " cross Chicken-Out Ridge? (yes/no): ");
        String ridgeChoice = in.nextLine().toLowerCase();

        if (ridgeChoice.equals("no")) {
            System.out.println(player.getName() + " hesitates, gripping the rock nervously.");
            System.out.println("But " + player.getPossAdj() + " dad steps forward, offering a steadying hand.");
            System.out.println("\"I'm right here. We'll cross together.\"");
            System.out.println(player.getName() + " breathes deep and nods.");
        } else {
            System.out.println(player.getName() + " nods confidently and steps onto the narrow ridge.");
        }

        System.out.println();
        System.out.println("After crossing the ridge, the trail climbs sharply through loose scree and talus.");
        System.out.println("Each step sends small rocks sliding back, but " + player.getName() + " keeps moving upward.");

        System.out.println();
        System.out.println("Finally, after a long push, the summit comes into view—");
        System.out.println("—and then, with a final step, " + player.getName() + " stands on the SUMMIT of Mount Borah for the first time!");
        
        System.out.println("The wind is fierce at 12,662 feet, but the view makes every step worth it.");
        System.out.println("No records broken today, but the mountain has been conquered.");
    }
}
