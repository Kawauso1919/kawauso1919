/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.view;

import fireemblem.model.GameManager;
import fireemblem.model.data.GameConstant;
import fireemblem.model.data.Range;
import javafx.scene.control.Label;

/**
 *
 * @author t-sato
 */
public class MoveRangeView extends Label {

    private final Range range;

    public MoveRangeView(Range range) {
        this.range = range;
        setLayoutX(range.x * GameConstant.CELL_SIZE());
        setLayoutY(range.y * GameConstant.CELL_SIZE());
        setMaxWidth(GameConstant.CELL_SIZE());
        setMaxHeight(GameConstant.CELL_SIZE());
        setMinWidth(GameConstant.CELL_SIZE());
        setMinHeight(GameConstant.CELL_SIZE());

        setStyle("-fx-background-color: blue; -fx-border-width: 1; -fx-border-color: black;");
        setVisible(false);

        visibleProperty().bind(range.isActive);

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
                        GameManager.getInstance().selectPoint(range.x, range.y);
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
