package com.fox.engine.platform.input;

import com.fox.engine.platform.window.GameWindow;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 * JavaFX 输入设备实现，当前仅示例键盘事件。
 */
public class JavaFxInputDeviceManager implements InputDeviceManager {
    private final Stage stage;

    public JavaFxInputDeviceManager(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void bind(GameWindow window) {
        Scene scene = stage.getScene();
        if (scene != null) {
            scene.addEventHandler(KeyEvent.KEY_PRESSED, e -> {
                if (e.getCode() != null) {
                    System.out.println("Key pressed: " + e.getCode().name());
                }
            });
        }
    }
}
