/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fireemblem.model.data;

/**
 *
 * @author t-sato
 */
public class Cell {
    public final int x;
    public final int y;
    public CellType type;
    
    public Cell(int x, int y, CellType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
}
