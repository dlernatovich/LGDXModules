package com.legacy.game.sceenes;//package com.artlite.libgdxgame.desktop.legacy.game.sceenes;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import android.util.Log;
//
//import com.artlite.mygame.constants.AnimationProjections;
//import com.artlite.mygame.enteties.GameScreen;
//import com.artlite.mygame.game.actors.SpriteSheetPlayer;
//import com.artlite.mygame.game.actors.StaticActor;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL10;
//import com.badlogic.gdx.graphics.OrthographicCamera;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//
//public class FirstFullProject extends BaseApplicationListener {
//
//	private static Map<AnimationProjections, Integer> projectionsMap = new HashMap<AnimationProjections, Integer>();
//
//	private final int X_DIVIDER = 6;
//	private final int Y_ADDITIONAL = 20;
//
//	static {
//		projectionsMap.put(AnimationProjections.FORWARD, 0);
//		projectionsMap.put(AnimationProjections.BACKWARD, 1);
//	}
//
//	private Stage stage;
//	private GameScreen screen;
//	private OrthographicCamera camera;
//	private SpriteSheetPlayer player;
//	private StaticActor background;
//	private StaticActor tree;
//	private float scaleFactor;
//
//	// positionX = 100;
//	// positionY = screen.getHeigh() - (screen.getHeigh() / 4);
//
//	@Override
//	public void create() {
//		screen = GameScreen.createScreenFromDefaults();
//		camera = createCamera(screen);
//		stage = createStage();
//		scaleFactor = getScaleFactor();
//		int startX = 0;
//		int startY = 0;
//
//		background = new StaticActor("gamedata/back.png", screen.getWidth(),
//				screen.getHeigh());
//
//		tree = new StaticActor("maingame/tree_sprite.png", scaleFactor);
//
//		startX = screen.getWidth() - (screen.getWidth() / X_DIVIDER);
//		startY = (int) (screen.getHeigh() - (tree.getActorHeigh() + Y_ADDITIONAL
//				* scaleFactor));
//
//		tree.setDrawX(startX);
//		tree.setDrawY(startY);
//
//		player = new SpriteSheetPlayer("maingame/main_actor.png", 8, 2,
//				projectionsMap, scaleFactor);
//
//		startX = (screen.getWidth() / X_DIVIDER);
//		startY = (int) (screen.getHeigh() - (player.getPlayerHeigh() + Y_ADDITIONAL
//				* scaleFactor));
//
//		player.setDrawX(startX);
//		player.setDrawY(startY);
//
//		player.setTouchable(true);
//
//		stage.addActor(background);
//		stage.addActor(tree);
//		stage.addActor(player);
//
//		setInputProcessor(player);
//	}
//
//	@Override
//	public void dispose() {
//		stage.dispose();
//	}
//
//	@Override
//	public void render() {
//		Gdx.gl.glClearColor(1, 1, 1, 1);
//		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
//
//		update();
//
//		camera.update();
//		stage.setCamera(camera);
//		stage.act(Gdx.graphics.getDeltaTime());
//		stage.draw();
//	}
//
//	private void update() {
//		if (player.getBounds().overlaps(tree.getBounds())) {
//			player.denyMovement();
//		}
//	}
//
//}
