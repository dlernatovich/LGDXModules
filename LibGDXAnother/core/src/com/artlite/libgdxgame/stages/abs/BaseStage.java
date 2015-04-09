package com.artlite.libgdxgame.stages.abs;

import com.artlite.libgdxgame.helper.ScreenHelper;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created on 4/9/15.
 */
public abstract class BaseStage extends Stage {

    private OnFinishStageListener onFinishStageListener;

    public BaseStage() {
        super();
        getViewport().setCamera(ScreenHelper.getCamera());
        onCreate();
    }

    protected abstract void onCreate();

    @Override
    public void draw() {
        super.draw();
        onDraw();
    }

    protected abstract void onDraw();

    @Override
    public void dispose() {
        super.dispose();
        if (onFinishStageListener != null) {
            onFinishStageListener.onFinishStage();
        }
    }

    public void setOnFinishStageListener(OnFinishStageListener onFinishStageListener) {
        this.onFinishStageListener = onFinishStageListener;
    }

    public interface OnFinishStageListener {
        void onFinishStage();
    }
}
