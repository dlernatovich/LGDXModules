package com.artlite.libgdxgame.enteties;

/**
 * Class which provide the retrieving
 * the data about screen
 * Created on 4/9/15.
 */
public class GameDisplay {
    private int width;
    private int heigh;

    public GameDisplay(int width, int heigh) {
        this.width = width;
        this.heigh = heigh;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
}
