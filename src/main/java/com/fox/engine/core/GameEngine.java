package com.fox.engine.core;

import com.fox.engine.platform.input.InputDeviceManager;
import com.fox.engine.platform.window.GameWindow;

/**
 * 游戏引擎核心编排器。
 */
public class GameEngine {
    private final GameWindow window;
    private final InputDeviceManager inputDeviceManager;

    public GameEngine(GameWindow window, InputDeviceManager inputDeviceManager) {
        this.window = window;
        this.inputDeviceManager = inputDeviceManager;
    }

    public void init() {
        inputDeviceManager.bind(window);
    }

    public void start() {
        window.show();
    }

    public void stop() {
        window.close();
    }
}
