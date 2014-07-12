/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem;

import fireemblem.control.ConnectableController;
import fireemblem.model.data.Command;

/**
 *
 * @author t-sato
 */
public interface ControlConnector {

    void addChild(Class<? extends ConnectableController> child);

    void shift(Class<? extends ConnectableController> dist, Command cmd);
}
