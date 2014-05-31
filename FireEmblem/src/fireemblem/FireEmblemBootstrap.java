/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * 
 * 
 * @author t-sato
 */
public class FireEmblemBootstrap extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        //TODO ✖ボタン押されてた時になんかうまく死んでくれないから強制即死させる。
        stage.setOnCloseRequest((eh) -> {System.exit(0);});
        
        Navigater.initialize(stage);
        Navigater.getInstance().gotoGameScene(GameSceneType.OPENING);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
