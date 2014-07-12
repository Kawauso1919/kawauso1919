/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model;

import fireemblem.ControlConnector;
import fireemblem.GameSceneType;
import fireemblem.model.data.MapData;
import fireemblem.model.data.Range;
import fireemblem.model.data.Unit;
import java.util.ArrayList;
import java.util.List;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.util.Duration;

/**
 *
 * @author t-sato
 */
public class GameManager {

    public MapData mapData;
    public List<Unit> unitList;
    public final ControlConnector sceneConnector;
    public Unit selected;

    private static GameManager instance;

    private GameManager(ControlConnector sceneConnector) {
        this.sceneConnector = sceneConnector;
        mapData = new MapData();
        unitList = new ArrayList<>();
        unitList.add(new Unit());
        final Unit unit = new Unit();
        unit.setX(15);
        unitList.add(unit);
    }

    public static GameManager getInstance() {
        return instance;
    }

    public static void Initialized(ControlConnector sceneConnector) {
        instance = new GameManager(sceneConnector);
    }

    public static void gotoScene(GameSceneType gameSceneType) {
        instance.sceneConnector.shift(gameSceneType.getScene(), null);
    }

    public void selectUnit(Unit unit) {
        if (selected != null) {
            return;
        }

        final Range[][] moveRanges = mapData.moveRanges;
        moveRanges[unit.getY() + 1][unit.getX()].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY() - 1][unit.getX()].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY()][unit.getX() + 1].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY()][unit.getX() + 2].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY()][unit.getX() + 3].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY()][unit.getX() + 4].isActive.setValue(Boolean.TRUE);
        moveRanges[unit.getY()][unit.getX() - 1].isActive.setValue(Boolean.TRUE);

        final Range[][] effectRanges = mapData.effectRanges;
        effectRanges[unit.getY() + 2][unit.getX()].isActive.setValue(Boolean.TRUE);
        effectRanges[unit.getY() - 2][unit.getX()].isActive.setValue(Boolean.TRUE);
        effectRanges[unit.getY()][unit.getX() + 2].isActive.setValue(Boolean.TRUE);
        effectRanges[unit.getY()][unit.getX() - 2].isActive.setValue(Boolean.TRUE);

        selected = unit;
    }

    public void selectPoint(int x, int y) {
        for (Range[] ranges : mapData.moveRanges) {
            for (Range range : ranges) {
                range.isActive.setValue(Boolean.FALSE);
            }
        }

        for (Range[] ranges : mapData.effectRanges) {
            for (Range range : ranges) {
                range.isActive.setValue(Boolean.FALSE);
            }
        }

//        selected.setX(x);
//        selected.setY(y);
        Timeline timeline = new Timeline(createKeyFrames(selected, x, y, 20, 8));
        timeline.setCycleCount(1);
        timeline.play();

        selected = null;
    }

    private KeyFrame[] createKeyFrames(Unit unit, int x, int y, long duration, int frameByPoint) {
        int dx = (x - unit.getX());
        int dy = (y - unit.getY());

        KeyFrame[] result = new KeyFrame[(Math.abs(dx) + Math.abs(dy)) * frameByPoint];
        int i = 0;
        for (; i < Math.abs(dx) * frameByPoint; i++) {
            result[i] = createKeyFrame(unit, dx / Math.abs(dx) / (frameByPoint * 1.0d), 0, duration * i);
        }
        int di = i;
        for (; i < di + Math.abs(dy) * frameByPoint; i++) {
            result[i] = createKeyFrame(unit, 0, dy / Math.abs(dy) / (frameByPoint * 1.0d), duration * i);
        }
        return result;
    }

    private KeyFrame createKeyFrame(Unit unit, double x, double y, long duration) {
        return new KeyFrame(Duration.millis(duration), (ActionEvent event) -> {
            System.out.println(x + "=>" + (unit.getRealX() + x));
            System.out.println(y + "=>" + (unit.getRealY() + y));
            unit.setX(unit.getRealX() + x);
            unit.setY(unit.getRealY() + y);
        });
    }
}
