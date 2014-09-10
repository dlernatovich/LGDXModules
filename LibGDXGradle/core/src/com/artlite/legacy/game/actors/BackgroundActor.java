//package com.artlite.libgdxgame.desktop.legacy.game.actors;
//
//import android.util.Log;
//
//import com.artlite.mygame.constants.SpriteResources;
//import com.artlite.mygame.helpers.SpriteHelper;
//import com.artlite.mygame.providers.ScaleFactorProvider;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class BackgroundActor extends BaseActor implements SpriteResources {
//
//    private static final int DELAY_FACTOR = 5;
//    private List<Sprite> sprites;
//    private int i = 0;
//    private int delay = 0;
//    private float scaleFactor;
//
//    //    "gamedata/back.png"
//    public BackgroundActor(String resourcePath) {
//        super();
//        scaleFactor  = new ScaleFactorProvider().get();
//        Log.e("==> Scale factor: " + scaleFactor, "");
//
//        sprites = new ArrayList<Sprite>();
//        for (int i = 0; i < BACKGROUND_SPRITE.length; i++) {
//            sprites.add(SpriteHelper.createStaticSprite(BACKGROUND_SPRITE[i], scaleFactor));
//        }
//
//    }
//
//    @Override
//    public void draw(SpriteBatch spriteBatch, float v) {
//        if (i == sprites.size() - 1) {
//            i = 0;
//        } else {
//            if (delay == DELAY_FACTOR) {
//                i++;
//                delay = 0;
//            } else {
//                delay++;
//            }
//        }
//        sprites.get(i).draw(spriteBatch);
//    }
//
//
//}
