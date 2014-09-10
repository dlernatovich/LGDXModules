//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.helpers.ResourceHelper;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureAtlas;
//
//public class CameraUsage extends BaseApplicationListener {
//
//    private OrthographicCamera camera;
//    private SpriteBatch batch;
//    private TextureAtlas atlas;
//    private Animation animation;
//
//    private float elapsedTime = 0;
//
//    private int x = 0;
//    private int y = 0;
//
//    private GameScreen gameScreen;
//
//
//    @Override
//    public void create() {
//        gameScreen = GameScreen.createScreenFromDefaults();
//
//        camera = new OrthographicCamera(gameScreen.getWidth(), gameScreen.getHeigh());
//        camera.setToOrtho(true, gameScreen.getWidth(), gameScreen.getHeigh());
//
//        batch = new SpriteBatch();
//        atlas = new TextureAtlas(ResourceHelper.getInternalResource("data/atlases/textureatlas"));
//        animation = new Animation(1 / 15f, atlas.getRegions());
//        setInputProcessor(this);
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        atlas.dispose();
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//        batch.setProjectionMatrix(camera.combined);
//        batch.begin();
//        elapsedTime += Gdx.graphics.getDeltaTime();
//        batch.draw(animation.getKeyFrame(elapsedTime, true), x, y);
//        batch.end();
//
//    }
//
//    @Override
//    public boolean touchDragged(int i, int i2, int i3) {
//        x = i;
//        y = i2;
//        return true;
//    }
//
//    @Override
//    public boolean touchDown(int i, int i2, int i3, int i4) {
//        x = i;
//        y = i2;
//        return true;
//    }
//
//}
