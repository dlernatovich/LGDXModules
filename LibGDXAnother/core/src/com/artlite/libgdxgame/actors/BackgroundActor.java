package com.artlite.libgdxgame.actors;

import com.artlite.libgdxgame.actors.abs.BaseActor;
import com.artlite.libgdxgame.enteties.GameDisplay;
import com.artlite.libgdxgame.helper.ResourceHelper;
import com.artlite.libgdxgame.helper.ScreenHelper;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public class BackgroundActor extends BaseActor {

    private Texture backgroundTexture;
    private Sprite backgroundSprite;
    private Rectangle bounds;

    public BackgroundActor(String resourcePath) {
        super();
        backgroundTexture = new Texture(ResourceHelper.getInternalResource(resourcePath));
        GameDisplay display = ScreenHelper.getGameDisplay();
        backgroundSprite = new Sprite(backgroundTexture);
        backgroundSprite.setSize(display.getWidth(), display.getHeigh());
        bounds = new Rectangle(positionX, positionY, backgroundSprite.getWidth(), backgroundSprite.getHeight());
        positionX = 0;
        positionY = 0;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        backgroundSprite.setPosition(positionX, positionY);
        updateBounds(positionX, positionY);
        backgroundSprite.draw(batch);
    }

    private void updateBounds(int x, int y) {
        bounds.set(positionX, positionY, bounds.getWidth(), bounds.getHeight());
    }
}
