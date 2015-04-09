package com.artlite.libgdxgame.stages;

import com.artlite.libgdxgame.actors.MovingBackgroundActor;
import com.artlite.libgdxgame.stages.abs.BaseStage;

/**
 * Created on 4/9/15.
 */
public class MenuStage extends BaseStage {

    private MovingBackgroundActor staticActor;

    @Override
    protected void onCreate() {
        staticActor = new MovingBackgroundActor("new_game/sakura_bg.png");
        addActor(staticActor);

    }

    @Override
    protected void onDraw() {
    }
}
