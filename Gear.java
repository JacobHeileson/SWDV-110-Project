import java.util.Scanner;

public class Gear {

    public static void shoppingList(String playerName) {
        Scanner in = new Scanner(System.in);
        int items = 15;
        String[] gear = new String[items];

        for (int i = 0; i < items; i++) {
            System.out.print("Enter gear item #" + (i + 1) + ": ");
            gear[i] = in.nextLine();
        }

        System.out.println();
        System.out.println("Here's everything " + playerName + " bought:");
        System.out.println("***************");

        for (int i = 0; i < items; i++) {
            System.out.println((i + 1) + ". " + gear[i]);
        }
    }
}