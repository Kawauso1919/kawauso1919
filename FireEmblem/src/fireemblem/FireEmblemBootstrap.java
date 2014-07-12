/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import fireemblem.model.data.GameConstant;
import fireemblem.util.FXMLUtils;
import java.io.IOException;
import java.net.URL;
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
        stage.setOnCloseRequest((eh) -> {
            System.exit(0);
        });

        URL url = FXMLUtils.getFXMLURL(GameSceneType.MAIN.getScene());
        FXMLLoader loader = new FXMLLoader(url);
        try {
            Parent parent = loader.load();
            stage.setScene(new Scene(parent));
        } catch (IOException ex) {
            ex.printStackTrace();
            System.exit(1);
        }
        stage.setMaxHeight(GameConstant.CELL_SIZE() * 18 + 32);
        stage.setMaxWidth(GameConstant.CELL_SIZE() * 24);
        stage.setMinHeight(GameConstant.CELL_SIZE() * 18 + 32);
        stage.setMinWidth(GameConstant.CELL_SIZE() * 24);
        stage.show();
        stage.setTitle(GameConstant.TITLE());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
