/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import fireemblem.control.BattleMainController;
import fireemblem.control.ConnectableController;
import fireemblem.control.MainController;
import fireemblem.control.OpeningController;
import fireemblem.control.TitleController;

/**
 *
 *
 * @author t-sato
 */
public enum GameSceneType {

    MAIN(MainController.class),
    OPENING(OpeningController.class),
    TITLE(TitleController.class),
    BATTLE(BattleMainController.class);

    private final Class<? extends ConnectableController> scene;

    public Class<? extends ConnectableController> getScene() {
        return scene;
    }

    private GameSceneType(Class<? extends ConnectableController> scene) {
        this.scene = scene;
    }
}
