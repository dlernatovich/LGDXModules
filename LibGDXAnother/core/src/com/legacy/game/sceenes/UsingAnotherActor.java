package com.legacy.game.sceenes;//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.game.actors.SpriteSheetPlayer;
//import com.artlite.mygame.game.actors.StaticActor;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
//public class UsingAnotherActor extends BaseApplicationListener {
//
//    private OrthographicCamera camera;
//    private Stage stage;
//
//    private int x = 0;
//    private int y = 0;
//
//    private GameScreen gameScreen;
//    private SpriteSheetPlayer myActor;
//    private StaticActor backgroundActor;
//
//
//    @Override
//    public void create() {
//        gameScreen = GameScreen.createScreenFromDefaults();
//        camera = createCamera(gameScreen);
//        stage = createStage();
//
////        myActor = new SpriteSheetPlayer("data/sprite_player.png", 6, 8);
//
//        backgroundActor = new StaticActor("data/back.jpg");
//
//        stage.addActor(backgroundActor);
//        stage.addActor(myActor);
//
//        setInputProcessor(myActor);
//
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
//        camera.update();
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
