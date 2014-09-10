//package com.artlite.libgdxgame.desktop.legacy.helpers;
//
//
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//import com.badlogic.gdx.graphics.g2d.TextureAtlas;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//
//public class SpriteHelper {
//    public static Sprite createStaticSprite(String resourcePath) {
//        Texture staticActorAtlas = new Texture(ResourceHelper.getInternalResource(resourcePath));
//        Sprite staticActorAnimation = new Sprite(staticActorAtlas);
//        return staticActorAnimation;
//    }
//
//    public static Sprite createStaticSprite(String resourcePath, float scaleFactor) {
//        Texture staticActorAtlas = new Texture(ResourceHelper.getInternalResource(resourcePath));
//        Sprite staticActorAnimation = new Sprite(staticActorAtlas);
//        staticActorAnimation.scale(scaleFactor);
//        return staticActorAnimation;
//    }
//
//    public static Animation createAnimationSprite(String resuorcePath) {
//        TextureAtlas actorAtlas = new TextureAtlas(ResourceHelper.getInternalResource(resuorcePath));
//        Animation actorAnimation = new Animation(1 / 15f, actorAtlas.getRegions());
//        return actorAnimation;
//    }
//
//    public static Animation createAnimation(TextureRegion[] regions, float duration) {
//        Animation animation = new Animation(duration, regions);
//        return animation;
//    }
//}
