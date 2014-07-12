/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.control;

import fireemblem.ControlPaneConnector;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author t-sato
 */
public class BattleMainController extends AbstractConnectableController implements Initializable {

    @FXML
    private AnchorPane mainPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(getClass().getSimpleName());

        final ControlPaneConnector controlPaneConnector = new ControlPaneConnector(this, mainPane);
        controlPaneConnector.shift(BattleFieldController.class, null);
    }

}
