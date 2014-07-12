/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import fireemblem.control.ConnectableController;
import fireemblem.model.data.Command;
import fireemblem.util.FXMLUtils;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author t-sato
 */
public class ControlSceneConnector implements ControlConnector {
    public final Stage stage;

    public ControlSceneConnector(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void addChild(Class<? extends ConnectableController> child) {
        //何もしない。
    }

    @Override
    public void shift(Class<? extends ConnectableController> dist, Command cmd) {
        URL url = FXMLUtils.getFXMLURL(dist);
        FXMLLoader loader = new FXMLLoader(url);
        try {
            Parent childParent = loader.load();
            ConnectableController ctrl = (ConnectableController) loader.getController();
            ctrl.set(this);
            stage.setScene(new Scene(childParent));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
