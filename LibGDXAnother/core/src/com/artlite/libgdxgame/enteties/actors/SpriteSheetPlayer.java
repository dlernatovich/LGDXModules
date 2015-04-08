package com.artlite.libgdxgame.enteties.actors;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.artlite.libgdxgame.constants.AnimationProjections;
import com.artlite.libgdxgame.enteties.ScreenConfiguration;
import com.artlite.libgdxgame.helpers.Logger;
import com.artlite.libgdxgame.helpers.SpriteHelper;
import com.artlite.libgdxgame.providers.ScreenConfigurationProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by dlernatovich on 7/28/14.
 */
@SuppressWarnings("unused")
public class SpriteSheetPlayer extends BaseActor {

    private int cols = 0;
    private int rows = 0;

    private List<Animation> animations;

    private Texture texture;
    private float stateTime;
    private AnimationProjections currentProjections;

    private Map<AnimationProjections, Integer> animationMap;

    private Rectangle bounds;
    private ScreenConfiguration screen;

    private int previousX;
    private int previousY;

    private float scaleFactor = -1;

    private SpriteSheetPlayer(String path, int cols, int rows) {
        super();
        this.cols = cols;
        this.rows = rows;

        animations = new ArrayList<Animation>();
        screen = new ScreenConfigurationProvider().get();

        texture = new Texture(Gdx.files.internal(path));
        TextureRegion[][] tmp = TextureRegion.split(texture, texture.getWidth()
                / cols, texture.getHeight() / rows);

        transformSprites(tmp);

        for (int i = 0; i < tmp.length; i++) {
            animations.add(SpriteHelper.createAnimation(tmp[i], 0.075f));
        }
        currentProjections = AnimationProjections.FORWARD;
        initDefaultPositionValue();
        bounds = new Rectangle(positionX, positionY,
                ((texture.getWidth() / cols) - cols),
                (texture.getHeight() / rows) - rows);
    }

    public SpriteSheetPlayer(String path, int cols, int rows,
                             Map<AnimationProjections, Integer> animationMap) {
        this(path, cols, rows);
        this.animationMap = animationMap;
    }

    public SpriteSheetPlayer(String path, int cols, int rows,
                             Map<AnimationProjections, Integer> animationMap, float scaleFactor) {
        this(path, cols, rows, animationMap);
        this.scaleFactor = scaleFactor;
    }

    @Override
    public void draw(Batch spriteBatch, float v) {
        stateTime += Gdx.graphics.getDeltaTime();
        updatePosition();
        updateBounds(positionX, positionY);

        TextureRegion region = getCurrentRegion();

        Logger.println("==> Draw parameters" + positionX + " " + positionY + " "
                + region.getRegionWidth() / 2 + " "
                + region.getRegionHeight() / 2 + " "
                + region.getRegionWidth() + " " + region.getRegionHeight()
                + " " + this.scaleFactor + " " + this.scaleFactor + " "
                + 180);

        spriteBatch.draw(region, positionX, positionY,
                region.getRegionWidth() / 2, region.getRegionHeight() / 2,
                region.getRegionWidth(), region.getRegionHeight(),
                this.scaleFactor, this.scaleFactor, 180);
    }

    @Override
    public Actor hit(float x, float y, boolean touchable) {
        return null;
    }

    @Override
    public boolean touchDown(int i, int i2, int i3, int i4) {
        Logger.println("==> TouchDown", "");
        currentProjections = defineProjections(positionX, i);
        destX = i;
        return super.touchDown(i, i2, i3, i4);
    }

	/*
     * Setters and getters
	 */

    public Map<AnimationProjections, Integer> getAnimationMap() {
        return animationMap;
    }

    public void setAnimationMap(Map<AnimationProjections, Integer> animationMap) {
        this.animationMap = animationMap;
    }

	/*
     * Other sprite functions
	 */

    private void transformSprites(TextureRegion[][] regions) {
        for (int i = 0; i < regions.length; i++) {
            for (int j = 0; j < regions[i].length; j++) {
                regions[i][j].flip(false, false);
            }
        }
    }

    private AnimationProjections defineProjections(int currentX, int destX) {
        Logger.println("==> cX: " + currentX + " dX: " + destX, "");
        AnimationProjections projections = AnimationProjections.FORWARD;
        if ((currentX - destX) > 0) {
            projections = AnimationProjections.BACKWARD;
        }
        return projections;
    }

    private void updatePosition() {
        if ((destX > 0)) {
            double value = (destX - positionX);
            if (value > 0) {
                value = 1;
            } else {
                value = -1;
            }
            previousX = positionX;
            positionX += value;
            if (positionX == destX) {
                destX = -1;
            }
        }
    }

    private void updateBounds(int x, int y) {
        bounds.set(positionX, positionY, bounds.getWidth(), getPlayerHeigh());
    }

    public Rectangle getBounds() {
        return bounds;
    }

    public void setBounds(Rectangle bounds) {
        this.bounds = bounds;
    }

    public void setDrawX(int x) {
        positionX = x;
        previousX = positionX;
    }

    public void setDrawY(int y) {
        positionY = y;
        previousY = positionY;
    }

    public int getPlayerHeigh() {
        return (int) Math.abs(bounds.getHeight());

    }

    public int getPlayerWidth() {
        return (int) Math.abs(bounds.getWidth());
    }

    public void denyMovement() {
        destX = -1;
        destY = -1;
        positionX = previousX;
    }

    private void initDefaultPositionValue() {
        positionX = 0;
        positionY = 0;
    }

    private TextureRegion getCurrentRegion() {
        TextureRegion region;
        if (destX == -1) {
            region = animations.get(
                    animationMap.get(currentProjections)).getKeyFrame(0,
                    true);
        } else {
            region = animations.get(
                    animationMap.get(currentProjections)).getKeyFrame(stateTime,
                    true);
        }
        return region;
    }
}
