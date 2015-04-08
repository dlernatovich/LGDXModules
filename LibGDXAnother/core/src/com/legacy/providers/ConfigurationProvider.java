package com.legacy.providers;//package com.artlite.libgdxgame.desktop.legacy.providers;
//
//import com.artlite.mygame.constants.ScreenConstants;
//import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
//import com.badlogic.gdx.backends.android.surfaceview.FillResolutionStrategy;
//import com.badlogic.gdx.backends.android.surfaceview.ResolutionStrategy;
//
//public class ConfigurationProvider implements BaseProvider<AndroidApplicationConfiguration>, ScreenConstants {
//    public AndroidApplicationConfiguration get() {
//        ResolutionStrategy resolutionStrategy = new FillResolutionStrategy();
//        resolutionStrategy.calcMeasures(SCREEN_WIDTH, SCREEN_HEIGH);
//        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
//        config.useAccelerometer = false;
//        config.useCompass = false;
//        config.useWakelock = true;
//        config.useGL20 = true;
//        config.resolutionStrategy = resolutionStrategy;
//        return config;
//    }
//}
