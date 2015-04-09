package com.artlite.libgdxgame.main;

import com.artlite.libgdxgame.managers.StageManager;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by dlernatovich on 8/14/14.
 */
public abstract class BaseApplicationAdapter extends ApplicationAdapter {

    protected StageManager stageManager;

    /**
     * Method which provide the action when game scene is created
     */
    @Override
    public void create() {
        super.create();
        stageManager = getStageManager();
        onCreate();
    }

    /**
     * Method which provide the action when application is
     * working on rendering
     */
    @Override
    public void render() {
        super.render();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //Drawing stageManager
        stageManager.getCurrentStage().act(getDeltaTime());
        stageManager.getCurrentStage().draw();
        onRender();
    }

    /**
     * Method which provide the getting of the delta time
     *
     * @return current delta time
     */
    protected float getDeltaTime() {
        return Gdx.graphics.getDeltaTime();
    }

    /**
     * Method which provide the action when application is resizing
     *
     * @param width  current width
     * @param height current height
     */
    @Override
    public void resize(int width, int height) {
        super.resize(width, height);
    }

    /**
     * Method which provide the action when game is onPause
     */
    @Override
    public void pause() {
        super.pause();
    }

    /**
     * Method which provide the action when game is onResume
     */
    @Override
    public void resume() {
        super.resume();
    }

    /**
     * Method which provide the action when game is onDestroy
     */
    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * ABSTRACT METHODS
     */
    protected abstract void onCreate();

    protected abstract void onRender();

    protected abstract StageManager getStageManager();

}
