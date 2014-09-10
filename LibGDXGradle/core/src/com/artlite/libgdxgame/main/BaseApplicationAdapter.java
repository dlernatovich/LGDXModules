package com.artlite.libgdxgame.main;

import com.artlite.libgdxgame.constants.BackgroundColor;
import com.artlite.libgdxgame.enteties.ScreenConfiguration;
import com.artlite.libgdxgame.helpers.CameraUtils;
import com.artlite.libgdxgame.providers.ScreenConfigurationProvider;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.OrthographicCamera;

/**
 * Created by dlernatovich on 8/14/14.
 */
public abstract class BaseApplicationAdapter extends ApplicationAdapter implements InputProcessor {
    protected ScreenConfiguration screen;
    protected OrthographicCamera camera;
    protected BackgroundColor color;


    @Override
    public void create() {
        screen = new ScreenConfigurationProvider().get();
        camera = CameraUtils.getCameraFromScreen(screen);
        color = BackgroundColor.WHITE;
    }

    protected void setInputProcessor(InputProcessor inputProcessor) {
        Gdx.input.setInputProcessor(inputProcessor);
    }

    protected float getDeltaTime() {
        return Gdx.graphics.getDeltaTime();
    }

    @Override
    public abstract void dispose();

    @Override
    public abstract void render();

    protected abstract void update();

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
