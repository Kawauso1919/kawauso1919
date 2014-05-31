/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fireemblem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author t-sato
 */
public class OpeningController implements Initializable, GameScene {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void anyKeyPressed(KeyEvent event) {
        Navigater.getInstance().gotoGameScene(GameSceneType.TITLE);
    }

    @Override
    public void end() {
        
    }
    
}
