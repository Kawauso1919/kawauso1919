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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author t-sato
 */
public class ControlPaneConnector implements ControlConnector {
    public final ConnectableController parent;
    public final Pane rootPane;

    public ControlPaneConnector(ConnectableController parent, Pane rootPane) {
        this.parent = parent;
        this.rootPane = rootPane;
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
            rootPane.getChildren().clear();
            rootPane.getChildren().add(childParent);
            AnchorPane.setTopAnchor(childParent, 0d);
            AnchorPane.setRightAnchor(childParent, 0d);
            AnchorPane.setLeftAnchor(childParent, 0d);
            AnchorPane.setBottomAnchor(childParent, 0d);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
}
