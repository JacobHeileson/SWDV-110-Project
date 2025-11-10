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
		
        int pounds = 25;

        System.out.println();
        System.out.println("	 What Goes Up	");
        System.out.println();
        System.out.println(player.getName() + " started on their journey. " + player.getPossAdj() + " pack with just the essentials and dreams aimed for success.");
        System.out.println("At only " + player.getAge() + " years old, " + player.getProSubj() + " dreams of having the fastest time to summit Mount Borah.");
        System.out.println("In the pack " + player.getPossAdj() + " " + pounds + " pounds of gear clinked soflty."
                + " Not much, but enough for the hard climb.");

            //How the character reacts as the task begins
		System.out.print("Enter an action for how the character will react to the climb ahead: ");
		String reaction = in.nextLine().toLowerCase();


		System.out.println("A cracked sign pointed toward the Rocky Mountains, and " + player.getProSubj()
                + " " + reaction + " as " + player.getProSubj() +  " felt a shiver that had nothing to do with the weather.");
        System.out.println("Whatever waited beyond the paved roads would test " + player.getProObj() + " like never before, but " + player.getName()
                + " drove on without looking back.");

		System.out.println();
		System.out.println();
		
		//Back story of how the character got into rock climbing.
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
		System.out.print("Now that we have our gear, " + player.getName() + " should climb Mount Borah for the first time. No records will be broken yet, " +player.getProSubj());
		System.out.println(" to just get the lay of the land and successfully climb the mountain first.");
		System.out.println("But that all depends on the weather...If its too stormy, visibility will be virtually 0, and will make the climb much more dangerous.");

		System.out.print("Now that " + player.getName() + " has everything " + player.getProSubj());

        Grammar.needs(player.getProSubj());

		System.out.println(" for this climb, and they can try climbing Mount Borah for the first time ever.");
		System.out.println("" + player.getName() + " should climb Mount Borah during the summer. Producing the best weather for the climb, making it easier for beginners.");
		System.out.println("Lucky for " + player.getProObj() + ", summer is in full swing.");
		System.out.println("" + player.getName() + " and " + player.getPossAdj()  + " dad got time off, and headed out in the pick-up. The gear in the back, and their hopes high.");

        System.out.println("");
		System.out.println("How many hours has" + player.getName() + " and " + player.getPossAdj() + " dad traveled to get to the foot of Mount Borah?:");
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