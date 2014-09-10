//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import android.util.Log;
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.helpers.ResourceHelper;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureAtlas;
//
//
//public class TouchInteraction extends BaseApplicationListener {
//
//    private SpriteBatch batch;
//    private TextureAtlas textureAtlas;
//    private Animation animation;
//    private float elapsedTime = 0;
//
//    private int x;
//    private int y;
//
//    private GameScreen gameScreen;
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        textureAtlas = new TextureAtlas(ResourceHelper.getInternalResource("data/atlases/textureatlas"));
//        animation = new Animation(1 / 15f, textureAtlas.getRegions());
//        setInputProcessor(this);
//
//        x = 0;
//        y = 0;
//
//        gameScreen = GameScreen.createScreenFromDefaults();
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//        batch.begin();
//
//        elapsedTime += Gdx.graphics.getDeltaTime();
//        batch.draw(animation.getKeyFrame(elapsedTime, true), x, y);
//
//        batch.end();
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        textureAtlas.dispose();
//    }
//
//    @Override
//    public boolean touchDown(int i, int i2, int i3, int i4) {
//        Log.e("==> TouchDown: x: " + x + " y: " + y + " i: " + i + " i2: " + i2, "");
//        x = i;
//        y = gameScreen.getHeigh() - i2;
//        return true;
//    }
//
//    @Override
//    public boolean touchUp(int i, int i2, int i3, int i4) {
//        Log.e("==> TouchUp: x: " + x + " y: " + y + " i: " + i + " i2: " + i2, "");
//        x = i;
//        y = gameScreen.getHeigh() - i2;
//        return true;
//    }
//
//    @Override
//    public boolean touchDragged(int i, int i2, int i3) {
//        x = i;
//        y = gameScreen.getHeigh() - i2;
//        return true;
//    }
//}
