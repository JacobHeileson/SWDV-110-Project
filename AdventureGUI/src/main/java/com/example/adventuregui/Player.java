package com.example.adventuregui;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    private String name;
    private String proSubj;
    private String proObj;
    private String possAdj;
    private int age;

    // ⭐ INVENTORY SYSTEM
    private ArrayList<String> inventory = new ArrayList<>();

    // ⭐ FOOD KEYWORDS (Option 1)
    private static final String[] FOOD_KEYWORDS = {
        "food", "snack", "snacks", "jerky", "bar", "energy bar",
        "trail mix", "sandwich", "fruit"
    };

    // ===== INVENTORY METHODS =====

    public void addItem(String item) {
        inventory.add(item.toLowerCase());
    }

    public boolean hasItem(String item) {
        return inventory.contains(item.toLowerCase());
    }

    public void removeItem(String item) {
        inventory.remove(item.toLowerCase());
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public int countFood() {
        int total = 0;
        for (String item : inventory) {
            if (isFood(item)) total++;
        }
        return total;
    }

    public boolean isFood(String item) {
        item = item.toLowerCase();
        for (String keyword : FOOD_KEYWORDS) {
            if (item.contains(keyword)) return true;
        }
        return false;
    }

    // ===== GETTERS =====

    public String getName() { return name; }
    public String getProSubj() { return proSubj; }
    public String getProObj() { return proObj; }
    public String getPossAdj() { return possAdj; }
    public int getAge() { return age; }

    // ===== CONSTRUCTOR — uses ONLY the Scanner provided =====
    public Player(Scanner in) {

        System.out.print("Enter a name for the character: ");
        name = in.nextLine();

        System.out.print("Enter a pronoun subject (he/she/they): ");
        proSubj = in.nextLine().toLowerCase();

        System.out.print("Enter a pronoun object (him/her/them): ");
        proObj = in.nextLine().toLowerCase();

        System.out.print("Enter a possessive adjective (his/her/their): ");
        possAdj = in.nextLine().toLowerCase();

        System.out.print("Enter an age for the character: ");
        age = Integer.parseInt(in.nextLine()); // prevents newline issues
    }
}

