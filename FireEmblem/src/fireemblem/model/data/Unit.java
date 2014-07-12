/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

import fireemblem.model.GameManager;
import javafx.beans.property.DoubleProperty;

/**
 *
 * @author t-sato
 */
public class Unit implements PointObject {

    private int hp;
    private int str;
    private PointObject po;

    public Unit() {
        hp = 100;
        str = 20;
        po = new PointObjectImpl();
        setX(5);
        setY(8);
    }

    public void selectA() {
        GameManager.getInstance().selectUnit(this);
    }

    @Override
    public DoubleProperty getXProperty() {
        return po.getXProperty();
    }

    @Override
    public DoubleProperty getYProperty() {
        return po.getYProperty();
    }
}
