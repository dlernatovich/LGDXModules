package com.artlite.libgdxgame.managers;

import com.artlite.libgdxgame.stages.abs.BaseStage;

import java.util.List;

/**
 * Created on 4/9/15.
 */
public class StageManager implements BaseStage.OnFinishStageListener {

    private List<BaseStage> stages;
    private int stageIndex;

    public StageManager(List<BaseStage> stages) {
        this.stages = stages;
        for (BaseStage baseStage : this.stages) {
            baseStage.setOnFinishStageListener(this);
        }
        stageIndex = 0;
    }

    public BaseStage getCurrentStage() {
        return stages.get(stageIndex);
    }

    @Override
    public void onFinishStage() {
        stageIndex++;
        if (stageIndex >= stages.size()) {
            stageIndex = stages.size() - 1;
        }
    }
}
