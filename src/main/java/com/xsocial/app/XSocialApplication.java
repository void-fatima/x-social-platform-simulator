package com.xsocial.app;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Desktop entry point for the X Social platform.
 */
public final class XSocialApplication extends Application {

    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 760;

    @Override
    public void start(Stage stage) {
        Label title = new Label("X Social");
        title.setStyle("-fx-font-size: 32px; -fx-font-weight: bold;");

        StackPane root = new StackPane(title);
        root.setAlignment(Pos.CENTER);

        stage.setTitle("X Social");
        stage.setMinWidth(900);
        stage.setMinHeight(600);
        stage.setScene(new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
