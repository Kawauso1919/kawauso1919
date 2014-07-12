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

/**
 * FXML Controller class
 *
 * @author t-sato
 */
public class TitleController extends AbstractConnectableController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(getClass().getSimpleName());
    }

    @FXML
    private void startClicked(MouseEvent event) {
        GameManager.gotoScene(GameSceneType.BATTLE);
    }

    @FXML
    private void loadClicked(MouseEvent event) {

    }

}
