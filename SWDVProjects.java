import java.util.Scanner;

public class SWDVProjects{
       public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Player player = new Player();
		
		//Where the character practices climbing
		System.out.print("Enter a place to train (ie. RecCenter, YMCA): ");
		String place = in.nextLine().toUpperCase();
	
		//How many times the character practices per day
		System.out.print("Enter a number of practices per day: ");
		String practices = in.nextLine().toLowerCase();
		

			// Build story nodes
			StoryNode[] story = {
				new IntroNode(),
				new ReactionNode(),
				new BackstoryNode(place, practices),
				new Chapter1Node(),
				new Chapter2Node(),
		
			};

			//Run the program
			for (StoryNode node : story) {
            	node.play(player, in);
        	}

	}
}

		
