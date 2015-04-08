package com.artlite.libgdxgame.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.artlite.libgdxgame.enteties.actors.AtlasActor;
import com.artlite.libgdxgame.enteties.actors.StaticActor;

public class MyGdxGame extends BaseApplicationAdapter {

    private SpriteBatch batch;
    private Stage stage;
    private StaticActor background;
    private AtlasActor loadingActor;
    private AtlasActor fingerSprite;

    @Override
    public void create() {
        super.create();
        batch = new SpriteBatch();
        stage = new Stage();

        initializeActor();

        setInputProcessor(this);

        stage.addActor(background);
        stage.addActor(loadingActor);
        stage.addActor(fingerSprite);
    }

    private void initializeActor() {
        background = new StaticActor("future/background.png");
        loadingActor = new AtlasActor("future/loadingsprite.atlas", (screen.getHeigh() / 10),
                (screen.getHeigh() / 10), screen.getWidth() - (screen.getWidth() / 10), 0);
        fingerSprite = new AtlasActor("future/spritefinger.atlas",
                (screen.getHeigh() / 8),
                (screen.getHeigh() / 8));
        fingerSprite.setHideActor(true);
    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(color.getParam1(), color.getParam2(), color.getParam3(), color.getParam4());
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act(getDeltaTime());
        stage.getViewport().setCamera(camera);
        stage.draw();
    }

    @Override
    protected void update() {

    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {

        fingerSprite.setPositionX(screenX);
        fingerSprite.setPositionY(screenY);
        fingerSprite.setHideActor(false);


        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {

        fingerSprite.setPositionX(screenX);
        fingerSprite.setPositionY(screenY);
        fingerSprite.setHideActor(true);

        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {

        fingerSprite.setPositionX(screenX);
        fingerSprite.setPositionY(screenY);

        return true;
    }

}
