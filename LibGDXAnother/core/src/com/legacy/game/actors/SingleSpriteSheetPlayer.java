package com.legacy.game.actors;//package com.artlite.libgdxgame.desktop.legacy.game.actors;
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.helpers.SpriteHelper;
//import com.artlite.mygame.providers.GameScreenProvider;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.Texture;
//import com.badlogic.gdx.graphics.g2d.Animation;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.graphics.g2d.TextureRegion;
//import com.badlogic.gdx.scenes.scene2d.Actor;
//
///**
// * Created by dlernatovich on 7/28/14.
// */
//@SuppressWarnings("unused")
//public class SingleSpriteSheetPlayer extends BaseActor {
//
//	private int cols = 0;
//	private int rows = 0;
//
//	private Texture texture;
//	private float stateTime;
//	private TextureRegion[] frames;
//	private Animation animation;
//
//	public SingleSpriteSheetPlayer(String path, int cols, int rows) {
//		super();
//		this.cols = cols;
//		this.rows = rows;
//
//		frames = new TextureRegion[cols * rows];
//
//		texture = new Texture(Gdx.files.internal(path));
//		TextureRegion[][] tmp = TextureRegion.split(texture, texture.getWidth()
//				/ cols, texture.getHeight() / rows);
//		GameScreen gameScreen = new GameScreenProvider().get();
//		positionX = 0;
//		positionY = 0;
//
//		int index = 0;
//		for (int i = 0; i < tmp.length; i++) {
//			for (int j = 0; j < tmp[i].length; j++) {
//				TextureRegion textureRegion = tmp[i][j];
//				textureRegion.flip(false, true);
//				frames[index] = textureRegion;
//				index++;
//			}
//		}
//		animation = SpriteHelper.createAnimation(frames, 0.090f);
//	}
//
//	@Override
//	public void draw(SpriteBatch spriteBatch, float v) {
//		stateTime += Gdx.graphics.getDeltaTime();
//		TextureRegion textureRegion = animation.getKeyFrame(stateTime, true);
//		spriteBatch.draw(textureRegion, positionX, positionY);
//	}
//
//	@Override
//	public Actor hit(float v, float v2) {
//		return null;
//	}
//
//}
