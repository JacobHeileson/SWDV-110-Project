package com.example.adventuregui;

import javafx.fxml.FXML;

public class MainController {

    @FXML
    private void startAdventure() {
        System.out.println("Launching console adventure...");
        MainApp.startConsoleAdventure();
    }
}


