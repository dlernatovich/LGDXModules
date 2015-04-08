package com.legacy.game.actors;//package com.artlite.libgdxgame.desktop.legacy.game.actors;
//
//import android.util.Log;
//
//import com.artlite.mygame.constants.AnimationProjections;
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.game.controller.ActorAnimationController;
//import com.artlite.mygame.helpers.SpriteHelper;
//import com.artlite.mygame.providers.GameScreenProvider;
//import com.artlite.mygame.providers.ScaleFactorProvider;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.scenes.scene2d.Actor;
//
//public class AnimationActor extends BaseActor {
//
//    private ActorAnimationController animationController;
//    private AnimationProjections currentXProjections;
//    private GameScreen gameScreen;
//
//    private float actorElapsedTime = 0;
//    @SuppressWarnings("unused")
//	private float scaleFactor;
//
//    private String actorName;
//
//    //    "data/atlases/textureatlas"
//    public AnimationActor(String resourcePath, String actorName) {
//        super();
//
//        scaleFactor = new ScaleFactorProvider().get();
//        gameScreen = new GameScreenProvider().get();
//        positionY = gameScreen.getHeigh() - (gameScreen.getHeigh() / 3);
//
//
//        animationController = new ActorAnimationController();
//        animationController.addDynamicAnimation(AnimationProjections.BASE,
//                SpriteHelper.createAnimationSprite(resourcePath));
//
//        animationController.addDynamicAnimation(AnimationProjections.FORWARD,
//                SpriteHelper.createAnimationSprite(resourcePath));
//
//        animationController.addDynamicAnimation(AnimationProjections.BACKWARD,
//                SpriteHelper.createAnimationSprite("data/actors/backward/animation"));
//        currentXProjections = AnimationProjections.FORWARD;
//        this.actorName = actorName;
//    }
//
//    @Override
//    public void draw(SpriteBatch spriteBatch, float v) {
//        boolean isTransition = false;
//
//        if ((destX > 0)) {
//            double value = (destX - positionX);
//
//            if (value > 0) {
//                value = 1;
//            } else {
//                value = -1;
//            }
//
//            Log.e("==> deX: " + destX + " posX: " + positionX + " value" + value, "\n");
//
//            currentXProjections = animationController.getXProjection(positionX, destX);
//
//            positionX += value;
//            isTransition = true;
//
//            if (positionX == destX) {
//                destX = -1;
//            }
//
//        }
//
////        if ((destY > 0)) {
////            int value = (destY - positionY);
////
////            if (value > 0) {
////                value = 1;
////            } else {
////                value = -1;
////            }
////
////            Log.e("==> deY: " + destY + " posY: " + positionY + " value" + value, "\n");
////
////            positionY += value;
////            isTransition = true;
////
////            if (positionY == destY) {
////                destY = -1;
////            }
////        }
//
//        actorElapsedTime += Gdx.graphics.getDeltaTime();
//        if (!isTransition) {
//            spriteBatch.draw(animationController.getDynamicAnimation(AnimationProjections.BASE).getKeyFrame(actorElapsedTime, true), positionX, positionY);
//        } else {
//            spriteBatch.draw(animationController.getDynamicAnimation(currentXProjections).getKeyFrame(actorElapsedTime, true), positionX, positionY);
//
//        }
//
//    }
//
//    @Override
//    public Actor hit(float v, float v2) {
//        Log.e("==> Actor hited: " + actorName, "");
//        return null;
//    }
//
//    @Override
//    public boolean touchDown(int i, int i2, int i3, int i4) {
//        destX = i;
//        destY = i2;
//        return true;
//    }
//
//}
