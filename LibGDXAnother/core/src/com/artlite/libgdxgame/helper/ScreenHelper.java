package com.artlite.libgdxgame.helper;

import com.artlite.libgdxgame.enteties.GameDisplay;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Class which provide the manage of the Screen parameters
 * Created on 4/9/15.
 */
public class ScreenHelper {

    /**
     * Method which provide the getting of the display size
     *
     * @return current display size
     */
    public static GameDisplay getGameDisplay() {
        return new GameDisplay(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    /**
     * Method which provide the creating camera from
     * DisplaySize class
     *
     * @param gameDisplay current DisplaySize
     * @return OrthographicCamera
     */
    public static OrthographicCamera getCameraFromDisplay(GameDisplay gameDisplay) {
        OrthographicCamera camera = new OrthographicCamera(
                gameDisplay.getWidth(), gameDisplay.getHeigh());
//        camera.setToOrtho(true, gameDisplay.getWidth(), gameDisplay.getHeigh());
        camera.translate(gameDisplay.getWidth() / 2, gameDisplay.getHeigh() / 2);
        camera.update();
        return camera;
    }

    public static OrthographicCamera getCamera() {
        return getCameraFromDisplay(getGameDisplay());
    }

}
