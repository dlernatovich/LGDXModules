package com.legacy.game.controller;//package com.artlite.libgdxgame.desktop.legacy.game.controller;
//
//import com.artlite.mygame.constants.AnimationProjections;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.Sprite;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class ActorAnimationController {
//    Map<AnimationProjections, Animation> dynamicAnimations;
//    Map<AnimationProjections, Sprite> staticAnimmations;
//
//    public ActorAnimationController() {
//        dynamicAnimations = new HashMap<AnimationProjections, Animation>();
//        staticAnimmations = new HashMap<AnimationProjections, Sprite>();
//    }
//
//    public void resetAnimations() {
//        resetStaticAnimations();
//        resetDynamicAnimations();
//    }
//
//    public void resetDynamicAnimations() {
//        dynamicAnimations.clear();
//    }
//
//    public void resetStaticAnimations() {
//        staticAnimmations.clear();
//    }
//
//    public void addStaticAnimation(AnimationProjections projections, Sprite sprite) {
//        staticAnimmations.put(projections, sprite);
//    }
//
//    public void addDynamicAnimation(AnimationProjections projections, Animation animation) {
//        dynamicAnimations.put(projections, animation);
//    }
//
//    public Animation getDynamicAnimation(AnimationProjections projections) {
//        Animation animation = dynamicAnimations.get(projections);
//        return animation;
//    }
//
//    public Sprite getStaticAnimation(AnimationProjections projections) {
//        Sprite sprite = staticAnimmations.get(projections);
//        return sprite;
//    }
//
//    public AnimationProjections getYProjection(int currentY, int destY) {
//        int value = currentY - destY;
//        if (value > 0) {
//            return AnimationProjections.UP;
//        } else {
//            return AnimationProjections.DOWN;
//        }
//    }
//
//    public AnimationProjections getXProjection(int currentX, int destX) {
//        int value = currentX - destX;
//        if (value > 0) {
//            return AnimationProjections.BACKWARD;
//        } else {
//            return AnimationProjections.FORWARD;
//        }
//    }
//}
