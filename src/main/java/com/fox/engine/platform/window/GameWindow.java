package com.fox.engine.platform.window;

/**
 * 窗口抽象层。
 */
public interface GameWindow {
    void show();

    void close();

    int width();

    int height();

    String title();
}
