package com.fox.engine;

import com.fox.engine.core.GameEngine;
import com.fox.engine.platform.input.JavaFxInputDeviceManager;
import com.fox.engine.platform.window.JavaFxGameWindow;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * JavaFX 应用启动入口。
 */
public class FoxApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        EngineConfig config = EngineConfig.defaultConfig();

        JavaFxGameWindow window = new JavaFxGameWindow(
                primaryStage,
                config.name(),
                config.width(),
                config.height());

        GameEngine engine = new GameEngine(window, new JavaFxInputDeviceManager(primaryStage));
        engine.init();
        engine.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
