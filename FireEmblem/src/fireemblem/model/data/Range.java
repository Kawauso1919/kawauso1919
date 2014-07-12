/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.model.data;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;

/**
 *
 * @author t-sato
 */
public class Range {

    public final int x;
    public final int y;
    public BooleanProperty isActive = new SimpleBooleanProperty(false);

    public Range(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
