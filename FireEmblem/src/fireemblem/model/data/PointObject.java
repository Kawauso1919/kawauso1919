/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

import javafx.beans.property.DoubleProperty;

/**
 *
 * @author t-sato
 */
public interface PointObject {

    /**
     * @return the x
     */
    DoubleProperty getXProperty();

    /**
     * @return the y
     */
    DoubleProperty getYProperty();

    /**
     * @return the x
     */
    default double getRealX() {
        return getXProperty().get();
    }

    /**
     * @return the y
     */
    default double getRealY() {
        return getYProperty().get();
    }

    /**
     * @return the x
     */
    default int getX() {
        return (int) getXProperty().get();
    }

    /**
     * @return the y
     */
    default int getY() {
        return (int) getYProperty().get();
    }

    /**
     * @param x the x to set
     */
    default void setX(double x) {
        getXProperty().setValue(x);
    }

    /**
     * @param y the y to set
     */
    default void setY(double y) {
        getYProperty().setValue(y);
    }

}
