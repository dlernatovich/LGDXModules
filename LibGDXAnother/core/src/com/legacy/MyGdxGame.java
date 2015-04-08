package com.legacy;//package com.artlite.legacy;
//
//import com.artlite.libgdxgame.constants.AnimationProjections;
//import com.artlite.libgdxgame.enteties.actors.SpriteSheetPlayer;
//import com.artlite.libgdxgame.enteties.actors.StaticActor;
//import com.artlite.libgdxgame.main.BaseApplicationAdapter;
//import com.badlogic.gdx.Gdx;
//import com.badlogic.gdx.graphics.GL20;
//import com.badlogic.gdx.graphics.g2d.SpriteBatch;
//import com.badlogic.gdx.scenes.scene2d.Stage;
//import com.badlogic.gdx.scenes.scene2d.Touchable;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class MyGdxGame extends BaseApplicationAdapter {
//
//    private SpriteBatch batch;
//    private Stage stage;
//    private StaticActor background;
//    private SpriteSheetPlayer player;
//
//    private final int X_DIVIDER = 6;
//    private final int Y_ADDITIONAL = 20;
//
//
//    private static Map<AnimationProjections, Integer> projectionsMap = new HashMap<AnimationProjections, Integer>();
//
//    static {
//        projectionsMap.put(AnimationProjections.FORWARD, 0);
//        projectionsMap.put(AnimationProjections.BACKWARD, 1);
//    }
//
//    @Override
//    public void create() {
//        super.create();
//        batch = new SpriteBatch();
//        stage = new Stage();
//        background = new StaticActor("maingame/background.png", screen.getWidth(), screen.getHeigh());
//
//        player = new SpriteSheetPlayer("maingame/main_actor.png", 8, 2,
//                projectionsMap, 1);
//
//        int startX = (screen.getWidth() / X_DIVIDER);
//        int startY = (int) (screen.getHeigh() - (player.getPlayerHeigh() + Y_ADDITIONAL
//                * 1));
//
//        player.setDrawX(startX);
//        player.setDrawY(startY);
//
//        player.setTouchable(Touchable.enabled);
//        setInputProcessor(player);
//
//
//        stage.addActor(background);
//        stage.addActor(player);
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
//        Gdx.gl.glClearColor(color.getParam1(), color.getParam2(), color.getParam3(), color.getParam4());
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//
//        stage.act(getDeltaTime());
//        stage.getViewport().setCamera(camera);
//        stage.draw();
//    }
//
//    @Override
//    protected void update() {
//
//    }
//}
