package com.artlite.libgdxgame.enteties.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class StaticActor extends BaseActor {

    private Texture backgroundTexture;
    private Sprite backgroundSprite;
    private Rectangle bounds;

    public StaticActor(String resourcePath) {
        super();
        backgroundTexture = new Texture(resourcePath);
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(backgroundTexture.getWidth(),
                backgroundTexture.getHeight());

        backgroundSprite.flip(false, true);

        bounds = new Rectangle(positionX, positionY,
                backgroundSprite.getWidth(), backgroundSprite.getHeight());

        positionX = 0;
        positionY = 0;
    }

    public StaticActor(String resourcePath, int width, int height) {
        this(resourcePath);
        backgroundSprite.setSize(width, height);
    }

    public StaticActor(String resourcePath, float scaleFactor) {
        this(resourcePath);
        bounds = new Rectangle(positionX, positionY,
                backgroundSprite.getWidth() * scaleFactor,
                backgroundSprite.getHeight() * scaleFactor);
        backgroundSprite.scale(scaleFactor);

    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        backgroundSprite.setPosition(positionX, positionY);
        updateBounds(positionX, positionY);
        backgroundSprite.draw(batch);
    }

    @Override
    public Actor hit(float x, float y, boolean touchable) {
        return null;
    }

    private void updateBounds(int x, int y) {
        bounds.set(positionX, positionY, bounds.getWidth(), bounds.getHeight());
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public void setDrawX(int x) {
        positionX = x;
    }

    public void setDrawY(int y) {
        positionY = y;
    }

    public int getActorHeigh() {
        return (int) Math.abs(bounds.getHeight());
    }

    public int getActorWidth() {
        return (int) Math.abs(bounds.getWidth());
    }
}
