package com.fox.engine;

/**
 * 引擎启动器。
 */
public class EngineBootstrap {

    private final EngineConfig config;

    public EngineBootstrap(EngineConfig config) {
        this.config = config;
    }

    public void start() {
        System.out.printf("Starting %s (%dx%d @ %d FPS)%n",
                config.name(), config.width(), config.height(), config.targetFps());
    }
}
