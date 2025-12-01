import java.util.Scanner;

public class IntroNode extends StoryNode {

    @Override
        
    public void play(Player player, Scanner in) {

            int pounds = 25;

        System.out.println();
        System.out.println("	 What Goes Up	");
        System.out.println();
        System.out.println(player.getName() + " started on their journey. " + player.getPossAdj() + " pack with just the essentials and dreams aimed for success.");
        System.out.println("At only " + player.getAge() + " years old, " + player.getProSubj() + " dreams of having the fastest time to summit Mount Borah.");
        System.out.println("In the pack " + player.getPossAdj() + " " + pounds + " pounds of gear clinked soflty." + " Not much, but enough for the hard climb.");
    }
}