/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.view;

import fireemblem.model.data.Cell;
import fireemblem.model.data.GameConstant;
import javafx.scene.control.Label;

/**
 *
 * @author t-sato
 */
public class CellView extends Label {

    private final Cell cell;

    public CellView(Cell cell) {
        this.cell = cell;
        setLayoutX(cell.x * GameConstant.CELL_SIZE());
        setLayoutY(cell.y * GameConstant.CELL_SIZE());
        setMaxWidth(GameConstant.CELL_SIZE());
        setMaxHeight(GameConstant.CELL_SIZE());
        setMinWidth(GameConstant.CELL_SIZE());
        setMinHeight(GameConstant.CELL_SIZE());

        setStyle("-fx-background-color: white; -fx-border-width: 1; -fx-border-color: gray;");

        addMouceClickListener();
    }

    /**
     * マウスクリックのリスナ登録
     */
    private void addMouceClickListener() {
        setOnMouseClicked((me) -> {
            switch (me.getButton()) {
                case PRIMARY:
                    if (me.isSecondaryButtonDown()) {

                    } else {

                    }
                    break;
                case SECONDARY:
                    if (me.isPrimaryButtonDown()) {

                    } else {

                    }
                    break;
                default:
                    break;
            }
        });
    }
}
