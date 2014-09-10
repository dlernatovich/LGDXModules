//package com.artlite.libgdxgame.desktop.legacy.game.actors;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.InputProcessor;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.scenes.scene2d.Actor;
//
///**
// * Created by dlernatovich on 7/24/14.
// */
//public abstract class BaseActor extends Actor implements InputProcessor {
//
//    protected int positionX = 0;
//    protected int positionY = 0;
//
//    protected int destX = -1;
//    protected int destY = -1;
//
//    @Override
//    public abstract void draw(SpriteBatch spriteBatch, float v);
//
//    @Override
//    public Actor hit(float v, float v2) {
//        return null;
//    }
//
//
//    public void setX(int x) {
//        this.positionX = x;
//    }
//
//    public void setY(int y) {
//        this.positionY = y;
//    }
//
//    protected void setInputProcessor(InputProcessor inputProcessor) {
//        Gdx.input.setInputProcessor(inputProcessor);
//    }
//
//    public void setTouchable(boolean b) {
//        touchable = b;
//    }
//
//    public boolean touchDown(int i, int i2, int i3, int i4) {
//        return false;
//    }
//
//    public boolean touchUp(int i, int i2, int i3, int i4) {
//        return false;
//    }
//
//    public boolean touchDragged(int i, int i2, int i3) {
//        return false;
//    }
//
//    public boolean touchMoved(int i, int i2) {
//        return false;
//    }
//
//    public int getPositionX() {
//        return positionX;
//    }
//
//    public void setPositionX(int positionX) {
//        this.positionX = positionX;
//    }
//
//    public int getPositionY() {
//        return positionY;
//    }
//
//    public void setPositionY(int positionY) {
//        this.positionY = positionY;
//    }
//
//    public int getDestX() {
//        return destX;
//    }
//
//    public void setDestX(int destX) {
//        this.destX = destX;
//    }
//
//    public int getDestY() {
//        return destY;
//    }
//
//    public void setDestY(int destY) {
//        this.destY = destY;
//    }
//}
