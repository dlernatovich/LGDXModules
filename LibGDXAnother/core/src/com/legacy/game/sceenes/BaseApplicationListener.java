package com.legacy.game.sceenes;//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.providers.GameScreenProvider;
//import com.artlite.mygame.providers.ScaleFactorProvider;
//import com.badlogic.gdx.ApplicationListener;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.InputProcessor;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
//public abstract class BaseApplicationListener implements ApplicationListener,
//		InputProcessor {
//
//	public abstract void create();
//
//	public abstract void dispose();
//
//	public abstract void render();
//
//	public void resize(int i, int i2) {
//
//	}
//
//	public void pause() {
//
//	}
//
//	public void resume() {
//
//	}
//
//	public boolean keyDown(int i) {
//		return false;
//	}
//
//	public boolean keyUp(int i) {
//		return false;
//	}
//
//	public boolean keyTyped(char c) {
//		return false;
//	}
//
//	public boolean touchDown(int i, int i2, int i3, int i4) {
//		return false;
//	}
//
//	public boolean touchUp(int i, int i2, int i3, int i4) {
//		return false;
//	}
//
//	public boolean touchDragged(int i, int i2, int i3) {
//		return false;
//	}
//
//	public boolean touchMoved(int i, int i2) {
//		return false;
//	}
//
//	public boolean scrolled(int i) {
//		return false;
//	}
//
//	protected void setInputProcessor(InputProcessor inputProcessor) {
//		Gdx.input.setInputProcessor(inputProcessor);
//	}
//
//	protected OrthographicCamera createCamera(GameScreen gameScreen) {
//		OrthographicCamera camera = new OrthographicCamera(
//				gameScreen.getWidth(), gameScreen.getHeigh());
//		camera.setToOrtho(true, gameScreen.getWidth(), gameScreen.getHeigh());
//		return camera;
//	}
//
//	protected Stage createStage() {
//		Stage stage = new Stage(Gdx.graphics.getWidth(),
//				Gdx.graphics.getHeight(), true);
//		return stage;
//	}
//
//	protected GameScreen createScreen() {
//		GameScreen screen = new GameScreenProvider().get();
//		return screen;
//	}
//
//	protected float getScaleFactor(){
//		return new ScaleFactorProvider().get();
//	}
//}
