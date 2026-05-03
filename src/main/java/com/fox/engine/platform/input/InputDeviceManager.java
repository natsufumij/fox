package com.fox.engine.platform.input;

import com.fox.engine.platform.window.GameWindow;

/**
 * 输入设备抽象层。
 */
public interface InputDeviceManager {
    void bind(GameWindow window);
}
