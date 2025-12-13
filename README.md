Mount Borah Adventure – SWDV110 Final Project

Author: Jacob Heileson
Course: SWDV 105/110

 Overview

This project is an interactive "choose-your-own-adventure" style program where the user creates a climber and follows their journey to summit Idaho’s tallest peak — Mount Borah.
The player chooses: Name, age, pronouns, gear items for the climb, actions during the ascent, rest choices, food decisions, and route challenges.
The story unfolds across multiple polymorphic StoryNode scenes, creating a structured, object-oriented narrative experience.

*How to Run the Program
Option 1: Console Version (AdventureRunner)
This version runs the full interactive story in the terminal.
Open the project in IntelliJ (recommended).
Run the file:
AdventureRunner.java
Follow the prompts to enter character information and progress through the story.

Option 2: GUI Shell (JavaFX)
The project also includes a simple JavaFX front-end.
This GUI shell satisfies the SWDV105 requirement of "building a clean UI shell that interacts with your scene engine."

To run it:
Install JDK 22
Make sure JavaFX dependencies load (Maven handles this automatically)
Run via Maven sidebar:
javafx:run

This GUI demonstrates:

Event-driven structure
View/controller separation
Connection to the StoryNode engine

*Project Structure
src/main/java/com/example/adventuregui/
│
├── Player.java               // builds the user’s character
├── StoryNode.java            // abstract scene type (polymorphic)
├── StoryChoice.java          // branching choice for GUI use
│
├── IntroNode.java            // Scene 1
├── ReactionNode.java         // Scene 2
├── BackstoryNode.java        // Scene 3
├── Chapter1Node.java         // Scene 4
├── Chapter2Node.java         // Scene 5 (recursive & interactive)
│
├── Gear.java                 // Gear shopping system
├── Travel.java               // Travel simulation
│
├── AdventureRunner.java      // Console-based controller
└── MainApp / MainController  // JavaFX UI shell

Features Included

Object-Oriented Design
Abstract classes
Polymorphism
Encapsulation
Method overriding
Interactive Gameplay
Player-created character
Input-driven story progression
Branching decision points
Recursion (route builder, menus)
Collections (ArrayList inventory)
Loops (while, for, enhanced for)
Custom classes for story nodes
JavaFX GUI shell overlay

*Narrative Summary*

Your character begins as a young climber inspired by "Into Thin Air."
After practicing at the local climbing gym, they decide to attempt Mount Borah — the tallest peak in Idaho.

Their journey includes:

Building backstory

Gathering gear

Making navigation choices

Conquering major route obstacles

Rest choices

A fully recursive climb loop in Chapter 2

Multiple emotional and environmental story beats

*Usage*

Run the program, answer prompts such as:

Character details

Gear to pack

Whether to rest or climb

Choices at key checkpoints

Each decision branches into unique story outcomes.


Software Development 105/110

