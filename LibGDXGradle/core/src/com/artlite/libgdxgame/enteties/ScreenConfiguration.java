package com.artlite.libgdxgame.enteties;

/**
 * Created by dlernatovich on 8/14/14.
 */
public class ScreenConfiguration {
    private int width;
    private int heigh;

    public ScreenConfiguration(int width, int heigh) {
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
