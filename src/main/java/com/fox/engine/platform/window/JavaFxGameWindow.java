package com.fox.engine.platform.window;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX 窗口实现。
 */
public class JavaFxGameWindow implements GameWindow {
    private final Stage stage;
    private final String title;
    private final int width;
    private final int height;

    public JavaFxGameWindow(Stage stage, String title, int width, int height) {
        this.stage = stage;
        this.title = title;
        this.width = width;
        this.height = height;

        Scene scene = new Scene(new StackPane(), width, height);
        stage.setTitle(title);
        stage.setScene(scene);
    }

    @Override
    public void show() {
        stage.show();
    }

    @Override
    public void close() {
        stage.close();
    }

    @Override
    public int width() {
        return width;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public String title() {
        return title;
    }
}
