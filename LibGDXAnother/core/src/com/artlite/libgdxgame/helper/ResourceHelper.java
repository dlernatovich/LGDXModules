package com.artlite.libgdxgame.helper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class ResourceHelper {
    public static FileHandle getInternalResource(String path) {
        FileHandle handle = Gdx.files.internal(path);
        return handle;
    }
}
