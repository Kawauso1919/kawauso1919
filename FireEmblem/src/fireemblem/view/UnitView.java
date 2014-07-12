/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.view;

import fireemblem.model.data.GameConstant;
import fireemblem.model.data.Unit;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author t-sato
 */
public class UnitView extends ImageView {

    private final Unit unit;

    public UnitView(Unit unit) {
        this.unit = unit;
        layoutXProperty().bind(unit.getXProperty().multiply(GameConstant.CELL_SIZE()));
        layoutYProperty().bind(unit.getYProperty().multiply(GameConstant.CELL_SIZE()));
        Image image = new Image(getClass().getResourceAsStream("chara1.gif"));
        setImage(image);

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
                        unit.selectA();
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
