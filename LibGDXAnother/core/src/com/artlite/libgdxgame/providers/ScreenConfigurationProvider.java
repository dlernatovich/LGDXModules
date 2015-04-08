package com.artlite.libgdxgame.providers;

import com.badlogic.gdx.Gdx;
import com.artlite.libgdxgame.enteties.ScreenConfiguration;

/**
 * Created by dlernatovich on 8/14/14.
 */
public class ScreenConfigurationProvider implements BaseProvider<ScreenConfiguration> {

    @Override
    public ScreenConfiguration get() {
        ScreenConfiguration configuration = new ScreenConfiguration(Gdx.graphics.getWidth(),
                Gdx.graphics.getHeight());
        return configuration;
    }
}
