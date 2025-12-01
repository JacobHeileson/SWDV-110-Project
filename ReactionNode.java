import java.util.Scanner;

public class ReactionNode extends StoryNode {

    @Override
        
    public void play(Player player, Scanner in) {

		System.out.print("Enter an action for how the character will react to the climb ahead: ");
		String reaction = in.nextLine().toLowerCase();


		System.out.println("A cracked sign pointed toward the Rocky Mountains, and " + player.getProSubj()
                + " " + reaction + " as " + player.getProSubj() +  " felt a shiver that had nothing to do with the weather.");
        System.out.println("Whatever waited beyond the paved roads would test " + player.getProObj() + " like never before, but " + player.getName()
                + " drove on without looking back.");

		System.out.println();
		System.out.println();
		
    }
}