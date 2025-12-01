import java.util.Scanner;

public class Chapter1Node extends StoryNode {

    @Override
        
    public void play(Player player, Scanner in) {

        int pounds = 25;

        		//Chapter 1
		System.out.println("");
		System.out.println("Chapter 1: Prepping For The Daunting Task");
		System.out.println("");
		System.out.print(player.getName() + " has decided to climb Mount Borah. But " + player.getProSubj());

        Grammar.wants(player.getProSubj());

		System.out.print(" another challenge. ");

	    System.out.print(Grammar.capitalize(player.getProSubj()));
		
		//Introduces the challenge to the user and allows for some guessing input
		System.out.println(" to summit the mountain in the fastest time ever.");
		System.out.println("In order to do that though, " + player.getName() + " has to figure out if " + player.getProSubj() + " can even climb Mount Borah to begin with.");
		System.out.print(player.getName() + " needed to do some reaserch. ");
		
        Grammar.capitalize(player.getProSubj());
		
        Grammar.needs(player.getProSubj());

		System.out.println(" to figure out what gear, and how much of it, is necessary for the treacherous climb.");
		System.out.println("");
		System.out.println("Guess how many pounds are necessary for this climb: " );

		int guess = in.nextInt();
		while (guess != pounds) {
			System.out.println("Try again!");
			guess = in.nextInt();
		}

		System.out.println("Correct!");
		System.out.println("");
		System.out.print("Now that " + player.getName() + " knows how much gear is necessary for this climb, " +player.getProSubj());
		System.out.println(" to figure out what gear specifically.");

		System.out.print("The gear " + player.getProSubj() + " currently");

        Grammar.has(player.getProSubj());

		System.out.println(" is only good for large hills and small mountains. Borah is anything but.");

        System.out.println("Let's go shopping. " + player.getName() + " will neeed enough clothes, gear, food, and water to get to the top. Lets aim for 15 items.");
        System.out.println("");

        Gear.shoppingList(player.getName());


        System.out.println("");
		System.out.print("Now that we have our gear, " + player.getName() + " should climb Mount Borah for the first time. No records will be broken yet, ");
		System.out.println(" to just get the lay of the land and successfully climb the mountain first.");
		System.out.println("But that all depends on the weather...If its too stormy, visibility will be virtually 0, and will make the climb much more dangerous.");

		System.out.print("Now that " + player.getName() + " has everything " + player.getProSubj());

        Grammar.needs(player.getProSubj());

		System.out.println(" for this climb, and they can try climbing Mount Borah for the first time ever.");
		System.out.println("" + player.getName() + " should climb Mount Borah during the summer. Producing the best weather for the climb, making it easier for beginners.");
		System.out.println("Lucky for " + player.getProObj() + ", summer is in full swing.");
		System.out.println("" + player.getName() + " and " + player.getPossAdj()  + " dad got time off, and headed out in the pick-up. The gear in the back, and their hopes high.");

        System.out.println("");
		System.out.println("How many hours has " + player.getName() + " and " + player.getPossAdj() + " dad traveled to get to the foot of Mount Borah?:");
        int hours = in.nextInt();


        // Call the Travel class to handle the trip
        Travel.startTrip(hours, player.getName(), player.getPossAdj());

   
        // Weather options
        String[] weather = {"sunny", "rainy", "stormy", "windy", "snowy"};
        String currentWeather = weather[0];

        System.out.println("The weather is " + currentWeather + "! Perfect for the first climb!");
        System.out.println("");
        System.out.println("\"Woah...\" " + player.getName() + " says as they pull up to the base of the mountain. The tall mountain, jutting out of the sky like it was thrown in front of them.");
    }
}
