/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 *
 * @author t-sato
 */
public class PointObjectImpl implements PointObject {

    private DoubleProperty x = new SimpleDoubleProperty(0);
    private DoubleProperty y = new SimpleDoubleProperty(0);

    /**
     * @return the x
     */
    @Override
    public DoubleProperty getXProperty() {
        return x;
    }

    /**
     * @return the y
     */
    @Override
    public DoubleProperty getYProperty() {
        return y;
    }
}
