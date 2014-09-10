//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//
//import javax.microedition.khronos.opengles.GL10;
//
///**
// * Created by dlernatovich on 7/10/14.
// */
//public class StaticTextureGameScene extends BaseApplicationListener {
//
//    private SpriteBatch batch;
//    private Texture texture;
//    private Sprite sprite;
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        texture = new Texture(Gdx.files.internal("data/other/cluster_icon.png"));
//        sprite = new Sprite(texture);
//
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//        batch.begin();
//        sprite.draw(batch);
//        batch.end();
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        texture.dispose();
//
//    }
//}
