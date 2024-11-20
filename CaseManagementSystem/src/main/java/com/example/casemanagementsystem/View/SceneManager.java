package com.example.casemanagementsystem.View;

import javafx.animation.FadeTransition;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.util.HashMap;

public class SceneManager {
    private final StackPane rootPane;
    private final HashMap<String, Node> pages = new HashMap<>();

    public SceneManager(StackPane rootPane) {
        this.rootPane = rootPane;
    }

    // Add a page to the manager
    public void addPage(String name, Node page) {
        pages.put(name, page);
    }

    // Switch to a specific page with fade transition
    public void switchTo(String name) {
        if (!pages.containsKey(name)) {
            System.err.println("Page " + name + " not found!");
            return;
        }

        Node page = pages.get(name);

        // If the page is already being displayed, do nothing
        if (rootPane.getChildren().contains(page)) {
            return;
        }

        if (!rootPane.getChildren().isEmpty()) {
            // Fade out the current page
            Node current = rootPane.getChildren().get(0);
            rootPane.getChildren().remove(current);
            rootPane.getChildren().add(page);

        } else {
            // No current page, just add the new page
            rootPane.getChildren().add(page);
        }
    }
}