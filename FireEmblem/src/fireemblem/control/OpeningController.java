/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.control;

import fireemblem.GameSceneType;
import fireemblem.model.GameManager;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author t-sato
 */
public class OpeningController extends AbstractConnectableController implements Initializable {

    @FXML
    private AnchorPane mainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(getClass().getSimpleName());

    }

    @FXML
    private void mouseClicked(MouseEvent event) {
        System.out.println(getClass().getSimpleName() + ":mouseClicked");
        GameManager.gotoScene(GameSceneType.TITLE);
    }

}
