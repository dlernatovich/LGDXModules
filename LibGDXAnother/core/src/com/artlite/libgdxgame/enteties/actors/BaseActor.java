package com.artlite.libgdxgame.enteties.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by dlernatovich on 7/24/14.
 */
public abstract class BaseActor extends Actor implements InputProcessor {

    protected int positionX = 0;
    protected int positionY = 0;

    protected int destX = -1;
    protected int destY = -1;

    protected float elapsedTime = 0;

    @Override
    public abstract void draw(Batch batch, float parentAlpha);

    @Override
    public abstract Actor hit(float x, float y, boolean touchable);

    public void setX(int x) {
        this.positionX = x;
    }

    public void setY(int y) {
        this.positionY = y;
    }

    public void setInputProcessor(InputProcessor inputProcessor) {
        Gdx.input.setInputProcessor(inputProcessor);
    }


    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getDestX() {
        return destX;
    }

    public void setDestX(int destX) {
        this.destX = destX;
    }

    public int getDestY() {
        return destY;
    }

    public void setDestY(int destY) {
        this.destY = destY;
    }

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

    protected float getElapsedTime() {
        return elapsedTime += Gdx.graphics.getDeltaTime();
    }
}
