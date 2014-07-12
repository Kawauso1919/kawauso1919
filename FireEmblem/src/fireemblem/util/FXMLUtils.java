/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fireemblem.util;

import java.net.URL;

/**
 *
 * @author t-sato
 */
public class FXMLUtils {
    
    public static URL getFXMLURL(Class controller) {
        return controller.getResource(controller.getSimpleName().replaceAll("Controller", ".fxml"));
    }
    
}
