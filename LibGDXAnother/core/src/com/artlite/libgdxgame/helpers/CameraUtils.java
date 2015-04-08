package com.artlite.libgdxgame.helpers;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.artlite.libgdxgame.enteties.ScreenConfiguration;

/**
 * Created by dlernatovich on 8/14/14.
 */
public class CameraUtils {
    public static OrthographicCamera getCameraFromScreen(ScreenConfiguration screenConfiguration) {
        OrthographicCamera camera = new OrthographicCamera(
                screenConfiguration.getWidth(), screenConfiguration.getHeigh());
        camera.setToOrtho(true, screenConfiguration.getWidth(), screenConfiguration.getHeigh());
        return camera;
    }
}
