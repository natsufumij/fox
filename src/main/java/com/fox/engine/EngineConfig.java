package com.fox.engine;

/**
 * 引擎基础配置。
 */
public record EngineConfig(String name, int width, int height, int targetFps) {

    public static EngineConfig defaultConfig() {
        return new EngineConfig("Fox Engine", 1280, 720, 60);
    }
}
