package com.example.adventuregui;

import java.util.Scanner;

public class BackstoryNode extends StoryNode {

	private String place;
	private String practices;

	public BackstoryNode(String place, String practices) {
		super("Backstory Node");
		this.place = place;
		this.practices = practices;
	}

	@Override
	public void play(Player player, Scanner in) {

		System.out.println("At 13 years old,  " + player.getProSubj() +
				" read Into Thin Air by Jon Krakauer and instantly became obsessed with rock climbing.");
		System.out.println(player.getName() + "'s parents soon got a membership at the local "
				+ place + " so " + player.getProSubj() + " could start learning to rock climb.");

		System.out.println(player.getProSubj() + " started on the beginner levels and was "
				+ "quickly able to get to the top with ease.");
		System.out.println("Practicing " + practices + " times a week, " + player.getName()
				+ " gradually became one of the best young climbers at the " + place + ".");

		System.out.println();
	}
}