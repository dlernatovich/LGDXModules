package com.artlite.libgdxgame.main;

import com.artlite.libgdxgame.managers.StageManager;
import com.artlite.libgdxgame.stages.MenuStage;
import com.artlite.libgdxgame.stages.abs.BaseStage;

import java.util.Arrays;

public class MyGdxGame extends BaseApplicationAdapter {


    @Override
    protected void onCreate() {

    }

    @Override
    protected void onRender() {

    }

    @Override
    protected StageManager getStageManager() {
        return new StageManager(Arrays.asList(new BaseStage[]{
                new MenuStage()
        }));
    }

}
