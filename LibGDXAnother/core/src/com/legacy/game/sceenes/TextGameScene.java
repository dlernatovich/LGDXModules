package com.legacy.game.sceenes;//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import android.graphics.Color;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.g2d.BitmapFont;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//
//public class TextGameScene extends BaseApplicationListener {
//
//    private SpriteBatch batch;
//    private BitmapFont font;
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        font = new BitmapFont();
//        font.setScale(2);
//        font.setColor(Color.GREEN);
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        font.dispose();
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//        batch.begin();
//        font.draw(batch, "Hello world", 10, 300);
//        batch.end();
//    }
//}
