package com.artlite.libgdxgame.constants;

/**
 * Created by dlernatovich on 8/14/14.
 */
public enum BackgroundColor {
    RED(1, 0, 0, 1),
    BLACK(0, 0, 0, 0),
    WHITE(1, 1, 1, 1);

    private final int param1;
    private final int param2;
    private final int param3;
    private final int param4;

    BackgroundColor(int param1, int param2, int param3, int param4) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
    }

    public int getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public int getParam3() {
        return param3;
    }

    public int getParam4() {
        return param4;
    }
}
