package com.artlite.libgdxgame.enteties.actors;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by dlernatovich on 9/15/14.
 */
public class AtlasActor extends BaseActor {

    private TextureAtlas textureAtlas;
    private Animation animation;
    private int heigh;
    private int width;
    private boolean isHideActor;


    public AtlasActor(String atlasPath) {
        textureAtlas = new TextureAtlas(atlasPath);
        animation = new Animation(1 / 15f, textureAtlas.getRegions());
        isHideActor = false;
        heigh = getDefaultHeigh();
        width = getDefaultWidth();
    }

    public AtlasActor(String atlasPath, int heigh, int width) {
        this(atlasPath);
        setHeigh(heigh);
        setWidth(width);
    }

    public AtlasActor(String atlasPath, int heigh, int width, int x, int y) {
        this(atlasPath, heigh, width);
        setPositionX(x);
        setPositionY(y);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        if (!isHideActor) {
            batch.draw(animation.getKeyFrame(getElapsedTime(), true), positionX, positionY,
                    positionX, positionY,
                    width, heigh,
                    1, 1,
                    0);
        }
    }

    @Override
    public Actor hit(float x, float y, boolean touchable) {
        return null;
    }

    @Override
    public void setPositionX(int positionX) {
        super.setPositionX(positionX);
    }

    @Override
    public void setPositionY(int positionY) {
        super.setPositionY(positionY);
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isHideActor() {
        return isHideActor;
    }

    public void setHideActor(boolean isHideActor) {
        this.isHideActor = isHideActor;
    }

    private TextureRegion getKeyFrameByIndex(int index) {
        return animation.getKeyFrames()[index];
    }

    private int getDefaultHeigh() {
        return getKeyFrameByIndex(0).getRegionHeight();
    }

    private int getDefaultWidth() {
        return getKeyFrameByIndex(0).getRegionWidth();
    }

}
