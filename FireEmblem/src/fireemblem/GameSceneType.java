/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fireemblem;

import java.net.URL;

/**
 * 
 * 
 * @author t-sato
 */
public enum GameSceneType {
    OPENING(OpeningController.class),
    TITLE(TitleController.class);
    
    private final Class<? extends GameScene> scene;
    
    private GameSceneType(Class<? extends GameScene> scene) {
        this.scene = scene;
    }
    
    public Class<? extends GameScene> getGameScene() {
        return scene;
    }
    
    public URL getFXMLURL() {
        return scene.getResource(scene.getSimpleName().replaceAll("Controller", ".fxml"));
    }
}
