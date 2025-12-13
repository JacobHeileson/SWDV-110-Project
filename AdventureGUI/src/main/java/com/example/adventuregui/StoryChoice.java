package com.example.adventuregui;

public class StoryChoice {

    private String description;
    private StoryNode nextNode;

    public StoryChoice(String description, StoryNode nextNode) {
        this.description = description;
        this.nextNode = nextNode;
    }

    public String getDescription() {
        return description;
    }

    public StoryNode getNextNode() {
        return nextNode;
    }
}
