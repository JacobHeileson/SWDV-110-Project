package com.example.adventuregui;

public abstract class StoryNode {

    private String text;
    private StoryChoice choice1;
    private StoryChoice choice2;

    public StoryNode(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public StoryChoice getChoice1() {
        return choice1;
    }

    public StoryChoice getChoice2() {
        return choice2;
    }

    public void setChoice1(StoryChoice choice) {
        this.choice1 = choice;
    }

    public void setChoice2(StoryChoice choice) {
        this.choice2 = choice;
    }

    // all subclasses must implement this
    public abstract void play(Player player, java.util.Scanner in);

    // BUILD YOUR ADVENTURE
    public static StoryNode buildStory() {

        StoryNode reaction = new ReactionNode();
        StoryNode backstory = new BackstoryNode("climbing gym", "3");
        StoryNode chapter1 = new Chapter1Node();
        StoryNode chapter2 = new Chapter2Node();

        reaction.setChoice1(new StoryChoice("Continue", backstory));
        backstory.setChoice1(new StoryChoice("Continue", chapter1));
        chapter1.setChoice1(new StoryChoice("Continue", chapter2));

        return reaction;
    }
}

