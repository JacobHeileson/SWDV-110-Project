package com.example.adventuregui;

import java.util.Scanner;

public class Gear {

    public static void shoppingList(String playerName, Player player, Scanner in) {

        int items = 15;

        System.out.println("Enter 15 items to buy for the climb.");
        System.out.println("TIP: If adding food, consider: jerky, snacks, trail mix, sandwich, energy bar, fruit.\n");

        for (int i = 0; i < items; i++) {
            System.out.print("Enter gear item #" + (i + 1) + ": ");
            String item = in.nextLine();
            player.addItem(item); // ⭐ Add directly to inventory
        }

        System.out.println();
        System.out.println("Here's everything " + playerName + " bought:");
        System.out.println("***************");

        int idx = 1;
        for (String item : player.getInventory()) {
            System.out.println(idx + ". " + item);
            idx++;
        }
    }
}

