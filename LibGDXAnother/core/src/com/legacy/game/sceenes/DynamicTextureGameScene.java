package com.legacy.game.sceenes;//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureAtlas;
//
//
//public class DynamicTextureGameScene extends BaseApplicationListener {
//
//    private SpriteBatch batch;
//    private TextureAtlas textureAtlas;
//    private Animation animation;
//    private float elapsedTime = 0;
//
//
//    @Override
//    public void create() {
//        batch = new SpriteBatch();
//        textureAtlas = new TextureAtlas(Gdx.files.internal("data/atlases/textureatlas"));
//        animation = new Animation(1 / 15f, textureAtlas.getRegions());
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//        batch.begin();
//        elapsedTime += Gdx.graphics.getDeltaTime();
//        batch.draw(animation.getKeyFrame(elapsedTime, true), ((940 / 2)), ((520 / 2)));
//        batch.end();
//    }
//
//    @Override
//    public void dispose() {
//        batch.dispose();
//        textureAtlas.dispose();
//    }
//}
