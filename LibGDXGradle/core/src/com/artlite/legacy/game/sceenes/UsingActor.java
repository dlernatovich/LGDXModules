//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.game.actors.AnimationActor;
//import com.artlite.mygame.game.actors.BackgroundActor;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
//public class UsingActor extends BaseApplicationListener {
//
//    private OrthographicCamera camera;
//    private Stage stage;
//
//    private int x = 0;
//    private int y = 0;
//
//    private GameScreen gameScreen;
//    private AnimationActor myActor;
//    private BackgroundActor backgroundActor;
//
//
//    @Override
//    public void create() {
//        gameScreen = GameScreen.createScreenFromDefaults();
//        camera = createCamera(gameScreen);
//        stage = createStage();
//
//        myActor = new AnimationActor("data/actors/forward/backward_animation", "Vasya");
//
//        backgroundActor = new BackgroundActor("gamedata/back.png");
//
//        stage.addActor(backgroundActor);
//        stage.addActor(myActor);
//
//        setInputProcessor(myActor);
//    }
//
//    @Override
//    public void dispose() {
//        stage.dispose();
//    }
//
//    @Override
//    public void render() {
//        Gdx.gl.glClearColor(1, 1, 1, 1);
//        Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//        stage.setCamera(camera);
//        stage.act(Gdx.graphics.getDeltaTime());
//        stage.draw();
//    }
//
//	public int getX() {
//		return x;
//	}
//
//	public void setX(int x) {
//		this.x = x;
//	}
//
//	public int getY() {
//		return y;
//	}
//
//	public void setY(int y) {
//		this.y = y;
//	}
//
//}
