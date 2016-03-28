package com.shc.silenceengine.backend.lwjgl;

import com.shc.silenceengine.core.SilenceEngine;

/**
 * The LwjglRuntime initializes the LWJGL library, and starts the native event loop.
 *
 * @author Sri Harsha Chilakapati
 */
public final class LwjglRuntime
{
    private LwjglRuntime()
    {
    }

    public static void start()
    {
        SilenceEngine.io = new LwjglIODevice();
        SilenceEngine.display = new LwjglDisplayDevice();
        SilenceEngine.graphics = new LwjglGraphicsDevice();
    }
}
