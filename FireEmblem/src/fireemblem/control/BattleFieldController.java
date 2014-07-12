/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.control;

import fireemblem.model.data.Cell;
import fireemblem.model.GameManager;
import fireemblem.model.data.Range;
import fireemblem.model.data.Unit;
import fireemblem.view.CellView;
import fireemblem.view.EffectRangeView;
import fireemblem.view.MoveRangeView;
import fireemblem.view.UnitView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author t-sato
 */
public class BattleFieldController extends AbstractConnectableController implements Initializable {

    @FXML
    private Pane mainPane;

    @FXML
    private VBox mainSelect;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(getClass().getSimpleName());

        mainPane.getChildren().clear();
        Cell[][] cells = GameManager.getInstance().mapData.cells;
        for (Cell[] columns : cells) {
            for (Cell cell : columns) {
                mainPane.getChildren().add(new CellView(cell));
            }
        }

        for (Range[] columns : GameManager.getInstance().mapData.moveRanges) {
            for (Range range : columns) {
                mainPane.getChildren().add(new MoveRangeView(range));
            }
        }

        for (Range[] columns : GameManager.getInstance().mapData.effectRanges) {
            for (Range range : columns) {
                mainPane.getChildren().add(new EffectRangeView(range));
            }
        }

        for (Unit unit : GameManager.getInstance().unitList) {
            mainPane.getChildren().add(new UnitView(unit));
        }

        mainPane.getChildren().add(mainSelect);
    }
}
