import java.util.Scanner;

public class BackstoryNode extends StoryNode {

        private String place;
        private String practices;

    public BackstoryNode(String place, String practices) {
        this.place = place;
        this.practices = practices;
    }


    @Override
        
    public void play(Player player, Scanner in) {

        		System.out.println("At 13 years old,  " + player.getProSubj() + " read Into Thin Air by Jon Krakauer and instantly became obsessed with rock climbing.");
		System.out.println(player.getName() + "'s parents soon got a membership at the local " + place + " so " + player.getProSubj() + " could start learning to rock climb.");
        
        System.out.println(Grammar.capitalize(player.getProSubj()) + " started on the beginner levels and was quickly able to get to the top with ease. " + Grammar.capitalize(player.getProSubj()) + " started on the beginner levels and was quickly able to get to the top with ease. ");
		System.out.println("Practicing " + practices + " times a week, " + player.getName() + " gradually became one of the best young climbers at the " + place + ".");
		System.out.println("Soon enough, to no one's surprise, the local " + place + "'s walls were too easy for " + player.getProObj() + ". ");
		System.out.println(player.getName() + " needed a challenge. So " + player.getProSubj() + " started to tackle on actual mountains. The challenge, and risk, grew.");
		
		System.out.println();
		System.out.println();
		
		//The character needs a challenge. This is where the challenge is reintroduced and the suspense builds.
		System.out.println(player.getName() + " first climbed tall hills and small mountains. Steep, but mostly easy terrain. ");
		System.out.println("I want to climb REAL mountains. " + player.getProSubj() + " thought to himself. ");
		System.out.println("So with the help of " + player.getProObj() + " dad, he got all the necessary gear: Carabiners, rope, a climbing pack, a harness, and a helmet. ");
		System.out.println("Now, at " + player.getAge() + " years old, " + player.getName() + " felt ready. " + player.getProSubj() + " wanted to climb the tallest mountain in Idaho: Mount Borah. ");
		System.out.println("But not only that. " + player.getName() + " wanted to be the fastest to ever do it. " + player.getProObj() + " dream was to break Luke Nelsons record of 1:26:46. ");

    }
}