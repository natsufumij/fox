package com.fox.engine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EngineConfigTest {

    @Test
    void shouldUseDefaultConfig() {
        EngineConfig config = EngineConfig.defaultConfig();

        assertEquals("Fox Engine", config.name());
        assertEquals(1280, config.width());
        assertEquals(720, config.height());
        assertEquals(60, config.targetFps());
    }
}
