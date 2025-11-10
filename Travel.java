import java.util.Scanner;

public class Travel {

    // --- Method 1: Calculates recommended sleep based on hours ---
    public static int getRecommendedSleeps(int hours) {
        int recommendedSleeps = 0;

        if (hours <= 10) {
            System.out.println("That's not that bad! Only a day's trip!");
        } else {
            System.out.println("Whoo! You're gonna want to sleep in the car for a night or two!");
        }

        if (hours >= 10 && hours <= 20) {
            System.out.println("I would urge you to sleep for 1 night.");
            recommendedSleeps = 1;
        } else if (hours >= 21 && hours <= 29) {
            System.out.println("I would urge you to sleep for 2 nights along the way.");
            recommendedSleeps = 2;
        } else if (hours >= 30) {
            System.out.println("PLEASE sleep for AT LEAST 3 NIGHTS.");
            recommendedSleeps = 3;
        }

        return recommendedSleeps;
    }

    // --- Method 2: Uses the above logic in a trip sequence ---
    public static void startTrip(int hours, String name, String possAdj) {
        Scanner in = new Scanner(System.in);

        int recommendedSleeps = getRecommendedSleeps(hours);
        int sleeps;

        do {
            System.out.println("\nHow many nights are you going to sleep during this trip?:");
            sleeps = in.nextInt();

            if (sleeps != recommendedSleeps) {
                System.out.println("That's not the right amount of sleep! Please try again.");
            }
        } while (sleeps != recommendedSleeps);

        System.out.println("Perfect! Just the right amount of sleep for this trip!");

        int days = sleeps + 1;

        System.out.println("\nAfter " + days + " days and " + sleeps + " sleeps, " + name +
                " and " + possAdj + " dad have made it to the foot of Mount Borah... but how's the weather?");
    }
}

