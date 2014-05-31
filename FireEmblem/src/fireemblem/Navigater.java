/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author t-sato
 */
public class Navigater {
    private final Stage stage;
    private static Navigater instance;

    public static void initialize(Stage stage) {
        if (instance == null) {
            instance = new Navigater(stage);
        }
    }
    
    public static Navigater getInstance() {
        if (instance == null) {
            throw new IllegalStateException("Not Initialized!!");
        }
        return instance;
    }
    
    private Navigater(Stage stage) {
        this.stage = stage;
    }

    public void gotoGameScene(GameSceneType sceneType) {
        Parent root = null;
        try {
            root = FXMLLoader.load(sceneType.getFXMLURL());
        } catch (IOException ex) {
        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
