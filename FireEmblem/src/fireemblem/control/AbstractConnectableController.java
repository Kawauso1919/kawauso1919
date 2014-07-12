/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.control;

import fireemblem.ControlConnector;

/**
 *
 * @author t-sato
 */
public class AbstractConnectableController implements ConnectableController {

    protected ControlConnector connector;

    @Override
    public void set(ControlConnector connector) {
        this.connector = connector;
    }

}
